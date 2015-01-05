/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Ubicacion;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author Emiliano
 */
public class FrmLocalidad extends javax.swing.JInternalFrame {

    private GestorVistaLocalidad gestorVista;

    /**
     * Creates new form FrmLocalidad
     */
    public FrmLocalidad(GestorVistaLocalidad gestor) {
        initComponents();
        this.centrarVentana();
        this.configInicial();
        this.gestorVista = gestor;

    }

    private void centrarVentana() {
        //este metodo devuelve el tamaño de la pantalla  
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
//obtenemos el tamaño de la ventana  
        Dimension ventana = this.getSize();
//para centrar la ventana lo hacemos con el siguiente calculo  
        this.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
//y para finalizar la hacemos visible  
    }

    public GestorVistaLocalidad getGestorVista() {
        return gestorVista;
    }

    private void setGestorVista(GestorVistaLocalidad gestorVista) {
        this.gestorVista = gestorVista;
    }

    public JButton getBtnAux() {
        return btnAux;
    }

    public void setBtnAux(JButton btnAux) {
        this.btnAux = btnAux;
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

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JButton getBtnImprimir() {
        return btnImprimir;
    }

    public void setBtnImprimir(JButton btnImprimir) {
        this.btnImprimir = btnImprimir;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public void setBtnLimpiar(JButton btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
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

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JComboBox getCmbProvBuscar() {
        return cmbProvBuscar;
    }

    public void setCmbProvBuscar(JComboBox cmbProvBuscar) {
        this.cmbProvBuscar = cmbProvBuscar;
    }

    public JComboBox getCmbProvincia() {
        return cmbProvincia;
    }

    public void setCmbProvincia(JComboBox cmbProvincia) {
        this.cmbProvincia = cmbProvincia;
    }

    public JList getLista() {
        return listaLocalidades;
    }

    public void setLista(JList lista) {
        this.listaLocalidades = lista;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtCiudad) {
        this.txtNombre = txtCiudad;
    }

    public JTextField getTxtCodigo() {
        return txtCodigo;
    }

    public void setTxtCodigo(JTextField txtCodigo) {
        this.txtCodigo = txtCodigo;
    }

    public JTextField getTxtCodigoPostal() {
        return txtCodigoPostal;
    }

    public void setTxtCodigoPostal(JTextField txtCodigoPostal) {
        this.txtCodigoPostal = txtCodigoPostal;
    }

    public JTextField getTxtNombreBuscar() {
        return txtNombreBuscar;
    }

    public void setTxtBuscar(JTextField txtNombre) {
        this.txtNombreBuscar = txtNombre;
    }

    public JComboBox getCmbPais() {
        return cmbPais;
    }

    public void setCmbPais(JComboBox cmbPais) {
        this.cmbPais = cmbPais;
    }

    public JButton getBtnListar() {
        return btnListar;
    }

    public void setBtnListar(JButton btnListar) {
        this.btnListar = btnListar;
    }

    public JComboBox getCmbPaisBuscar() {
        return cmbPaisBuscar;
    }

    public void setCmbPaisBuscar(JComboBox cmbPaisBuscar) {
        this.cmbPaisBuscar = cmbPaisBuscar;
    }

    public JCheckBox getCheckCodigo() {
        return checkCodigo;
    }

    public void setCheckCodigo(JCheckBox checkCodigo) {
        this.checkCodigo = checkCodigo;
    }

    public JCheckBox getCheckProvincia() {
        return checkProvincia;
    }

    public void setCheckProvincia(JCheckBox checkCodigo1) {
        this.checkProvincia = checkCodigo1;
    }

    public JCheckBox getCheckNombre() {
        return checkNombre;
    }

    public void setCheckNombre(JCheckBox checkNombre) {
        this.checkNombre = checkNombre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatosBusqueda = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombreBuscar = new javax.swing.JTextField();
        cmbProvBuscar = new javax.swing.JComboBox();
        btnAux = new javax.swing.JButton();
        cmbPaisBuscar = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        checkNombre = new javax.swing.JCheckBox();
        checkCodigo = new javax.swing.JCheckBox();
        checkProvincia = new javax.swing.JCheckBox();
        panelMostrarProvincias = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaLocalidades = new javax.swing.JList();
        btnLimpiar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        paneDatosNuevaLocalidad = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbProvincia = new javax.swing.JComboBox();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoPostal = new javax.swing.JTextField();
        cmbPais = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
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

        setTitle("Administra Localidad");

        panelDatosBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));
        panelDatosBusqueda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Código ");
        panelDatosBusqueda.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 69, -1, -1));

