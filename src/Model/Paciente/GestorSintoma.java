/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Paciente;

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
 * @author Emiliano
 */
public class GestorSintoma extends GestorHibernate implements InterfazABM {

    private Sintoma model;

    public GestorSintoma() {
        this.setModel(new Sintoma());
    }

    public Sintoma getModel() {
        return model;
    }

    public void setModel(Sintoma model) {
        this.model = model;
    }

    public void crearModelo() {
        this.setModel(new Sintoma());
    }

    public void guardar() {
        try {
            this.guardarObjeto(this.getModel());
            new Util().getMensajeInformation("Síntoma guardado con éxito");
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
            new Util().getMensajeInformation("Síntoma actualizado con éxito");
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
            new Util().getMensajeInformation("Síntoma eliminado con éxito");
        } catch (Exception e) {
        }

    }

    @Override
    public void imprimir() {
        GestorImprimir gestImp= new GestorImprimir(this.listarSintoma(), "Sintomas", "provincias.jasper");
        gestImp.imprimir();
        

    }

    public List listarSintoma() {
        GestorConsultas gestor = new GestorConsultas(Sintoma.class);
        gestor.addOrdenAscendente("nombre");
        return gestor.resultConsulta();
    }

    public List listarFiltrarNombre(String nombre) {
        GestorConsultas gestor = new GestorConsultas(Sintoma.class);
        gestor.addFiltro("nombre", nombre);
        gestor.addOrdenAscendente("nombre");
        return gestor.resultConsulta();
    }

    public boolean isRepetido(String nombre) {
        GestorConsultas gestor = new GestorConsultas(Sintoma.class);
        gestor.addRestriccion("nombre", nombre);
        return !gestor.resultConsulta().isEmpty();

    }
    public List filtrarConb(Enfermedad enfermedad, String nombreFiltro) {
        GestorConsultas gestor = new GestorConsultas(Enfermedad.class);
        gestor.addFiltroPorObjeto("enfermedad", enfermedad);
        gestor.addFiltro("nombre", nombreFiltro);
        gestor.addOrdenAscendente("nombre");
        return gestor.resultConsulta();
    }

}
