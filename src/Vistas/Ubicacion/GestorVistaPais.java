/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Ubicacion;

import Model.Ubicacion.GestorPais;
import Model.Ubicacion.Pais;
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
public class GestorVistaPais extends GestorVista implements InterfazFrm {

    private GestorPais gestor;

    public GestorVistaPais(JDesktopPane escritorio) {
        this.setEscritorio(escritorio);
        this.setFrame(new FrmPais(this));
        this.setGestor(new GestorPais());
    }

    private Pais getModel() {
        return this.gestor.getModel();
    }

    public GestorPais getGestor() {
        return gestor;
    }

    public final void setGestor(GestorPais gestor) {
        this.gestor = gestor;
    }

    public String getNombreABuscar() {
        return this.getFormularioEspecifico().getTxtNombrePaisBuscar().getText();
    }

    @Override
    public void abrir() {
        this.getEscritorio().add(this.getFrame());
        this.getFrame().setVisible(true);
    }

    public FrmPais getFormularioEspecifico() {
        return (FrmPais) this.getFrame();
    }

    public void guardar() {
        if (this.comprabarCamposMinimos()) {
            if (this.isNuevo()) {
                this.getGestor().crearModelo();
                this.getModel().setNombre(getFormularioEspecifico().getTxtNombreNuevoPais().getText());
                this.getGestor().procesar(this.getModo());
                this.getFormularioEspecifico().configInicial();
            } else {
                this.getGestor().getModel().setNombre(this.getFormularioEspecifico().getTxtNombreNuevoPais().getText());
                this.getGestor().procesar(this.getModo());
                this.getFormularioEspecifico().configInicial();
                this.clearList();
            }

        }

    }

    public void accionModificar() {
        if (this.getFormularioEspecifico().getLista().getSelectedValue() == null) {
            new Util().getMensajeError("No ha seleccionado nada");
        } else {/*selecciono algo*/

            this.actualizarVista();
            this.actualizarModelo();
        }

    }

    public void actualizarVista() {
        this.getFormularioEspecifico().getBtnGuardar().setEnabled(true);
        String nombre = this.getFormularioEspecifico().getLista().getSelectedValue().toString();
        this.getFormularioEspecifico().getTxtNombreNuevoPais().setEnabled(true);
        this.getFormularioEspecifico().getTxtNombreNuevoPais().setText(nombre);
        this.getFormularioEspecifico().getTxtNombreNuevoPais().requestFocus();
    }

    public void actualizarModelo() {
        this.getGestor().setModel(this.getSeleccionLista());
    }

    public void eliminarPais() {
        if (this.getFormularioEspecifico().getLista().getSelectedValue() == null) {
            new Util().getMensajeError("No ha seleccionado nada");
        } else {
            String nombre = this.getFormularioEspecifico().getLista().getSelectedValue().toString();
            switch (new Util().confirmacion("¿Desea eliminar el país " + nombre + "?")) {
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
        this.getGestor().setModel(this.getSeleccionLista());
        this.getGestor().eliminar();
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

    public void listar() {
        List paises = this.getGestor().listarPais();
        this.llenarList(paises);
        this.getFormularioEspecifico().setConfigBtnFiltrar(true);
    }

    public void llenarList(List lista) {
        GestorLista gestorLista = new GestorLista();
        gestorLista.llenarList(lista, this.getFormularioEspecifico().getLista());

    }

    public void clearList() {
        GestorLista gestorLista = new GestorLista();
        gestorLista.clearList(this.getFormularioEspecifico().getLista());

    }

    public boolean comprabarCamposMinimos() {
        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtNombreNuevoPais())) {
            new Util().getMensajeError("Campo nombre esta vacío");
            return false;
        }
        return true;

    }

    public boolean campoBusquedaVacia() {
        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtNombrePaisBuscar())) {
            return false;
        }
        return true;
    }

    private Pais getSeleccionLista() {
        return (Pais) this.getFormularioEspecifico().getLista().getSelectedValue();
    }

    public void imprimir() {
        this.getGestor().imprimir();
    }

    @Override
    public void cerrar() {
        this.getFormularioEspecifico().setVisible(false);
    }
}
