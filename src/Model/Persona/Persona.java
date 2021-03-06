/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Persona;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Emiliano
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
// @Table(name = "persona")
public class Persona {

    @Id    
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private long id;
    
    private String nombre;
    private String apellido;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNac;
    
    @OneToOne(targetEntity = Documento.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Documento documento;
    
    @OneToOne(targetEntity = Domicilio.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Domicilio domicilio;
    
    @OneToMany(targetEntity = Telefono.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Telefono> telefonos;
    

    public Persona() {
        this.setTelefonos(new HashSet());
    }
 
    public Set<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(Set<Telefono> telefonos) {
        this.telefonos = telefonos;
    }   

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
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
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Date getFechaNac() {
        return fechaNac;
    }
    
}
