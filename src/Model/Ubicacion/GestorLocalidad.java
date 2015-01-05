/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Ubicacion;

import Hibernate.GestorHibernate;
import Model.GestorConsultas;
import Utilidades.Util;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author emiliano
 */
public class GestorLocalidad extends GestorHibernate implements InterfazABM {

    private Localidad model;

    public GestorLocalidad() {
    }

    public Localidad getModel() {
        return model;
    }

    public void setModel(Localidad model) {
        this.model = model;
    }

    public void crearModelo() {
        this.setModel(new Localidad());
    }

    @Override
    public void guardar() {
        try {
            this.guardarObjeto(this.getModel());
            new Util().getMensajeInformation("Localidad guardada con éxito");
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
            new Util().getMensajeInformation("Localidad actualizada con éxito");
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
            new Util().getMensajeInformation("Localidad eliminada con éxito");
        } catch (Exception e) {
        }

    }

     @Override
    public void imprimir() {
        try {
            GestorImprimir gestor = new GestorImprimir(this.listarLocalidades(), "Localidades", "localidad.jasper");
            gestor.imprimir();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public List listarLocalidades() {
        GestorConsultas gestor = new GestorConsultas(Localidad.class);
        gestor.addOrdenAscendente("nombre");
        return gestor.resultConsulta();
    }

    public List listarLocalidadesXCodigo(int codigo) {
        GestorConsultas gestor = new GestorConsultas(Localidad.class);
        gestor.addFiltroInt("codigoPostal", codigo);
        return gestor.resultConsulta();
    }
    public List listarLocalidadesXNombre(String nombre){
        GestorConsultas gestor = new GestorConsultas(Localidad.class);
        gestor.addFiltro("nombre", nombre);
        gestor.addOrdenAscendente("nombre");
        return gestor.resultConsulta();
    }

    public List filtrarNombre(String nombre) {
        GestorConsultas gestor = new GestorConsultas(Provincia.class);
        gestor.addFiltro("nombre", nombre);
        gestor.addOrdenAscendente("nombre");
        return gestor.resultConsulta();

    }
    
}
