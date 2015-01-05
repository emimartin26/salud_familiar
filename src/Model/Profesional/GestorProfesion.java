/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Profesional;

import Hibernate.GestorDeReportes;
import Hibernate.GestorHibernate;
import Model.GestorConsultas;
import Model.Ubicacion.GestorImprimir;
import Model.Ubicacion.InterfazABM;
import Utilidades.Util;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Federico
 */
public class GestorProfesion extends GestorHibernate implements InterfazABM {

    private Profesion model;

    public GestorProfesion() {
        this.setModel(new Profesion());
    }

    public void setModel(Profesion model) {
        this.model = model;
    }

    @Override
    public void guardar() {
        try {
            this.guardarObjeto(this.getModel());
            new Util().getMensajeInformation("Profesión guardada con éxito");
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
                new Util().getMensajeInformation("Profesión actualizada con éxito");
                break;
            default:
                break;
        }
    }

    public Profesion getModel() {
        return model;
    }

    public void crearModelo() {
        this.setModel(new Profesion());
    }

    public void guardar(int modo) {
        switch (modo) {
            case 0:
                this.guardar();
                new Util().getMensajeInformation("Profesión guardada con éxito");
                break;
            case 1:
                this.actualizar();
                new Util().getMensajeInformation("Profesión actualizada con éxito");
                break;
            default:
                break;
        }
    }

    @Override
    public void actualizar() {
        this.actualizarObjeto(this.getModel());
    }

    public boolean isRepetido(String nombre) {
        GestorConsultas gestor = new GestorConsultas(Profesion.class);
        gestor.addRestriccion("nombre", nombre);
        return !gestor.resultConsulta().isEmpty();

    }

    @Override
    public void eliminar() {
        this.getModel().asEliminado();
        this.actualizarObjeto(this.getModel());
        new Util().getMensajeInformation("Profesión eliminada con éxito");

    }

    public List listarProfesion() {
        GestorConsultas gestor = new GestorConsultas(Profesion.class);
        gestor.addOrdenAscendente("nombre");
        return gestor.resultConsulta();
    }

    @Override
    public void imprimir() {
        try {
            GestorImprimir gestor = new GestorImprimir(this.listarProfesion(), "Profesiones", "provincias.jasper");
            gestor.imprimir();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public List filtrarNombre(String nombreFiltro) {
        GestorConsultas gestor = new GestorConsultas(Profesion.class);
        gestor.addFiltro("nombre", nombreFiltro);
        gestor.addOrdenAscendente("nombre");
        return gestor.resultConsulta();
    }
}
