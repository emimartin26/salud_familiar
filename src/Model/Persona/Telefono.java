/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Persona;

import javax.persistence.*;

/**
 *
 * @author Emiliano
 */
@Entity
@Table(name = "telefono")
public class Telefono {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private long id;
    private int numero;
    private int caracteristica;
    private int estado;
        public final static int NORMAL = 0;
        public final static int ELIMINADO = 1;

    public int getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(int caracteristica) {
        this.caracteristica = caracteristica;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void asEliminado() {
        this.setEstado(Telefono.ELIMINADO);
    }
    
    @Override
    public String toString(){
        return this.caracteristica+"-"+this.numero;
    }
}
