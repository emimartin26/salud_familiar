/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Persona;

import Hibernate.GestorHibernate;
import Model.GestorConsultas;
import Model.Ubicacion.InterfazABM;
import Utilidades.Util;
import java.util.List;

/**
 *
 * @author Federico
 */
public class GestorTelefono extends GestorHibernate implements InterfazABM {
           private Telefono model;

    public GestorTelefono() {
        this.setModel(new Telefono());
    }

    public Telefono getModel() {
        return model;
    }

    public void setModel(Telefono model) {
        this.model = model;
    }

    public void crearModelo() {
        this.setModel(new Telefono());
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
//                this.actualizarExterno();
                break;
            default:
                break;
        }
    }
    
    
    @Override
    public void guardar() {
        try {
            this.guardarObjeto(this.getModel());
            new Util().getMensajeInformation("Telefono agregado con Exito");
        } catch (Exception e) {
            new Util().getMensajeError("Error: " + e);
        }

    }
    
    public List listarTelefonos() {
        GestorConsultas gestor = new GestorConsultas(Telefono.class);
        gestor.addOrdenAscendente("numero");
        return gestor.resultConsulta();
    }

    @Override
    public void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


  
}
