/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Principal;

import Model.Paciente.GestorEnfermedad;
import Model.Paciente.GestorPaciente;
import Model.Profesional.GestorProfesionales;
import Utilidades.Util;
import Vistas.InterfazFrm;
import Vistas.Paciente.*;
import Vistas.Profesional.GestorVistaProfesional;
import Vistas.Profesional.GestorVistaProfesiones;
import Vistas.Ubicacion.GestorVistaLocalidad;
import Vistas.Ubicacion.GestorVistaPais;
import Vistas.Ubicacion.GestorVistaProvincia;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JDesktopPane;

/**
 *
 * @author Emiliano
 */
public class GestorVistaPrincipal implements InterfazFrm {
    
    private FrmPrincipal formularioPrincipal;
    
    public FrmPrincipal getFormularioPrincipal() {
        return formularioPrincipal;
    }
    
    public void setFormularioPrincipal(FrmPrincipal formularioPrincipal) {
        this.formularioPrincipal = formularioPrincipal;
    }
    
    public JDesktopPane getEscritorio() {
        return this.getFormularioPrincipal().getEscritorio();
    }
    
    public void crearFormularioPrincipal() {
        this.setFormularioPrincipal(new FrmPrincipal(this));
    }
    
    public void mostrarFormulario() {
        try {
            //Sobreescribo el puntero de formulario principal para poder aplicar la configuracion
            this.crearFormularioPrincipal();
            this.getFormularioPrincipal().setVisible(true);
        } catch (Exception e) {
            new Util().getMensajeError("Errror en mostrar formulario: " + e + "");
        }
        
    }
    
    @Override
    public void abrir() {
        this.crearFormularioPrincipal();
        this.mostrarFormulario();
    }
    
    @Override
    public void cerrar() {
        this.getFormularioPrincipal().setVisible(false);
        this.getFormularioPrincipal().dispose();
    }
    
    public void abrirFrmPais() {
        GestorVistaPais gestorVpais = new GestorVistaPais(this.getEscritorio());
        gestorVpais.abrir();
    }
    
    public void abrirFrmEnfermedad() {
        GestorVistaEnfermedad gestorVEnfermedad = new GestorVistaEnfermedad(this.getEscritorio());
        gestorVEnfermedad.abrir();
        
    }
    
    public void abrirFrmProvincia() {
        GestorVistaProvincia gestorVProvincia = new GestorVistaProvincia(this.getEscritorio());
        gestorVProvincia.abrir();
        
    }
    
    public void abrirFrmLocalidad() {
        GestorVistaLocalidad gestorVLocalidad = new GestorVistaLocalidad(this.getEscritorio());
        gestorVLocalidad.abrir();
    }
    
    public void abrirFrmProfesiones() {
        GestorVistaProfesiones gestorprofesiones = new GestorVistaProfesiones(this.getEscritorio());
        gestorprofesiones.abrir();
    }
    
    public void abrirFrmProfesional() {
        GestorVistaProfesional gestorVProfesional = new GestorVistaProfesional(this.getEscritorio());
        gestorVProfesional.abrir();
    }
    
    public void abrirFrmPaciente() {
        GestorVistaPaciente gestor = new GestorVistaPaciente(this.getEscritorio());
        gestor.abrir();
    }
    
    public void abrirFrmSintomas() {
        GestorVistaSintomas gestor = new GestorVistaSintomas(this.getEscritorio());
        gestor.abrir();
    }
    
    public void abrirFrmTipoEnfermedades() {
        GestorVistaTipoEnfermedad gestor = new GestorVistaTipoEnfermedad(this.getEscritorio());
        gestor.abrir();
    }
      public void abrirFrmRelacion() {
        GestorVistaRelacionSintEnfe gestor = new GestorVistaRelacionSintEnfe(this.getEscritorio());
        gestor.abrir();
    }
      public void abrirFrmVisualizarTree(){
          GestorVistaVisualizarTree gestor = new GestorVistaVisualizarTree(this.getEscritorio());
          gestor.abrir();
      }
      
      public void abrirFrmTipoParentesco(){
          GestorVistaTipoParentesco gestor = new GestorVistaTipoParentesco(this.getEscritorio());
          gestor.abrir();
      }
    public String getFecha() {
        SimpleDateFormat formateador = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("es"));
        Date fechaDate = new Date();
        String fecha = formateador.format(fechaDate);
        return fecha;
    }
    
    public void imprimirPacientes(){
        GestorPaciente gestor = new GestorPaciente();
        gestor.imprimir();
    }
    
    public void imprimirEnfermedades(){
        GestorEnfermedad gestor = new GestorEnfermedad();
        gestor.imprimir();
    }
        
    public void imprimirProfesionales(){
        GestorProfesionales gestor = new GestorProfesionales();
        gestor.imprimir();
    }
}
