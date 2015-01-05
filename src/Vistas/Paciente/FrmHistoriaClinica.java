/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Historia.java
 *
 * Created on 03-jul-2012, 4:50:15
 */
package Vistas.Paciente;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Federico
 */
public class FrmHistoriaClinica extends javax.swing.JInternalFrame {

    private GestorVistaHistoriaClinica gestorVista;

    /**
     * Creates new form Historia
     */
    public FrmHistoriaClinica(GestorVistaHistoriaClinica gestor) {
        initComponents();
        this.setGestorVista(gestor);
        this.centrarVentana();
        this.configInicial();
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

    public GestorVistaHistoriaClinica getGestorVista() {
        return gestorVista;
    }

    public void setGestorVista(GestorVistaHistoriaClinica gestor) {
        this.gestorVista = gestor;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public JButton getBtnEliminaSintoma() {
        return btnEliminaSintoma;
    }

    public void setBtnEliminaSintoma(JButton btnEliminaSintoma) {
        this.btnEliminaSintoma = btnEliminaSintoma;
    }

    public JButton getBtnEliminarProfesion() {
        return btnEliminarProfesion;
    }

    public void setBtnEliminarProfesion(JButton btnEliminarProfesion) {
        this.btnEliminarProfesion = btnEliminarProfesion;
    }

    public JButton getBtnNuevoSintoma() {
        return btnNuevoSintoma;
    }

    public void setBtnNuevoSintoma(JButton btnNuevoSintoma) {
        this.btnNuevoSintoma = btnNuevoSintoma;
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



    public JTextField getTxtEdad() {
        return txtEdad;
    }

    public void setTxtEdad(JTextField txtEdad) {
        this.txtEdad = txtEdad;
    }

    public JTextField getTxtFechaConsulta() {
        return txtFechaConsulta;
    }

    public void setTxtFechaConsulta(JTextField txtFechaConsulta) {
        this.txtFechaConsulta = txtFechaConsulta;
    }

    public JTextField getTxtFechaNacPers() {
        return txtFechaNacPers;
    }

    public void setTxtFechaNacPers(JTextField txtFechaNacPers) {
        this.txtFechaNacPers = txtFechaNacPers;
    }

    public JTextField getTxtNroDocumento() {
        return txtNroDocumento;
    }

    public void setTxtNroDocumento(JTextField txtNroDocumento) {
        this.txtNroDocumento = txtNroDocumento;
    }

    public JTextField getTxtTipoDocumento() {
        return txtTipoDocumento;
    }

    public void setTxtTipoDocumento(JTextField txtTipoDocumento) {
        this.txtTipoDocumento = txtTipoDocumento;
    }

  
    public JButton getBtnNuevo() {
        return btnNuevo;
    }

    public void setBtnNuevo(JButton btnNuevo) {
        this.btnNuevo = btnNuevo;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JComboBox getCmbEnfermedades() {
        return cmbEnfermedades;
    }

    public void setCmbEnfermedades(JComboBox cmbEnfermedades) {
        this.cmbEnfermedades = cmbEnfermedades;
    }

    public JList getListHistorial() {
        return ListHistorial;
    }

    public void setListHistorial(JList ListHistorial) {
        this.ListHistorial = ListHistorial;
    }

    public JButton getBtnNuevaEnfermedad() {
        return btnNuevaEnfermedad;
    }

    public void setBtnNuevaEnfermedad(JButton btnNuevaEnfermedad) {
        this.btnNuevaEnfermedad = btnNuevaEnfermedad;
    }

    public JButton getBtnVerInfoHistoria() {
        return btnVerInfoHistoria;
    }

    public void setBtnVerInfoHistoria(JButton btnVerInfoHistoria) {
        this.btnVerInfoHistoria = btnVerInfoHistoria;
    }

    public JList getListEnfermedades() {
        return listEnfermedades;
    }

    public JList getListSintomas() {
        return listSintomas;
    }

    public void setListSintomas(JList listSintomas) {
        this.listSintomas = listSintomas;
    }

    public void setListEnfermedades(JList listEnfermedades) {
        this.listEnfermedades = listEnfermedades;
    }

    public JComboBox getCmbProfesionales() {
        return cmbProfesionales;
    }

    public JLabel getLblCantCaracteres() {
        return lblCantCaracteres;
    }

    public void setLblCantCaracteres(JLabel lblCantCaracteres) {
        this.lblCantCaracteres = lblCantCaracteres;
    }

    public void setCmbProfesionales(JComboBox cmbProfesionales) {
        this.cmbProfesionales = cmbProfesionales;
    }

    public JComboBox getCmbSintomas() {
        return cmbSintomas;
    }

    public void setCmbSintomas(JComboBox cmbSintomas) {
        this.cmbSintomas = cmbSintomas;
    }

    public JTextArea getTxtAreaObservacion() {
        return txtAreaObservacion;
    }

    public void setTxtAreaObservacion(JTextArea txtAreaObservacion) {
        this.txtAreaObservacion = txtAreaObservacion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        panelSalir = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        PanelInfoPaciente = new javax.swing.JPanel();
        PanelDatosPersonales = new javax.swing.JPanel();
        jLabel167 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel166 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel165 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel173 = new javax.swing.JLabel();
        txtFechaNacPers = new javax.swing.JTextField();
        PanelId = new javax.swing.JPanel();
        jLabel174 = new javax.swing.JLabel();
        txtTipoDocumento = new javax.swing.JTextField();
        jLabel175 = new javax.swing.JLabel();
        txtNroDocumento = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListHistorial = new javax.swing.JList();
        btnVerInfoHistoria = new javax.swing.JButton();
        panelBotones = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        cmbEnfermedades = new javax.swing.JComboBox();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        cmbProfesionales = new javax.swing.JComboBox();
        cmbSintomas = new javax.swing.JComboBox();
        jLabel56 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaObservacion = new javax.swing.JTextArea();
        jLabel57 = new javax.swing.JLabel();
        txtFechaConsulta = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listEnfermedades = new javax.swing.JList();
        btnNuevaEnfermedad = new javax.swing.JButton();
        btnEliminarProfesion = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        listSintomas = new javax.swing.JList();
        btnNuevoSintoma = new javax.swing.JButton();
        btnEliminaSintoma = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        lblCantCaracteres = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir))
        );

        PanelInfoPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder("Información Paciente"));

        PanelDatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales"));

        jLabel167.setText("Fecha Nac.");

        jLabel166.setText("Apellidos");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jLabel165.setText("Nombres");

        jLabel173.setText("Edad");

        PanelId.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel174.setText("Documento");

        txtTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoDocumentoActionPerformed(evt);
            }
        });

        jLabel175.setText("Nro");

        txtNroDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroDocumentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelIdLayout = new javax.swing.GroupLayout(PanelId);
        PanelId.setLayout(PanelIdLayout);
        PanelIdLayout.setHorizontalGroup(
            PanelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIdLayout.createSequentialGroup()
                .addComponent(jLabel174)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipoDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel175)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelIdLayout.setVerticalGroup(
            PanelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel174)
                    .addComponent(txtTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel175)
                    .addComponent(txtNroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelDatosPersonalesLayout = new javax.swing.GroupLayout(PanelDatosPersonales);
        PanelDatosPersonales.setLayout(PanelDatosPersonalesLayout);
        PanelDatosPersonalesLayout.setHorizontalGroup(
            PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel165)
                            .addComponent(jLabel166)
                            .addComponent(jLabel167))
                        .addGap(18, 18, 18)
                        .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(txtFechaNacPers, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel173)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEdad))
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido))
                        .addContainerGap())))
        );
        PanelDatosPersonalesLayout.setVerticalGroup(
            PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(jLabel166)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel165)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel167))
                    .addGroup(PanelDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaNacPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel173)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout PanelInfoPacienteLayout = new javax.swing.GroupLayout(PanelInfoPaciente);
        PanelInfoPaciente.setLayout(PanelInfoPacienteLayout);
        PanelInfoPacienteLayout.setHorizontalGroup(
            PanelInfoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PanelInfoPacienteLayout.setVerticalGroup(
            PanelInfoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoPacienteLayout.createSequentialGroup()
                .addComponent(PanelDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Historial "));

        ListHistorial.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListHistorial);

        btnVerInfoHistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btnVerInfoHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerInfoHistoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnVerInfoHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerInfoHistoria))
        );

        panelBotones.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta Médica"));

        jLabel53.setText("Fecha Consulta:");

        cmbEnfermedades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel54.setText("Diagnóstico:");

        jLabel55.setText("Profesional:");

        cmbProfesionales.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbSintomas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel56.setText("Síntomas:");

        txtAreaObservacion.setColumns(20);
        txtAreaObservacion.setRows(5);
        txtAreaObservacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAreaObservacionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAreaObservacionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAreaObservacionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtAreaObservacion);

        jLabel57.setText("Observación:");

        jScrollPane3.setViewportView(listEnfermedades);

        btnNuevaEnfermedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N
        btnNuevaEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaEnfermedadActionPerformed(evt);
            }
        });

        btnEliminarProfesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminarProfesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProfesionActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(listSintomas);

        btnNuevoSintoma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N
        btnNuevoSintoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoSintomaActionPerformed(evt);
            }
        });

        btnEliminaSintoma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminaSintoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaSintomaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(jLabel53)
                            .addComponent(jLabel57))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblCantCaracteres)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtFechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbProfesionales, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnNuevaEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnEliminarProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3))
                                    .addComponent(cmbEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel56)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbSintomas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnNuevoSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnEliminaSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)))))))
                .addContainerGap())
            .addComponent(jSeparator6)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbProfesionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel53)
                        .addComponent(txtFechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel55)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel56)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNuevaEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNuevoSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminaSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblCantCaracteres)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel57))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelInfoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator3)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelInfoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.cerrar();
}//GEN-LAST:event_btnSalirActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtApellidoActionPerformed

    private void txtTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoDocumentoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtTipoDocumentoActionPerformed

    private void txtNroDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroDocumentoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtNroDocumentoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.configBuscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.configNuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.configCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevaEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaEnfermedadActionPerformed
        this.presionaBtnNuevaEnfermedad();
    }//GEN-LAST:event_btnNuevaEnfermedadActionPerformed

    private void btnEliminarProfesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProfesionActionPerformed
        this.presionaBtnEliminaEnfermedad();
    }//GEN-LAST:event_btnEliminarProfesionActionPerformed

    private void btnNuevoSintomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoSintomaActionPerformed
        this.presionaBtnNuevoSintoma();
    }//GEN-LAST:event_btnNuevoSintomaActionPerformed

    private void btnEliminaSintomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaSintomaActionPerformed
        this.presionaBtnEliminaSintoma();
    }//GEN-LAST:event_btnEliminaSintomaActionPerformed

    private void btnVerInfoHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerInfoHistoriaActionPerformed
        this.presionaBtnVerInfoHistoria();
    }//GEN-LAST:event_btnVerInfoHistoriaActionPerformed

    private void txtAreaObservacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaObservacionKeyReleased
