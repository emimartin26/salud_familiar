/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Ubicacion;

import Hibernate.GestorDeReportes;
import Hibernate.GestorHibernate;
import Model.GestorConsultas;
import Utilidades.Util;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Emiliano
 */
public class GestorPais extends GestorHibernate implements InterfazABM {

    private Pais model;

    public GestorPais() {
        this.setModel(new Pais());
    }

    public Pais getModel() {
        return model;
    }

    public void setModel(Pais model) {
        this.model = model;
    }

    public void crearModelo() {
        this.setModel(new Pais());
    }

    @Override
    public void guardar() {
        try {
            this.guardarObjeto(this.getModel());
            new Util().getMensajeInformation("País guardado con éxito");
        } catch (Exception e) {
            new Util().getMensajeError("Error: " + e);
        }

    }

    @Override
    public void actualizar() {
        try {
            if (this.isRepetido()) {
                new Util().getMensajeError("El País ingresado ya existe en la base de datos.");
            } else {
                this.actualizarObjeto(this.getModel());
                new Util().getMensajeInformation("País actualizado con éxito");

            }
        } catch (Exception e) {
            new Util().getMensajeError("Error: " + e);
        }

    }

    public void actualizarExterno() {
        try {
            this.actualizarObjeto(this.getModel());
        } catch (Exception e) {
            new Util().getMensajeError("Error: " + e);
        }
    }
    /*
     * este metodo dependiendo del modo que recibe: guarda o actualiza.
     */

    public void procesar(int modo) {
        switch (modo) {
            case 0:
                this.guardar();
                break;
            case 1:
                this.actualizar();
                break;
            case 2:
                this.actualizarExterno();
                break;
            default:
                break;
        }
    }

    @Override
    public void eliminar() {
        try {
            this.getModel().asEliminado();
            this.actualizarObjeto(this.getModel());
            new Util().getMensajeInformation("País eliminado con éxito");
        } catch (Exception e) {
            new Util().getMensajeError("Error: " + e);
        }

    }

    public List listarPais() {
        GestorConsultas gestor = new GestorConsultas(Pais.class);
        gestor.addOrdenAscendente("nombre");
        return gestor.resultConsulta();
    }

    public List listarFiltrarNombre(String nombreFiltro) {
        GestorConsultas gestor = new GestorConsultas(Pais.class);
        gestor.addFiltro("nombre", nombreFiltro);
        gestor.addOrdenAscendente("nombre");
        return gestor.resultConsulta();
    }

    @Override
    public void imprimir() {
        try {
            GestorImprimir gestor = new GestorImprimir(this.listarPais(), "Paises", "paises.jasper");
            gestor.imprimir();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public boolean isRepetido() {
        GestorConsultas gestor = new GestorConsultas(Pais.class);
        gestor.addRestriccion("nombre", this.getModel().getNombre());
        return !gestor.resultConsulta().isEmpty();

    }
}
