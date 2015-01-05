/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paciente;

import Model.Persona.GestorTipoParentesco;
import Model.Persona.TipoParentesco;
import Model.Ubicacion.InterfazABM;
import Utilidades.GestorLista;
import Utilidades.Util;
import Vistas.GestorVista;
import Vistas.InterfazFrm;
import java.util.List;
import javax.swing.JDesktopPane;

/**
 *
 * @author Emiliano
 */
public class GestorVistaTipoParentesco extends GestorVista implements InterfazFrm{

    private GestorTipoParentesco gestor;

    public GestorVistaTipoParentesco(JDesktopPane escritorio){
        this.setEscritorio(escritorio);
        this.setFrame(new FrmTipoParentesco(this));
        this.setGestor(new GestorTipoParentesco());
        
    }
    
    public GestorTipoParentesco getGestor() {
        return gestor;
    }

    public void setGestor(GestorTipoParentesco gestor) {
        this.gestor = gestor;
    }
    
    private TipoParentesco getModel() {
        return this.gestor.getModel();
    }
    
    public void crearModelo() {
        this.getGestor().crearModelo();
    }
    
     public FrmTipoParentesco getFormularioEspecifico() {
        return (FrmTipoParentesco) this.getFrame();
    }

     public String getNombreABuscar() {
        return this.getFormularioEspecifico().getTxtNombre().getText();
    }

    private TipoParentesco getSeleccionLista() {
        return (TipoParentesco) this.getFormularioEspecifico().getLista().getSelectedValue();
    }
    
    public List listaTipoParentesco() {
        return this.getGestor().listarFiltrarNombre(this.tomarNombreTipoParentesco().trim().toLowerCase());
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
                this.getModel().setNombre(this.getFormularioEspecifico().getTxtNombreNuevoParentesco().getText());
                this.getModel().setDescripcion(this.getFormularioEspecifico().getTxtDescripcion().getText());
                this.getGestor().procesar(this.getModo());

                this.getFormularioEspecifico().configInicial();
            } else {
                this.getModel().setNombre(this.getFormularioEspecifico().getTxtNombreNuevoParentesco().getText());
                this.getModel().setDescripcion(this.getFormularioEspecifico().getTxtDescripcion().getText());
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
        TipoParentesco tp = (TipoParentesco) this.getFormularioEspecifico().getLista().getSelectedValue();
        this.getFormularioEspecifico().getTxtNombreNuevoParentesco().setText(tp.getNombre());
        this.getFormularioEspecifico().getTxtDescripcion().setText(String.valueOf(tp.getDescripcion()));
        this.getFormularioEspecifico().getBtnEliminar().setEnabled(false);
        this.getFormularioEspecifico().getBtnGuardar().setEnabled(true);
        this.getFormularioEspecifico().getTxtNombreNuevoParentesco().setEnabled(true);
        this.getFormularioEspecifico().getTxtDescripcion().setEnabled(true);
    }

    public void actualizarModelo() {
        this.getGestor().setModel(this.tomarSeleccionLista());
    }

    public void filtrar() {
        if (this.campoBusquedaVacia()) {
            List TipoParentesco = this.getGestor().listarFiltrarNombre(this.getNombreABuscar());
            this.llenarList(TipoParentesco);
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
            switch (new Util().confirmacion("¿Desea eliminar el Tipo de Parentesco " + nombre + "?")) {
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

    public void imprimir() {
        this.getGestor().imprimir();
    }
    

    public void cerrar() {
        this.getFormularioEspecifico().setVisible(false);
    }
    
    public String tomarNombreTipoParentesco() {
        return this.getFormularioEspecifico().getTxtNombre().getText();
    }       
    
    public void llenarList(List lista) {
        GestorLista gestorLista = new GestorLista();
        gestorLista.llenarList(lista, this.getFormularioEspecifico().getLista());

    }
    
    private TipoParentesco tomarSeleccionLista() {
        return (TipoParentesco) this.getFormularioEspecifico().getLista().getSelectedValue();
    }
    
    public boolean campoBusquedaVacia() {
        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtNombre())) {
            return false;
        }
        return true;
    }
    
     public void clearList() {
        GestorLista gestorLista = new GestorLista();
        gestorLista.clearList(this.getFormularioEspecifico().getLista());

    }
     
     public void listar() {
        List TipoParentesco = this.getGestor().listarTipoParentesco();
        this.llenarList(TipoParentesco);
        this.getFormularioEspecifico().setConfigBtnFiltrar(true);
    }

     
    public boolean comprabarCamposMinimos() {
        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtNombreNuevoParentesco())) {
            new Util().getMensajeError("Campo nombre esta vacio");
            return false;
        }
        return true;

    }

 
    
}
