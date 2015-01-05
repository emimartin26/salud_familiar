/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paciente;

import Model.Paciente.GestorEnfermedad;
import Model.Paciente.GestorPaciente;
import Model.Paciente.Paciente;
import Model.Persona.GestorDocumento;
import Model.Persona.GestorDomicilio;
import Model.Persona.GestorTelefono;
import Model.Persona.TipoDocumento;
import Model.Ubicacion.Localidad;
import Model.Ubicacion.Pais;
import Model.Ubicacion.Provincia;
import Utilidades.GestorCombo;
import Utilidades.GestorLista;
import Utilidades.Util;
import Vistas.GestorVista;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Lopez
 */
public class GestorVistaPaciente extends GestorVista {

    private GestorPaciente gestor;
    private List listaTelefonos;
    private List listaEnfermedades;

    public GestorVistaPaciente(JDesktopPane escritorio) {
        this.setEscritorio(escritorio);
        this.setFrame(new FrmPaciente(this));
        this.listaTelefonos = new ArrayList();
        this.listaEnfermedades = new ArrayList();
        this.setGestor(new GestorPaciente());
    }

    public GestorPaciente getGestor() {
        return gestor;
    }

    public void setGestor(GestorPaciente gestor) {
        this.gestor = gestor;
    }

    public List getListaTelefonos() {
        return listaTelefonos;
    }

    public void setListaTelefonos(List listaTelefonos) {
        this.listaTelefonos = listaTelefonos;
    }

    public List getListaEnfermedades() {
        return listaEnfermedades;
    }

    public void setListaEnfermedades(List listaEnfermedades) {
        this.listaEnfermedades = listaEnfermedades;
    }

    public Paciente getModel() {
        return gestor.getModel();
    }

    public FrmPaciente getFormularioEspecifico() {
        return (FrmPaciente) this.getFrame();
    }

    public void abrirHistoriaClinica() {
        if (this.getFormularioEspecifico().getTblBusqueda().getSelectedRow() >= 0) {
            Paciente seleccionado = (Paciente) this.getFormularioEspecifico().getTblBusqueda().getValueAt(this.getFormularioEspecifico().getTblBusqueda().getSelectedRow(), 0); //el 0 es el de la columna que quiero traer
            GestorVistaHistoriaClinica gestorHistoria = new GestorVistaHistoriaClinica(this.getEscritorio(),seleccionado);
            gestorHistoria.abrir();
        } else {
            new Util().getMensajeError("No ha seleccionado nada");
        }
    }    
    public void abrirFrmRelacionParentezco() {
        if (this.getFormularioEspecifico().getTblBusqueda().getSelectedRow() >= 0) {
            Paciente seleccionado = (Paciente) this.getFormularioEspecifico().getTblBusqueda().getValueAt(this.getFormularioEspecifico().getTblBusqueda().getSelectedRow(), 0); //el 0 es el de la columna que quiero traer
            GestorVistaRelacionarParentesco gestorRP = new GestorVistaRelacionarParentesco(this.getEscritorio(),seleccionado);
            gestorRP.abrir();
        } else {
            new Util().getMensajeError("No ha seleccionado nada");
        }
    }

    public void crearGestor() {
        this.setGestor(new GestorPaciente());
    }
    
    public void imprimir() {
        this.getGestor().imprimir();
    }
    
