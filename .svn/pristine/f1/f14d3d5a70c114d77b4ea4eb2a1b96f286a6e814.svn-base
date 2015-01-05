/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmPaciente.java
 *
 * Created on 07-jun-2012, 13:29:58
 */
package Vistas.Paciente;

import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Lopez
 */
public class FrmPaciente extends javax.swing.JInternalFrame {

    private GestorVistaPaciente gestorVista;

    /**
     * Creates new form FrmPaciente
     */
    public FrmPaciente(GestorVistaPaciente gestorVista) {
        initComponents();
        this.setGestorVista(gestorVista);
        this.configInicial();
        this.centrarVentana();
    }
    
    private void centrarVentana() {
        //este metodo devuelve el tamaño de la pantalla  
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
//obtenemos el tamaño de la ventana  
        Dimension ventana = this.getSize();
//para centrar la ventana lo hacemos con el siguiente calculo  
        this.setLocation((pantalla.width - ventana.width + 250) / 2, (pantalla.height - 200 - ventana.height) / 2);
//y para finalizar la hacemos visible  
    }

    public GestorVistaPaciente getGestorVista() {
        return gestorVista;
    }

    public void setGestorVista(GestorVistaPaciente gestor) {
        this.gestorVista = gestor;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JButton getBtnHistoriaClinica() {
        return btnHistoriaClinica;
    }

    public void setBtnHistoriaClinica(JButton btnHistoriaClinica) {
        this.btnHistoriaClinica = btnHistoriaClinica;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    public JButton getBtnNuevo() {
        return btnNuevo;
    }

    public void setBtnNuevo(JButton btnNuevo) {
        this.btnNuevo = btnNuevo;
    }

    public JComboBox getCmbLocalidad() {
        return cmbLocalidad;
    }

    public void setCmbLocalidad(JComboBox cmbLocalidad) {
        this.cmbLocalidad = cmbLocalidad;
    }

    public JComboBox getCmbProvincia() {
        return cmbProvincia;
    }

    public void setCmbProvincia(JComboBox cmbProvincia) {
        this.cmbProvincia = cmbProvincia;
    }

    public JComboBox getCmbTipoDni() {
        return cmbTipoDni;
    }

    public void setCmbTipoDni(JComboBox cmbTipoDni) {
        this.cmbTipoDni = cmbTipoDni;
    }

    public JComboBox getCmbTipoDniBusqueda() {
        return cmbTipoDniBusqueda;
    }

    public void setCmbTipoDniBusqueda(JComboBox cmbTipoDniBusqueda) {
        this.cmbTipoDniBusqueda = cmbTipoDniBusqueda;
    }

    public JPanel getjPanel6() {
        return jPanel6;
    }

    public void setjPanel6(JPanel jPanel6) {
        this.jPanel6 = jPanel6;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JPanel getPanelBotones() {
        return panelBotones;
    }

    public void setPanelBotones(JPanel panelBotones) {
        this.panelBotones = panelBotones;
    }

    public JPanel getPnlBusquedaPaciente() {
        return pnlBusquedaPaciente;
    }

    public void setPnlBusquedaPaciente(JPanel pnlBusquedaPaciente) {
        this.pnlBusquedaPaciente = pnlBusquedaPaciente;
    }

    public JPanel getPnlDatosLocalidad() {
        return pnlDatosLocalidad;
    }

    public void setPnlDatosLocalidad(JPanel pnlDatosLocalidad) {
        this.pnlDatosLocalidad = pnlDatosLocalidad;
    }

    public JPanel getPnlDatosPersonales() {
        return pnlDatosPersonales;
    }

    public void setPnlDatosPersonales(JPanel pnlDatosPersonales) {
        this.pnlDatosPersonales = pnlDatosPersonales;
    }

    public JRadioButton getRbtnApellidoBusqueda() {
        return rbtnApellidoBusqueda;
    }

    public void setRbtnApellidoBusqueda(JRadioButton rbtnApellidoBusqueda) {
        this.rbtnApellidoBusqueda = rbtnApellidoBusqueda;
    }

    public JRadioButton getRbtnDniBusqueda() {
        return rbtnDniBusqueda;
    }

    public void setRbtnDniBusqueda(JRadioButton rbtnDniBusqueda) {
        this.rbtnDniBusqueda = rbtnDniBusqueda;
    }

    public JRadioButton getRbtnNombreBusqueda() {
        return rbtnNombreBusqueda;
    }

    public void setRbtnNombreBusqueda(JRadioButton rbtnNombreBusqueda) {
        this.rbtnNombreBusqueda = rbtnNombreBusqueda;
    }

    public JTable getTblBusqueda() {
        return tblBusqueda;
    }

    public void setTblBusqueda(JTable tblBusqueda) {
        this.tblBusqueda = tblBusqueda;
    }

    public JTextField getTxtAlturaCalle() {
        return txtAlturaCalle;
    }

    public void setTxtAlturaCalle(JTextField txtAlturaCalle) {
        this.txtAlturaCalle = txtAlturaCalle;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JTextField getTxtApellidoBusqueda() {
        return txtApellidoBusqueda;
    }

    public void setTxtApellidoBusqueda(JTextField txtApellidoBusqueda) {
        this.txtApellidoBusqueda = txtApellidoBusqueda;
    }

    public JTextField getTxtCalle() {
        return txtCalle;
    }

    public void setTxtCalle(JTextField txtCalle) {
        this.txtCalle = txtCalle;
    }

    public JTextField getTxtDni() {
        return txtDni;
    }

    public void setTxtDni(JTextField txtDni) {
        this.txtDni = txtDni;
    }

    public JTextField getTxtDniBusqueda() {
        return txtDniBusqueda;
    }

    public void setTxtDniBusqueda(JTextField txtDniBusqueda) {
        this.txtDniBusqueda = txtDniBusqueda;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtNombreBusqueda() {
        return txtNombreBusqueda;
    }

    public void setTxtNombreBusqueda(JTextField txtNombreBusqueda) {
        this.txtNombreBusqueda = txtNombreBusqueda;
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

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnImprimir() {
        return btnImprimir;
    }

    public void setBtnImprimir(JButton btnImprimir) {
        this.btnImprimir = btnImprimir;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JButton getBtnNuevoTelefono() {
        return btnNuevoTelefono;
    }

    public void setBtnNuevoTelefono(JButton btnNuevoTelefono) {
        this.btnNuevoTelefono = btnNuevoTelefono;
    }

    public JList getLstNumerosTelefono() {
        return lstNumerosTelefono;
    }

    public void setLstNumerosTelefono(JList lstNumerosTelefono) {
        this.lstNumerosTelefono = lstNumerosTelefono;
    }

    public JTextField getTxtCaractTelefono() {
        return txtCaractTelefono;
    }

    public void setTxtCaractTelefono(JTextField txtCaractTelefono) {
        this.txtCaractTelefono = txtCaractTelefono;
    }

    public JTextField getTxtNumDepto() {
        return txtNumDepto;
    }

    public void setTxtNumDepto(JTextField txtNumDepto) {
        this.txtNumDepto = txtNumDepto;
    }

    public JTextField getTxtNumTelefono() {
        return txtNumTelefono;
    }

    public void setTxtNumTelefono(JTextField txtNumTelefono) {
        this.txtNumTelefono = txtNumTelefono;
    }

    public JTextField getTxtPisoDepto() {
        return txtPisoDepto;
    }

    public void setTxtPisoDepto(JTextField txtPisoDepto) {
        this.txtPisoDepto = txtPisoDepto;
    }

    public JScrollPane getScrollListaTelefono() {
        return scrollListaTelefono;
    }

    public void setScrollListaTelefono(JScrollPane scrollListaTelefono) {
        this.scrollListaTelefono = scrollListaTelefono;
    }

    public JComboBox getCmbPais() {
        return cmbPais;
    }

    public void setCmbPais(JComboBox cmbPais) {
        this.cmbPais = cmbPais;
    }

    public JDateChooser getDateFechaNacimiento() {
        return dateFechaNacimiento;
    }

    public void setDateFechaNacimiento(JDateChooser dateFechaNacimiento) {
        this.dateFechaNacimiento = dateFechaNacimiento;
    }

    public JButton getBtnEliminarTelefono() {
        return btnEliminarTelefono;
    }

    public void setBtnEliminarTelefono(JButton btnEliminarTelefono) {
        this.btnEliminarTelefono = btnEliminarTelefono;
    }

    public JButton getBtnMostrarInfoPaciente() {
        return btnMostrarInfoPaciente;
    }

    public void setBtnMostrarInfoPaciente(JButton btnMostrarInfoPaciente) {
        this.btnMostrarInfoPaciente = btnMostrarInfoPaciente;
    }

    public JButton getBtnDefinirParentesco() {
        return btnDefinirParentesco;
    }

    public void setBtnDefinirParentesco(JButton btnDefinirParentesco) {
        this.btnDefinirParentesco = btnDefinirParentesco;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBotones = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBusqueda = new javax.swing.JTable();
        pnlBusquedaPaciente = new javax.swing.JPanel();
        rbtnApellidoBusqueda = new javax.swing.JRadioButton();
        txtApellidoBusqueda = new javax.swing.JTextField();
        rbtnDniBusqueda = new javax.swing.JRadioButton();
        cmbTipoDniBusqueda = new javax.swing.JComboBox();
        txtNombreBusqueda = new javax.swing.JTextField();
        rbtnNombreBusqueda = new javax.swing.JRadioButton();
        txtDniBusqueda = new javax.swing.JTextField();
        btnHistoriaClinica = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnMostrarInfoPaciente = new javax.swing.JButton();
        btnDefinirParentesco = new javax.swing.JButton();
        pnlNuevoPaciente1 = new javax.swing.JPanel();
        pnlDatosTelefonicos = new javax.swing.JPanel();
        scrollListaTelefono = new javax.swing.JScrollPane();
        lstNumerosTelefono = new javax.swing.JList();
        jLabel71 = new javax.swing.JLabel();
        txtNumTelefono = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        txtCaractTelefono = new javax.swing.JTextField();
        btnNuevoTelefono = new javax.swing.JButton();
        btnEliminarTelefono = new javax.swing.JButton();
        pnlDatosPersonales = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dateFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        cmbTipoDni = new javax.swing.JComboBox();
        jLabel46 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        pnlDatosLocalidad = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        txtNumDepto = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        txtPisoDepto = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        txtAlturaCalle = new javax.swing.JTextField();
        cmbProvincia = new javax.swing.JComboBox();
        txtCalle = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        cmbLocalidad = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox();
        btnSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setTitle("Administrar Pacientes");

        panelBotones.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setMaximumSize(new java.awt.Dimension(85, 25));
        btnEliminar.setMinimumSize(new java.awt.Dimension(85, 25));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setMaximumSize(new java.awt.Dimension(85, 25));
        btnModificar.setMinimumSize(new java.awt.Dimension(85, 25));
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
        btnNuevo.setMaximumSize(new java.awt.Dimension(85, 25));
        btnNuevo.setMinimumSize(new java.awt.Dimension(85, 25));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setMaximumSize(new java.awt.Dimension(85, 25));
        btnGuardar.setMinimumSize(new java.awt.Dimension(85, 25));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(85, 25));
        btnCancelar.setMinimumSize(new java.awt.Dimension(85, 25));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setMaximumSize(new java.awt.Dimension(85, 25));
        btnImprimir.setMinimumSize(new java.awt.Dimension(85, 25));
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
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda"));

        tblBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " ", "Apellido y nombre", "DNI", "Nacimiento", "Domicilio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBusqueda);
        tblBusqueda.getColumnModel().getColumn(0).setMinWidth(-10);
        tblBusqueda.getColumnModel().getColumn(0).setPreferredWidth(-10);
        tblBusqueda.getColumnModel().getColumn(0).setMaxWidth(-10);
        tblBusqueda.getColumnModel().getColumn(2).setMinWidth(85);
        tblBusqueda.getColumnModel().getColumn(2).setPreferredWidth(85);
        tblBusqueda.getColumnModel().getColumn(2).setMaxWidth(85);
        tblBusqueda.getColumnModel().getColumn(3).setMinWidth(70);
        tblBusqueda.getColumnModel().getColumn(3).setPreferredWidth(70);
        tblBusqueda.getColumnModel().getColumn(3).setMaxWidth(70);
        tblBusqueda.getColumnModel().getColumn(4).setMinWidth(200);
        tblBusqueda.getColumnModel().getColumn(4).setPreferredWidth(200);
        tblBusqueda.getColumnModel().getColumn(4).setMaxWidth(200);

        pnlBusquedaPaciente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rbtnApellidoBusqueda.setText("Por Apellido");
        rbtnApellidoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnApellidoBusquedaActionPerformed(evt);
            }
        });

        txtApellidoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoBusquedaActionPerformed(evt);
            }
        });
        txtApellidoBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoBusquedaKeyTyped(evt);
            }
        });

        rbtnDniBusqueda.setText("Por DNI");
        rbtnDniBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDniBusquedaActionPerformed(evt);
            }
        });

        cmbTipoDniBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoDniBusquedaActionPerformed(evt);
            }
        });
        cmbTipoDniBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbTipoDniBusquedaKeyReleased(evt);
            }
        });

        txtNombreBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreBusquedaKeyTyped(evt);
            }
        });

        rbtnNombreBusqueda.setText("Por Nombre");
        rbtnNombreBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNombreBusquedaActionPerformed(evt);
            }
        });

        txtDniBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniBusquedaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlBusquedaPacienteLayout = new javax.swing.GroupLayout(pnlBusquedaPaciente);
        pnlBusquedaPaciente.setLayout(pnlBusquedaPacienteLayout);
        pnlBusquedaPacienteLayout.setHorizontalGroup(
            pnlBusquedaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBusquedaPacienteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlBusquedaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnNombreBusqueda)
                    .addComponent(rbtnApellidoBusqueda)
                    .addComponent(rbtnDniBusqueda))
                .addGap(18, 18, 18)
                .addGroup(pnlBusquedaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtApellidoBusqueda)
                    .addComponent(txtNombreBusqueda)
                    .addGroup(pnlBusquedaPacienteLayout.createSequentialGroup()
                        .addComponent(cmbTipoDniBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDniBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBusquedaPacienteLayout.setVerticalGroup(
            pnlBusquedaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBusquedaPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBusquedaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnApellidoBusqueda)
                    .addComponent(txtApellidoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBusquedaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnNombreBusqueda)
                    .addComponent(txtNombreBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBusquedaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnDniBusqueda)
                    .addComponent(cmbTipoDniBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDniBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnHistoriaClinica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historiaClinicaLibrito.png"))); // NOI18N
        btnHistoriaClinica.setText("Historia Clínica");
        btnHistoriaClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoriaClinicaActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listar.png"))); // NOI18N
        btnListar.setText("Listar Completo");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnMostrarInfoPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver_mas.png"))); // NOI18N
        btnMostrarInfoPaciente.setText("Ver Información");
        btnMostrarInfoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarInfoPacienteActionPerformed(evt);
            }
        });

        btnDefinirParentesco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/familia.jpg"))); // NOI18N
        btnDefinirParentesco.setText("Definir Parentescos");
        btnDefinirParentesco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefinirParentescoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBusquedaPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDefinirParentesco)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnListar)))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMostrarInfoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHistoriaClinica, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(pnlBusquedaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarInfoPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHistoriaClinica, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDefinirParentesco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        pnlNuevoPaciente1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Paciente"));

        pnlDatosTelefonicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefónicos"));

        scrollListaTelefono.setViewportView(lstNumerosTelefono);

        jLabel71.setText("-");

        txtNumTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumTelefonotxtNumTelActionPerformed(evt);
            }
        });
        txtNumTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumTelefonoKeyTyped(evt);
            }
        });

        jLabel72.setText("N° Teléfono");

        txtCaractTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCaractTelefonoKeyTyped(evt);
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

        javax.swing.GroupLayout pnlDatosTelefonicosLayout = new javax.swing.GroupLayout(pnlDatosTelefonicos);
        pnlDatosTelefonicos.setLayout(pnlDatosTelefonicosLayout);
        pnlDatosTelefonicosLayout.setHorizontalGroup(
            pnlDatosTelefonicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosTelefonicosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosTelefonicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosTelefonicosLayout.createSequentialGroup()
                        .addComponent(txtCaractTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumTelefono))
                    .addGroup(pnlDatosTelefonicosLayout.createSequentialGroup()
                        .addGroup(pnlDatosTelefonicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNuevoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollListaTelefono)))
                .addContainerGap())
        );
        pnlDatosTelefonicosLayout.setVerticalGroup(
            pnlDatosTelefonicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosTelefonicosLayout.createSequentialGroup()
                .addGroup(pnlDatosTelefonicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(txtCaractTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71)
                    .addComponent(txtNumTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosTelefonicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosTelefonicosLayout.createSequentialGroup()
                        .addComponent(btnNuevoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollListaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales")), "Datos Personales "));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel45.setText("Nombres");

        jLabel44.setText("Apellidos");

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        jLabel2.setText("Fecha de Nacimiento");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel51.setText("Tipo Documento");

        jLabel46.setText("N°");

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTipoDni, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(cmbTipoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlDatosPersonalesLayout = new javax.swing.GroupLayout(pnlDatosPersonales);
        pnlDatosPersonales.setLayout(pnlDatosPersonalesLayout);
        pnlDatosPersonalesLayout.setHorizontalGroup(
            pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addGap(10, 10, 10)
                                .addComponent(txtApellido))
                            .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre)))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosPersonalesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnlDatosPersonalesLayout.setVerticalGroup(
            pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel45)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(dateFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlDatosLocalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Domicilio "));

        jLabel52.setText("N° Depto");

        jLabel53.setText("Piso");

        jLabel56.setText("Provincia");

        jLabel54.setText("Altura");

        jLabel57.setText("Localidad");

        txtAlturaCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlturaCalleKeyTyped(evt);
            }
        });

        cmbProvincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProvinciaItemStateChanged(evt);
            }
        });

        jLabel55.setText("Calle");

        jLabel1.setText("Pais");

        cmbPais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPaisItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosLocalidadLayout = new javax.swing.GroupLayout(pnlDatosLocalidad);
        pnlDatosLocalidad.setLayout(pnlDatosLocalidadLayout);
        pnlDatosLocalidadLayout.setHorizontalGroup(
            pnlDatosLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLocalidadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55)
                    .addComponent(jLabel54)
                    .addComponent(jLabel1)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlDatosLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCalle)
                    .addGroup(pnlDatosLocalidadLayout.createSequentialGroup()
                        .addComponent(txtAlturaCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel53)
                        .addGap(18, 18, 18)
                        .addComponent(txtPisoDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDatosLocalidadLayout.createSequentialGroup()
                        .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel56)
                        .addGap(18, 18, 18)
                        .addComponent(cmbProvincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDatosLocalidadLayout.createSequentialGroup()
                        .addComponent(cmbLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDatosLocalidadLayout.setVerticalGroup(
            pnlDatosLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLocalidadLayout.createSequentialGroup()
                .addGroup(pnlDatosLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbPais)
                    .addComponent(jLabel56)
                    .addComponent(cmbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDatosLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlDatosLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(txtAlturaCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53)
                    .addComponent(txtPisoDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52)
                    .addComponent(txtNumDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout pnlNuevoPaciente1Layout = new javax.swing.GroupLayout(pnlNuevoPaciente1);
        pnlNuevoPaciente1.setLayout(pnlNuevoPaciente1Layout);
        pnlNuevoPaciente1Layout.setHorizontalGroup(
            pnlNuevoPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevoPaciente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNuevoPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlDatosTelefonicos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDatosLocalidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDatosPersonales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlNuevoPaciente1Layout.setVerticalGroup(
            pnlNuevoPaciente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevoPaciente1Layout.createSequentialGroup()
                .addComponent(pnlDatosPersonales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDatosTelefonicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDatosLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pnlNuevoPaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlNuevoPaciente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnNombreBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNombreBusquedaActionPerformed
        this.actRbtnNombreBusqueda();
    }//GEN-LAST:event_rbtnNombreBusquedaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.actBtnBuscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.actBtnNuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void rbtnApellidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnApellidoBusquedaActionPerformed
        this.actRbtnApellidoBusqueda();
    }//GEN-LAST:event_rbtnApellidoBusquedaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        this.configModificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtApellidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoBusquedaActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        this.mostrar();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.configCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnHistoriaClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoriaClinicaActionPerformed
        this.abrirHistoriaClinica();
    }//GEN-LAST:event_btnHistoriaClinicaActionPerformed

    private void txtNumTelefonotxtNumTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumTelefonotxtNumTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumTelefonotxtNumTelActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        this.imprimir();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.cerrar();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void rbtnDniBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDniBusquedaActionPerformed
        this.actRbtnDniBusqueda();
    }//GEN-LAST:event_rbtnDniBusquedaActionPerformed

    private void cmbPaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPaisItemStateChanged
        this.stateChangedCmbPais();
    }//GEN-LAST:event_cmbPaisItemStateChanged

    private void cmbProvinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProvinciaItemStateChanged
        this.stateChangedCmbProvincia();
    }//GEN-LAST:event_cmbProvinciaItemStateChanged

    private void btnEliminarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTelefonoActionPerformed
        this.presionaBtnEliminarTel();
    }//GEN-LAST:event_btnEliminarTelefonoActionPerformed

    private void btnNuevoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTelefonoActionPerformed
        this.presionaBtnTelefono();
    }//GEN-LAST:event_btnNuevoTelefonoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.getGestorVista().limpiarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtApellidoBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoBusquedaKeyReleased
        this.filtrarApellido();
    }//GEN-LAST:event_txtApellidoBusquedaKeyReleased

    private void txtNombreBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreBusquedaKeyReleased
        this.filtrarNombre();
    }//GEN-LAST:event_txtNombreBusquedaKeyReleased

    private void txtDniBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniBusquedaKeyReleased
        this.filtrarDni();
    }//GEN-LAST:event_txtDniBusquedaKeyReleased

    private void btnMostrarInfoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarInfoPacienteActionPerformed
        this.cargarInfoMostrar();
    }//GEN-LAST:event_btnMostrarInfoPacienteActionPerformed

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        this.validarSoloLetras(evt);
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        this.validarSoloLetras(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoBusquedaKeyTyped
        this.validarSoloLetras(evt);
    }//GEN-LAST:event_txtApellidoBusquedaKeyTyped

    private void txtNombreBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreBusquedaKeyTyped
        this.validarSoloLetras(evt);
    }//GEN-LAST:event_txtNombreBusquedaKeyTyped

    private void txtDniBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniBusquedaKeyTyped
        this.validarSoloEntero(evt);
    }//GEN-LAST:event_txtDniBusquedaKeyTyped

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        this.validarSoloEntero(evt);
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtCaractTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaractTelefonoKeyTyped
        this.validarSoloEntero(evt);
    }//GEN-LAST:event_txtCaractTelefonoKeyTyped

    private void txtNumTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumTelefonoKeyTyped
        this.validarSoloEntero(evt);
    }//GEN-LAST:event_txtNumTelefonoKeyTyped

    private void txtAlturaCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlturaCalleKeyTyped
        this.validarSoloEntero(evt);
    }//GEN-LAST:event_txtAlturaCalleKeyTyped

    private void cmbTipoDniBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbTipoDniBusquedaKeyReleased
        //
    }//GEN-LAST:event_cmbTipoDniBusquedaKeyReleased

    private void cmbTipoDniBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoDniBusquedaActionPerformed
        this.limpiarTxtDniYTabla();       
    }//GEN-LAST:event_cmbTipoDniBusquedaActionPerformed

    private void btnDefinirParentescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefinirParentescoActionPerformed
        this.abrirRelacionParentezco();
    }//GEN-LAST:event_btnDefinirParentescoActionPerformed
    public void cerrar(){
        this.getGestorVista().cerrar();
    }
    public void setConfigBotones() {
        this.getBtnNuevo().setEnabled(false);
        this.getBtnBuscar().setEnabled(false);
        this.getBtnEliminar().setEnabled(false);
        this.getBtnGuardar().setEnabled(false);
        this.getBtnModificar().setEnabled(false);
        this.getBtnCancelar().setEnabled(false);
    }

    public void setConfigBusqueda(boolean estado) {
        if (!estado) {
            this.getBtnLimpiar().setEnabled(false);
            this.getBtnListar().setEnabled(false);
            this.getTxtApellidoBusqueda().setEnabled(false);
            this.getTxtNombreBusqueda().setEnabled(false);
            this.getTblBusqueda().setEnabled(false);
            this.getTxtDniBusqueda().setEnabled(false);
            this.getCmbTipoDniBusqueda().setEnabled(false);
            this.getBtnHistoriaClinica().setEnabled(false);
            this.getBtnDefinirParentesco().setEnabled(false);
            this.getRbtnApellidoBusqueda().setEnabled(false);
            this.getRbtnDniBusqueda().setEnabled(false);
            this.getRbtnNombreBusqueda().setEnabled(false);
            this.getBtnMostrarInfoPaciente().setEnabled(false);
        } else {
            this.getBtnLimpiar().setEnabled(true);
            this.getBtnListar().setEnabled(true);
            this.getTxtApellidoBusqueda().setEnabled(true);
            this.getTxtNombreBusqueda().setEnabled(true);
            this.getTblBusqueda().setEnabled(true);
            this.getTxtDniBusqueda().setEnabled(true);
            this.getCmbTipoDniBusqueda().setEnabled(true);
            this.getBtnHistoriaClinica().setEnabled(true);
            this.getBtnDefinirParentesco().setEnabled(true);
            this.getRbtnApellidoBusqueda().setEnabled(true);
            this.getRbtnDniBusqueda().setEnabled(true);
            this.getRbtnNombreBusqueda().setEnabled(true);
            this.getBtnMostrarInfoPaciente().setEnabled(true);
        }
    }

    public void setConfigNuevoPaciente(boolean estado) {
        if (!estado) {
            this.getTxtApellido().setEnabled(false);
            this.getTxtNombre().setEnabled(false);
            this.getCmbTipoDni().setEnabled(false);
            this.getTxtCaractTelefono().setEnabled(false);
            this.getTxtNumTelefono().setEnabled(false);
            this.getLstNumerosTelefono().setEnabled(false);
            this.getCmbProvincia().setEnabled(false);
            this.getCmbLocalidad().setEnabled(false);
            this.getTxtCalle().setEnabled(false);
            this.getTxtAlturaCalle().setEnabled(false);
            this.getTxtPisoDepto().setEnabled(false);
            this.getTxtNumDepto().setEnabled(false);
            this.getTxtDni().setEnabled(false);
            this.getBtnNuevoTelefono().setEnabled(false);
            this.getBtnEliminarTelefono().setEnabled(false);
            this.getLstNumerosTelefono().setEnabled(false);
            this.getCmbPais().setEnabled(false);
            this.getScrollListaTelefono().setEnabled(false);
            this.getDateFechaNacimiento().setEnabled(false);
        } else {

            this.getTxtApellido().setEnabled(true);
            this.getTxtNombre().setEnabled(true);
            this.getCmbTipoDni().setEnabled(true);
            this.getTxtCaractTelefono().setEnabled(true);
            this.getTxtNumTelefono().setEnabled(true);
            this.getLstNumerosTelefono().setEnabled(true);
            this.getCmbProvincia().setEnabled(true);
            this.getCmbLocalidad().setEnabled(true);
            this.getTxtCalle().setEnabled(true);
            this.getTxtAlturaCalle().setEnabled(true);
            this.getTxtPisoDepto().setEnabled(true);
            this.getTxtNumDepto().setEnabled(true);
            this.getTxtDni().setEnabled(true);
            this.getBtnNuevoTelefono().setEnabled(true);
            this.getBtnEliminarTelefono().setEnabled(true);
            this.getLstNumerosTelefono().setEnabled(true);
            this.getCmbPais().setEnabled(true);
            this.getScrollListaTelefono().setEnabled(true);
            this.getDateFechaNacimiento().setEnabled(true);
        }


    }

    public void setConfigBtnInicial() {
        this.setConfigBotones();
        this.getBtnNuevo().setEnabled(true);
        this.getBtnBuscar().setEnabled(true);
        this.setConfigBusqueda(false);
        this.setConfigNuevoPaciente(false);
    }

    public void setConfigBtnNuevo() {
        this.setConfigBotones();
        this.getBtnGuardar().setEnabled(true);
        this.getBtnCancelar().setEnabled(true);
        this.setConfigBusqueda(false);
        this.setConfigNuevoPaciente(true);
    }

    public void limpiarTxt() {
        this.getTxtNombre().setText("");
        this.getTxtApellido().setText("");
        this.getTxtAlturaCalle().setText("");
        this.getTxtApellidoBusqueda().setText("");
        this.getTxtCalle().setText("");
        this.getTxtCaractTelefono().setText("");
        this.getTxtDni().setText("");
        this.getTxtDniBusqueda().setText("");
        this.getTxtNombreBusqueda().setText("");
        this.getTxtNumDepto().setText("");
        this.getTxtNumTelefono().setText("");
        this.getTxtPisoDepto().setText("");
    }

    private void limpiarCampos() {
        this.getCmbTipoDni().removeAllItems();
        this.getCmbTipoDniBusqueda().removeAllItems();
        this.getDateFechaNacimiento().setDate(null);
        this.getCmbLocalidad().removeAllItems();
        this.getCmbPais().removeAllItems();
        this.getCmbProvincia().removeAllItems();

    }

    private void limpiarRButton() {
        this.getRbtnApellidoBusqueda().setSelected(false);
        this.getRbtnNombreBusqueda().setSelected(false);
        this.getRbtnDniBusqueda().setSelected(false);

    }

    public void configInicial() {
        this.setConfigBtnInicial();
        this.limpiarTxt();
        this.limpiarCampos();
    }

    public void configNuevo() {
        this.setConfigBtnNuevo();
        this.getGestorVista().setNuevo();
        this.getTxtApellido().requestFocus();
        this.getCmbLocalidad().setEnabled(false);
        this.getCmbProvincia().setEnabled(false);
    }

    public void setConfigBtnBuscar() {
        this.setConfigBotones();
        this.setConfigBusqueda(true);
        this.setConfigNuevoPaciente(false);
        this.getTxtNombreBusqueda().setEnabled(false);
        this.getTxtApellidoBusqueda().setEnabled(false);
        this.getTxtDniBusqueda().setEnabled(false);
        this.getCmbTipoDniBusqueda().setEnabled(false);
        this.getBtnCancelar().setEnabled(true);
        this.getBtnListar().setEnabled(true);
        this.getBtnEliminar().setEnabled(true);
    }

    public void configBuscar() {
        this.setConfigBtnBuscar();
        this.getRbtnNombreBusqueda().requestFocus();
        this.getTblBusqueda().setEnabled(true);
    }

    public void configCancelar() {
        this.habilitarEdicionDeCampos();
        this.getTxtDni().setEditable(true);
        this.configInicial();
        this.getGestorVista().limpiarTabla();
        this.limpiarTxt();
        this.limpiarRButton();
        this.getGestorVista().clearList();
        this.getCmbProvincia().setEnabled(false);
        this.getCmbLocalidad().setEnabled(false);
    }

    private void configBusquedaInicial(JRadioButton radbtn) {
        int num = 0;
        if (radbtn == this.getRbtnApellidoBusqueda()) {
            num = 1;
        }
        if (radbtn == this.getRbtnNombreBusqueda()) {
            num = 2;
        }
        if (radbtn == this.getRbtnDniBusqueda()) {
            num = 3;
        }

        switch (num) {
            case 1:
                this.getRbtnNombreBusqueda().setSelected(false);
                this.getRbtnDniBusqueda().setSelected(false);
                this.getTxtApellidoBusqueda().setEnabled(true);
                this.getTxtApellidoBusqueda().requestFocus();
                this.getTxtNombreBusqueda().setEnabled(false);
                this.getTxtDniBusqueda().setEnabled(false);
                this.getCmbTipoDniBusqueda().setEnabled(false);
                this.limpiarTxtBusqueda();
                break;

            case 2:
                this.getRbtnApellidoBusqueda().setSelected(false);
                this.getRbtnDniBusqueda().setSelected(false);
                this.getTxtApellidoBusqueda().setEnabled(false);
                this.getTxtNombreBusqueda().requestFocus();
                this.getTxtNombreBusqueda().setEnabled(true);
                this.getTxtDniBusqueda().setEnabled(false);
                this.getCmbTipoDniBusqueda().setEnabled(false);
                this.limpiarTxtBusqueda();
                break;

            case 3:
                this.getRbtnApellidoBusqueda().setSelected(false);
                this.getRbtnNombreBusqueda().setSelected(false);
                this.getTxtApellidoBusqueda().setEnabled(false);
                this.getCmbTipoDniBusqueda().requestFocus();
                this.getTxtNombreBusqueda().setEnabled(false);
                this.getTxtDniBusqueda().setEnabled(true);
                this.getCmbTipoDniBusqueda().setEnabled(true);
                this.limpiarTxtBusqueda();
                break;


        }

    }

    private void cargarInfoMostrar() {
        this.getGestorVista().mostrarInfoPaciente();
    }

    public void configMostrarInfo() {
        this.getBtnGuardar().setEnabled(false);
        this.getBtnModificar().setEnabled(true);
        this.getBtnEliminar().setEnabled(false);
        this.getTblBusqueda().setEnabled(false);
        this.getBtnMostrarInfoPaciente().setEnabled(false);
        this.getBtnHistoriaClinica().setEnabled(false);
        this.getBtnDefinirParentesco().setEnabled(false);
        this.getBtnListar().setEnabled(false);
        this.getBtnLimpiar().setEnabled(false);
        this.bloquearEdicionDeCampos();
        this.setConfigNuevoPaciente(true);
        this.getBtnNuevoTelefono().setEnabled(false);
        this.getBtnEliminarTelefono().setEnabled(false);
        this.getLstNumerosTelefono().setEnabled(false);
        this.getCmbTipoDni().setEnabled(false);
        this.getCmbPais().setEnabled(false);

    }

    private void configModificar() {
        this.getGestorVista().accionMofidicar();
        this.getCmbTipoDni().setEnabled(true);
        this.getCmbPais().setEnabled(true);
        this.getCmbProvincia().setEnabled(true);
        this.getCmbLocalidad().setEnabled(true);
        this.habilitarEdicionDeCampos();
        this.getTxtDni().setEditable(false);
        this.getGestorVista().setModificar();
        this.getBtnGuardar().setEnabled(true);
        this.getBtnModificar().setEnabled(false);
    }

    private void eliminar() {
        this.getGestorVista().eliminar();
    }

    public void configVistaModificar() {

        this.configNuevo();
        this.getBtnGuardar().setEnabled(true);
        this.getBtnModificar().setEnabled(false);
        this.getBtnEliminar().setEnabled(false);
        this.getTblBusqueda().setEnabled(false);

    }
    
    public void bloquearEdicionDeCampos(){
            this.getTxtApellido().setEditable(false);
            this.getTxtNombre().setEditable(false);
            this.getCmbTipoDni().setEnabled(false);
            this.getTxtCaractTelefono().setEditable(false);
            this.getTxtNumTelefono().setEditable(false);
            this.getLstNumerosTelefono().setEnabled(false);
            this.getTxtCalle().setEditable(false);
            this.getTxtAlturaCalle().setEditable(false);
            this.getTxtPisoDepto().setEditable(false);
            this.getTxtNumDepto().setEditable(false);
            this.getTxtDni().setEditable(false);
            this.getBtnNuevoTelefono().setEnabled(false);
            this.getBtnEliminarTelefono().setEnabled(false);
            this.getLstNumerosTelefono().setEnabled(false);
            this.getCmbPais().setEnabled(false);
            this.getCmbProvincia().setEnabled(false);
            this.getCmbLocalidad().setEnabled(false);
            this.getScrollListaTelefono().setEnabled(false);
            this.getDateFechaNacimiento().setEnabled(false);        
    }
    
    public void habilitarEdicionDeCampos(){
            this.getTxtApellido().setEditable(true);
            this.getTxtNombre().setEditable(true);
            this.getCmbTipoDni().setEnabled(true);
            this.getTxtCaractTelefono().setEditable(true);
            this.getTxtNumTelefono().setEditable(true);
            this.getLstNumerosTelefono().setEnabled(true);
            this.getTxtCalle().setEditable(true);
            this.getTxtAlturaCalle().setEditable(true);
            this.getTxtPisoDepto().setEditable(true);
            this.getTxtNumDepto().setEditable(true);
            this.getBtnNuevoTelefono().setEnabled(true);
            this.getBtnEliminarTelefono().setEnabled(true);
            this.getLstNumerosTelefono().setEnabled(true);
            this.getCmbPais().setEnabled(true);
            this.getCmbProvincia().setEnabled(true);
            this.getCmbLocalidad().setEnabled(true);
            this.getScrollListaTelefono().setEnabled(true);
            this.getDateFechaNacimiento().setEnabled(true);        
    }
            
    public void mostrar() {
        this.getGestorVista().mostrar();
    }

    public void abrirHistoriaClinica() {
        this.getGestorVista().abrirHistoriaClinica();
    }
    public void abrirRelacionParentezco() {
        this.getGestorVista().abrirFrmRelacionParentezco();
    }
    public void presionaBtnTelefono() {
        this.getGestorVista().tomarNumTelefono();
    }

    public void presionaBtnEliminarTel() {
        this.getGestorVista().eliminarNumTelefono();
    }

    public void guardar() {
        this.getGestorVista().guardar();
    }
    
    public void imprimir(){
        this.getGestorVista().imprimir();
    }

    public void filtrarApellido() {
        this.getGestorVista().filtrarApellido();
    }

    public void filtrarNombre() {
        this.getGestorVista().filtrarNombre();
    }

    public void filtrarDni() {
        this.getGestorVista().filtrarDni();
    }

    public void limpiarTxtBusqueda() {
        this.getTxtApellidoBusqueda().setText("");
        this.getTxtNombreBusqueda().setText("");
        this.getTxtDniBusqueda().setText("");
    }

    public void actRbtnApellidoBusqueda() {
        if (this.getRbtnApellidoBusqueda().isSelected()) {
            this.configBusquedaInicial(this.getRbtnApellidoBusqueda());
        } else {
            this.getTxtApellidoBusqueda().setEnabled(false);
        }
    }

    public void actRbtnNombreBusqueda() {
        if (this.getRbtnNombreBusqueda().isSelected()) {
            this.configBusquedaInicial(this.getRbtnNombreBusqueda());
        } else {
            this.getTxtNombreBusqueda().setEnabled(false);
        }
    }

    public void actRbtnDniBusqueda() {
        if (this.getRbtnDniBusqueda().isSelected()) {
            this.configBusquedaInicial(this.getRbtnDniBusqueda());
        } else {
            this.getCmbTipoDniBusqueda().setEnabled(false);
            this.getTxtDniBusqueda().setEnabled(false);
        }
    }

    public void actBtnBuscar() {
        this.configBuscar();
        this.getGestorVista().cargarComboDni(this.getCmbTipoDniBusqueda());
    }

    public void actBtnNuevo() {
        this.configNuevo();
        this.getGestorVista().cargarComboDni(this.getCmbTipoDni());
        this.getGestorVista().cargarComboPais(this.getCmbPais());
    }

    public void stateChangedCmbProvincia() {
        this.getGestorVista().cargarComboLocalidad();
        this.getCmbLocalidad().setEnabled(true);
    }

    public void stateChangedCmbPais() {
        this.getGestorVista().cargarComboProvincia();
        this.getCmbProvincia().setEnabled(true);
    }
    
    private void validarSoloLetras(KeyEvent evt) {
        this.getGestorVista().soloLetras(evt);
    }

    private void validarSoloEntero(KeyEvent evt) {
        this.getGestorVista().soloNumeros(evt);
    }
    
    public void limpiarTxtDniYTabla(){
        this.getGestorVista().limpiarTxtDniYTabla();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDefinirParentesco;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarTelefono;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnHistoriaClinica;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarInfoPaciente;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevoTelefono;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbLocalidad;
    private javax.swing.JComboBox cmbPais;
    private javax.swing.JComboBox cmbProvincia;
    private javax.swing.JComboBox cmbTipoDni;
    private javax.swing.JComboBox cmbTipoDniBusqueda;
    private com.toedter.calendar.JDateChooser dateFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList lstNumerosTelefono;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel pnlBusquedaPaciente;
    private javax.swing.JPanel pnlDatosLocalidad;
    private javax.swing.JPanel pnlDatosPersonales;
    private javax.swing.JPanel pnlDatosTelefonicos;
    private javax.swing.JPanel pnlNuevoPaciente1;
    private javax.swing.JRadioButton rbtnApellidoBusqueda;
    private javax.swing.JRadioButton rbtnDniBusqueda;
    private javax.swing.JRadioButton rbtnNombreBusqueda;
    private javax.swing.JScrollPane scrollListaTelefono;
    private javax.swing.JTable tblBusqueda;
    private javax.swing.JTextField txtAlturaCalle;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoBusqueda;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCaractTelefono;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDniBusqueda;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreBusqueda;
    private javax.swing.JTextField txtNumDepto;
    private javax.swing.JTextField txtNumTelefono;
    private javax.swing.JTextField txtPisoDepto;
    // End of variables declaration//GEN-END:variables
}
