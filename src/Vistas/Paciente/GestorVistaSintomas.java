/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paciente;

import Model.Paciente.Enfermedad;
import Model.Paciente.GestorEnfermedad;
import Model.Paciente.GestorSintoma;
import Model.Paciente.Sintoma;
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
public class GestorVistaSintomas extends GestorVista implements InterfazFrm {

    private GestorSintoma gestor;

    public GestorVistaSintomas(JDesktopPane escritorio) {
        this.setEscritorio(escritorio);
        this.setFrame(new FrmSintomas(this));
        this.setGestor(new GestorSintoma());

    }

    public GestorSintoma getGestor() {
        return gestor;
    }

    public void setGestor(GestorSintoma gestor) {
        this.gestor = gestor;
    }

    private Sintoma getModel() {
        return this.gestor.getModel();
    }

    public void crearModelo() {
        this.getGestor().crearModelo();
    }

    public FrmSintomas getFormularioEspecifico() {
        return (FrmSintomas) this.getFrame();
    }

    public String getNombreABuscar() {
        return this.getFormularioEspecifico().getTxtNombre().getText();
    }

    private Sintoma getSeleccionLista() {
        return (Sintoma) this.getFormularioEspecifico().getLista().getSelectedValue();
    }

    public List listaSintomaConb() {
        return this.getGestor().filtrarConb(this.seleccionComboBuscar(), this.tomarNombreSintoma().trim().toLowerCase());

    }

    public List listaSintomaNombre() {
        return this.getGestor().listarFiltrarNombre(this.tomarNombreSintoma().trim().toLowerCase());
    }

    @Override
    public void abrir() {
        this.getEscritorio().add(this.getFrame());
        this.getFrame().setVisible(true);
    }

