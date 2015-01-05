/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Paciente;

import Model.Profesional.Profesional;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Fede
 */
@Entity
@Table(name = "historiaClinica")
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private long id;

    public HistoriaClinica() {
        this.setEnfermedad(new HashSet());
        this.setSintoma(new HashSet());
    }

    private int estado;
    public final static int NORMAL = 0;
    public final static int ELIMINADO = 1;
    @OneToOne(targetEntity = Paciente.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Paciente paciente;
    
    private String fechaConsulta;
    private String observacion;
    
    @ManyToMany(targetEntity = Enfermedad.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Enfermedad> enfermedad;
    
    @ManyToMany(targetEntity = Sintoma.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Sintoma> sintoma;
    
    @OneToOne(targetEntity = Profesional.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Profesional profesional;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public Set<Enfermedad> getEnfermedad() {
        return enfermedad;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public void setEnfermedad(Set<Enfermedad> enfermedad) {
        this.enfermedad = enfermedad;
    }

    public Set<Sintoma> getSintoma() {
        return sintoma;
    }

    public void setSintoma(Set<Sintoma> sintoma) {
        this.sintoma = sintoma;
    }


    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void asEliminado() {
        this.setEstado(Enfermedad.ELIMINADO);
    }
    public String toString() {
        return this.getFechaConsulta()+" - Profesional: "+this.getProfesional().apellidoYNombre();
    }
}
