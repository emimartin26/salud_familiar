/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Ubicacion;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Emiliano
 */
@Entity
@Table(name = "localidad")
public class Localidad {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private int codigoPostal;
    private int estado;
    @ManyToOne(targetEntity = Provincia.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Provincia prov;
    public static int NORMAL = 0;
    public static int ELIMINADO = 1;

    public Localidad(long id, String nombreCiudad, int codigoPostal, int estado, Provincia provincia) {
        this.id = id;
        this.nombre = nombreCiudad;
        this.codigoPostal = codigoPostal;
        this.estado = estado;
    }

    public Localidad() {
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void asEliminado() {
        this.setEstado(Localidad.ELIMINADO);
    }

    public Provincia getProv() {
        return prov;
    }

    public void setProv(Provincia prov) {
        this.prov = prov;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
