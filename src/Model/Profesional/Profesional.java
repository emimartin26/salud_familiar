/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Profesional;

import Model.Persona.Persona;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Federico
 */
@Entity
@Table(name = "profesionales")
public class Profesional extends Persona {

    private String matricula;
    
    private int estado;

    @ManyToMany(targetEntity = Profesion.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Profesion> profesiones;
    
    
    public final static int NORMAL = 0;
    public final static int ELIMINADO = 1;
     
    public Profesional() {
        this.setProfesiones(new HashSet());
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Set<Profesion> getProfesiones() {
        return profesiones;
    }

    public void setProfesiones(Set<Profesion> profesiones) {
        this.profesiones = profesiones;
    }

    public void asEliminado() {
        this.setEstado(Profesional.ELIMINADO);
    }
    
      public String apellidoYNombre(){
        return getApellido().substring(0,1).toUpperCase()+getApellido().substring(1)+", "+getNombre().substring(0,1).toUpperCase()+getNombre().substring(1);
    }
    
    public String domicilioConcatenado(){
        return getDomicilio().getDireccion().substring(0,1).toUpperCase()+getDomicilio().getDireccion().substring(1).toLowerCase()+" "+getDomicilio().getNumero()+" (Piso: "+getDomicilio().getPiso().toUpperCase()+"| Dpto:"+getDomicilio().getNumDepto().toUpperCase()+")";
    }
    public String documentoYTipo() {
        return getDocumento().getTipoDocumento().getNombre().toUpperCase()+": "+getDocumento().getNum();
    }
    @Override
    public String toString() {
        return this.apellidoYNombre();
    }
}
