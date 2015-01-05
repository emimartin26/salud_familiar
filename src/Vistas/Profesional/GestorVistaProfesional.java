
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Profesional;

import Model.GestorConsultas;
import Model.Persona.GestorDocumento;
import Model.Persona.GestorDomicilio;
import Model.Persona.GestorTelefono;
import Model.Persona.TipoDocumento;
import Model.Profesional.GestorProfesion;
import Model.Profesional.GestorProfesionales;
import Model.Profesional.Profesion;
import Model.Profesional.Profesional;
import Model.Ubicacion.GestorPais;
import Model.Ubicacion.Localidad;
import Model.Ubicacion.Pais;
import Model.Ubicacion.Provincia;
import Utilidades.GestorCombo;
import Utilidades.GestorLista;
import Utilidades.Util;
import Vistas.GestorVista;
import Vistas.InterfazFrm;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Federico
 */
public class GestorVistaProfesional extends GestorVista implements InterfazFrm {

    private GestorProfesionales gestor;
    private List listaTelefonos;
    private List listaProfesiones;

    public GestorVistaProfesional(JDesktopPane escritorio) {
        this.setEscritorio(escritorio);
        this.setFrame(new FrmProfesional(this));
        this.listaTelefonos = new ArrayList();
        this.listaProfesiones = new ArrayList();
    }

    public List getListaProfesiones() {
        return listaProfesiones;
    }

    public void setListaProfesiones(List listaProfesiones) {
        this.listaProfesiones = listaProfesiones;
    }

    public List getListaTelefonos() {
        return listaTelefonos;
    }

    public void setListaTelefonos(List listaTelefonos) {
        this.listaTelefonos = listaTelefonos;
    }

    public TableModel getTablaModel() {
        return this.getFormularioEspecifico().getTblProfesional().getModel();
    }

    private void crearGestor() {
        this.setGestor(new GestorProfesionales());
    }

    public void setModel(Profesional model) {
        this.gestor.setModel(model);
    }

    public Profesional getModel() {
        return gestor.getModel();
    }

    public void crearModelo() {
        this.setModel(new Profesional());
    }

    public GestorProfesionales getGestor() {
        return gestor;
    }

    public FrmProfesional getFormularioEspecifico() {
        return (FrmProfesional) this.getFrame();
    }

    @Override
    public void abrir() {
        this.getEscritorio().add(this.getFrame());
        this.getFrame().setVisible(true);
    }

    @Override
    public void cerrar() {
        this.getFormularioEspecifico().setVisible(false);
        this.getFormularioEspecifico().dispose();
    }

    public void imprimir() {
        this.crearGestor();
        this.getGestor().imprimir();
    }

    private List buscarProfesiones() {
        GestorProfesion gesprof = new GestorProfesion();
        return gesprof.listarProfesion();
    }

    public void cargarComboProfesiones() {
        GestorCombo gestorCombo = new GestorCombo();
        gestorCombo.cargarCombo(this.buscarProfesiones(), this.getFormularioEspecifico().getCmb_profesionDatos());
    }

    public void cargarComboProfesionesBusq() {
        GestorCombo gestorCombo = new GestorCombo();
        gestorCombo.cargarCombo(this.buscarProfesiones(), this.getFormularioEspecifico().getCmb_profesionBusq());

    }

    public void cargarComboPaises() {
        GestorCombo gestorCombo = new GestorCombo();
        gestorCombo.cargarCombo(listPaises(), this.getFormularioEspecifico().getCmbPaises());

    }

    public List listPaises() {
        GestorPais gestorPais = new GestorPais();
        return gestorPais.listarPais();
    }

    public void clearListProf() {
        GestorLista gestorLista = new GestorLista();
        gestorLista.clearList(this.getFormularioEspecifico().getListProfesiones());


    }

    public void clearListTel() {
        GestorLista gestorLista = new GestorLista();
        gestorLista.clearList(this.getFormularioEspecifico().getListTelefonos());
    }

