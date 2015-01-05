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
@Table(name = "pais")
public class Pais {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private int estado;
    @OneToMany(targetEntity = Provincia.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Provincia> provincias;
            public final static int NORMAL = 0;
            public final static int ELIMINADO = 1;

    public Pais(long id, String nombre, int estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.provincias = new <Provincia> HashSet();
    }

    public Pais() {
         this.provincias = new <Provincia> HashSet();
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
        this.nombre = nombre.toLowerCase().trim();
    }

    public void add(Provincia prov) {
        this.provincias.add(prov);
    }
    public void remove(Provincia prov){
        this.provincias.remove(prov);
    }

    public Set<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(Set<Provincia> provincias) {
        this.provincias = provincias;
    }

    public void asEliminado() {
        this.setEstado(Pais.ELIMINADO);
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
