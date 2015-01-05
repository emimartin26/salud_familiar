/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Persona;

/**
 *
 * @author Federico
 */
public class GestorDocumento {
   private Documento model;

    public GestorDocumento() {
        this.setModel(new Documento());
    }

    public Documento getModel() {
        return model;
    }

    public void setModel(Documento model) {
        this.model = model;
    }

    public void crearModelo() {
        this.setModel(new Documento());
    }
  
}