    public void setGestor(GestorProfesionales gestor) {
        this.gestor = gestor;
    }

    public void obtenerUbicacionProfesional() {
        GestorDomicilio gestorDom = new GestorDomicilio();
        gestorDom.crearModelo();
        gestorDom.getModel().setPiso(this.getFormularioEspecifico().getTxtPiso().getText());
        gestorDom.getModel().setDireccion(this.getFormularioEspecifico().getTxtCalle().getText());
        if (!this.getFormularioEspecifico().getTxtNroCalle().getText().isEmpty()) {
            gestorDom.getModel().setNumero(Integer.parseInt(this.getFormularioEspecifico().getTxtNroCalle().getText()));
        }
        gestorDom.getModel().setNumDepto(this.getFormularioEspecifico().getTxtNumDpto().getText());
        gestorDom.getModel().setLocalidad(this.seleccionComboLoc());
        this.getModel().setDomicilio(gestorDom.getModel());
    }

    public void llenarListTel(List lista) {
        GestorLista gestorLista = new GestorLista();
        gestorLista.llenarList(lista, this.getFormularioEspecifico().getListTelefonos());
    }

    public void llenarListProf(List lista) {
        GestorLista gestorLista = new GestorLista();
        gestorLista.llenarList(lista, this.getFormularioEspecifico().getListProfesiones());
    }

    public void listarTelefono(GestorTelefono gestorTel) {
        List telefonos = gestorTel.listarTelefonos();
        this.llenarListTel(telefonos);

    }

    public void pintarDeBlanco() {
        this.getFormularioEspecifico().getTxtApellido().setBackground(Color.white);
        this.getFormularioEspecifico().getTxtCalle().setBackground(Color.white);
        this.getFormularioEspecifico().getCmbLocalidades().setBackground(Color.white);
        this.getFormularioEspecifico().getTxtNombre().setBackground(Color.white);
        this.getFormularioEspecifico().getTxtNumDocumentoPers().setBackground(Color.white);
        this.getFormularioEspecifico().getCmbProvincias().setBackground(Color.white);
        this.getFormularioEspecifico().getCmbPaises().setBackground(Color.white);
        this.getFormularioEspecifico().getDateFechaNacPers().setBackground(Color.white);
        this.getFormularioEspecifico().getCmbDocumento().setBackground(Color.white);
        this.getFormularioEspecifico().getCmb_profesionDatos().setBackground(Color.white);
        this.getFormularioEspecifico().getTxtMatricula().setBackground(Color.WHITE);
        this.getFormularioEspecifico().getListProfesiones().setBackground(Color.WHITE);
    }

    public void agregarProfesion() {
        this.getListaProfesiones().add(this.getFormularioEspecifico().getCmb_profesionDatos().getSelectedItem());
        this.llenarListProf(this.getListaProfesiones());
    }

    public void agregarNumTelefono() {
        GestorTelefono gestorTel = new GestorTelefono();
        gestorTel.crearModelo();

        String caracTel = this.getFormularioEspecifico().getTxtCaracTel().getText();
        String numTel = this.getFormularioEspecifico().getTxtNumTel().getText();

        gestorTel.getModel().setCaracteristica(Integer.parseInt(caracTel));
        gestorTel.getModel().setNumero(Integer.parseInt(numTel));

        this.getListaTelefonos().add(gestorTel.getModel());
        this.llenarListTel(this.getListaTelefonos());
    }

    public void tomarProfesion() {
        if (Util.estaSeleccionadoCombo(this.getFormularioEspecifico().getCmb_profesionDatos())) {
            new Util().getMensajeError("No seleccionó nada.");
        } else {
            if (Util.estaIngresadoList(this.getListaProfesiones(), this.getFormularioEspecifico().getCmb_profesionDatos().getSelectedItem())) {
                new Util().getMensajeError("Profesión ya ingresada.");
            } else {
                this.agregarProfesion();
                this.getFormularioEspecifico().getCmb_profesionDatos().setSelectedItem(null);
                this.getFormularioEspecifico().getCmb_profesionDatos().requestFocus();
            }
        }
    }