        jLabel5.setText("Nombre");
        panelDatosBusqueda.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 36, -1, -1));

        jLabel6.setText("Provincia");
        panelDatosBusqueda.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });
        panelDatosBusqueda.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 80, -1));

        txtNombreBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreBuscarKeyReleased(evt);
            }
        });
        panelDatosBusqueda.add(txtNombreBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 520, -1));

        cmbProvBuscar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProvBuscarItemStateChanged(evt);
            }
        });
        panelDatosBusqueda.add(cmbProvBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 129, -1));

        btnAux.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btnAux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuxActionPerformed(evt);
            }
        });
        panelDatosBusqueda.add(btnAux, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 24, -1));

        cmbPaisBuscar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPaisBuscarItemStateChanged(evt);
            }
        });
        cmbPaisBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaisBuscarActionPerformed(evt);
            }
        });
        panelDatosBusqueda.add(cmbPaisBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 130, -1));

        jLabel8.setText("País");
        panelDatosBusqueda.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 108, -1, -1));

        checkNombre.setText("Sólo Nombre");
        checkNombre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkNombreItemStateChanged(evt);
            }
        });
        panelDatosBusqueda.add(checkNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        checkCodigo.setText("Sólo Codigo");
        checkCodigo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkCodigoItemStateChanged(evt);
            }
        });
        panelDatosBusqueda.add(checkCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        checkProvincia.setText("Sólo Provincia");
        checkProvincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkProvinciaItemStateChanged(evt);
            }
        });
        checkProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkProvinciaActionPerformed(evt);
            }
        });
        panelDatosBusqueda.add(checkProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, -1, -1));

        panelMostrarProvincias.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jScrollPane2.setViewportView(listaLocalidades);

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

        javax.swing.GroupLayout panelMostrarProvinciasLayout = new javax.swing.GroupLayout(panelMostrarProvincias);
        panelMostrarProvincias.setLayout(panelMostrarProvinciasLayout);
        panelMostrarProvinciasLayout.setHorizontalGroup(
            panelMostrarProvinciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarProvinciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMostrarProvinciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(82, 82, 82))
        );
        panelMostrarProvinciasLayout.setVerticalGroup(
            panelMostrarProvinciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarProvinciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(panelMostrarProvinciasLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        paneDatosNuevaLocalidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));

        jLabel1.setText("Provincia");

        lblNombre.setText("Nombre");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel3.setText("Código Postal");

        txtCodigoPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoPostalKeyTyped(evt);
            }
        });

        cmbPais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPaisItemStateChanged(evt);
            }
        });

        jLabel7.setText("País");

        javax.swing.GroupLayout paneDatosNuevaLocalidadLayout = new javax.swing.GroupLayout(paneDatosNuevaLocalidad);
        paneDatosNuevaLocalidad.setLayout(paneDatosNuevaLocalidadLayout);
        paneDatosNuevaLocalidadLayout.setHorizontalGroup(
            paneDatosNuevaLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneDatosNuevaLocalidadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneDatosNuevaLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneDatosNuevaLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneDatosNuevaLocalidadLayout.createSequentialGroup()
                        .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 46, Short.MAX_VALUE))
                    .addGroup(paneDatosNuevaLocalidadLayout.createSequentialGroup()
                        .addComponent(txtNombre)
                        .addGap(50, 50, 50)))
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        paneDatosNuevaLocalidadLayout.setVerticalGroup(
            paneDatosNuevaLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneDatosNuevaLocalidadLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(paneDatosNuevaLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(25, 25, 25)
                .addGroup(paneDatosNuevaLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
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
        btnModificar.setMargin(new java.awt.Insets(2, 1, 2, 14));
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
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addGroup(panelSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMostrarProvincias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDatosBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(panelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneDatosNuevaLocalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMostrarProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneDatosNuevaLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreBuscarKeyReleased
        this.filtrar();
    }//GEN-LAST:event_txtNombreBuscarKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        this.soloLetras(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCodigoPostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoPostalKeyTyped
        this.soloNumeros(evt);
    }//GEN-LAST:event_txtCodigoPostalKeyTyped

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
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        this.imprimir();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnAuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuxActionPerformed
        this.filtrar();
    }//GEN-LAST:event_btnAuxActionPerformed

    private void cmbPaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPaisItemStateChanged
        this.cargarComboProv();
    }//GEN-LAST:event_cmbPaisItemStateChanged

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        this.sinFiltro();
    }//GEN-LAST:event_btnListarActionPerformed

    private void cmbPaisBuscarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPaisBuscarItemStateChanged
        this.cargarComboProvBuscar();
    }//GEN-LAST:event_cmbPaisBuscarItemStateChanged

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        this.filtrar();
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void cmbProvBuscarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProvBuscarItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProvBuscarItemStateChanged

    private void checkNombreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkNombreItemStateChanged
        this.configCheckNombre();
    }//GEN-LAST:event_checkNombreItemStateChanged

    private void checkProvinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkProvinciaItemStateChanged
        this.configCheckProvincia();
    }//GEN-LAST:event_checkProvinciaItemStateChanged

    private void checkCodigoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkCodigoItemStateChanged
        this.configCheckCodigo();
    }//GEN-LAST:event_checkCodigoItemStateChanged

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.configCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.limpiarLista();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        this.configModificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cmbPaisBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaisBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPaisBuscarActionPerformed

    private void checkProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkProvinciaActionPerformed

    public final void configInicial() {
        this.getTxtNombre().setEnabled(false);
        this.getTxtNombreBuscar().setEnabled(false);
        this.getCmbPaisBuscar().setEnabled(false);
        this.getBtnAux().setEnabled(false);
        this.getCheckNombre().setEnabled(false);
        this.getCheckCodigo().setEnabled(false);
        this.getCheckProvincia().setEnabled(false);
        this.getLista().setEnabled(false);
        this.getBtnLimpiar().setEnabled(false);
        this.getBtnListar().setEnabled(false);
        this.getTxtNombre().setEnabled(false);
        this.getCmbPais().setEnabled(false);
        this.getBtnNuevo().setEnabled(true);
        this.getBtnGuardar().setEnabled(false);
        this.getBtnModificar().setEnabled(false);
        this.getBtnEliminar().setEnabled(false);
        this.getBtnCancelar().setEnabled(false);
        this.getBtnImprimir().setEnabled(true);
        this.getBtnBuscar().setEnabled(true);
        this.getCmbProvincia().setEnabled(false);
        this.getCmbProvBuscar().setEnabled(false);
        this.getTxtCodigoPostal().setEnabled(false);
        this.getTxtCodigo().setEnabled(false);
        this.getTxtCodigo().setText("");
        this.getTxtCodigoPostal().setText("");
        this.getTxtNombre().setText("");
        this.getTxtNombreBuscar().setText("");
        this.getCmbPais().removeAllItems();
        this.getCmbPaisBuscar().removeAllItems();
        this.getCmbProvincia().removeAllItems();
        this.getCmbProvBuscar().removeAllItems();
        this.getCheckCodigo().setSelected(false);
        this.getCheckProvincia().setSelected(false);
        this.getCheckNombre().setSelected(false);
    }

    public void configNuevo() {
        this.getBtnBuscar().setEnabled(false);
        this.getBtnNuevo().setEnabled(false);
        this.getBtnGuardar().setEnabled(true);
        this.getBtnCancelar().setEnabled(true);
        this.getTxtNombre().setEnabled(true);
        this.getTxtCodigoPostal().setEnabled(true);
        this.getCmbPais().setEnabled(true);
        this.getCmbProvincia().setEnabled(true);
        this.getBtnImprimir().setEnabled(false);

        this.getTxtNombre().requestFocus();
        this.getGestorVista().cargarComboPais();
        this.getGestorVista().setNuevo();
    }

    public void configBuscar() {
        this.getGestorVista().cargarComboPaisBuscar();
        this.getBtnImprimir().setEnabled(false);
        this.getBtnNuevo().setEnabled(false);
        this.getCheckCodigo().setEnabled(true);
        this.getCheckNombre().setEnabled(true);
        this.getCheckProvincia().setEnabled(true);
        this.getBtnCancelar().setEnabled(true);
        this.getLista().setEnabled(true);
        this.getBtnLimpiar().setEnabled(true);
        this.getBtnListar().setEnabled(true);

        this.getBtnBuscar().setEnabled(false);
        this.getBtnModificar().setEnabled(true);
        this.getBtnEliminar().setEnabled(true);

    }

    public void configCancelar() {
        this.configInicial();
        this.limpiarLista();
    }

    public void configModificar() {
        this.getGestorVista().setModificar();
        this.getGestorVista().accionModificar();
    }

    public void configCheckNombre() {
        if (this.getCheckNombre().isSelected()) {
            this.getCheckCodigo().setSelected(false);
            this.getCheckProvincia().setSelected(false);
            this.getTxtNombreBuscar().setEnabled(true);
            this.getTxtCodigo().setEnabled(false);
            this.getTxtCodigo().setText("");
            this.getCmbPaisBuscar().setEnabled(false);
            this.getCmbProvBuscar().setEnabled(false);
            this.getBtnAux().setEnabled(false);
            this.getCmbPaisBuscar().removeAllItems();
            this.getCmbProvBuscar().removeAllItems();
            this.getTxtNombreBuscar().requestFocus();
        }
    }

    public void configCheckCodigo() {
        if (this.getCheckCodigo().isSelected()) {
            this.getCheckNombre().setSelected(false);
            this.getCheckProvincia().setSelected(false);

            this.getTxtNombreBuscar().setEnabled(false);
            this.getTxtNombreBuscar().setText("");
            this.getTxtCodigo().setEnabled(true);
            this.getCmbPaisBuscar().setEnabled(false);
            this.getCmbProvBuscar().setEnabled(false);
            this.getBtnAux().setEnabled(false);
            this.getCmbPaisBuscar().removeAllItems();
            this.getCmbProvBuscar().removeAllItems();
            this.getTxtCodigo().requestFocus();
        }
    }

    public void configCheckProvincia() {
        if (this.getCheckProvincia().isSelected()) {
            this.getGestorVista().cargarComboPaisBuscar();
            this.getCheckNombre().setSelected(false);
            this.getCheckCodigo().setSelected(false);

            this.getTxtNombreBuscar().setEnabled(false);
            this.getTxtNombreBuscar().setText("");
            this.getTxtCodigo().setEnabled(false);
            this.getTxtCodigo().setText("");
            this.getCmbPaisBuscar().setEnabled(true);
            this.getCmbProvBuscar().setEnabled(true);
            this.getBtnAux().setEnabled(true);
            this.getCmbPaisBuscar().requestFocus();
        }
    }

    public void limpiarLista() {
        this.getGestorVista().clearList();
    }

    public void soloLetras(java.awt.event.KeyEvent evt) {
        getGestorVista().soloLetras(evt);
    }

    public void soloNumeros(java.awt.event.KeyEvent evt) {
        this.getGestorVista().soloNumeros(evt);
    }

    public void filtrar() {
        this.getGestorVista().filtrar();
    }

    public void cargarComboProv() {
        this.getGestorVista().cargarComboProv();
    }

    public void cargarComboProvBuscar() {
        this.getGestorVista().cargarComboProvBuscar();
    }

    public void sinFiltro() {
        this.getGestorVista().sinFiltro();
    }

    public void guardar() {
        this.getGestorVista().guardar();
    }

    public void eliminar() {
        this.getGestorVista().eliminarLocalidad();
    }

    public void imprimir() {
        this.getGestorVista().imprimir();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAux;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox checkCodigo;
    private javax.swing.JCheckBox checkNombre;
    private javax.swing.JCheckBox checkProvincia;
    private javax.swing.JComboBox cmbPais;
    private javax.swing.JComboBox cmbPaisBuscar;
    private javax.swing.JComboBox cmbProvBuscar;
    private javax.swing.JComboBox cmbProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JList listaLocalidades;
    private javax.swing.JPanel paneDatosNuevaLocalidad;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDatosBusqueda;
    private javax.swing.JPanel panelMostrarProvincias;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreBuscar;
    // End of variables declaration//GEN-END:variables
}
