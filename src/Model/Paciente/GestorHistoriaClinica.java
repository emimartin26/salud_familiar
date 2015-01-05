/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Paciente;

import Hibernate.GestorHibernate;
import Model.Ubicacion.InterfazABM;
import Utilidades.Util;

/**
 *
 * @author Fede
 */
public class GestorHistoriaClinica extends GestorHibernate implements InterfazABM {
     private HistoriaClinica model;

    public GestorHistoriaClinica() {
        this.setModel(new HistoriaClinica());
    }

    public HistoriaClinica getModel() {
        return model;
    }

    public void setModel(HistoriaClinica model) {
        this.model = model;
    }

    public void crearModelo() {
        this.setModel(new HistoriaClinica());
    }
        public void guardar() {
        try {
            this.guardarObjeto(this.getModel());
            new Util().getMensajeInformation("Historia clínica guardado con éxito");
        } catch (Exception e) {
            new Util().getMensajeError("Error: " + e);
        }


    }

    public void procesar(int modo) {
        switch (modo) {
            case 0:
                this.guardar();
                break;
            case 1:
                this.actualizar();
                break;

            default:
                break;
        }
    }

    @Override
    public void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar() {
        try {
            this.getModel().asEliminado();
            this.actualizarObjeto(this.getModel());
            new Util().getMensajeInformation("Historia clínica eliminada con éxito");
        } catch (Exception e) {
            new Util().getMensajeError("Error: " + e);
        }

    }


    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