//        this.escribeObservacion(evt);
    }//GEN-LAST:event_txtAreaObservacionKeyReleased

    private void txtAreaObservacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaObservacionKeyPressed
//        this.escribeObservacion(evt);
    }//GEN-LAST:event_txtAreaObservacionKeyPressed

    private void txtAreaObservacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaObservacionKeyTyped
        this.escribeObservacion(evt);
    }//GEN-LAST:event_txtAreaObservacionKeyTyped

    /**
     * @param args the command line arguments
     */
    private void guardar() {
        this.getGestorVista().guardar();
    }
    private void eliminar(){
        this.getGestorVista().eliminar();
    }
    private void cerrar(){
        this.getGestorVista().cerrar();
    }
   public void presionaBtnVerInfoHistoria(){
       this.getGestorVista().mostrarInfoHistoria();
   }
    public void configCancelar() {
        this.limpiarCampos();
        this.configInicial();
        this.getGestorVista().clearListEnfermedades();
        this.getGestorVista().clearListSintomas();
        this.getGestorVista().getListaEnfermedades().clear();
        this.getGestorVista().getListaSintomas().clear();
    }
    private void escribeObservacion(KeyEvent evt){
        this.getGestorVista().escribeObservacion(evt);
    }

    public void configInicial() {
        this.limpiarCampos();
        this.setConfigInicial();
        this.getListHistorial().setEnabled(false);
    }
    public void configBtnBuscar(){
        this.getBtnCancelar().setEnabled(true);
        this.getBtnNuevo().setEnabled(false);
        this.getBtnBuscar().setEnabled(false);
        this.getBtnEliminar().setEnabled(true);
        this.getBtnVerInfoHistoria().setEnabled(true);
        this.getBtnGuardar().setEnabled(false);
        this.getBtnEliminaSintoma().setEnabled(false);
        this.getBtnEliminarProfesion().setEnabled(false);
        this.getBtnNuevaEnfermedad().setEnabled(false);
        this.getBtnNuevoSintoma().setEnabled(false);
    }
    public void configBuscar(){
        this.configBtnBuscar();
        this.getListHistorial().setEnabled(true);
    }

    public void setConfigInicial() {
        this.configBotonesIncial();
        this.configTxtInicial();
        this.configCmbInicial();
    }

    private void presionaBtnNuevaEnfermedad() {
        this.getGestorVista().tomarEnfermedad();
    }

    private void presionaBtnNuevoSintoma() {
        this.getGestorVista().tomarSintoma();

    }

    private void presionaBtnEliminaSintoma() {
        this.getGestorVista().eliminarSintomaDeLista();
    }

    private void presionaBtnEliminaEnfermedad() {
        this.getGestorVista().eliminarProfesionDeLista();
    }

    private void configCmbInicial() {
        this.getCmbEnfermedades().setEnabled(false);
        this.getCmbProfesionales().setEnabled(false);
        this.getCmbSintomas().setEnabled(false);
    }

    private void configBotonesIncial() {
        this.getBtnCancelar().setEnabled(false);
        this.getBtnNuevo().setEnabled(true);
        this.getBtnBuscar().setEnabled(true);
        this.getBtnEliminar().setEnabled(false);
        this.getBtnGuardar().setEnabled(false);
        this.getBtnCancelar().setEnabled(false);
        this.getBtnNuevaEnfermedad().setEnabled(false);
        this.getBtnVerInfoHistoria().setEnabled(false);
        this.getBtnEliminaSintoma().setEnabled(false);
        this.getBtnEliminarProfesion().setEnabled(false);
        this.getBtnNuevoSintoma().setEnabled(false);
        this.getBtnVerInfoHistoria().setEnabled(false);
    }

    private void configTxtInicial() {
        this.getTxtApellido().setEditable(false);
        this.getTxtEdad().setEditable(false);
        this.getTxtFechaConsulta().setEditable(false);
        this.getTxtNombre().setEditable(false);
        this.getTxtNroDocumento().setEditable(false);
        this.getTxtTipoDocumento().setEditable(false);
        this.getTxtFechaNacPers().setEditable(false);
        this.getTxtAreaObservacion().setEditable(false);
    }

    private void limpiarCampos() {
        this.getCmbEnfermedades().removeAllItems();
        this.getCmbProfesionales().removeAllItems();
        this.getCmbSintomas().removeAllItems();
        this.getTxtFechaConsulta().setText("");
        this.getTxtAreaObservacion().setText("");
        this.getLblCantCaracteres().setText("");
    }

 

    public void configNuevo() {
        this.configBotonesNuevo();
        this.configCombosNuevo();
        this.getTxtAreaObservacion().setEditable(true);
        this.cargarCombos();
        this.getGestorVista().setModificar();
        this.getGestorVista().cargarFechaActual();

    }

    public void cargarCombos() {
        this.getGestorVista().cargarComboProfesional();
        this.getGestorVista().cargarComboSintomas();
        this.getGestorVista().cargarCombosEnfermedad();

    }

    public void configCombosNuevo() {
        this.getCmbEnfermedades().setEnabled(true);
        this.getCmbProfesionales().setEnabled(true);
        this.getCmbSintomas().setEnabled(true);
    }

    public void configBotonesNuevo() {
        this.getBtnCancelar().setEnabled(true);
        this.getBtnNuevo().setEnabled(false);
        this.getBtnBuscar().setEnabled(false);
        this.getBtnEliminar().setEnabled(false);
        this.getBtnGuardar().setEnabled(true);
        this.getBtnCancelar().setEnabled(true);
        this.getBtnEliminaSintoma().setEnabled(true);
        this.getBtnEliminarProfesion().setEnabled(true);
        this.getBtnNuevaEnfermedad().setEnabled(true);
        this.getBtnNuevoSintoma().setEnabled(true);
        this.getBtnVerInfoHistoria().setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ListHistorial;
    private javax.swing.JPanel PanelDatosPersonales;
    private javax.swing.JPanel PanelId;
    private javax.swing.JPanel PanelInfoPaciente;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminaSintoma;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarProfesion;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevaEnfermedad;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevoSintoma;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerInfoHistoria;
    private javax.swing.JComboBox cmbEnfermedades;
    private javax.swing.JComboBox cmbProfesionales;
    private javax.swing.JComboBox cmbSintomas;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblCantCaracteres;
    private javax.swing.JList listEnfermedades;
    private javax.swing.JList listSintomas;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextArea txtAreaObservacion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFechaConsulta;
    private javax.swing.JTextField txtFechaNacPers;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNroDocumento;
    private javax.swing.JTextField txtTipoDocumento;
    // End of variables declaration//GEN-END:variables
}
