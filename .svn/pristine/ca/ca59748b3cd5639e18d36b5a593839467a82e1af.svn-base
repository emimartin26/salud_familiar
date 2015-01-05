/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Paciente;

import Hibernate.GestorHibernate;
import Model.GestorConsultas;
import Model.Persona.Documento;
import Model.Persona.TipoDocumento;
import Model.Ubicacion.GestorImprimir;
import Model.Ubicacion.InterfazABM;
import Model.Ubicacion.Pais;
import Utilidades.Util;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Lopez
 */
public class GestorPaciente extends GestorHibernate implements InterfazABM {

    private Paciente model;

    public GestorPaciente() {
        this.setModel(new Paciente() {
        });
    }

    public void setModel(Paciente model) {
        this.model = model;
    }

    public Paciente getModel() {
        return model;
    }

    public void crearModelo() {
        this.setModel(new Paciente());
    }

    public void procesar(int modo) {
        switch (modo) {
            case 0:
                this.guardar();
                break;
            case 1:
                this.actualizar();
                break;
            default:
                break;
        }
    }

    @Override
    public void guardar() {
        try {
            this.guardarObjeto(this.getModel());
            new Util().getMensajeInformation("Paciente guardado con éxito");
        } catch (Exception e) {
            new Util().getMensajeError("Error: " + e);
        }

    }

    @Override
    public void actualizar() {
        try {
        this.actualizarObjeto(this.getModel());
        new Util().getMensajeInformation("Paciente Actualizado con éxito");            
        } catch (Exception e) {
            new Util().getMensajeError("Error: " + e);
        }

    }

    @Override
    public void eliminar() {
        try {
        this.getModel().asEliminado();
        this.getModel().getDocumento().asEliminado();
        this.actualizarObjeto(this.getModel());
        new Util().getMensajeInformation("Paciente Eliminado con éxito");
        } catch (Exception e) {
            new Util().getMensajeError("Error: " + e);
        }
    }

    @Override
    public void imprimir() {
        try {
            GestorImprimir gestor = new GestorImprimir(this.listarPaciente(), "Pacientes", "pacientes.jasper");
            gestor.imprimir();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }        
    }

    public List listarDni() {
        GestorConsultas gestor = new GestorConsultas(TipoDocumento.class);
        gestor.addOrdenAscendente("nombre");
        return gestor.resultConsulta();
    }

    public List listarPais() {
        GestorConsultas gestor = new GestorConsultas(Pais.class);
        gestor.addOrdenAscendente("nombre");
        return gestor.resultConsulta();
    }

    public List listarPaciente() {
        GestorConsultas gestor = new GestorConsultas(Paciente.class);
        gestor.addOrdenAscendente("apellido");
        return gestor.resultConsulta();
    }
    
    public List listarFiltrarApellido(String apellidoFiltro) {
        GestorConsultas gestor = new GestorConsultas(Paciente.class);
        gestor.addFiltro("apellido", apellidoFiltro);
        gestor.addOrdenAscendente("apellido");
        return gestor.resultConsulta();
    }
    
    public List listarFiltrarNombre(String nombreFiltro) {
        GestorConsultas gestor = new GestorConsultas(Paciente.class);
        gestor.addFiltro("nombre", nombreFiltro);
        gestor.addOrdenAscendente("nombre");
        return gestor.resultConsulta();
    }
    
    public boolean isRepetido(Documento doc) {
        GestorConsultas ges = new GestorConsultas(Documento.class);
        ges.addRestriccion("num", doc.getNum());
        boolean uno = !ges.resultConsulta().isEmpty();
        ges.resultConsulta().clear();
        return uno; //|| dos;

    }
}
