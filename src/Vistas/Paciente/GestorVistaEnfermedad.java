/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paciente;

import Model.Paciente.Enfermedad;
import Model.Paciente.GestorEnfermedad;
import Model.Paciente.GestorTipoEnfermedad;
import Model.Paciente.TipoEnfermedad;
import Utilidades.GestorCombo;
import Utilidades.GestorLista;
import Utilidades.Util;
import Vistas.GestorVista;
import Vistas.InterfazFrm;
import java.util.List;
import javax.swing.JDesktopPane;

/**
 *
 * @author Lopez
 */
public class GestorVistaEnfermedad extends GestorVista implements InterfazFrm {

    private GestorEnfermedad gestor;

    public GestorVistaEnfermedad(JDesktopPane escritorio) {
        this.setEscritorio(escritorio);
        this.setFrame(new FrmEnfermedad(this));
        this.setGestor(new GestorEnfermedad());
    }

    private Enfermedad getModel() {
        return this.gestor.getModel();
    }

    private void crearGestor() {
        this.setGestor(new GestorEnfermedad());
    }

    public GestorEnfermedad getGestor() {
        return gestor;
    }

    public final void setGestor(GestorEnfermedad gestor) {
        this.gestor = gestor;
    }

    public String tomarNombre() {
        return this.getFormularioEspecifico().getTxtNombreBuscar().getText();
    }

    @Override
    public void abrir() {
        this.getEscritorio().add(this.getFrame());
        this.getFrame().setVisible(true);
    }

    public FrmEnfermedad getFormularioEspecifico() {
        return (FrmEnfermedad) this.getFrame();
    }

    public void guardar() {
        if (comprabarCamposMinimos()) {
            if (this.isNuevo()) {
                this.getGestor().crearModelo();
                this.getModel().setNombre(this.getFormularioEspecifico().getTxtNombre().getText());
                this.getModel().setTipoEnfermedad(this.seleccionComboNuevo());
                this.getGestor().procesar(this.getModo());
                this.getFormularioEspecifico().configInicial();
            } else {
                this.getModel().setNombre(this.getFormularioEspecifico().getTxtNombre().getText());
                this.getModel().setTipoEnfermedad(this.seleccionComboNuevo());
                this.getGestor().procesar(this.getModo());
                this.getFormularioEspecifico().configInicial();
                this.clearList();
            }
        }
    }

    public void accionModificar() {
        if (this.getFormularioEspecifico().getListaEnfermedades().getSelectedValue() == null) {
            new Util().getMensajeError("No ha seleccionado nada");
        } else {
            this.actualizarVista();
            this.actualizarModelo();
        }

    }

    public void actualizarVista() {
        String nombre = this.getFormularioEspecifico().getListaEnfermedades().getSelectedValue().toString();
        this.getFormularioEspecifico().getTxtNombre().setText(nombre);
        this.cargarComboTipoEnfermedadNuevaEnfermedad();
        this.getFormularioEspecifico().getBtnGuardar().setEnabled(true);
        this.getFormularioEspecifico().getTxtNombre().setEnabled(true);
        this.getFormularioEspecifico().getCmbTipoEnfermedadNuevaEnfermedad().setEnabled(true);
        this.getFormularioEspecifico().getGestorVista().cargarComboTipoEnfermedadNuevaEnfermedad();
    }

    public void actualizarModelo() {
        this.getGestor().setModel(this.tomarSeleccionLista());
    }

