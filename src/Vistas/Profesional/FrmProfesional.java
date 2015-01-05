/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Profesional;

import Model.Profesional.GestorProfesion;
import Utilidades.GestorCombo;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author Federico
 */
public class FrmProfesional extends javax.swing.JInternalFrame {

    private GestorVistaProfesional gestorVista;

    /**
     * Creates new form FrmProfesionales
     */
    public FrmProfesional(GestorVistaProfesional gestor) {
        initComponents();
        this.centrarVentana();
        this.ConfigInicial();
        this.setGestorVista(gestor);
    }

    private void centrarVentana() {
        //este metodo devuelve el tamaño de la pantalla  
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
//obtenemos el tamaño de la ventana  
        Dimension ventana = this.getSize();
//para centrar la ventana lo hacemos con el siguiente calculo  
        this.setLocation((pantalla.width - ventana.width + 250) / 2, (pantalla.height - 150 - ventana.height) / 2);
//y para finalizar la hacemos visible  
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public JButton getBtnNuevo() {
        return btnNuevo;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnBuscar(JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnEliminarProfesion() {
        return btnEliminarProfesion;
    }

    public void setBtnEliminarProfesion(JButton btnEliminarProfesion) {
        this.btnEliminarProfesion = btnEliminarProfesion;
    }

    public JButton getBtnNuevaProfesion() {
        return btnNuevaProfesion;
    }

    public void setBtnNuevaProfesion(JButton btnNuevaProfesion) {
        this.btnNuevaProfesion = btnNuevaProfesion;
    }

    public JList getListProfesiones() {
        return listProfesiones;
    }

    public void setListProfesiones(JList listProfesiones) {
        this.listProfesiones = listProfesiones;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    public void setBtnNuevo(JButton btnNuevo) {
        this.btnNuevo = btnNuevo;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JComboBox getCmb_profesionBusq() {
        return cmb_profesionBusq;
    }

    public JComboBox getCmbDocumento() {
        return cmbDocumento;
    }

    public void setCmbDocumento(JComboBox cmbDocumento) {
        this.cmbDocumento = cmbDocumento;
    }

    public JList getListTelefonos() {
        return listTelefonos;
    }

    public void setListTelefonos(JList listTelefonos) {
        this.listTelefonos = listTelefonos;
    }

    public JTextField getTxtCalle() {
        return txtCalle;
    }

    public void setTxtCalle(JTextField txtCalle) {
        this.txtCalle = txtCalle;
    }

    public JTextField getTxtCaracTel() {
        return txtCaracTel;
    }

    public void setTxtCaracTel(JTextField txtCaracTel) {
        this.txtCaracTel = txtCaracTel;
    }

    public JTextField getTxtMatricula() {
        return txtMatricula;
    }

    public void setTxtMatricula(JTextField txtMatricula) {
        this.txtMatricula = txtMatricula;
    }

    public JTextField getTxtNroCalle() {
        return txtNroCalle;
    }

    public void setTxtNroCalle(JTextField txtNroCalle) {
        this.txtNroCalle = txtNroCalle;
    }

    public JTextField getTxtNumDocumentoPers() {
        return txtNumDocumentoPers;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public void setBtnLimpiar(JButton btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
    }

    public JButton getBtnListar() {
        return btnListar;
    }

    public void setBtnListar(JButton btnListar) {
        this.btnListar = btnListar;
    }

    public JButton getBtnMostrarInfoProf() {
        return btnMostrarInfoProf;
    }

    public void setBtnMostrarInfoProf(JButton btnMostrarInfoProf) {
        this.btnMostrarInfoProf = btnMostrarInfoProf;
    }

    public void setTxtNumDocumentoPers(JTextField txtNumDocumentoPers) {
        this.txtNumDocumentoPers = txtNumDocumentoPers;
    }

    public JTextField getTxtNumTel() {
        return txtNumTel;
    }

    public void setTxtNumTel(JTextField txtNumTel) {
        this.txtNumTel = txtNumTel;
    }

    public GestorVistaProfesional getGestorVista() {
        return gestorVista;
    }

    public void setGestorVista(GestorVistaProfesional gestorVista) {
        this.gestorVista = gestorVista;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JPanel getPanelBusqueda() {
        return panelBusqueda;
    }

    public void setPanelBusqueda(JPanel panelBusqueda) {
        this.panelBusqueda = panelBusqueda;
    }

    public JPanel getPanelDatosProfesion() {
        return panelDatosProfesion;
    }

    public void setPanelDatosProfesion(JPanel panelDatosProfesion) {
        this.panelDatosProfesion = panelDatosProfesion;
    }

    public JPanel getPanelDatosProfesional() {
        return panelDatosProfesional;
    }

    public void setPanelDatosProfesional(JPanel panelDatosProfesional) {
        this.panelDatosProfesional = panelDatosProfesional;
    }

    public JTable getTblProfesional() {
        return tblProfesional;
    }

    public JDateChooser getDateFechaNacPers() {
        return dateFechaNacPers;
    }

    public void setDateFechaNacPers(JDateChooser dateFechaNacPers) {
        this.dateFechaNacPers = dateFechaNacPers;
    }

    public void setTblProfesional(JTable tblProfesional) {
        this.tblProfesional = tblProfesional;
    }

    public JRadioButton getRadBtnMatricula() {
        return radBtnMatricula;
    }

    public void setRadBtnMatricula(JRadioButton radBtnMatricula) {
        this.radBtnMatricula = radBtnMatricula;
    }

    public JRadioButton getRadBtnNombre() {
        return radBtnNombre;
    }

    public void setRadBtnNombre(JRadioButton radbtnNombre) {
        this.radBtnNombre = radbtnNombre;
    }

    public JRadioButton getRadBtnProfesion() {
        return radBtnProfesion;
    }

    public void setRadbtnProfesion(JRadioButton radbtnProfesion) {
        this.radBtnProfesion = radbtnProfesion;
    }

    public JTextField getTxtMatriculaBusq() {
        return txtMatriculaBusq;
    }

    public void setTxtMatriculaBusq(JTextField txtMatriculaBusq) {
        this.txtMatriculaBusq = txtMatriculaBusq;
    }

    public JTextField getTxtNombreBusq() {
        return txtNombreBusq;
    }

    public void setTxtNombreBusq(JTextField txtNombre) {
        this.txtNombreBusq = txtNombre;
    }

    public String getNombrePersona() {
        return txtNombre.getText();
    }

    public Date getFechaNacPers() {
        return dateFechaNacPers.getDate();
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JButton getBtnImprimir() {
        return btnImprimir;
    }

    public void setBtnImprimir(JButton btnImprimir) {
        this.btnImprimir = btnImprimir;
    }

    public JButton getBtnNuevoTelefono() {
        return btnNuevoTelefono;
    }

    public void setBtnNuevoTelefono(JButton btnNuevoTelefono) {
        this.btnNuevoTelefono = btnNuevoTelefono;
    }

    public JPanel getPnlDatos() {
        return pnlDatos;
    }

    public void setPnlDatos(JPanel pnlDatos) {
        this.pnlDatos = pnlDatos;
    }

    public JPanel getPnlTelefonos() {
        return pnlTelefonos;
    }

    public JButton getBtnEliminarTelefono() {
        return btnEliminarTelefono;
    }

    public void setBtnEliminarTelefono(JButton btnEliminarTelefono) {
        this.btnEliminarTelefono = btnEliminarTelefono;
    }

    public void setPnlTelefonos(JPanel pnlTelefonos) {
        this.pnlTelefonos = pnlTelefonos;
    }

    public JPanel getPnlUbicacion() {
        return pnlUbicacion;
    }

    public void setPnlUbicacion(JPanel pnlUbicacion) {
        this.pnlUbicacion = pnlUbicacion;
    }

    public JTextField getTxtNumDpto() {
        return txtNumDpto;
    }

    public JComboBox getCmbLocalidades() {
        return cmbLocalidades;
    }

    public void setCmbLocalidades(JComboBox cmbLocalidades) {
        this.cmbLocalidades = cmbLocalidades;
    }

    public JTextField getTxtPiso() {
        return txtPiso;
    }

    public void setTxtPiso(JTextField txtPiso) {
        this.txtPiso = txtPiso;
    }

    public void setCmb_profesionBusq(JComboBox cmb_profesionBusq) {
        this.cmb_profesionBusq = cmb_profesionBusq;
    }

    public JComboBox getCmb_profesionDatos() {
        return cmb_profesionDatos;
    }

    public void setCmb_profesionDatos(JComboBox cmb_profesionDatos) {
        this.cmb_profesionDatos = cmb_profesionDatos;
    }

    public void setTxtNumDpto(JTextField txtNumDpto) {
        this.txtNumDpto = txtNumDpto;
    }

    public JComboBox getCmbPaises() {
        return cmbPaises;
    }

    public void setCmbPaises(JComboBox cmbPaises) {
        this.cmbPaises = cmbPaises;
    }

    public JComboBox getCmbProvincias() {
        return cmbProvincias;
    }

    public void setCmbProvincias(JComboBox cmbProvincias) {
        this.cmbProvincias = cmbProvincias;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelBusqueda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProfesional = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtNombreBusq = new javax.swing.JTextField();
        radBtnMatricula = new javax.swing.JRadioButton();
        radBtnProfesion = new javax.swing.JRadioButton();
        radBtnNombre = new javax.swing.JRadioButton();
        txtMatriculaBusq = new javax.swing.JTextField();
        cmb_profesionBusq = new javax.swing.JComboBox();
        btnMostrarInfoProf = new javax.swing.JButton();
        panelDatosProfesional = new javax.swing.JPanel();
        pnlDatos = new javax.swing.JPanel();
        txtApellido = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        dateFechaNacPers = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        cmbDocumento = new javax.swing.JComboBox();
        jLabel46 = new javax.swing.JLabel();
        txtNumDocumentoPers = new javax.swing.JTextField();
        pnlUbicacion = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        txtNroCalle = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtNumDpto = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        cmbPaises = new javax.swing.JComboBox();
        cmbProvincias = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtPiso = new javax.swing.JTextField();
        cmbLocalidades = new javax.swing.JComboBox();
        pnlTelefonos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTelefonos = new javax.swing.JList();
        jLabel49 = new javax.swing.JLabel();
        txtNumTel = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtCaracTel = new javax.swing.JTextField();
        btnNuevoTelefono = new javax.swing.JButton();
        btnEliminarTelefono = new javax.swing.JButton();
        panelBotones = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        panelSalir = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        panelDatosProfesion = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        cmb_profesionDatos = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        listProfesiones = new javax.swing.JList();
        btnNuevaProfesion = new javax.swing.JButton();
        btnEliminarProfesion = new javax.swing.JButton();

        setTitle("Administrar Profesionales");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        panelBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda"));

        tblProfesional.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "Apellido y Nombre", "Documento", "Profesión", "Matrícula"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProfesional);
        tblProfesional.getColumnModel().getColumn(0).setMinWidth(-11);
        tblProfesional.getColumnModel().getColumn(0).setMaxWidth(-10);

        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listar.png"))); // NOI18N
        btnListar.setText("Listar Completo");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtNombreBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreBusqKeyReleased(evt);
            }
        });

        radBtnMatricula.setText("Por Matrícula");
        radBtnMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnMatriculaActionPerformed(evt);
            }
        });

        radBtnProfesion.setText("Por Profesión");
        radBtnProfesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnProfesionActionPerformed(evt);
            }
        });

        radBtnNombre.setText("Por Apellido");
        radBtnNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnNombreActionPerformed(evt);
            }
        });

        txtMatriculaBusq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaBusqActionPerformed(evt);
            }
        });
        txtMatriculaBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMatriculaBusqKeyReleased(evt);
            }
        });

        cmb_profesionBusq.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_profesionBusqItemStateChanged(evt);
            }
        });
        cmb_profesionBusq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_profesionBusqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radBtnProfesion)
                    .addComponent(radBtnNombre)
                    .addComponent(radBtnMatricula))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNombreBusq, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_profesionBusq, javax.swing.GroupLayout.Alignment.LEADING, 0, 377, Short.MAX_VALUE)
                    .addComponent(txtMatriculaBusq))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radBtnNombre)
                    .addComponent(txtNombreBusq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radBtnProfesion)
                    .addComponent(cmb_profesionBusq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radBtnMatricula)
                    .addComponent(txtMatriculaBusq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnMostrarInfoProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver_mas.png"))); // NOI18N
        btnMostrarInfoProf.setText("Ver Información");
        btnMostrarInfoProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarInfoProfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBusquedaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrarInfoProf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarInfoProf)
                    .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panelDatosProfesional.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales"));

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        jLabel44.setText("Apellidos");

        jLabel45.setText("Nombres");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel61.setText("Fecha Nac.");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel51.setText("Documento");

        cmbDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDocumentoActionPerformed(evt);
            }
        });

        jLabel46.setText("N°");

        txtNumDocumentoPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumDocumentoPersActionPerformed(evt);
            }
        });
        txtNumDocumentoPers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumDocumentoPersKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51)
                .addGap(18, 18, 18)
                .addComponent(cmbDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumDocumentoPers, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(cmbDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(txtNumDocumentoPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel44)
                            .addComponent(jLabel61))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateFechaNacPers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellido)
                            .addComponent(txtNombre))
                        .addGap(3, 3, 3))))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel61)
                    .addComponent(dateFechaNacPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlUbicacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Domicilio"));

        jLabel55.setText("Calle");

        jLabel54.setText("Nro");

        jLabel56.setText("Provincia");

        jLabel57.setText("Localidad");

        txtCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleActionPerformed(evt);
            }
        });

        txtNroCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNroCalleKeyTyped(evt);
            }
        });

        jLabel52.setText("Dpto");

        txtNumDpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumDptoActionPerformed(evt);
            }
        });

        jLabel60.setText("País:");

        cmbPaises.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPaisesItemStateChanged(evt);
            }
        });
        cmbPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaisesActionPerformed(evt);
            }
        });

        cmbProvincias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProvinciasItemStateChanged(evt);
            }
        });

        jLabel1.setText("Piso");

        javax.swing.GroupLayout pnlUbicacionLayout = new javax.swing.GroupLayout(pnlUbicacion);
        pnlUbicacion.setLayout(pnlUbicacionLayout);
        pnlUbicacionLayout.setHorizontalGroup(
            pnlUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUbicacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUbicacionLayout.createSequentialGroup()
                        .addGroup(pnlUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55)
                            .addComponent(jLabel54)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUbicacionLayout.createSequentialGroup()
                                .addComponent(txtNroCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumDpto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCalle, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbLocalidades, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlUbicacionLayout.createSequentialGroup()
                        .addGroup(pnlUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel60))
                        .addGap(18, 18, 18)
                        .addGroup(pnlUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbProvincias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbPaises, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlUbicacionLayout.setVerticalGroup(
            pnlUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUbicacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(cmbPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbProvincias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(cmbLocalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(txtNumDpto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54)
                    .addComponent(txtNroCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlTelefonos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefónicos"));

        jScrollPane2.setViewportView(listTelefonos);

        jLabel49.setText("-");

        txtNumTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumTeltxtNumTelActionPerformed(evt);
            }
        });
        txtNumTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumTelKeyTyped(evt);
            }
        });

        jLabel47.setText("N° Teléfono");

        txtCaracTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaracTelActionPerformed(evt);
            }
        });
        txtCaracTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCaracTelKeyTyped(evt);
            }
        });

        btnNuevoTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N
        btnNuevoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoTelefonoActionPerformed(evt);
            }
        });

        btnEliminarTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTelefonosLayout = new javax.swing.GroupLayout(pnlTelefonos);
        pnlTelefonos.setLayout(pnlTelefonosLayout);
        pnlTelefonosLayout.setHorizontalGroup(
            pnlTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelefonosLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pnlTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTelefonosLayout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addGap(11, 11, 11)
                        .addComponent(txtCaracTel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumTel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTelefonosLayout.createSequentialGroup()
                        .addGroup(pnlTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNuevoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlTelefonosLayout.setVerticalGroup(
            pnlTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelefonosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCaracTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(txtNumTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTelefonosLayout.createSequentialGroup()
                        .addComponent(btnNuevoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDatosProfesionalLayout = new javax.swing.GroupLayout(panelDatosProfesional);
        panelDatosProfesional.setLayout(panelDatosProfesionalLayout);
        panelDatosProfesionalLayout.setHorizontalGroup(
            panelDatosProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosProfesionalLayout.createSequentialGroup()
                .addGroup(panelDatosProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosProfesionalLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(pnlUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        panelDatosProfesionalLayout.setVerticalGroup(
            panelDatosProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosProfesionalLayout.createSequentialGroup()
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panelBotones.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/accept.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar)
                    .addComponent(btnBuscar)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelSalir.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSalirLayout = new javax.swing.GroupLayout(panelSalir);
        panelSalir.setLayout(panelSalirLayout);
        panelSalirLayout.setHorizontalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalirLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(btnSalir))
        );

        panelDatosProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Profesión"));

        jLabel53.setText("Profesión");

        jLabel59.setText("Matrícula");

        cmb_profesionDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_profesionDatosActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(listProfesiones);

        btnNuevaProfesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N
        btnNuevaProfesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaProfesionActionPerformed(evt);
            }
        });

        btnEliminarProfesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminarProfesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProfesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosProfesionLayout = new javax.swing.GroupLayout(panelDatosProfesion);
        panelDatosProfesion.setLayout(panelDatosProfesionLayout);
        panelDatosProfesionLayout.setHorizontalGroup(
            panelDatosProfesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosProfesionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosProfesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelDatosProfesionLayout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_profesionDatos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDatosProfesionLayout.createSequentialGroup()
                        .addGroup(panelDatosProfesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNuevaProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelDatosProfesionLayout.setVerticalGroup(
            panelDatosProfesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosProfesionLayout.createSequentialGroup()
                .addGroup(panelDatosProfesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(cmb_profesionDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosProfesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosProfesionLayout.createSequentialGroup()
                        .addComponent(btnNuevaProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDatosProfesional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDatosProfesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelDatosProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDatosProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumTeltxtNumTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumTeltxtNumTelActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_txtNumTeltxtNumTelActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.configBuscar();

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.configNuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.cerrar();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void radBtnProfesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnProfesionActionPerformed
        this.presionarRadBtnProfesion();
    }//GEN-LAST:event_radBtnProfesionActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
//        this.setConfigInicial();
    }//GEN-LAST:event_formComponentShown

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.configCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        this.imprimir();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void cmb_profesionBusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_profesionBusqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_profesionBusqActionPerformed

    private void radBtnNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnNombreActionPerformed
        this.presionarRadBtnNombre();
    }//GEN-LAST:event_radBtnNombreActionPerformed

    private void radBtnMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnMatriculaActionPerformed
        this.presionarRadBtnMatricula();
    }//GEN-LAST:event_radBtnMatriculaActionPerformed

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        this.validarSoloLetras(evt);
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        this.validarSoloLetras(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNumDocumentoPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumDocumentoPersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumDocumentoPersActionPerformed

    private void txtNumDocumentoPersKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumDocumentoPersKeyTyped
        this.validarSoloEntero(evt);
    }//GEN-LAST:event_txtNumDocumentoPersKeyTyped

    private void cmb_profesionDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_profesionDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_profesionDatosActionPerformed

    private void txtCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalleActionPerformed

    private void cmbPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaisesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPaisesActionPerformed

    private void cmbPaisesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPaisesItemStateChanged
        this.seleccionComboPais();
    }//GEN-LAST:event_cmbPaisesItemStateChanged

    private void cmbProvinciasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProvinciasItemStateChanged
        this.seleccionComboProvincia();
    }//GEN-LAST:event_cmbProvinciasItemStateChanged

    private void btnNuevoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTelefonoActionPerformed
        this.presionaBtnTelefono();
    }//GEN-LAST:event_btnNuevoTelefonoActionPerformed

    private void txtCaracTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaracTelKeyTyped
        this.validarSoloEntero(evt);
    }//GEN-LAST:event_txtCaracTelKeyTyped

    private void txtNumTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumTelKeyTyped
        this.validarSoloEntero(evt);
    }//GEN-LAST:event_txtNumTelKeyTyped

    private void txtNroCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroCalleKeyTyped
        this.validarSoloEntero(evt);
    }//GEN-LAST:event_txtNroCalleKeyTyped

    private void cmbDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDocumentoActionPerformed

    private void btnEliminarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTelefonoActionPerformed
        this.presionaBtnEliminarTel();
    }//GEN-LAST:event_btnEliminarTelefonoActionPerformed

    private void txtNumDptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumDptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumDptoActionPerformed

    private void txtCaracTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaracTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaracTelActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        this.mostrar();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.limpiarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnMostrarInfoProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarInfoProfActionPerformed
        this.cargarInfoMostrar();
    }//GEN-LAST:event_btnMostrarInfoProfActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtMatriculaBusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaBusqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaBusqActionPerformed

    private void btnNuevaProfesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaProfesionActionPerformed
        this.presionaBtnNuevaProfesion();
    }//GEN-LAST:event_btnNuevaProfesionActionPerformed

    private void btnEliminarProfesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProfesionActionPerformed
        this.presionaBtnEliminarProf();
    }//GEN-LAST:event_btnEliminarProfesionActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        this.ConfigModificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtNombreBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreBusqKeyReleased
        this.filtrarApellido();
    }//GEN-LAST:event_txtNombreBusqKeyReleased

    private void txtMatriculaBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaBusqKeyReleased
        this.filtrarMatricula();
    }//GEN-LAST:event_txtMatriculaBusqKeyReleased

    private void cmb_profesionBusqItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_profesionBusqItemStateChanged
        this.filtrarProfesion();
    }//GEN-LAST:event_cmb_profesionBusqItemStateChanged

    private void cerrar() {
        this.getGestorVista().cerrar();
    }

    private void guardar() {
        this.getGestorVista().guardar();
    }

    private void eliminar() {
        this.getGestorVista().eliminar();
    }

    private void imprimir() {
        this.getGestorVista().imprimir();
    }

    private void ConfigModificar() {
        this.getGestorVista().accionMofidicar();
        this.habilitarCamposModificar();
        this.getGestorVista().setModificar();
    }

    private void presionaBtnEliminarProf() {
        this.getGestorVista().eliminarProfesionDeLista();
    }

    private void presionaBtnNuevaProfesion() {
        this.getGestorVista().tomarProfesion();
    }

    private void cargarInfoMostrar() {
        this.getGestorVista().mostrarInfoProfesional();
        this.bloquearCamposMostrarInfo();
    }

    public void filtrarApellido() {
        this.getGestorVista().filtrarApellido();
    }

    public void filtrarMatricula() {
        this.getGestorVista().filtrarMatricula();
    }

    public void filtrarProfesion() {
        this.getGestorVista().filtrarProfesion();
    }

    private void habilitarCamposModificar() {
        this.getTxtApellido().setEditable(true);
        this.getTxtCalle().setEditable(true);
        this.getTxtCaracTel().setEditable(true);
        this.getTxtMatricula().setEditable(false);
        this.getTxtNombre().setEditable(true);
        this.getTxtNroCalle().setEditable(true);
        this.getTxtNumDocumentoPers().setEditable(false);
        this.getTxtNumTel().setEditable(true);
        this.getTxtNumDpto().setEditable(true);
        this.getTxtPiso().setEditable(true);
    }

    private void bloquearCamposMostrarInfo() {
        this.getTxtApellido().setEditable(false);
        this.getTxtCalle().setEditable(false);
        this.getTxtCaracTel().setEditable(false);
        this.getTxtMatricula().setEditable(false);
        this.getTxtNombre().setEditable(false);
        this.getTxtNroCalle().setEditable(false);
        this.getTxtNumDocumentoPers().setEditable(false);
        this.getTxtNumTel().setEditable(false);
        this.getTxtNumDpto().setEditable(false);
        this.getTxtPiso().setEditable(false);
        this.getCmbDocumento().setEnabled(false);
        this.getCmbPaises().setEnabled(false);
        this.getCmbProvincias().setEnabled(false);
        this.getCmbLocalidades().setEnabled(false);
        this.getCmb_profesionDatos().setEnabled(false);
        this.getBtnEliminarProfesion().setEnabled(false);
        this.getBtnNuevaProfesion().setEnabled(false);
        this.getBtnNuevoTelefono().setEnabled(false);
        this.getBtnEliminarTelefono().setEnabled(false);
        this.getDateFechaNacPers().setEnabled(false);
    }

    private void configBotonesIncial() {
        this.getBtnImprimir().setEnabled(true);
        this.getBtnCancelar().setEnabled(false);
        this.getBtnNuevo().setEnabled(true);
        this.getBtnBuscar().setEnabled(true);
        this.getBtnMostrarInfoProf().setEnabled(false);
        this.getBtnEliminar().setEnabled(false);
        this.getBtnGuardar().setEnabled(false);
        this.getBtnModificar().setEnabled(false);
        this.getBtnCancelar().setEnabled(false);
        this.getBtnEliminarTelefono().setEnabled(false);
        this.getBtnNuevoTelefono().setEnabled(false);
        this.getBtnLimpiar().setEnabled(false);
        this.getBtnListar().setEnabled(false);
        this.getBtnEliminarProfesion().setEnabled(false);
        this.getBtnNuevaProfesion().setEnabled(false);


    }

    public void configVistaModificar() {

        this.configNuevo();
        this.getBtnGuardar().setEnabled(true);
        this.getBtnModificar().setEnabled(false);
        this.getBtnEliminar().setEnabled(false);
        this.getTblProfesional().setEnabled(false);

    }

    public void configMostrarInfo() {
        this.configNuevo();
        this.getBtnGuardar().setEnabled(false);
        this.getBtnModificar().setEnabled(true);
        this.getBtnEliminar().setEnabled(false);
        this.getTblProfesional().setEnabled(false);

    }

    private void configTxtInicial() {
        this.getTxtApellido().setEnabled(false);
        this.getTxtCalle().setEnabled(false);
        this.getTxtCaracTel().setEnabled(false);
        this.getTxtPiso().setEnabled(false);
        this.getTxtMatricula().setEnabled(false);
        this.getTxtMatriculaBusq().setEnabled(false);
        this.getTxtNombreBusq().setEnabled(false);
        this.getTxtNombre().setEnabled(false);
        this.getTxtNroCalle().setEnabled(false);
        this.getTxtNumDocumentoPers().setEnabled(false);
        this.getTxtNumTel().setEnabled(false);
        this.getTxtNumDpto().setEnabled(false);
    }

    private void configCmbInicial() {
        this.getCmb_profesionBusq().setEnabled(false);
        this.getCmbDocumento().setEnabled(false);
        this.getCmbPaises().setEnabled(false);
        this.getCmbProvincias().setEnabled(false);
        this.getCmb_profesionDatos().setEnabled(false);
        this.getCmbLocalidades().setEnabled(false);
    }

    public void setConfigInicial() {
        this.configPanelesInicial();
        this.configBotonesIncial();
        this.configTxtInicial();
        this.configCmbInicial();
        this.getRadBtnMatricula().setEnabled(false);
        this.getRadBtnNombre().setEnabled(false);
        this.getRadBtnProfesion().setEnabled(false);
        this.getTblProfesional().setEnabled(false);
        this.getDateFechaNacPers().setEnabled(false);
        this.getListTelefonos().setEnabled(false);
        this.getListProfesiones().setEnabled(false);

    }

    private void configPanelesNuevo() {
        this.getPanelBusqueda().setEnabled(false);
        this.getPanelDatosProfesion().setEnabled(false);
        this.getPanelDatosProfesional().setEnabled(false);
        this.getPnlDatos().setEnabled(false);
        this.getPnlTelefonos().setEnabled(true);
        this.getPnlUbicacion().setEnabled(false);
    }

    private void configPanelesInicial() {
        this.getPanelBusqueda().setEnabled(false);
        this.getPanelDatosProfesion().setEnabled(false);
        this.getPanelDatosProfesional().setEnabled(false);
        this.getPnlDatos().setEnabled(false);
        this.getPnlTelefonos().setEnabled(false);
        this.getPnlUbicacion().setEnabled(false);
    }

    private void configCancelar() {
        this.ConfigInicial();
        this.getGestorVista().clearListTel();
        this.getGestorVista().clearListProf();
        this.getGestorVista().getListaTelefonos().clear();
        this.getGestorVista().getListaProfesiones().clear();
        this.limpiarTabla();
        this.getGestorVista().pintarDeBlanco();
        this.habilitarCampos();
    }

    private void habilitarCampos() {
        this.getTxtApellido().setEditable(true);
        this.getTxtCalle().setEditable(true);
        this.getTxtCaracTel().setEditable(true);
        this.getTxtMatricula().setEditable(true);
        this.getTxtNombre().setEditable(true);
        this.getTxtNroCalle().setEditable(true);
        this.getTxtNumDocumentoPers().setEditable(true);
        this.getTxtNumTel().setEditable(true);
        this.getTxtNumDpto().setEditable(true);
        this.getTxtPiso().setEditable(true);


    }

    private void configBusquedaInicial(JRadioButton radbtn) {
        int num = 0;
        if (radbtn == this.getRadBtnNombre()) {
            num = 1;
        }
        if (radbtn == this.getRadBtnMatricula()) {
            num = 2;
        }
        if (radbtn == this.getRadBtnProfesion()) {
            num = 3;
        }

        switch (num) {
            case 1:
                this.getRadBtnMatricula().setSelected(false);
                this.getRadBtnProfesion().setSelected(false);
                this.getTxtMatriculaBusq().setEnabled(false);
                this.getCmb_profesionBusq().setEnabled(false);
                this.getTxtNombreBusq().setEnabled(true);
                this.getTxtNombreBusq().requestFocus();
                this.limpiarCamposBusqueda();
                break;

            case 2:
                this.getRadBtnNombre().setSelected(false);
                this.getRadBtnProfesion().setSelected(false);
                this.getTxtNombreBusq().setEnabled(false);
                this.getCmb_profesionBusq().setEnabled(false);
                this.getTxtMatriculaBusq().setEnabled(true);
                this.getTxtMatriculaBusq().requestFocus();
                this.limpiarCamposBusqueda();

                break;

            case 3:
                this.getRadBtnNombre().setSelected(false);
                this.getRadBtnMatricula().setSelected(false);
                this.getTxtNombreBusq().setEnabled(false);
                this.getTxtMatriculaBusq().setEnabled(false);
                this.getCmb_profesionBusq().setEnabled(true);
                this.getCmb_profesionBusq().requestFocus();
                this.limpiarCamposBusqueda();
                break;
        }

    }

    public void limpiarCamposBusqueda() {
        this.getTxtNombreBusq().setText("");
        this.getTxtMatriculaBusq().setText("");
        this.getCmb_profesionBusq().setSelectedItem(null);
    }

    private void limpiarCampos() {
        this.getCmbDocumento().removeAllItems();
        this.getCmb_profesionBusq().removeAllItems();
        this.getDateFechaNacPers().setDate(null);
        this.getCmb_profesionDatos().removeAllItems();
        this.getCmbPaises().removeAllItems();
        this.getCmbProvincias().removeAllItems();
        this.getRadBtnMatricula().setSelected(false);
        this.getRadBtnNombre().setSelected(false);
        this.getRadBtnProfesion().setSelected(false);

    }

    private void limpiarTxt() {
        this.getTxtApellido().setText("");
        this.getTxtMatriculaBusq().setText("");
        this.getTxtNombreBusq().setText("");
        this.getTxtNombre().setText("");
        this.getTxtCalle().setText("");

        this.getTxtCaracTel().setText("");

        this.getTxtPiso().setText("");
        this.getTxtMatricula().setText("");
        this.getTxtNroCalle().setText("");
        this.getTxtNumDocumentoPers().setText("");
        this.getTxtNumDpto().setText("");
        this.getTxtNumTel().setText("");


    }

    public void presionarRadBtnNombre() {
        if (this.getRadBtnNombre().isSelected()) {
            this.configBusquedaInicial(this.getRadBtnNombre());
        } else {
            this.getTxtNombreBusq().setEnabled(false);
        }

    }

    public void presionarRadBtnMatricula() {
        if (this.getRadBtnMatricula().isSelected()) {
            this.configBusquedaInicial(this.getRadBtnMatricula());
        } else {
            this.getTxtMatriculaBusq().setEnabled(false);
        }
    }

    public void presionarRadBtnProfesion() {
        if (this.getRadBtnProfesion().isSelected()) {
            this.configBusquedaInicial(this.getRadBtnProfesion());
        } else {
            this.getCmb_profesionBusq().setEnabled(false);
        }
    }

    public void seleccionComboPais() {
        this.getGestorVista().cargarComboProvBuscar();
        this.getCmbProvincias().setEnabled(true);
    }

    public void seleccionComboProvincia() {
        this.getGestorVista().cargarComboLocalidadBuscar();
        this.getCmbLocalidades().setEnabled(true);
    }

    public void presionaBtnTelefono() {
        this.getGestorVista().tomarNumTelefono();

    }

    public void presionaBtnEliminarTel() {
        this.getGestorVista().eliminarNumTelefono();
    }

    private void configBotonesNuevo() {
        this.getBtnImprimir().setEnabled(true);
        this.getBtnCancelar().setEnabled(true);
        this.getBtnNuevo().setEnabled(false);
        this.getBtnBuscar().setEnabled(false);
        this.getBtnEliminar().setEnabled(false);
        this.getBtnGuardar().setEnabled(true);
        this.getBtnModificar().setEnabled(false);
        this.getBtnCancelar().setEnabled(true);
        this.getBtnMostrarInfoProf().setEnabled(false);
        this.getBtnEliminarTelefono().setEnabled(true);
        this.getBtnNuevoTelefono().setEnabled(true);
        this.getBtnLimpiar().setEnabled(false);
        this.getBtnListar().setEnabled(false);
        this.getBtnNuevaProfesion().setEnabled(true);
        this.getBtnEliminarProfesion().setEnabled(true);

    }

    private void configTxtNuevo() {
        this.getTxtApellido().setEnabled(true);
        this.getTxtCalle().setEnabled(true);
        this.getTxtCaracTel().setEnabled(true);
        this.getTxtPiso().setEnabled(true);
        this.getTxtMatricula().setEnabled(true);
        this.getTxtMatriculaBusq().setEnabled(false);
        this.getTxtNombreBusq().setEnabled(false);
        this.getTxtNombre().setEnabled(true);
        this.getTxtNroCalle().setEnabled(true);
        this.getTxtNumDocumentoPers().setEnabled(true);
        this.getTxtNumTel().setEnabled(true);
        this.getTxtApellido().requestFocus();
        this.getTxtNumDpto().setEnabled(true);
    }

    public void configCombosNuevo() {
        this.getCmbProvincias().setEnabled(false);
        this.getCmbPaises().setEnabled(true);
        this.getCmb_profesionDatos().setEnabled(true);
        this.getCmb_profesionBusq().setEnabled(false);
        this.getCmbLocalidades().setEnabled(false);
        this.getCmbDocumento().setEnabled(true);


    }

    public void configNuevo() {
        this.configPanelesNuevo();
        this.configBotonesNuevo();
        this.configTxtNuevo();
        this.configCombosNuevo();
        this.getListTelefonos().setEnabled(true);
        this.getListProfesiones().setEnabled(true);
        this.getDateFechaNacPers().setEnabled(true);
        this.getGestorVista().setNuevo();
        this.cargarCombos();
    }

    public void cargarCombos() {
        this.getGestorVista().cargarComboProfesiones();
        this.getGestorVista().cargarComboPaises();
        this.getGestorVista().cargarComboTipoDoc();

    }

    private void configTxtBuscar() {
        this.getTxtApellido().setEnabled(false);
        this.getTxtCalle().setEnabled(false);
        this.getTxtCaracTel().setEnabled(false);
        this.getTxtPiso().setEnabled(false);
        this.getTxtMatricula().setEnabled(false);
        this.getTxtMatriculaBusq().setEnabled(true);
        this.getTxtNombreBusq().setEnabled(true);
        this.getTxtNombre().setEnabled(false);
        this.getTxtNroCalle().setEnabled(false);
        this.getTxtNumDocumentoPers().setEnabled(false);
        this.getTxtNumTel().setEnabled(false);
        this.getTxtPiso().setEnabled(false);


        this.getTxtNumDpto().setEnabled(false);
    }

    private void configBtnBuscar() {
        this.getBtnImprimir().setEnabled(true);
        this.getBtnCancelar().setEnabled(true);
        this.getBtnNuevo().setEnabled(false);
        this.getBtnBuscar().setEnabled(false);
        this.getBtnEliminar().setEnabled(true);
        this.getBtnMostrarInfoProf().setEnabled(true);
        this.getBtnGuardar().setEnabled(false);
        this.getBtnModificar().setEnabled(false);
        this.getBtnEliminarTelefono().setEnabled(false);
        this.getBtnNuevoTelefono().setEnabled(false);
        this.getBtnListar().setEnabled(true);
        this.getBtnLimpiar().setEnabled(true);
        this.getBtnEliminarProfesion().setEnabled(false);
        this.getBtnNuevaProfesion().setEnabled(false);


    }

    public void configCmbBuscar() {

        this.getCmb_profesionBusq().setEnabled(true);
        this.getCmbDocumento().setEnabled(false);
        this.getCmbPaises().setEnabled(false);
        this.getCmbProvincias().setEnabled(false);
        this.getCmb_profesionDatos().setEnabled(false);
    }

    private void configBuscar() {
        this.configTxtBuscar();
        this.configBtnBuscar();
        this.configCmbBuscar();

        this.getGestorVista().cargarComboProfesionesBusq();
        this.configBusquedaInicial(this.getRadBtnNombre());
        this.getRadBtnNombre().setSelected(true);

        this.getRadBtnMatricula().setEnabled(true);
        this.getRadBtnNombre().setEnabled(true);
        this.getRadBtnProfesion().setEnabled(true);

        this.getTblProfesional().setEnabled(true);


    }

    public void ConfigInicial() {
        this.limpiarTxt();
        this.limpiarCampos();
        this.setConfigInicial();
    }

    private void validarSoloLetras(KeyEvent evt) {
        this.getGestorVista().soloLetras(evt);
    }

    private void validarSoloEntero(KeyEvent evt) {
        this.getGestorVista().soloNumeros(evt);
    }

    public void mostrar() {
        this.getGestorVista().mostrar();
    }

    public void limpiarTabla() {
        this.getGestorVista().limpiarTabla();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarProfesion;
    private javax.swing.JButton btnEliminarTelefono;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarInfoProf;
    private javax.swing.JButton btnNuevaProfesion;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevoTelefono;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbDocumento;
    private javax.swing.JComboBox cmbLocalidades;
    private javax.swing.JComboBox cmbPaises;
    private javax.swing.JComboBox cmbProvincias;
    private javax.swing.JComboBox cmb_profesionBusq;
    private javax.swing.JComboBox cmb_profesionDatos;
    private com.toedter.calendar.JDateChooser dateFechaNacPers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList listProfesiones;
    private javax.swing.JList listTelefonos;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelDatosProfesion;
    private javax.swing.JPanel panelDatosProfesional;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlTelefonos;
    private javax.swing.JPanel pnlUbicacion;
    private javax.swing.JRadioButton radBtnMatricula;
    private javax.swing.JRadioButton radBtnNombre;
    private javax.swing.JRadioButton radBtnProfesion;
    private javax.swing.JTable tblProfesional;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCaracTel;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtMatriculaBusq;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreBusq;
    private javax.swing.JTextField txtNroCalle;
    private javax.swing.JTextField txtNumDocumentoPers;
    private javax.swing.JTextField txtNumDpto;
    private javax.swing.JTextField txtNumTel;
    private javax.swing.JTextField txtPiso;
    // End of variables declaration//GEN-END:variables
}
