/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Paciente;

import Model.Persona.Parentesco;
import Model.Persona.Persona;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author Lopez
 */
@Entity
//@Table(name = "paciente")
public class Paciente extends Persona {

    // @Id
    private int codPaciente;
    private int estado;
    public final static int NORMAL = 0;
    public final static int ELIMINADO = 1;
//    
//    @OneToMany(targetEntity = Enfermedad.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Set<Enfermedad> enfermedades;
//    
    @OneToMany(targetEntity = HistoriaClinica.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<HistoriaClinica> historia;
    
    @OneToMany(targetEntity = Parentesco.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Parentesco> parentesco;

    public Paciente() {
        this.setHistoria(new HashSet());
        this.setParentesco(new HashSet());
    }

    public Set<Parentesco> getParentesco() {
        return parentesco;
    }

    public void setParentesco(Set<Parentesco> parentesco) {
        this.parentesco = parentesco;
    }

    public Set<HistoriaClinica> getHistoria() {
        return historia;
    }

    public void setHistoria(Set<HistoriaClinica> historia) {
        this.historia = historia;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(int codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String apellidoYNombre() {
        return getApellido().substring(0, 1).toUpperCase() + getApellido().substring(1) + ", " + getNombre().substring(0, 1).toUpperCase() + getNombre().substring(1);
    }

    public String domicilioConcatenado() {
        return "" + getDomicilio().getDireccion() + " " + getDomicilio().getNumero() + ", Piso: " + getDomicilio().getPiso() + ", N°: " + getDomicilio().getNumDepto();
    }

    public String fechaFormateada() {
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
        return formateador.format(getFechaNac());
    }

    public String documentoYTipo() {
        return getDocumento().getTipoDocumento().getNombre().toUpperCase() + ": " + getDocumento().getNum();
    }

    public void asEliminado() {
        this.setEstado(Paciente.ELIMINADO);
    }
    
    @Override
    public String toString(){
        return this.apellidoYNombre()+" - "+this.documentoYTipo();
    }
}