    public boolean estaIngresadoList(List lista, Object obj) {
        return lista.contains(obj);
    }

    public void tomarNumTelefono() {
        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtCaracTel()) || (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtNumTel()))) {
            new Util().getMensajeError("No ingresó ningún teléfono válido.");
        } else {
            this.agregarNumTelefono();
            this.getFormularioEspecifico().getTxtCaracTel().setText("");
            this.getFormularioEspecifico().getTxtNumTel().setText("");
            this.getFormularioEspecifico().getTxtCaracTel().requestFocus();
        }
    }

    public void eliminarProfesionDeLista() {
        if (this.getFormularioEspecifico().getListProfesiones().getSelectedValue() == null) {
            new Util().getMensajeError("No ha seleccionado nada");
        } else {
            this.getListaProfesiones().remove(this.getFormularioEspecifico().getListProfesiones().getSelectedValue());
            this.llenarListProf(this.getListaProfesiones());
        }
    }

    public void eliminarNumTelefono() {
        if (this.getFormularioEspecifico().getListTelefonos().getSelectedValue() == null) {
            new Util().getMensajeError("No ha seleccionado nada");
        } else {
            this.getListaTelefonos().remove(this.getFormularioEspecifico().getListTelefonos().getSelectedValue());
            this.llenarListTel(this.getListaTelefonos());
        }
    }

    public void mostrarDatosProfesional(Profesional prof) {
        this.clearListTel();
        this.clearListProf();
        this.getFormularioEspecifico().getDateFechaNacPers().setDate(prof.getFechaNac());
        this.getFormularioEspecifico().getTxtApellido().setText(prof.getApellido());
        this.getFormularioEspecifico().getTxtNombre().setText(prof.getNombre());
        this.getFormularioEspecifico().getTxtCalle().setText(prof.getDomicilio().getDireccion());
        this.getFormularioEspecifico().getTxtMatricula().setText(prof.getMatricula());
        this.getFormularioEspecifico().getTxtNroCalle().setText(Integer.toString(prof.getDomicilio().getNumero()));
        this.getFormularioEspecifico().getTxtNumDocumentoPers().setText(prof.getDocumento().getNum());
        this.getFormularioEspecifico().getTxtNumDpto().setText(prof.getDomicilio().getNumDepto());
        this.getFormularioEspecifico().getTxtPiso().setText(prof.getDomicilio().getPiso());
        this.getFormularioEspecifico().cargarCombos();
        this.getFormularioEspecifico().getCmbDocumento().setSelectedItem(prof.getDocumento().getTipoDocumento());
        this.getFormularioEspecifico().getCmbPaises().setSelectedItem(prof.getDomicilio().getLocalidad().getProv().getPais());
        this.getFormularioEspecifico().getCmbProvincias().setSelectedItem(prof.getDomicilio().getLocalidad().getProv());
        this.getFormularioEspecifico().getCmbLocalidades().setSelectedItem(prof.getDomicilio().getLocalidad());
        this.getListaTelefonos().clear();
        this.getListaProfesiones().clear();
        this.getListaTelefonos().addAll(prof.getTelefonos());
        this.llenarListTel(getListaTelefonos());
        this.getListaProfesiones().addAll(prof.getProfesiones());
        this.llenarListProf(getListaProfesiones());


    }

    public void mostrarInfoProfesional() {
        if (this.getFormularioEspecifico().getTblProfesional().getSelectedRow() >= 0) {
            Profesional seleccionado = (Profesional) this.getFormularioEspecifico().getTblProfesional().getValueAt(this.getFormularioEspecifico().getTblProfesional().getSelectedRow(), 0); //el 0 es el de la columna que quiero traer
            this.getFormularioEspecifico().configMostrarInfo();
            this.mostrarDatosProfesional(seleccionado);

        } else {
            new Util().getMensajeError("No ha seleccionado nada");
        }
    }

    public void filtrarApellido() {
        if (this.campoApellidoBusquedaVacia()) {
            this.limpiarTabla();
            List profesiones = new ArrayList();

            DefaultTableModel modelo = (DefaultTableModel) this.getTablaModel();
            Iterator iter = this.getGestor().listarFiltrarApellido(this.getApellidoABuscar()).iterator();
            while (iter.hasNext()) {
                Profesional profesional = (Profesional) iter.next();
                profesiones.addAll(profesional.getProfesiones());
                Object[] newRow = {profesional, profesional.apellidoYNombre(), profesional.documentoYTipo(), this.profesionesEnTabla(profesiones), profesional.getMatricula()};
                modelo.addRow(newRow);
                profesiones.clear();
            }
        } else {
            this.limpiarTabla();
        }
    }

    public String getApellidoABuscar() {
        return this.getFormularioEspecifico().getTxtNombreBusq().getText();
    }

    public String getMatriculaBuscar() {
        return this.getFormularioEspecifico().getTxtMatriculaBusq().getText();
    }

    public String getProfesionBuscar() {
        String prof = this.getFormularioEspecifico().getCmb_profesionBusq().getSelectedItem().toString();
        return prof;
    }

    public void filtrarProfesion() {
        if (this.cmbProfesionBusquedaVacio()) {
            this.limpiarTabla();
            List profesiones = new ArrayList();

            DefaultTableModel modelo = (DefaultTableModel) this.getTablaModel();
            Iterator iter = this.getGestor().listarProfesionales().iterator();
            while (iter.hasNext()) {
                Profesional profesional = (Profesional) iter.next();
                profesiones.addAll(profesional.getProfesiones());
                Object[] newRow = {profesional, profesional.apellidoYNombre(), profesional.documentoYTipo(), this.profesionesEnTabla(profesiones), profesional.getMatricula()};
                if (compararProfesionesPorNombre(profesiones)) {
                    modelo.addRow(newRow);
                }
                profesiones.clear();
            }
        } else {
            this.limpiarTabla();
        }

    }

    public boolean compararProfesionesPorNombre(List profesiones) {
        return this.profesionesEnTabla(profesiones).toLowerCase().contains(this.getProfesionBuscar().toLowerCase());

    }

    public void filtrarMatricula() {
        if (this.campoMatriculaBusqVacio()) {
            this.limpiarTabla();
            List profesiones = new ArrayList();

            DefaultTableModel modelo = (DefaultTableModel) this.getTablaModel();
            Iterator iter = this.getGestor().listarPorMatricula(this.getMatriculaBuscar()).iterator();
            while (iter.hasNext()) {
                Profesional profesional = (Profesional) iter.next();
                profesiones.addAll(profesional.getProfesiones());
                Object[] newRow = {profesional, profesional.apellidoYNombre(), profesional.documentoYTipo(), this.profesionesEnTabla(profesiones), profesional.getMatricula()};
                modelo.addRow(newRow);
                profesiones.clear();
            }
        } else {
            this.limpiarTabla();
        }

    }

    public boolean campoApellidoBusquedaVacia() {
        return !(Util.estaVacioTxt(this.getFormularioEspecifico().getTxtNombreBusq()));
    }

    public boolean campoMatriculaBusqVacio() {
        return !(Util.estaVacioTxt(this.getFormularioEspecifico().getTxtMatriculaBusq()));
    }

    public boolean cmbProfesionBusquedaVacio() {
        return !(this.getFormularioEspecifico().getCmb_profesionBusq().getSelectedItem() == null);
    }

    public void obtenerTelefonosProfesional() {
        this.getModel().getTelefonos().addAll(this.getListaTelefonos());
    }

    public void obtenerDatosProfesional() {
        this.getModel().setNombre(getFormularioEspecifico().getTxtNombre().getText().trim().toLowerCase());
        this.getModel().setApellido(getFormularioEspecifico().getTxtApellido().getText().trim().toLowerCase());
        GestorDocumento gestorDoc = new GestorDocumento();;
        gestorDoc.crearModelo();
        gestorDoc.getModel().setNum(this.getFormularioEspecifico().getTxtNumDocumentoPers().getText().trim());
        gestorDoc.getModel().setTipoDocumento(this.seleccionComboTipoDoc());
        this.getModel().setDocumento(gestorDoc.getModel());
        this.getModel().setFechaNac(getFormularioEspecifico().getDateFechaNacPers().getDate());
        this.getModel().setMatricula(getFormularioEspecifico().getTxtMatricula().getText().trim());
        this.getModel().getProfesiones().addAll(this.getListaProfesiones());

    }

    public void actualizarVista() {
        Profesional seleccionado = (Profesional) this.getFormularioEspecifico().getTblProfesional().getValueAt(this.getFormularioEspecifico().getTblProfesional().getSelectedRow(), 0);
        this.getFormularioEspecifico().configVistaModificar();
        this.mostrarDatosProfesional(seleccionado);
    }

    public void actualizarModelo() {
        Profesional seleccionado = (Profesional) this.getFormularioEspecifico().getTblProfesional().getValueAt(this.getFormularioEspecifico().getTblProfesional().getSelectedRow(), 0);
        this.getGestor().setModel(seleccionado);
    }

    public void accionMofidicar() {
        if (this.getFormularioEspecifico().getTblProfesional().getSelectedRow() >= 0) {
            this.actualizarVista();
            this.actualizarModelo();
        } else {
            new Util().getMensajeError("No ha seleccionado nada");
        }
    }

    public void guardar() {
        if (this.comprobarCamposMinimos()) {
            if (this.isNuevo()) {
                this.crearGestor();
                this.getGestor().crearModelo();
                this.obtenerDatosProfesional();
                this.obtenerUbicacionProfesional();
                this.obtenerTelefonosProfesional();
                if (!this.getGestor().isRepetido(this.getModel().getDocumento())) {
                    if (!this.getGestor().isRepetido(this.getModel().getMatricula())) {
                        this.getGestor().procesar(this.getModo());
                        this.limpiarCamposPosGuardado();
                    } else {
                        this.errorMatricula();
                    }
                } else {
                    this.errorDocumento();
                }
            } else {
                this.removeTelefonosYProfesiones();
                this.obtenerDatosProfesional();
                this.obtenerUbicacionProfesional();
                this.obtenerTelefonosProfesional();
                this.getGestor().procesar(this.getModo());
                this.limpiarCamposPosGuardado();
                this.getFormularioEspecifico().setConfigInicial();
            }
        } else {
            new Util().getMensajeError("Hay campos obligatorios vacíos");
        }
    }

    public void eliminar() {
        if (this.isNuevo()) {
            this.crearGestor();
            this.getGestor().crearModelo();
        }
        if (this.getFormularioEspecifico().getTblProfesional().getSelectedRow() >= 0) {
            Profesional elim = (Profesional) this.getFormularioEspecifico().getTblProfesional().getValueAt(this.getFormularioEspecifico().getTblProfesional().getSelectedRow(), 0); //el 0 es el de la columna que quiero traer
            int num = new Util().confirmacion("Usted está por eliminar al Profesional: \n" + elim.apellidoYNombre() + "\n¿Desea continuar?");
            if (num == 0) {
                getGestor().setModel(elim);
                getGestor().eliminar();
                this.limpiarTabla();
                this.cargarTabla();
            }

        } else {
            new Util().getMensajeError("No ha seleccionado nada");
        }
    }

    public void limpiarCamposPosGuardado() {
        this.getFormularioEspecifico().ConfigInicial();
        this.clearListTel();
        this.clearListProf();
        this.getListaTelefonos().clear();
        this.getListaProfesiones().clear();
        this.pintarDeBlanco();
        this.limpiarTabla();

    }

    public void errorMatricula() {
        new Util().getMensajeError("El Profesional Ingresado ya existe en la base de datos.\nLa matrícula '" + this.getFormularioEspecifico().getTxtMatricula().getText() + "' ya fue ingresada.");
        this.getFormularioEspecifico().getTxtMatricula().setBackground(Color.red);
        this.getFormularioEspecifico().getTxtMatricula().setText("");
        this.getFormularioEspecifico().getTxtMatricula().requestFocus();

    }

    public void errorDocumento() {
        new Util().getMensajeError("El Profesional Ingresado ya existe.\nEl Nro de Documento '" + this.getFormularioEspecifico().getTxtNumDocumentoPers().getText() + "' ya fue ingresado.");
        this.getFormularioEspecifico().getTxtNumDocumentoPers().setBackground(Color.red);
        this.getFormularioEspecifico().getTxtNumDocumentoPers().setText("");
        this.getFormularioEspecifico().getTxtNumDocumentoPers().requestFocus();

    }

    public void removeTelefonosYProfesiones() {
        this.getGestor().getModel().getProfesiones().clear();
        this.getGestor().getModel().getTelefonos().clear();
    }

    public boolean comprobarCamposMinimos() {
        int numero = 0;
        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtApellido())) {
            numero = 1;
            this.getFormularioEspecifico().getTxtApellido().setBackground(Color.pink);
        } else {
            this.getFormularioEspecifico().getTxtApellido().setBackground(Color.GREEN);
        }

        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtCalle())) {
            numero = 1;
            this.getFormularioEspecifico().getTxtCalle().setBackground(Color.pink);
        } else {
            this.getFormularioEspecifico().getTxtCalle().setBackground(Color.GREEN);
        }

        if (this.getFormularioEspecifico().getCmbLocalidades().getSelectedItem() == null) {
            numero = 1;
            this.getFormularioEspecifico().getCmbLocalidades().setBackground(Color.pink);
        } else {
            this.getFormularioEspecifico().getCmbLocalidades().setBackground(Color.GREEN);
        }

        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtMatricula())) {
            numero = 1;
            this.getFormularioEspecifico().getTxtMatricula().setBackground(Color.pink);
        } else {
            this.getFormularioEspecifico().getTxtMatricula().setBackground(Color.GREEN);
        }

        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtNombre())) {
            numero = 1;
            this.getFormularioEspecifico().getTxtNombre().setBackground(Color.pink);
        } else {
            this.getFormularioEspecifico().getTxtNombre().setBackground(Color.GREEN);
        }

        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtNumDocumentoPers())) {
            numero = 1;
            this.getFormularioEspecifico().getTxtNumDocumentoPers().setBackground(Color.pink);
        } else {
            this.getFormularioEspecifico().getTxtNumDocumentoPers().setBackground(Color.GREEN);
        }

        if (this.getListaProfesiones().isEmpty()) {
            numero = 1;
            this.getFormularioEspecifico().getListProfesiones().setBackground(Color.pink);
        } else {
            this.getFormularioEspecifico().getListProfesiones().setBackground(Color.GREEN);
        }

        if (getFormularioEspecifico().getCmbProvincias().getSelectedItem() == null) {
            numero = 1;
            this.getFormularioEspecifico().getCmbProvincias().setBackground(Color.pink);
        } else {
            this.getFormularioEspecifico().getCmbProvincias().setBackground(Color.GREEN);
        }

        if (getFormularioEspecifico().getCmbPaises().getSelectedItem() == null) {
            numero = 1;
            this.getFormularioEspecifico().getCmbPaises().setBackground(Color.pink);
        } else {
            this.getFormularioEspecifico().getCmbPaises().setBackground(Color.GREEN);
        }

        if (getFormularioEspecifico().getDateFechaNacPers().getDate() == null) {
            numero = 1;
            new Util().getMensajeError("La fecha de nacimiento ingresada es nula o no válida.");
            getFormularioEspecifico().getDateFechaNacPers().setBackground(Color.pink);
        } else {
            this.getFormularioEspecifico().getDateFechaNacPers().setBackground(Color.green);
        }

        if (getFormularioEspecifico().getCmbDocumento().getSelectedItem() == null) {
            numero = 1;
            getFormularioEspecifico().getCmbDocumento().setBackground(Color.pink);
        } else {
            getFormularioEspecifico().getCmbDocumento().setBackground(Color.GREEN);
        }


        if (numero == 1) {

            return false;
        } else {
            return true;
        }


    }

    public void cargarComboProvBuscar() {
        GestorCombo gestorCombo = new GestorCombo();
        gestorCombo.cargarCombo(this.listProvXPaisBuscar(), this.getFormularioEspecifico().getCmbProvincias());

    }

    public void cargarComboLocalidadBuscar() {
        GestorCombo gestorCombo = new GestorCombo();
        gestorCombo.cargarCombo(this.listLocalidadXProvBuscar(), this.getFormularioEspecifico().getCmbLocalidades());

    }

    public void cargarComboTipoDoc() {
        GestorCombo gestorCombo = new GestorCombo();
        gestorCombo.cargarCombo(this.listTipoDoc(), this.getFormularioEspecifico().getCmbDocumento());
    }

    public List listTipoDoc() {
        GestorConsultas gestorCon = new GestorConsultas(TipoDocumento.class);
        return gestorCon.resultConsulta();
    }

    public List listProvXPaisBuscar() {
        List provincias = new ArrayList();
        if (this.seleccionComboPaisBuscar() == null) {
            return provincias;
        } else {
            Iterator iter = this.seleccionComboPaisBuscar().getProvincias().iterator();
            while (iter.hasNext()) {
                provincias.add((Provincia) iter.next());
            }
            return provincias;
        }
    }

    public List listLocalidadXProvBuscar() {
        List Localidades = new ArrayList();
        if (this.seleccionComboProvinciaBuscar() == null) {
            return Localidades;
        } else {
            Iterator iter = this.seleccionComboProvinciaBuscar().getCiudades().iterator();
            while (iter.hasNext()) {
                Localidades.add((Localidad) iter.next());
            }
            return Localidades;
        }
    }

    public Pais seleccionComboPaisBuscar() {
        return (Pais) this.getFormularioEspecifico().getCmbPaises().getSelectedItem();
    }

    public Provincia seleccionComboProvinciaBuscar() {
        return (Provincia) this.getFormularioEspecifico().getCmbProvincias().getSelectedItem();
    }

    public TipoDocumento seleccionComboTipoDoc() {
        return (TipoDocumento) this.getFormularioEspecifico().getCmbDocumento().getSelectedItem();
    }

    public Localidad seleccionComboLoc() {
        return (Localidad) this.getFormularioEspecifico().getCmbLocalidades().getSelectedItem();
    }

    public void mostrar() {
        this.limpiarTabla();
        this.cargarTabla();
    }

    public void limpiarTabla() {
        this.crearGestor();
        DefaultTableModel modelo = (DefaultTableModel) this.getTablaModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    public void cargarTabla() {
        this.crearGestor();
        DefaultTableModel modelo = (DefaultTableModel) this.getTablaModel();
        Iterator iter = this.getGestor().listarProfesionales().iterator();
        List profesiones = new ArrayList();

        while (iter.hasNext()) {
            Profesional profesional = (Profesional) iter.next();
            profesiones.addAll(profesional.getProfesiones());
            Object[] newRow = {profesional, profesional.apellidoYNombre(), profesional.documentoYTipo(), this.profesionesEnTabla(profesiones), profesional.getMatricula()};
            modelo.addRow(newRow);
            profesiones.clear();
        }
    }

    public String profesionesEnTabla(List lista) {
        List<Object> listaAux = lista;
        String Prof = "";
        for (Object objeto : listaAux) {
            Prof = Prof + " - " + objeto.toString();
        }
        return Prof.substring(3, 4).toUpperCase() + Prof.substring(4);
    }
}
