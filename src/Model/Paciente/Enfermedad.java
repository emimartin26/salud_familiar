/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Paciente;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Lopez
 */
@Entity
@Table(name = "enfermedad")
public class Enfermedad {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private int estado;
        public final static int NORMAL = 0;
        public final static int ELIMINADO = 1;
    @ManyToMany(targetEntity = Sintoma.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Sintoma> sintoma;
    @OneToOne(targetEntity = TipoEnfermedad.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private TipoEnfermedad tipoEnfermedad;

    public Enfermedad() {
        this.sintoma = new <Sintoma> HashSet();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Sintoma> getSintoma() {
        return sintoma;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setSintoma(Set<Sintoma> sintoma) {
        this.sintoma = sintoma;
    }

    public TipoEnfermedad getTipoEnfermedad() {
        return tipoEnfermedad;
    }

    public void setTipoEnfermedad(TipoEnfermedad tipoEnfermedad) {
        this.tipoEnfermedad = tipoEnfermedad;
    }

    public void asEliminado() {
        this.setEstado(Enfermedad.ELIMINADO);
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}