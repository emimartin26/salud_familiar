/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Persona;

import Model.Ubicacion.Localidad;
import javax.persistence.*;

/**
 *
 * @author Emiliano
 */
@Entity
@Table(name = "domicilio")
public class Domicilio {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private long id;
    private String direccion;
    private int numero;
    private String piso;
    private String numDepto;
    private int estado;
        public final static int NORMAL = 0;
        public final static int ELIMINADO = 1;
    @OneToOne(targetEntity = Localidad.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Localidad localidad;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNumDepto() {
        return numDepto;
    }

    public void setNumDepto(String numDepto) {
        this.numDepto = numDepto;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void asEliminado() {
        this.setEstado(Domicilio.ELIMINADO);
    }
}