    public void guardar() {
        if (this.comprobarCamposMinimos()) {
            if (this.isNuevo()) {
                this.crearGestor();
                this.getGestor().crearModelo();
                this.obtenerDatosPaciente();
                this.obtenerUbicacionPaciente();
                this.obtenerTelefonosPaciente();

                if (!this.getGestor().isRepetido(this.getModel().getDocumento())) {
                    this.getGestor().procesar(this.getModo());
                    this.getFormularioEspecifico().configInicial();
                    this.clearList();
                    this.listaTelefonos.clear();
                    this.listaEnfermedades.clear();
                    this.pintarDeBlanco();
                    this.getFormularioEspecifico().getCmbProvincia().setEnabled(false);
                    this.getFormularioEspecifico().getCmbLocalidad().setEnabled(false);

                } else {
                    this.errorDocumento();
                }

            } else {
                this.getGestor().getModel().getTelefonos().clear();
                this.obtenerDatosPaciente();
                this.obtenerUbicacionPaciente();
                this.obtenerTelefonosPaciente();
                this.getGestor().procesar(this.getModo());
                this.getFormularioEspecifico().configInicial();
                this.clearList();
                this.listaTelefonos.clear();
                this.listaEnfermedades.clear();
                this.pintarDeBlanco();
                this.getFormularioEspecifico().getCmbProvincia().setEnabled(false);
                this.getFormularioEspecifico().getCmbLocalidad().setEnabled(false);
                this.limpiarTabla();
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
        if (this.getFormularioEspecifico().getTblBusqueda().getSelectedRow() >= 0) {
            Paciente elim = (Paciente) this.getFormularioEspecifico().getTblBusqueda().getValueAt(this.getFormularioEspecifico().getTblBusqueda().getSelectedRow(), 0); //el 0 es el de la columna que quiero traer
            int num = new Util().confirmacion("Usted está por eliminar al Paciente: \n" + elim.apellidoYNombre() + "\n¿Desea continuar?");
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

    public void abrir() {
        Component add = this.getEscritorio().add(this.getFrame());
        this.getFrame().setVisible(true);
    }

    private List buscarDni() {
        GestorPaciente gespac = new GestorPaciente();
        return gespac.listarDni();
    }

    private List buscarPais() {
        GestorPaciente gespac = new GestorPaciente();
        return gespac.listarPais();
    }

    private List buscarEnfermedades() {
        GestorEnfermedad gespac = new GestorEnfermedad();
        return gespac.listarEnfermedades();
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
        return (Pais) this.getFormularioEspecifico().getCmbPais().getSelectedItem();
    }

    public Provincia seleccionComboProvinciaBuscar() {
        return (Provincia) this.getFormularioEspecifico().getCmbProvincia().getSelectedItem();
    }

    public TipoDocumento seleccionComboTipoDoc() {
        return (TipoDocumento) this.getFormularioEspecifico().getCmbTipoDni().getSelectedItem();
    }

    public Localidad seleccionComboLoc() {
        return (Localidad) this.getFormularioEspecifico().getCmbLocalidad().getSelectedItem();
    }

    public void llenarListTel(List lista) {
        GestorLista gestorLista = new GestorLista();
        gestorLista.llenarList(lista, this.getFormularioEspecifico().getLstNumerosTelefono());
    }

    public void cargarComboDni(JComboBox combito) {
        GestorCombo gescom = new GestorCombo();
        gescom.cargarCombo(buscarDni(), combito);

    }

    public void cargarComboPais(JComboBox combito) {
        GestorCombo gescom = new GestorCombo();
        gescom.cargarCombo(buscarPais(), combito);
    }

    public void cargarComboEnfermedades(JComboBox combito) {
        GestorCombo gescom = new GestorCombo();
        gescom.cargarCombo(buscarEnfermedades(), combito);
    }

    public void cerrar() {
        this.getFormularioEspecifico().setVisible(false);
    }

    public void cargarComboProvincia() {
        GestorCombo gestorCombo = new GestorCombo();
        gestorCombo.cargarCombo(this.listProvXPaisBuscar(), this.getFormularioEspecifico().getCmbProvincia());

    }

    public void cargarComboLocalidad() {
        GestorCombo gestorCombo = new GestorCombo();
        gestorCombo.cargarCombo(this.listLocalidadXProvBuscar(), this.getFormularioEspecifico().getCmbLocalidad());

    }

    public TableModel getTablaModel() {
        return this.getFormularioEspecifico().getTblBusqueda().getModel();
    }

    private void crearModelo() {
        this.gestor = new GestorPaciente();
    }

    public void cargarTabla() {
        this.crearModelo();
        DefaultTableModel modelo = (DefaultTableModel) this.getTablaModel();
        Iterator iter = this.getGestor().listarPaciente().iterator();
        while (iter.hasNext()) {
            Paciente obj = (Paciente) iter.next();
            Object[] newRow = {obj, obj.apellidoYNombre(), obj.documentoYTipo(), obj.fechaFormateada(), obj.domicilioConcatenado()};
            modelo.addRow(newRow);

        }
    }

    public void limpiarTabla() {
        this.crearModelo();
        DefaultTableModel modelo = (DefaultTableModel) this.getTablaModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    public void mostrar() {
        this.limpiarTabla();
        this.cargarTabla();
    }

    public void actualizarVista() {
        Paciente seleccionado = (Paciente) this.getFormularioEspecifico().getTblBusqueda().getValueAt(this.getFormularioEspecifico().getTblBusqueda().getSelectedRow(), 0);
        this.getFormularioEspecifico().configVistaModificar();
        this.mostrarDatosPaciente(seleccionado);
    }

    public void actualizarModelo() {
        Paciente seleccionado = (Paciente) this.getFormularioEspecifico().getTblBusqueda().getValueAt(this.getFormularioEspecifico().getTblBusqueda().getSelectedRow(), 0);
        this.getGestor().setModel(seleccionado);
    }
    
    public void accionMofidicar() {
        if (this.getFormularioEspecifico().getTblBusqueda().getSelectedRow() >= 0) {
            this.actualizarVista();
            this.actualizarModelo();
        } else {
            new Util().getMensajeError("No ha seleccionado nada");
        }
    }

    public void mostrarDatosPaciente(Paciente pac) {
        this.clearList();
        this.getFormularioEspecifico().getDateFechaNacimiento().setDate(pac.getFechaNac());
        this.getFormularioEspecifico().getTxtApellido().setText(pac.getApellido());
        this.getFormularioEspecifico().getTxtNombre().setText(pac.getNombre());
        this.getFormularioEspecifico().getTxtCalle().setText(pac.getDomicilio().getDireccion());
        this.getFormularioEspecifico().getTxtAlturaCalle().setText(Integer.toString(pac.getDomicilio().getNumero()));
        this.getFormularioEspecifico().getTxtDni().setText(pac.getDocumento().getNum());
        this.getFormularioEspecifico().getTxtNumDepto().setText(pac.getDomicilio().getNumDepto());
        this.getFormularioEspecifico().getTxtPisoDepto().setText(pac.getDomicilio().getPiso());
        this.cargarComboDni(this.getFormularioEspecifico().getCmbTipoDni());
        this.cargarComboPais(this.getFormularioEspecifico().getCmbPais());
        this.cargarComboProvincia();
        this.cargarComboLocalidad();
        this.getFormularioEspecifico().getCmbTipoDni().setSelectedItem(pac.getDocumento().getTipoDocumento());
        this.getFormularioEspecifico().getCmbPais().setSelectedItem(pac.getDomicilio().getLocalidad().getProv().getPais());
        this.getFormularioEspecifico().getCmbProvincia().setSelectedItem(pac.getDomicilio().getLocalidad().getProv());
        this.getFormularioEspecifico().getCmbLocalidad().setSelectedItem(pac.getDomicilio().getLocalidad());
        this.getListaTelefonos().clear();
        this.getListaTelefonos().addAll(pac.getTelefonos());
        this.llenarListTel(getListaTelefonos());
    }

    public void mostrarInfoPaciente() {

        if (this.getFormularioEspecifico().getTblBusqueda().getSelectedRow() >= 0) {
            Paciente seleccionado = (Paciente) this.getFormularioEspecifico().getTblBusqueda().getValueAt(this.getFormularioEspecifico().getTblBusqueda().getSelectedRow(), 0); //el 0 es el de la columna que quiero traer
            this.getFormularioEspecifico().configMostrarInfo();
            this.mostrarDatosPaciente(seleccionado);
            this.getFormularioEspecifico().getCmbProvincia().setEnabled(false);
            this.getFormularioEspecifico().getCmbLocalidad().setEnabled(false);
        } else {
            new Util().getMensajeError("No ha seleccionado nada");
        }


    }

    public void listarTelefono(GestorTelefono gestorTel) {
        List telefonos = gestorTel.listarTelefonos();
        this.llenarListTel(telefonos);

    }

    public void agregarNumTelefono() {
        GestorTelefono gestorTel = new GestorTelefono();
        gestorTel.crearModelo();

        String caracTel = this.getFormularioEspecifico().getTxtCaractTelefono().getText();
        String numTel = this.getFormularioEspecifico().getTxtNumTelefono().getText();

        gestorTel.getModel().setCaracteristica(Integer.parseInt(caracTel));
        gestorTel.getModel().setNumero(Integer.parseInt(numTel));

        this.listaTelefonos.add(gestorTel.getModel());

        this.llenarListTel(this.listaTelefonos);
    }

    public void tomarNumTelefono() {
        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtCaractTelefono()) || (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtNumTelefono()))) {
            new Util().getMensajeError("No ingresó ningún teléfono válido.");
        } else {
            this.agregarNumTelefono();
            this.getFormularioEspecifico().getTxtCaractTelefono().setText("");
            this.getFormularioEspecifico().getTxtNumTelefono().setText("");
            this.getFormularioEspecifico().getTxtCaractTelefono().requestFocus();
        }
    }

    public void eliminarNumTelefono() {
        if (this.getFormularioEspecifico().getLstNumerosTelefono().getSelectedValue() == null) {
            new Util().getMensajeError("No ha seleccionado nada");
        } else {
            this.listaTelefonos.remove(this.getFormularioEspecifico().getLstNumerosTelefono().getSelectedValue());
            this.llenarListTel(this.listaTelefonos);
        }
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

        if (this.getFormularioEspecifico().getCmbLocalidad().getSelectedItem() == null) {
            numero = 1;
            this.getFormularioEspecifico().getCmbLocalidad().setBackground(Color.pink);
        } else {
            this.getFormularioEspecifico().getCmbLocalidad().setBackground(Color.GREEN);
        }

        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtNombre())) {
            numero = 1;
            this.getFormularioEspecifico().getTxtNombre().setBackground(Color.pink);
        } else {
            this.getFormularioEspecifico().getTxtNombre().setBackground(Color.GREEN);
        }

        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtDni())) {
            numero = 1;
            this.getFormularioEspecifico().getTxtDni().setBackground(Color.pink);
        } else {
            this.getFormularioEspecifico().getTxtDni().setBackground(Color.GREEN);
        }

        if (getFormularioEspecifico().getCmbProvincia().getSelectedItem() == null) {
            numero = 1;
            this.getFormularioEspecifico().getCmbProvincia().setBackground(Color.pink);
        } else {
            this.getFormularioEspecifico().getCmbProvincia().setBackground(Color.GREEN);
        }

        if (getFormularioEspecifico().getCmbPais().getSelectedItem() == null) {
            numero = 1;
            this.getFormularioEspecifico().getCmbPais().setBackground(Color.pink);
        } else {
            this.getFormularioEspecifico().getCmbPais().setBackground(Color.GREEN);
        }

        if (getFormularioEspecifico().getDateFechaNacimiento().getDate() == null) {
            numero = 1;
            new Util().getMensajeError("La fecha de nacimiento ingresada es nula o no válida.");
            getFormularioEspecifico().getDateFechaNacimiento().setBackground(Color.pink);
        } else {
            this.getFormularioEspecifico().getDateFechaNacimiento().setBackground(Color.green);
        }

        if (getFormularioEspecifico().getCmbTipoDni().getSelectedItem() == null) {
            numero = 1;
            getFormularioEspecifico().getCmbTipoDni().setBackground(Color.pink);
        } else {
            getFormularioEspecifico().getCmbTipoDni().setBackground(Color.GREEN);
        }


        if (numero == 1) {

            return false;
        } else {
            return true;
        }


    }

    public void obtenerTelefonosPaciente() {
        this.getGestor().getModel().getTelefonos().addAll(this.listaTelefonos);
    }

    public void obtenerDatosPaciente() {
        this.getGestor().getModel().setNombre(getFormularioEspecifico().getTxtNombre().getText().trim().toLowerCase());
        this.getGestor().getModel().setApellido(getFormularioEspecifico().getTxtApellido().getText().trim().toLowerCase());

        GestorDocumento gestorDoc = new GestorDocumento();
        gestorDoc.crearModelo();
        if (Util.isNumeric(this.getFormularioEspecifico().getTxtDni().getText())) {
            gestorDoc.getModel().setNum(this.getFormularioEspecifico().getTxtDni().getText());
        }


        gestorDoc.getModel().setTipoDocumento(this.seleccionComboTipoDoc());
        this.getGestor().getModel().setDocumento(gestorDoc.getModel());
        this.getGestor().getModel().setFechaNac(getFormularioEspecifico().getDateFechaNacimiento().getDate());
    }

    public void obtenerUbicacionPaciente() {
        GestorDomicilio gestorDom = new GestorDomicilio();
        gestorDom.crearModelo();
        gestorDom.getModel().setPiso(this.getFormularioEspecifico().getTxtPisoDepto().getText());
        gestorDom.getModel().setDireccion(this.getFormularioEspecifico().getTxtCalle().getText());
        gestorDom.getModel().setNumDepto(this.getFormularioEspecifico().getTxtNumDepto().getText());
        gestorDom.getModel().setNumero(Integer.parseInt(this.getFormularioEspecifico().getTxtAlturaCalle().getText()));
        gestorDom.getModel().setLocalidad(this.seleccionComboLoc());
        this.getGestor().getModel().setDomicilio(gestorDom.getModel());
    }

    public void errorDocumento() {
        new Util().getMensajeError("El paciente Ingresado ya existe en la base de datos.\nEl Nro de Documento '" + this.getFormularioEspecifico().getTxtDni().getText() + "' ya fue ingresado.");
        this.getFormularioEspecifico().getTxtDni().setBackground(Color.red);
        this.getFormularioEspecifico().getTxtDni().setText("");

    }

    public void pintarDeBlanco() {
        this.getFormularioEspecifico().getTxtApellido().setBackground(Color.white);
        this.getFormularioEspecifico().getTxtCalle().setBackground(Color.white);
        this.getFormularioEspecifico().getCmbLocalidad().setBackground(Color.white);
        this.getFormularioEspecifico().getTxtNombre().setBackground(Color.white);
        this.getFormularioEspecifico().getTxtDni().setBackground(Color.white);
        this.getFormularioEspecifico().getCmbProvincia().setBackground(Color.white);
        this.getFormularioEspecifico().getCmbPais().setBackground(Color.white);
        this.getFormularioEspecifico().getDateFechaNacimiento().setBackground(Color.white);
        this.getFormularioEspecifico().getCmbTipoDni().setBackground(Color.white);
    }

    public void clearList() {
        GestorLista gestorLista = new GestorLista();
        gestorLista.clearList(this.getFormularioEspecifico().getLstNumerosTelefono());
    }

    public boolean campoApellidoBusquedaVacia() {
        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtApellidoBusqueda())) {
            return false;
        }
        return true;
    }

    public String getApellidoABuscar() {
        return this.getFormularioEspecifico().getTxtApellidoBusqueda().getText();
    }

    public void filtrarApellido() {
        if (this.campoApellidoBusquedaVacia()) {
            this.limpiarTabla();
            DefaultTableModel modelo = (DefaultTableModel) this.getTablaModel();
            Iterator iter = this.getGestor().listarFiltrarApellido(this.getApellidoABuscar()).iterator();
            while (iter.hasNext()) {
                Paciente obj = (Paciente) iter.next();
                Object[] newRow = {obj, obj.apellidoYNombre(), obj.documentoYTipo(), obj.fechaFormateada(), obj.domicilioConcatenado()};
                modelo.addRow(newRow);
            }
        } else {
            this.limpiarTabla();
        }
    }

    public boolean campoNombreBusquedaVacia() {
        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtNombreBusqueda())) {
            return false;
        }
        return true;
    }

    public String getNombreABuscar() {
        return this.getFormularioEspecifico().getTxtNombreBusqueda().getText();
    }

    public void filtrarNombre() {
        if (this.campoNombreBusquedaVacia()) {
            this.limpiarTabla();
            DefaultTableModel modelo = (DefaultTableModel) this.getTablaModel();
            Iterator iter = this.getGestor().listarFiltrarNombre(this.getNombreABuscar()).iterator();
            while (iter.hasNext()) {
                Paciente obj = (Paciente) iter.next();
                Object[] newRow = {obj, obj.apellidoYNombre(), obj.documentoYTipo(), obj.fechaFormateada(), obj.domicilioConcatenado()};
                modelo.addRow(newRow);
            }
        } else {
            this.limpiarTabla();
        }
    }

    public boolean campoDniBusquedaVacia() {
        if (Util.estaVacioTxt(this.getFormularioEspecifico().getTxtDniBusqueda())) {
            return false;
        }
        return true;
    }

    public String tipoYNumBuscado() {
        return this.getFormularioEspecifico().getCmbTipoDniBusqueda().getSelectedItem().toString().toUpperCase() + ": " + this.getFormularioEspecifico().getTxtDniBusqueda().getText();
    }

    public String getDniABuscar() {
        return this.getFormularioEspecifico().getTxtDniBusqueda().getText();
    }

    public void filtrarDni() {
        if (this.campoDniBusquedaVacia()) {
            this.limpiarTabla();
            DefaultTableModel modelo = (DefaultTableModel) this.getTablaModel();
            Iterator iter = this.getGestor().listarPaciente().iterator();
            while (iter.hasNext()) {
                Paciente obj = (Paciente) iter.next();
                Object[] newRow = {obj, obj.apellidoYNombre(), obj.documentoYTipo(), obj.fechaFormateada(), obj.domicilioConcatenado()};

                if (obj.documentoYTipo().contains(this.tipoYNumBuscado())) {
                    modelo.addRow(newRow);
                }
            }
        } else {
            this.limpiarTabla();
        }
    }
    
    public void limpiarTxtDniYTabla(){
        this.getFormularioEspecifico().getTxtDniBusqueda().setText("");
        this.limpiarTabla();
    }
}
