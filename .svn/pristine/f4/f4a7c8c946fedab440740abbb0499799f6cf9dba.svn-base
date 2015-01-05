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
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Emiliano Martin
 */
public class GestorEnfermedad extends GestorHibernate implements InterfazABM {

    private Enfermedad model;

    public GestorEnfermedad() {
        this.setModel(new Enfermedad());
    }

    public Enfermedad getModel() {
        return model;
    }

    public void setModel(Enfermedad model) {
        this.model = model;
    }

    public void crearModelo() {
        this.setModel(new Enfermedad());
    }

    @Override
    public void guardar() {
        try {
            this.guardarObjeto(this.getModel());
            new Util().getMensajeInformation("Enfermedad guardada con éxito");
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
            new Util().getMensajeInformation("Enfermedad actualizada con éxito");
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
            new Util().getMensajeInformation("Enfermedad eliminada con éxito");
        } catch (Exception e) {
        }

    }

    public List listarEnfermedades() {
        GestorConsultas gestor = new GestorConsultas(Enfermedad.class);
        gestor.addOrdenAscendente("nombre");
        return gestor.resultConsulta();
    }

    public List filtrarTipoEnfermedad(TipoEnfermedad tipoEnfermedad) {
        GestorConsultas gestor = new GestorConsultas(Enfermedad.class);
        gestor.addFiltroPorObjeto("tipoEnfermedad", tipoEnfermedad);
        gestor.addOrdenAscendente("nombre");
        return gestor.resultConsulta();
    }

    public List filtrarConb(TipoEnfermedad tipoEnfermedad, String nombreFiltro) {
        GestorConsultas gestor = new GestorConsultas(Enfermedad.class);
        gestor.addFiltroPorObjeto("tipoEnfermedad", tipoEnfermedad);
        gestor.addFiltro("nombre", nombreFiltro);
        gestor.addOrdenAscendente("nombre");
        return gestor.resultConsulta();
    }

    public List filtrarNombre(String nombre) {
        GestorConsultas gestor = new GestorConsultas(Enfermedad.class);
        gestor.addFiltro("nombre", nombre);
        gestor.addOrdenAscendente("nombre");
        return gestor.resultConsulta();

    }

    @Override
    public void imprimir() {
        GestorImprimir gestor = new GestorImprimir(this.listarEnfermedades(), "Enfermedades", "enfermedades.jasper");
        gestor.imprimir();
    }
}
