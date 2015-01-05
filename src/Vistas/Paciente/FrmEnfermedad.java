/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paciente;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

/**
 *
 * @author Lopez
 */
public class FrmEnfermedad extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmEnfermedad
     */
    private GestorVistaEnfermedad gestorVista;

    public FrmEnfermedad(GestorVistaEnfermedad gestor) {
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

    public GestorVistaEnfermedad getGestorVista() {
        return gestorVista;
    }

    public void setGestorVista(GestorVistaEnfermedad gestor) {
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

    public JButton getBtnListar() {
        return btnListar;
    }

    public void setBtnListar(JButton btnListar) {
        this.btnListar = btnListar;
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

    public JTextField getTxtNombreBuscar() {
        return txtNombreBuscar;
    }

    public void setTxtNombreBuscar(JTextField txtNombre) {
        this.txtNombreBuscar = txtNombre;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombreNuevaEnfermedad) {
        this.txtNombre = txtNombreNuevaEnfermedad;
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

    public JComboBox getCmbTipoEnfermedad() {
        return cmbTipoEnfermedad;
    }

    public void setCmbTipoEnfermedad(JComboBox cmbTipoEnfermedad) {
        this.cmbTipoEnfermedad = cmbTipoEnfermedad;
    }

    public JComboBox getCmbTipoEnfermedadNuevaEnfermedad() {
        return cmbTipoEnfermedadNuevaEnfermedad;
    }

    public void setCmbTipoEnfermedadNuevaEnfermedad(JComboBox cmbTipoEnfermedadNuevaEnfermedad) {
        this.cmbTipoEnfermedadNuevaEnfermedad = cmbTipoEnfermedadNuevaEnfermedad;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JList getListaEnfermedades() {
        return listaEnfermedades;
    }

    public void setListaEnfermedades(JList listaEnfermedades) {
        this.listaEnfermedades = listaEnfermedades;
    }

    public JPanel getPaneDatosNuevaLocalidad() {
        return paneDatosNuevaLocalidad;
    }

    public void setPaneDatosNuevaLocalidad(JPanel paneDatosNuevaLocalidad) {
        this.paneDatosNuevaLocalidad = paneDatosNuevaLocalidad;
    }

    public JPanel getPanelBotones() {
        return panelBotones;
    }

    public void setPanelBotones(JPanel panelBotones) {
        this.panelBotones = panelBotones;
    }

    public JPanel getPanelDatosBusqueda() {
        return panelDatosBusqueda;
    }

    public void setPanelDatosBusqueda(JPanel panelDatosBusqueda) {
        this.panelDatosBusqueda = panelDatosBusqueda;
    }

    public JPanel getPanelMostrarProvincias() {
        return panelMostrarProvincias;
    }

    public void setPanelMostrarProvincias(JPanel panelMostrarProvincias) {
        this.panelMostrarProvincias = panelMostrarProvincias;
    }

    public JPanel getPanelSalir() {
        return panelSalir;
    }

    public void setPanelSalir(JPanel panelSalir) {
        this.panelSalir = panelSalir;
    }

    public JPanel getPnlEnfermedad() {
        return pnlEnfermedad;
    }

    public void setPnlEnfermedad(JPanel pnlEnfermedad) {
        this.pnlEnfermedad = pnlEnfermedad;
    }

    public JButton getBtnAux() {
        return btnAux;
    }

    public void setBtnAux(JButton btnAux) {
        this.btnAux = btnAux;
    }

    public JCheckBox getChekNombre() {
        return chekNombre;
    }

    public void setChekNombre(JCheckBox chekNombre) {
        this.chekNombre = chekNombre;
    }

    public JCheckBox getChekTipoEnfermedad() {
        return chekTipoEnfermedad;
    }

    public void setChekTipoEnfermedad(JCheckBox chekTipoEnfermedad) {
        this.chekTipoEnfermedad = chekTipoEnfermedad;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEnfermedad = new javax.swing.JPanel();
        panelDatosBusqueda = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreBuscar = new javax.swing.JTextField();
        cmbTipoEnfermedad = new javax.swing.JComboBox();
        btnAux = new javax.swing.JButton();
        chekNombre = new javax.swing.JCheckBox();
        chekTipoEnfermedad = new javax.swing.JCheckBox();
        paneDatosNuevaLocalidad = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbTipoEnfermedadNuevaEnfermedad = new javax.swing.JComboBox();
        panelBotones = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        panelMostrarProvincias = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaEnfermedades = new javax.swing.JList();
        btnLimpiar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        panelSalir = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setTitle("Enfermedad");

        panelDatosBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda", 0, 0, null, java.awt.Color.black));

        jLabel4.setText("Nombre");

        jLabel5.setText("Tipo de enfermedad");

        txtNombreBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreBuscarKeyReleased(evt);
            }
        });

        btnAux.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btnAux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuxActionPerformed(evt);
            }
        });

        chekNombre.setText("Sólo Nombre");
        chekNombre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chekNombreItemStateChanged(evt);
            }
        });
        chekNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chekNombreActionPerformed(evt);
            }
        });

        chekTipoEnfermedad.setText("Sólo Tipo de Enfermedad");
        chekTipoEnfermedad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chekTipoEnfermedadItemStateChanged(evt);
            }
        });
        chekTipoEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chekTipoEnfermedadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosBusquedaLayout = new javax.swing.GroupLayout(panelDatosBusqueda);
        panelDatosBusqueda.setLayout(panelDatosBusquedaLayout);
        panelDatosBusquedaLayout.setHorizontalGroup(
            panelDatosBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosBusquedaLayout.createSequentialGroup()
                .addGroup(panelDatosBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosBusquedaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(panelDatosBusquedaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosBusquedaLayout.createSequentialGroup()
                        .addComponent(txtNombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(panelDatosBusquedaLayout.createSequentialGroup()
                        .addComponent(cmbTipoEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAux, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chekNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chekTipoEnfermedad)
                        .addGap(57, 57, 57))))
        );
        panelDatosBusquedaLayout.setVerticalGroup(
            panelDatosBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosBusquedaLayout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addGroup(panelDatosBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelDatosBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbTipoEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnAux, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(panelDatosBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chekTipoEnfermedad)
                        .addComponent(chekNombre)))
                .addContainerGap())
        );

        paneDatosNuevaLocalidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", 0, 0, null, java.awt.Color.black));

        jLabel2.setText("Nombre");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel3.setText("Tipo de enfermedad");

        javax.swing.GroupLayout paneDatosNuevaLocalidadLayout = new javax.swing.GroupLayout(paneDatosNuevaLocalidad);
        paneDatosNuevaLocalidad.setLayout(paneDatosNuevaLocalidadLayout);
        paneDatosNuevaLocalidadLayout.setHorizontalGroup(
            paneDatosNuevaLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneDatosNuevaLocalidadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneDatosNuevaLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneDatosNuevaLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbTipoEnfermedadNuevaEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        paneDatosNuevaLocalidadLayout.setVerticalGroup(
            paneDatosNuevaLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneDatosNuevaLocalidadLayout.createSequentialGroup()
                .addGroup(paneDatosNuevaLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneDatosNuevaLocalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbTipoEnfermedadNuevaEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
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
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        panelMostrarProvincias.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jScrollPane2.setViewportView(listaEnfermedades);

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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMostrarProvinciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        panelMostrarProvinciasLayout.setVerticalGroup(
            panelMostrarProvinciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarProvinciasLayout.createSequentialGroup()
                .addGroup(panelMostrarProvinciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMostrarProvinciasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMostrarProvinciasLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlEnfermedadLayout = new javax.swing.GroupLayout(pnlEnfermedad);
        pnlEnfermedad.setLayout(pnlEnfermedadLayout);
        pnlEnfermedadLayout.setHorizontalGroup(
            pnlEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnfermedadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMostrarProvincias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneDatosNuevaLocalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnfermedadLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(18, 18, 18)
                        .addComponent(panelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDatosBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlEnfermedadLayout.setVerticalGroup(
            pnlEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnfermedadLayout.createSequentialGroup()
                .addComponent(panelDatosBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelMostrarProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneDatosNuevaLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnfermedadLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(panelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEnfermedadLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEnfermedad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        this.sinFiltro();
   }//GEN-LAST:event_btnListarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        this.validarSoloLetras(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.configBuscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.configNuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        this.imprimir();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.clearList();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuxActionPerformed
        this.filtrar();
    }//GEN-LAST:event_btnAuxActionPerformed

    private void chekNombreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chekNombreItemStateChanged
        this.configChekNombre();
    }//GEN-LAST:event_chekNombreItemStateChanged

    private void chekNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chekNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chekNombreActionPerformed

    private void chekTipoEnfermedadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chekTipoEnfermedadItemStateChanged
        this.configChekTipoEnfermedad();
    }//GEN-LAST:event_chekTipoEnfermedadItemStateChanged

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        this.configModificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.configCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreBuscarKeyReleased
        this.filtrar();
    }//GEN-LAST:event_txtNombreBuscarKeyReleased

    private void chekTipoEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chekTipoEnfermedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chekTipoEnfermedadActionPerformed

    public void setConfigBtnNuevo() {
        this.getTxtNombre().setEnabled(true);
        this.getCmbTipoEnfermedadNuevaEnfermedad().setEnabled(true);
        this.getBtnGuardar().setEnabled(true);
        this.getBtnNuevo().setEnabled(false);
        this.getBtnBuscar().setEnabled(false);
        this.getBtnCancelar().setEnabled(true);
    }

    public void configInicial() {
        this.setConfigBtnInicial();
        this.limpiarTxt();
        this.getCmbTipoEnfermedadNuevaEnfermedad().removeAllItems();
        this.getCmbTipoEnfermedad().removeAllItems();
        this.getChekNombre().setSelected(false);
        this.getChekTipoEnfermedad().setSelected(false);
    }

    public void setConfigBtnInicial() {
        this.getBtnNuevo().setEnabled(true);
        this.getBtnBuscar().setEnabled(true);
        this.getBtnEliminar().setEnabled(false);
        this.getBtnGuardar().setEnabled(false);
        this.getBtnModificar().setEnabled(false);
        this.getBtnLimpiar().setEnabled(false);
        this.getTxtNombreBuscar().setEnabled(false);
        this.getTxtNombre().setEnabled(false);
        this.getBtnCancelar().setEnabled(false);
        this.getListaEnfermedades().setEnabled(true);
        this.getBtnListar().setEnabled(false);
        this.getCmbTipoEnfermedad().setEnabled(false);
        this.getCmbTipoEnfermedadNuevaEnfermedad().setEnabled(false);
        this.getBtnAux().setEnabled(false);
        this.getChekNombre().setEnabled(false);
        this.getChekTipoEnfermedad().setEnabled(false);

    }

    public void configNuevo() {
        this.setConfigBtnNuevo();
        this.getGestorVista().setNuevo();
        this.getTxtNombre().requestFocus();
        this.getGestorVista().cargarComboTipoEnfermedadNuevaEnfermedad();
    }

    public void configBuscar() {
        this.getBtnNuevo().setEnabled(false);
        this.getBtnBuscar().setEnabled(false);
        this.getBtnModificar().setEnabled(true);
        this.getBtnEliminar().setEnabled(true);
        this.getChekNombre().setEnabled(true);
        this.getChekTipoEnfermedad().setEnabled(true);
        this.getListaEnfermedades().setEnabled(true);
        this.getBtnLimpiar().setEnabled(true);
        this.getBtnListar().setEnabled(true);
        this.getBtnCancelar().setEnabled(true);
        this.getGestorVista().cargarComboTipoEnfermedad();
    }

    public void configModificar() {
        this.getTxtNombre().requestFocus();
        this.getGestorVista().setModificar();
        this.getGestorVista().accionModificar();
    }

    public void configCancelar() {
        this.configInicial();
        this.limpiarLista();
    }

    public void configChekNombre() {
        if (this.getChekNombre().isSelected()) {
            this.getTxtNombreBuscar().setEnabled(true);
            this.getTxtNombreBuscar().setText("");
            this.getTxtNombreBuscar().requestFocus();
        } else {
            this.getTxtNombreBuscar().setEnabled(false);
            this.getTxtNombreBuscar().setText("");
        }

    }

    public void configChekTipoEnfermedad() {
        if (this.getChekTipoEnfermedad().isSelected()) {
            this.getCmbTipoEnfermedad().setEnabled(true);
            this.getBtnAux().setEnabled(true);
//            this.cargarComboTipoEnfermedad();
        } else {
            this.getBtnAux().setEnabled(false);
            this.getCmbTipoEnfermedad().setEnabled(false);
            this.getCmbTipoEnfermedad().removeAllItems();
        }
    }

    public void limpiarTxt() {
        this.getTxtNombre().setText("");
        this.getTxtNombreBuscar().setText("");
    }

    public void limpiarLista() {
        this.getGestorVista().clearList();
    }

    public void guardar() {
        this.getGestorVista().guardar();
    }

    public void eliminar() {
        this.getGestorVista().eliminarEnfermedad();
    }

    public void imprimir() {
        this.getGestorVista().imprimir();
    }

    public void filtrar() {
        this.getGestorVista().filtrar();
    }

    public void clearList() {
        this.getGestorVista().clearList();
    }

    public void sinFiltro() {
        this.getGestorVista().sinFiltro();
    }

    public void validarSoloLetras(java.awt.event.KeyEvent evt) {
        this.getGestorVista().soloLetras(evt);
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
    private javax.swing.JCheckBox chekNombre;
    private javax.swing.JCheckBox chekTipoEnfermedad;
    private javax.swing.JComboBox cmbTipoEnfermedad;
    private javax.swing.JComboBox cmbTipoEnfermedadNuevaEnfermedad;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList listaEnfermedades;
    private javax.swing.JPanel paneDatosNuevaLocalidad;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDatosBusqueda;
    private javax.swing.JPanel panelMostrarProvincias;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JPanel pnlEnfermedad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreBuscar;
    // End of variables declaration//GEN-END:variables
}
