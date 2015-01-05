/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Ubicacion;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Emiliano
 */
@Entity
@Table(name = "provincia")
public class Provincia {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private int estado;
    public final static int NORMAL = 0;
    public final static int ELIMINADO = 1;
    @OneToMany(targetEntity = Localidad.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Localidad> localidades;
    @ManyToOne(targetEntity = Pais.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Pais pais;

    public Provincia() {
        this.localidades = new <Localidad> HashSet();
    }

    public Provincia(String nombre, Set<Localidad> ciudades) {
        this.nombre = nombre;
        this.localidades = ciudades;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.trim().toLowerCase();
    }

    public Set<Localidad> getCiudades() {
        return localidades;
    }

    public void setCiudades(Set<Localidad> localidades) {
        this.localidades = localidades;
    }

    public Set<Localidad> getLocalidades() {
        return localidades;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public void add(Localidad loc) {
        this.getLocalidades().add(loc);
    }

    public void remove(Localidad loc) {
        this.getLocalidades().remove(loc);
    }

    private void setLocalidades(Set<Localidad> localidades) {
        this.localidades = localidades;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public long getId() {
        return id;
    }

    public void asEliminado() {
        this.setEstado(Provincia.ELIMINADO);
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
