/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Paciente;

import javax.persistence.*;

/**
 *
 * @author Emiliano
 */
@Entity
@Table(name = "sintoma")
public class Sintoma {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String descripcion;
    private int estado;
    public final static int NORMAL = 0;
    public final static int ELIMINADO = 1;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public void asEliminado() {
        this.setEstado(Sintoma.ELIMINADO);
    }
 
    
    @Override
    public String toString() {
        return this.getNombre();
    }

   
}
