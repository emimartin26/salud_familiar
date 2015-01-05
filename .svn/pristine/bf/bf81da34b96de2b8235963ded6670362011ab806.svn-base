/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Paciente;

import Model.Persona.Persona;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Emiliano
 */
@Entity
@Table(name = "grupoFamiliar")
public class GrupoFamiliar {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private long id;
    private int numGrupo;
    private int estado;
    public final static int NORMAL = 0;
    public final static int ELIMINADO = 1;
    @OneToMany(targetEntity = Persona.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Persona> personas;

    public GrupoFamiliar() {
        this.setPersonas(new HashSet());
    }

    public int getNumGrupo() {
        return numGrupo;
    }

    public void setNumGrupo(int numGrupo) {
        this.numGrupo = numGrupo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(Set<Persona> personas) {
        this.personas = personas;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void asEliminado() {
        this.setEstado(GrupoFamiliar.ELIMINADO);
    }
}
