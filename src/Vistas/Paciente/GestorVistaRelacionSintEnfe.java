/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paciente;

import Model.Paciente.Enfermedad;
import Model.Paciente.GestorEnfermedad;
import Model.Paciente.GestorSintoma;
import Model.Paciente.GestorTipoEnfermedad;
import Model.Paciente.Sintoma;
import Model.Paciente.TipoEnfermedad;
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
 * @author emiliano
 */
public class GestorVistaRelacionSintEnfe extends GestorVista implements InterfazFrm {

    private GestorEnfermedad gestor;
    private List listaSintomasAdd;

    public GestorVistaRelacionSintEnfe(JDesktopPane escritorio) {
        this.setEscritorio(escritorio);
        this.setFrame(new FrmRelacionarEnfSint(this));
        this.gestor = new GestorEnfermedad();
        this.listaSintomasAdd = new ArrayList();

    }

    public GestorEnfermedad getGestor() {
        return gestor;
    }

    public void setGestor(GestorEnfermedad gestor) {
        this.gestor = gestor;
    }

    public List getListaSintomas() {
        return listaSintomasAdd;
    }

    public void setListaSintomas(List listaSintomas) {
        this.listaSintomasAdd = listaSintomas;
    }

    public String tomarNombre() {
        return this.getFormularioEspecifico().getTxtNombreBuscar().getText();
    }

    @Override
    public void abrir() {
        this.getEscritorio().add(this.getFrame());
        this.getFrame().setVisible(true);
    }

    public FrmRelacionarEnfSint getFormularioEspecifico() {
        return (FrmRelacionarEnfSint) this.getFrame();
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

    public void cargarComboTipoEnfermedad() {
        GestorCombo gestorCombo = new GestorCombo();
        gestorCombo.cargarCombo(this.listaCompletaTipoEnfermedad(), this.getFormularioEspecifico().getCmbTipoEnfermedad());
    }

    public boolean campoBusquedaVacia() {
        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtNombreBuscar())) {
            return false;
        }
        return true;
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

    public void listarSintomas() {
        GestorSintoma gestorSint = new GestorSintoma();
        List Sintoma = gestorSint.listarSintoma();
        this.llenarListSintomas(Sintoma);
    }

    public void listarSintomasXEnfermedad() {
        Iterator iter = this.seleccionEnfermedad().getSintoma().iterator();
        while (iter.hasNext()) {
            this.getListaSintomas().add((Sintoma) iter.next());
        }
        this.llenarListSintomasXEnfermedad(this.getListaSintomas());
    }

    public void llenarListSintomas(List lista) {
        GestorLista gestorLista = new GestorLista();
        gestorLista.llenarList(lista, this.getFormularioEspecifico().getListaSintomas());
    }

    public void llenarListSintomasXEnfermedad(List lista) {
        GestorLista gestorLista = new GestorLista();
        gestorLista.llenarList(lista, this.getFormularioEspecifico().getListaSintomasAdd());
    }

    public Enfermedad seleccionEnfermedad() {
        return (Enfermedad) this.getFormularioEspecifico().getListaEnfermedades().getSelectedValue();
    }

    public void habilitarListSiSintoma() {
        GestorLista gest = new GestorLista();
        if (this.getFormularioEspecifico().getListaEnfermedades().getSelectedValue() == null) {
            gest.clearList(this.getFormularioEspecifico().getListaSintomas());
            gest.clearList(this.getFormularioEspecifico().getListaSintomasAdd());
            this.getFormularioEspecifico().getListaSintomas().setEnabled(false);
            this.getFormularioEspecifico().getListaSintomasAdd().setEnabled(false);
            this.getFormularioEspecifico().getBtnNuevoSintoma().setEnabled(false);
            this.getFormularioEspecifico().getBtnEliminarSintoma().setEnabled(false);
            this.getFormularioEspecifico().getBtnGuardar().setEnabled(false);
        } else {
            gest.clearList(this.getFormularioEspecifico().getListaSintomas());
            this.getListaSintomas().clear();
            this.getFormularioEspecifico().getListaSintomas().setEnabled(true);
            this.getFormularioEspecifico().getListaSintomasAdd().setEnabled(true);
            this.getFormularioEspecifico().getBtnNuevoSintoma().setEnabled(true);
            this.getFormularioEspecifico().getBtnEliminarSintoma().setEnabled(true);
            this.getFormularioEspecifico().getBtnGuardar().setEnabled(true);
            this.listarSintomas();
            this.listarSintomasXEnfermedad();
        }
    }

    public Sintoma seleccionListaSintomas() {
        return (Sintoma) this.getFormularioEspecifico().getListaSintomas().getSelectedValue();
    }

    public Sintoma seleccionListaSintomasAdd() {
        return (Sintoma) this.getFormularioEspecifico().getListaSintomasAdd().getSelectedValue();
    }

    public void addSintoma() {
        if (new GestorLista().isSelectedList(this.getFormularioEspecifico().getListaSintomas())) {
            if (!this.isRepetido()) {
                this.getListaSintomas().add(this.seleccionListaSintomas());
                GestorLista gestorList = new GestorLista();
                gestorList.llenarList(this.getListaSintomas(), this.getFormularioEspecifico().getListaSintomasAdd());
            } else {
                new Util().getMensajeError("El Sintoma seleccionado ya existe en la Enfermedad Seleccionada");
            }
        } else {
            new Util().getMensajeError("No ha Seleccionado ningun sintoma");
        }
    }

    public void removeSintoma() {
        if (new GestorLista().isSelectedList(this.getFormularioEspecifico().getListaSintomasAdd())) {
            this.getListaSintomas().remove(this.seleccionListaSintomasAdd());
            GestorLista gestorList = new GestorLista();
            gestorList.llenarList(this.getListaSintomas(), this.getFormularioEspecifico().getListaSintomasAdd());
        }else{
            new Util().getMensajeError("No ha Seleccionado ningun sintoma");
        }
    }

    public boolean isRepetido() {
        return this.getListaSintomas().contains(this.seleccionListaSintomas());
    }

    public void guardar() {
        this.seleccionEnfermedad().getSintoma().clear();
        this.seleccionEnfermedad().getSintoma().addAll(this.getListaSintomas());
        GestorEnfermedad gestorEnf = new GestorEnfermedad();
        gestorEnf.setModel(this.seleccionEnfermedad());
        gestorEnf.actualizarExterno();
        new Util().getMensajeInformation("Relacion Guardada con Exito");
        this.getFormularioEspecifico().configInicial();
        this.getFormularioEspecifico().clearList();
    }

    @Override
    public void cerrar() {
        this.getFormularioEspecifico().setVisible(false);
    }
}
