/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Paciente;

import Hibernate.GestorHibernate;
import Model.GestorConsultas;
import Model.Ubicacion.GestorImprimir;
import Model.Ubicacion.InterfazABM;
import Utilidades.Util;
import java.util.List;

/**
 *
 * @author Emiliano
 */
public class GestorTipoEnfermedad extends GestorHibernate implements InterfazABM {

    private TipoEnfermedad model;

    public GestorTipoEnfermedad() {
        this.setModel(new TipoEnfermedad());
    }

    public TipoEnfermedad getModel() {
        return model;
    }

    public void setModel(TipoEnfermedad model) {
        this.model = model;
    }

    public void crearModelo() {
        this.setModel(new TipoEnfermedad());
    }

    public void guardar() {
        try {
            this.guardarObjeto(this.getModel());
            new Util().getMensajeInformation("Tipo de enfermedad guardada con éxito");
        } catch (Exception e) {
            new Util().getMensajeError("Error: " + e);
        }


    }

    public void procesar(int modo) {
        switch (modo) {
            case 0:
                this.guardar();
                break;
            case 1:
                this.actualizar();
                break;
            case 2:
                this.actualizarExterno();
                break;
            default:
                break;
        }
    }

    @Override
    public void actualizar() {
        try {
            this.actualizarObjeto(this.getModel());
            new Util().getMensajeInformation("Tipo de enfermedad actualizada con éxito");
        } catch (Exception e) {
            new Util().getMensajeError("Error: " + e);
        }

    }

    public void actualizarExterno() {
        try {
            this.actualizarObjeto(this.getModel());
        } catch (Exception e) {
            new Util().getMensajeError("Error: " + e);
        }
    }

    @Override
    public void eliminar() {
        try {
            this.getModel().asEliminado();
            this.actualizarObjeto(this.getModel());
            new Util().getMensajeInformation("Tipo de enfermedad eliminada con éxito");
        } catch (Exception e) {
        }

    }

    @Override
    public void imprimir() {
        GestorImprimir gestImp = new GestorImprimir(this.listarTipoEnfermedad(), "TipoEnfermedad", "provincias.jasper");
        gestImp.imprimir();
    }
    
   public List listarFiltrarNombre(String nombre) {
        GestorConsultas gestor = new GestorConsultas(TipoEnfermedad.class);
        gestor.addFiltro("nombre", nombre);
        gestor.addOrdenAscendente("nombre");
        return gestor.resultConsulta();
    }

    public List listarTipoEnfermedad() {
        GestorConsultas gestor = new GestorConsultas(TipoEnfermedad.class);
        gestor.addOrdenAscendente("nombre");
        return gestor.resultConsulta();
    }
}
