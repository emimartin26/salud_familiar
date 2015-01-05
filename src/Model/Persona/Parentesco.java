/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Persona;

import Model.Paciente.Paciente;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Fede
 */
@Entity
@Table(name = "parentesco")
public class Parentesco {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private long id;
    @OneToOne(targetEntity = TipoParentesco.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private TipoParentesco tipoParentesco;
    
    @OneToOne(targetEntity = Paciente.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Paciente familiar1;
    @OneToOne(targetEntity = Paciente.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Paciente familiar2;
    
    private String descripcion;
    private int estado;
    public final static int NORMAL = 0;
    public final static int ELIMINADO = 1;

    public Parentesco() {
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Paciente getFamiliar1() {
        return familiar1;
    }

    public void setFamiliar1(Paciente familiar1) {
        this.familiar1 = familiar1;
    }

    public Paciente getFamiliar2() {
        return familiar2;
    }

    public void setFamiliar2(Paciente familiar2) {
        this.familiar2 = familiar2;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoParentesco getTipoParentesco() {
        return tipoParentesco;
    }

    public void setTipoParentesco(TipoParentesco tipoParentesco) {
        this.tipoParentesco = tipoParentesco;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
        public void asEliminado() {
        this.setEstado(Parentesco.ELIMINADO);
    }
        public String toString() {
            return "El paciente es "+this.getTipoParentesco().getNombre().toUpperCase()+" de: "+this.getFamiliar2().apellidoYNombre();
        }
}
