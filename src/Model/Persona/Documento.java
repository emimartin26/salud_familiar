/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Persona;

import javax.persistence.*;

/**
 *
 * @author Emiliano
 */
@Entity
@Table(name = "documento")
public class Documento {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private long id;
    private String num;
    private int estado;
        public final static int NORMAL = 0;
        public final static int ELIMINADO = 1;
    @OneToOne(targetEntity = TipoDocumento.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private TipoDocumento tipoDocumento;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void asEliminado() {
        this.setEstado(Documento.ELIMINADO);
    }

    @Override
    public String toString() {
        return this.getNum();
    }
    
}
