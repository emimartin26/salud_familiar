/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Ubicacion;

import Model.Ubicacion.GestorLocalidad;
import Model.Ubicacion.GestorPais;
import Model.Ubicacion.GestorProvincia;
import Model.Ubicacion.Localidad;
import Model.Ubicacion.Pais;
import Model.Ubicacion.Provincia;
import Utilidades.GestorCombo;
import Utilidades.GestorLista;
import Utilidades.Util;
import Vistas.GestorVista;
import Vistas.InterfazFrm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JDesktopPane;

/**
 *
 * @author Emiliano
 */
public class GestorVistaLocalidad extends GestorVista implements InterfazFrm {

    private GestorLocalidad gestor;

    public GestorVistaLocalidad(JDesktopPane escritorio) {
        this.setEscritorio(escritorio);
        this.setFrame(new FrmLocalidad(this));
        this.setGestor(new GestorLocalidad());
    }

    public GestorLocalidad getGestor() {
        return gestor;
    }

    private void setGestor(GestorLocalidad gestor) {
        this.gestor = gestor;
    }

    public void crearModelo() {
        this.getGestor().crearModelo();
    }

    public Localidad getModel() {
        return this.getGestor().getModel();
    }

    public void obtenerDatosLocalidad() {
        this.getModel().setNombre(this.getFormularioEspecifico().getTxtNombre().getText());
        this.getModel().setCodigoPostal(Integer.parseInt(this.getFormularioEspecifico().getTxtCodigoPostal().getText()));
        this.getModel().setProv(this.seleccionComboNuevoProv());
    }

    public void actualizarLocalidad() {
        GestorProvincia gestorProv = new GestorProvincia();
        gestorProv.setModel(this.seleccionComboNuevoProv());
        gestorProv.getModel().add(this.getModel());
        this.setModoExterno();
        gestorProv.procesar(this.getModo());
    }

    public FrmLocalidad getFormularioEspecifico() {
        return (FrmLocalidad) this.getFrame();
    }

    public void guardar() {
        if (this.comprabarCamposMinimos()) {
            if (this.isNuevo()) {
                this.crearModelo();
                this.obtenerDatosLocalidad();
                this.getGestor().procesar(this.getModo());
                this.actualizarLocalidad();
                this.getFormularioEspecifico().configInicial();
            } else {
                this.removeLocalidad();
                this.obtenerDatosLocalidad();
                this.setModificar();
                this.getGestor().procesar(this.getModo());
                this.actualizarLocalidad();
                this.getFormularioEspecifico().configInicial();
                this.clearList();
            }

        }
    }

    public void accionModificar() {
        if (this.getFormularioEspecifico().getLista().getSelectedValue() == null) {
            new Util().getMensajeError("No ha seleccionado nada");
        } else {
            this.actualizarVista();
            this.actualizarModelo();
        }

    }

    public void actualizarVista() {
        Localidad loc = (Localidad) this.getFormularioEspecifico().getLista().getSelectedValue();
        this.getFormularioEspecifico().getTxtNombre().setText(loc.getNombre());
        this.getFormularioEspecifico().getTxtCodigoPostal().setText(String.valueOf(loc.getCodigoPostal()));
        this.getFormularioEspecifico().getBtnEliminar().setEnabled(false);
        this.getFormularioEspecifico().getBtnGuardar().setEnabled(true);
        this.getFormularioEspecifico().getTxtNombre().setEnabled(true);
        this.getFormularioEspecifico().getTxtCodigoPostal().setEnabled(true);
        this.getFormularioEspecifico().getCmbPais().setEnabled(true);
        this.getFormularioEspecifico().getCmbProvincia().setEnabled(true);
        this.getFormularioEspecifico().getGestorVista().cargarComboPais();
    }

    public void actualizarModelo() {
        this.getGestor().setModel(this.tomarSeleccionLista());
    }

    public void eliminarLocalidad() {
        if (this.getFormularioEspecifico().getLista().getSelectedValue() == null) {
            new Util().getMensajeError("No ha seleccionado nada");
        } else {
            String nombre = this.getFormularioEspecifico().getLista().getSelectedValue().toString();
            switch (new Util().confirmacion("¿Desea eliminar la localidad " + nombre + "?")) {
                case 0://aceptar
                    this.eliminar();
                    this.getFormularioEspecifico().configInicial();
                    this.clearList();
                    break;
                case 2://cancelar
                    break;
            }
        }
    }

    public void eliminar() {
        this.getGestor().setModel(this.tomarSeleccionLista());
        this.getGestor().eliminar();
        this.removeLocalidad();
    }

    public void removeLocalidad() {
        GestorProvincia gestorProvincia = new GestorProvincia();
        gestorProvincia.setModel(this.getModel().getProv());
        gestorProvincia.getModel().remove(this.getModel());
        gestorProvincia.actualizarExterno();
    }

