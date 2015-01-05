/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Paciente;

import Model.Ubicacion.Pais;
import javax.persistence.*;

/**
 *
 * @author Emiliano
 */
@Entity
@Table(name = "tipoEnfermedad")
public class TipoEnfermedad {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String descripcion;
    private int estado;
    public final static int NORMAL = 0;
    public final static int ELIMINADO = 1;

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void asEliminado() {
        this.setEstado(TipoEnfermedad.ELIMINADO);
    }

    public String toString() {
        return this.getNombre();
    }
}