    public void eliminarEnfermedad() {
        if (this.getFormularioEspecifico().getListaEnfermedades().getSelectedValue() == null) {
            new Util().getMensajeError("No ha seleccionado nada");
        } else {
            String nombre = this.getFormularioEspecifico().getListaEnfermedades().getSelectedValue().toString();
            switch (new Util().confirmacion("¿Desea eliminar la enfermedad " + nombre + "?")) {
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
    }

    private Enfermedad tomarSeleccionLista() {
        return (Enfermedad) this.getFormularioEspecifico().getListaEnfermedades().getSelectedValue();
    }

    public TipoEnfermedad seleccionComboNuevo() {
        return (TipoEnfermedad) this.getFormularioEspecifico().getCmbTipoEnfermedadNuevaEnfermedad().getSelectedItem();
    }

    public boolean comprabarCamposMinimos() {
        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtNombre())) {
            new Util().getMensajeError("Campo nombre esta vacío");
            return false;
        }
        if (Util.estaSeleccionadoCombo(this.getFormularioEspecifico().getCmbTipoEnfermedadNuevaEnfermedad())) {
            new Util().getMensajeError("Seleccione un tipo de enfermedad");
            return false;
        }

        return true;

    }

    public void filtrar() {
        if (!this.getFormularioEspecifico().getChekNombre().isSelected() && this.getFormularioEspecifico().getChekTipoEnfermedad().isSelected()) {
            if ((Util.estaSeleccionadoCombo(this.getFormularioEspecifico().getCmbTipoEnfermedad()))) {
                new Util().getMensajeError("No ha Seleccionado Tipo Enfermedad");
            } else {
                this.llenarList(this.listaEnfermedadTipoEnfermedad());
            }
        }

        if (this.getFormularioEspecifico().getChekNombre().isSelected() && this.getFormularioEspecifico().getChekTipoEnfermedad().isSelected()) {
            this.llenarList(this.listaEnfermedadConb());
        }
        if (this.campoBusquedaVacia()) {
            if (this.getFormularioEspecifico().getChekNombre().isSelected() && !this.getFormularioEspecifico().getChekTipoEnfermedad().isSelected()) {
                this.llenarList(this.listaEnfermedadNombre());
            }
        }
    }

    public void sinFiltro() {
        this.llenarList(this.listaCompletaEnfermedad());
    }

    public boolean campoBusquedaVacia() {
        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtNombreBuscar())) {
            return false;
        }
        return true;
    }

    public void cargarComboTipoEnfermedad() {
        GestorCombo gestorCombo = new GestorCombo();
        gestorCombo.cargarCombo(this.listaCompletaTipoEnfermedad(), this.getFormularioEspecifico().getCmbTipoEnfermedad());
    }

    public void cargarComboTipoEnfermedadNuevaEnfermedad() {
        GestorCombo gestorCombo = new GestorCombo();
        gestorCombo.cargarCombo(this.listaCompletaTipoEnfermedad(), this.getFormularioEspecifico().getCmbTipoEnfermedadNuevaEnfermedad());
    }

    public TipoEnfermedad seleccionComboBuscar() {
        return (TipoEnfermedad) this.getFormularioEspecifico().getCmbTipoEnfermedad().getSelectedItem();
    }

    public void clearList() {
        GestorLista gestorLista = new GestorLista();
        gestorLista.clearList(this.getFormularioEspecifico().getListaEnfermedades());

    }

    public void llenarList(List lista) {
        GestorLista gestorLista = new GestorLista();
        gestorLista.llenarList(lista, this.getFormularioEspecifico().getListaEnfermedades());
    }

    public List listaCompletaEnfermedad() {
        return this.getGestor().listarEnfermedades();
    }

    public List listaEnfermedadConb() {
        return this.getGestor().filtrarConb(this.seleccionComboBuscar(), this.tomarNombre().trim().toLowerCase());

    }

    public List listaEnfermedadTipoEnfermedad() {
        return this.getGestor().filtrarTipoEnfermedad(this.seleccionComboBuscar());
    }

    public List listaEnfermedadNombre() {
        return this.getGestor().filtrarNombre(this.tomarNombre().trim().toLowerCase());
    }

    public List listaCompletaTipoEnfermedad() {
        GestorTipoEnfermedad gestorTipoEnfermedad = new GestorTipoEnfermedad();
        return gestorTipoEnfermedad.listarTipoEnfermedad();
    }

    public void imprimir() {
        this.getGestor().imprimir();
    }

    @Override
    public void cerrar() {
        this.getFormularioEspecifico().setVisible(true);
    }
}