    public void guardar() {
        if (this.comprabarCamposMinimos()) {
            if (this.isNuevo()) {
                this.crearModelo();
                this.obtenerDatos();
                this.getGestor().procesar(this.getModo());

                this.getFormularioEspecifico().configInicial();
            } else {
                this.obtenerDatos();
                this.setModificar();
                this.getGestor().procesar(this.getModo());
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
        Sintoma sin = (Sintoma) this.getFormularioEspecifico().getLista().getSelectedValue();
        this.getFormularioEspecifico().getTxtNombreNuevoSintoma().setText(sin.getNombre());
        this.getFormularioEspecifico().getTxtDescripcion().setText(String.valueOf(sin.getDescripcion()));
        this.getFormularioEspecifico().getBtnEliminar().setEnabled(false);
        this.getFormularioEspecifico().getBtnGuardar().setEnabled(true);
        this.getFormularioEspecifico().getTxtNombreNuevoSintoma().setEnabled(true);
        this.getFormularioEspecifico().getTxtDescripcion().setEnabled(true);
    }

    public void actualizarModelo() {
        this.getGestor().setModel(this.tomarSeleccionLista());
    }

    public void filtrar() {
        if (this.campoBusquedaVacia()) {
            List paises = this.getGestor().listarFiltrarNombre(this.getNombreABuscar());
            this.llenarList(paises);
            this.getFormularioEspecifico().setConfigBtnFiltrar(true);
        } else {
            this.clearList();
            this.getFormularioEspecifico().setConfigBtnFiltrar(false);
        }

    }

    public void eliminar() {
        if (this.getFormularioEspecifico().getLista().getSelectedValue() == null) {
            new Util().getMensajeError("No ha seleccionado nada");
        } else {
            String nombre = this.getFormularioEspecifico().getLista().getSelectedValue().toString();
            switch (new Util().confirmacion("¿Desea eliminar el Sintoma " + nombre + "?")) {
                case 0://aceptar

                    this.getGestor().setModel(this.getSeleccionLista());
                    this.getGestor().eliminar();
                    this.getFormularioEspecifico().configInicial();
                   // new Util().getMensajeInformation("Sintoma eliminado con exito");
                    this.clearList();
                    break;
                case 2://cancelar

                    break;
            }
        }
    }

    public List listaSintomaXEnfermedad() {
        Iterator iter = this.seleccionComboBuscar().getSintoma().iterator();
        List sintomas = new ArrayList();
        while (iter.hasNext()) {
            Sintoma sintoma = (Sintoma) iter.next();
            sintomas.add(sintoma);
        }
        return sintomas;
    }

    public List listEnfermedad() {
        GestorEnfermedad gestor = new GestorEnfermedad();
        return gestor.listarEnfermedades();
    }

    public void listar() {
        List Sintoma = this.getGestor().listarSintoma();
        this.llenarList(Sintoma);
        this.getFormularioEspecifico().setConfigBtnFiltrar(true);
    }

//    }
    private Sintoma tomarSeleccionLista() {
        return (Sintoma) this.getFormularioEspecifico().getLista().getSelectedValue();
    }

    public Enfermedad seleccionComboBuscar() {
        return (Enfermedad) this.getFormularioEspecifico().getCmbEnfermedad().getSelectedItem();
    }

    public void llenarList(List lista) {
        GestorLista gestorLista = new GestorLista();
        gestorLista.llenarList(lista, this.getFormularioEspecifico().getLista());

    }

    public void cargarComboEnfermedad() {
        GestorCombo gestorCombo = new GestorCombo();
        gestorCombo.cargarCombo(this.listEnfermedad(), this.getFormularioEspecifico().getCmbEnfermedad());
    }

    public void configCheckNombre() {
        if (this.getFormularioEspecifico().getChekNombre().isSelected()) {
            this.getFormularioEspecifico().getTxtNombre().setEnabled(true);
            this.getFormularioEspecifico().getTxtNombre().setText("");
            this.getFormularioEspecifico().getTxtNombre().requestFocus();
        } else {
            this.getFormularioEspecifico().getTxtNombre().setEnabled(false);
            this.getFormularioEspecifico().getTxtNombre().setText("");
        }

    }

    public void configCheckEnfermedad() {
        if (this.getFormularioEspecifico().getChekEnfermedad().isSelected()) {
            this.getFormularioEspecifico().getCmbEnfermedad().setEnabled(true);
            this.getFormularioEspecifico().getBtnAux().setEnabled(true);
            this.cargarComboEnfermedad();
        } else {
            this.getFormularioEspecifico().getBtnAux().setEnabled(false);
            this.getFormularioEspecifico().getCmbEnfermedad().setEnabled(false);
            this.getFormularioEspecifico().getCmbEnfermedad().removeAllItems();
        }
    }

    public boolean campoBusquedaVacia() {
        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtNombre())) {
            return false;
        }
        return true;
    }

    public String tomarNombreSintoma() {
        return this.getFormularioEspecifico().getTxtNombre().getText();
    }

    public String getNombre() {
        return this.getFormularioEspecifico().getTxtNombreNuevoSintoma().getText();
    }

    public String getDescripcion() {
        return this.getFormularioEspecifico().getTxtDescripcion().getText();
    }

    public void clearList() {
        GestorLista gestorLista = new GestorLista();
        gestorLista.clearList(this.getFormularioEspecifico().getLista());

    }
    
    public void obtenerDatos() {
        this.getModel().setNombre(this.getFormularioEspecifico().getTxtNombreNuevoSintoma().getText());
        this.getModel().setDescripcion(this.getFormularioEspecifico().getTxtDescripcion().getText());
    }

    public boolean comprabarCamposMinimos() {
        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtNombreNuevoSintoma())) {
            new Util().getMensajeError("Campo nombre esta vacío");
            return false;
        }
        return true;

    }
    
    public void imprimir() {
        this.getGestor().imprimir();
    }

    @Override
    public void cerrar() {
        this.getFormularioEspecifico().setVisible(false);
    }
}