    public void filtrar() {
        if (this.getFormularioEspecifico().getCheckCodigo().isSelected() && !this.getFormularioEspecifico().getCheckNombre().isSelected() && !this.getFormularioEspecifico().getCheckProvincia().isSelected()) {
            this.llenarList(this.listLocalidadesXCodigo());
        }
        if (!this.getFormularioEspecifico().getCheckCodigo().isSelected() && this.getFormularioEspecifico().getCheckNombre().isSelected() && !this.getFormularioEspecifico().getCheckProvincia().isSelected()) {
            this.llenarList(this.listLocalidadesXnombre());
        }
        if (!this.getFormularioEspecifico().getCheckCodigo().isSelected() && !this.getFormularioEspecifico().getCheckNombre().isSelected() && this.getFormularioEspecifico().getCheckProvincia().isSelected()) {
            if ((Util.estaSeleccionadoCombo(this.getFormularioEspecifico().getCmbProvBuscar()))) {
                new Util().getMensajeError("No ha Seleccionado Ninguna Provincia");
            } else {
                this.llenarList(this.listLocalidadesXProvincia());
            }

        }
    }

    public void sinFiltro() {
        this.llenarList(this.listLocalidades());
    }

    private Localidad tomarSeleccionLista() {
        return (Localidad) this.getFormularioEspecifico().getLista().getSelectedValue();
    }

    public boolean comprabarCamposMinimos() {
        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtNombre())) {
            new Util().getMensajeError("Campo nombre esta vacío");
            return false;
        }
        if (Util.estaSeleccionadoCombo(this.getFormularioEspecifico().getCmbProvincia())) {
            new Util().getMensajeError("Seleccione una provincia");
            return false;
        }
        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtCodigoPostal())) {
            new Util().getMensajeError("Campo código postal esta vacío");
            return false;
        }
        return true;

    }

    public void cargarComboPais() {
        GestorCombo gestorCombo = new GestorCombo();
        gestorCombo.cargarCombo(listPaises(), this.getFormularioEspecifico().getCmbPais());
    }

    public void cargarComboProv() {
        GestorCombo gestorCombo = new GestorCombo();
        gestorCombo.cargarCombo(this.listProvXPais(), this.getFormularioEspecifico().getCmbProvincia());
    }

    public void cargarComboPaisBuscar() {
        GestorCombo gestorCombo = new GestorCombo();
        gestorCombo.cargarCombo(this.listPaises(), this.getFormularioEspecifico().getCmbPaisBuscar());
    }

    public void cargarComboProvBuscar() {
        GestorCombo gestorCombo = new GestorCombo();
        gestorCombo.cargarCombo(this.listProvXPaisBuscar(), this.getFormularioEspecifico().getCmbProvBuscar());
    }

    public List listPaises() {
        GestorPais gestorPais = new GestorPais();
        return gestorPais.listarPais();
    }

    public List listProvXPais() {
        List provincias = new ArrayList();
        if (this.seleccionComboNuevoPais() == null) {
            return provincias;
        } else {
            Iterator iter = this.seleccionComboNuevoPais().getProvincias().iterator();
            while (iter.hasNext()) {
                provincias.add((Provincia) iter.next());
            }
            return provincias;
        }
    }

    public List listProvXPaisBuscar() {
        List provincias = new ArrayList();
        if (this.seleccionComboPaisBuscar() == null) {
            return provincias;
        } else {
            Iterator iter = this.seleccionComboPaisBuscar().getProvincias().iterator();
            while (iter.hasNext()) {
                provincias.add((Provincia) iter.next());
            }
            return provincias;
        }
    }

    public List listLocalidades() {
        return this.getGestor().listarLocalidades();
    }

    public List listLocalidadesXCodigo() {
        if ("".equals(this.getFormularioEspecifico().getTxtCodigo().getText())) {
            return new ArrayList();
        }
        return this.getGestor().listarLocalidadesXCodigo(Integer.parseInt(this.getFormularioEspecifico().getTxtCodigo().getText()));
    }

    public List listLocalidadesXnombre() {
        if ("".equals(this.getFormularioEspecifico().getTxtNombreBuscar().getText())) {
            return new ArrayList();
        }
        return this.getGestor().listarLocalidadesXNombre(this.getFormularioEspecifico().getTxtNombreBuscar().getText());
    }

    public List listLocalidadesXProvincia() {
        List localidades = new ArrayList();
        if (this.seleccionComboPaisBuscar() == null) {
            return localidades;
        } else {
            Iterator iter = this.seleccionComboBuscarProv().getLocalidades().iterator();
            while (iter.hasNext()) {
                localidades.add((Localidad) iter.next());
            }
            return localidades;
        }
    }

    public Pais seleccionComboNuevoPais() {
        return (Pais) this.getFormularioEspecifico().getCmbPais().getSelectedItem();
    }

    public Pais seleccionComboPaisBuscar() {
        return (Pais) this.getFormularioEspecifico().getCmbPaisBuscar().getSelectedItem();
    }

    public Provincia seleccionComboNuevoProv() {
        return (Provincia) this.getFormularioEspecifico().getCmbProvincia().getSelectedItem();
    }

    public Provincia seleccionComboBuscarProv() {
        return (Provincia) this.getFormularioEspecifico().getCmbProvBuscar().getSelectedItem();
    }

    public void llenarList(List lista) {
        GestorLista gestorLista = new GestorLista();
        gestorLista.llenarList(lista, this.getFormularioEspecifico().getLista());
    }

    public void clearList() {
        GestorLista gestorLista = new GestorLista();
        gestorLista.clearList(this.getFormularioEspecifico().getLista());

    }

    @Override
    public void abrir() {
        this.getEscritorio().add(this.getFrame());
        this.getFrame().setVisible(true);
    }

    public void imprimir() {
        this.getGestor().imprimir();
    }

    @Override
    public void cerrar() {
        this.getFormularioEspecifico().setVisible(false);
    }
}
