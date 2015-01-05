/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Principal;

import Model.Ubicacion.GestorImprimir;
import Utilidades.EscritorioFondo;
import Utilidades.Util;
import java.awt.BorderLayout;
import javax.swing.*;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author Emiliano
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private GestorVistaPrincipal gestorVPrincipal;
    private EscritorioFondo escritorio;

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal(GestorVistaPrincipal gestor) {
        this.configSkin();
        initComponents();
        this.configFondo();
        this.setGestorVPrincipal(gestor);
        this.mostrarFecha();
    }

    public GestorVistaPrincipal getGestorVPrincipal() {
        return gestorVPrincipal;
    }

    private void setGestorVPrincipal(GestorVistaPrincipal gestorVPrincipal) {
        this.gestorVPrincipal = gestorVPrincipal;
    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = (EscritorioFondo) escritorio;
    }

    public void setEscritorio(EscritorioFondo escritorio) {
        this.escritorio = escritorio;
    }

    public JMenu getMenuAbrir() {
        return menuAbrir;
    }

    public void setMenuAbrir(JMenu menuAbrir) {
        this.menuAbrir = menuAbrir;
    }

    public JMenuBar getMenuGlobal() {
        return menuGlobal;
    }

    public void setMenuGlobal(JMenuBar menuGlobal) {
        this.menuGlobal = menuGlobal;
    }

    public JMenuItem getMenuInfProvincia() {
        return menuAdmProvincia;
    }

    public void setMenuInfProvincia(JMenuItem menuInfProvincia) {
        this.menuAdmProvincia = menuInfProvincia;
    }

    public JButton getBtnListarEnfermedades() {
        return btnListarEnfermedades;
    }

    public void setBtnListarEnfermedades(JButton btnListarEnfermedades) {
        this.btnListarEnfermedades = btnListarEnfermedades;
    }

    public JButton getBtnListarPaciente() {
        return btnListarPaciente;
    }

    public void setBtnListarPaciente(JButton btnListarPaciente) {
        this.btnListarPaciente = btnListarPaciente;
    }

    public JButton getBtnListarProfesionales() {
        return btnListarProfesionales;
    }

    public void setBtnListarProfesionales(JButton btnListarProfesionales) {
        this.btnListarProfesionales = btnListarProfesionales;
    }

    public JButton getBtnRegEnfermedad() {
        return btnRegEnfermedad;
    }

    public void setBtnRegEnfermedad(JButton btnRegEnfermedad) {
        this.btnRegEnfermedad = btnRegEnfermedad;
    }

    public JButton getBtnRegHistClinica() {
        return btnRegHistClinica;
    }

    public void setBtnRegHistClinica(JButton btnRegHistClinica) {
        this.btnRegHistClinica = btnRegHistClinica;
    }

    public JButton getBtnRegPaciente() {
        return btnRegPaciente;
    }

    public void setBtnRegPaciente(JButton btnRegPaciente) {
        this.btnRegPaciente = btnRegPaciente;
    }

    public JButton getBtnRegProfesional() {
        return btnRegProfesional;
    }

    public void setBtnRegProfesional(JButton btnRegProfesional) {
        this.btnRegProfesional = btnRegProfesional;
    }

    public JButton getBtnRegSintoma() {
        return btnRegSintoma;
    }

    public void setBtnRegSintoma(JButton btnRegSintoma) {
        this.btnRegSintoma = btnRegSintoma;
    }

    public JButton getBtnRegTEnfermedad() {
        return btnRegTEnfermedad;
    }

    public void setBtnRegTEnfermedad(JButton btnRegTEnfermedad) {
        this.btnRegTEnfermedad = btnRegTEnfermedad;
    }

    public JButton getBtnSalirSistema() {
        return btnSalirSistema;
    }

    public void setBtnSalirSistema(JButton btnSalirSistema) {
        this.btnSalirSistema = btnSalirSistema;
    }

    public JLabel getLblFecha() {
        return lblFecha;
    }

    public void setLblFecha(JLabel lblFecha) {
        this.lblFecha = lblFecha;
    }

    private void configSkin() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.OfficeSilver2007Skin");
        //SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceSteelBlueTheme");
    }

    private void configFondo() {
        this.escritorio = new EscritorioFondo();
        this.add(this.escritorio, BorderLayout.CENTER);
//        this.pack();
        this.setLocationRelativeTo(null);
    }

    public void abrirFrmPais() {
        this.getGestorVPrincipal().abrirFrmPais();
    }

    public void abrirFrmProvincia() {
        this.getGestorVPrincipal().abrirFrmProvincia();
    }

    public void abrirFrmEnfermedad() {
        this.getGestorVPrincipal().abrirFrmEnfermedad();
    }

    public void abrirFrmLocalidad() {
        this.getGestorVPrincipal().abrirFrmLocalidad();
    }

    public void abrirFrmProfesional() {
        this.getGestorVPrincipal().abrirFrmProfesional();
    }

    public void abrirFrmProfesiones() {
        this.getGestorVPrincipal().abrirFrmProfesiones();
    }

    public void abrirFrmPaciente() {
        this.getGestorVPrincipal().abrirFrmPaciente();
    }

    public void abrirFrmSintomas() {
        this.getGestorVPrincipal().abrirFrmSintomas();
    }

    public void abrirFrmTipoEnfermedades() {
        this.getGestorVPrincipal().abrirFrmTipoEnfermedades();
    }

    public void abrirFrmRelacion() {
        this.getGestorVPrincipal().abrirFrmRelacion();
    }

    public void abrirFrmVisualizarTree() {
        this.getGestorVPrincipal().abrirFrmVisualizarTree();
    }
    public void abrirFrmTipoParentesco(){
        this.getGestorVPrincipal().abrirFrmTipoParentesco();
    }

    private void mostrarFecha() {
        this.getLblFecha().setText(this.getGestorVPrincipal().getFecha());

    }
    
    public void imprimirPacientes(){
        this.getGestorVPrincipal().imprimirPacientes();
    }
    
    public void imprimirEnfermedades(){
        this.getGestorVPrincipal().imprimirEnfermedades();
    }
    
    public void imprimirProfesionales(){
        this.getGestorVPrincipal().imprimirProfesionales();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        pnlBotonePrincipales = new javax.swing.JPanel();
        btnRegPaciente = new javax.swing.JButton();
        btnRegEnfermedad = new javax.swing.JButton();
        btnRegTEnfermedad = new javax.swing.JButton();
        btnRegSintoma = new javax.swing.JButton();
        btnRegHistClinica = new javax.swing.JButton();
        btnRegProfesional = new javax.swing.JButton();
        btnListarPaciente = new javax.swing.JButton();
        btnListarEnfermedades = new javax.swing.JButton();
        btnListarProfesionales = new javax.swing.JButton();
        btnSalirSistema = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        menuGlobal = new javax.swing.JMenuBar();
        menuAbrir = new javax.swing.JMenu();
        menuAdmPais = new javax.swing.JMenuItem();
        menuAdmProvincia = new javax.swing.JMenuItem();
        menuAdmLocalidad = new javax.swing.JMenuItem();
        menuProf = new javax.swing.JMenu();
        menuAdmProf = new javax.swing.JMenuItem();
        menuAdmProf1 = new javax.swing.JMenuItem();
        menuPac = new javax.swing.JMenu();
        menuAdmPacientes = new javax.swing.JMenuItem();
        menuAdmSintomas = new javax.swing.JMenuItem();
        menuAdmTipoEnfermedades = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Salud Familiar");
        setResizable(false);
        getContentPane().setLayout(null);

        pnlBotonePrincipales.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnRegPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente.png"))); // NOI18N
        btnRegPaciente.setText("      Administrar Paciente");
        btnRegPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegPacienteActionPerformed(evt);
            }
        });

        btnRegEnfermedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enfermedad.png"))); // NOI18N
        btnRegEnfermedad.setText(" Administrar Enfermedad");
        btnRegEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegEnfermedadActionPerformed(evt);
            }
        });

        btnRegTEnfermedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tipo enfermedad.png"))); // NOI18N
        btnRegTEnfermedad.setText("Administrar Tipo de Enfermedad");
        btnRegTEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegTEnfermedadActionPerformed(evt);
            }
        });

        btnRegSintoma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sintoma.png"))); // NOI18N
        btnRegSintoma.setText("Administrar Síntomas");
        btnRegSintoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegSintomaActionPerformed(evt);
            }
        });

        btnRegHistClinica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historia clinica.png"))); // NOI18N
        btnRegHistClinica.setText("Explorar Enfermedades");
        btnRegHistClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegHistClinicaActionPerformed(evt);
            }
        });

        btnRegProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/profesional.png"))); // NOI18N
        btnRegProfesional.setText(" Administrar Profesional");
        btnRegProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegProfesionalActionPerformed(evt);
            }
        });

        btnListarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista.png"))); // NOI18N
        btnListarPaciente.setText("    Listar Pacientes");
        btnListarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPacienteActionPerformed(evt);
            }
        });

        btnListarEnfermedades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista.png"))); // NOI18N
        btnListarEnfermedades.setText("   Listar Enfermedades");
        btnListarEnfermedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarEnfermedadesActionPerformed(evt);
            }
        });

        btnListarProfesionales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista.png"))); // NOI18N
        btnListarProfesionales.setText("    Listar Profesionales");
        btnListarProfesionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProfesionalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonePrincipalesLayout = new javax.swing.GroupLayout(pnlBotonePrincipales);
        pnlBotonePrincipales.setLayout(pnlBotonePrincipalesLayout);
        pnlBotonePrincipalesLayout.setHorizontalGroup(
            pnlBotonePrincipalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonePrincipalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonePrincipalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnListarProfesionales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnListarEnfermedades, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnListarPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnRegProfesional, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnRegHistClinica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnRegSintoma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnRegTEnfermedad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnRegEnfermedad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnRegPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBotonePrincipalesLayout.setVerticalGroup(
            pnlBotonePrincipalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonePrincipalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegTEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegHistClinica, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarProfesionales, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pnlBotonePrincipales);
        pnlBotonePrincipales.setBounds(0, 0, 270, 680);

        btnSalirSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salirGrande.png"))); // NOI18N
        btnSalirSistema.setText("Salir");
        btnSalirSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirSistemaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalirSistema);
        btnSalirSistema.setBounds(1150, 610, 160, 50);

        lblFecha.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        getContentPane().add(lblFecha);
        lblFecha.setBounds(1060, 10, 250, 14);

        menuAbrir.setText("Gestión Ubicación");

        menuAdmPais.setText("Administar País");
        menuAdmPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdmPaisActionPerformed(evt);
            }
        });
        menuAbrir.add(menuAdmPais);

        menuAdmProvincia.setText("Administar Provincia");
        menuAdmProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdmProvinciaActionPerformed(evt);
            }
        });
        menuAbrir.add(menuAdmProvincia);

        menuAdmLocalidad.setText("Administrar Localidad");
        menuAdmLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdmLocalidadActionPerformed(evt);
            }
        });
        menuAbrir.add(menuAdmLocalidad);

        menuGlobal.add(menuAbrir);

        menuProf.setText("Gestión Profesionales");

        menuAdmProf.setText("Administrar Profesionales");
        menuAdmProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdmProfActionPerformed(evt);
            }
        });
        menuProf.add(menuAdmProf);

        menuAdmProf1.setText("Administrar Profesiones");
        menuAdmProf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdmProf1ActionPerformed(evt);
            }
        });
        menuProf.add(menuAdmProf1);

        menuGlobal.add(menuProf);

        menuPac.setText("Gestión Pacientes");

        menuAdmPacientes.setText("Administrar Pacientes");
        menuAdmPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdmPacientesActionPerformed(evt);
            }
        });
        menuPac.add(menuAdmPacientes);

        menuAdmSintomas.setText("Admnistrar Síntomas");
        menuAdmSintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdmSintomasActionPerformed(evt);
            }
        });
        menuPac.add(menuAdmSintomas);

        menuAdmTipoEnfermedades.setText("Administrar Tipo de Enfermedades");
        menuAdmTipoEnfermedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdmTipoEnfermedadesActionPerformed(evt);
            }
        });
        menuPac.add(menuAdmTipoEnfermedades);

        jMenuItem2.setText("Administrar Enfermedades");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuPac.add(jMenuItem2);

        jMenuItem4.setText("Administrar Relacion Enfermedad Sintomas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuPac.add(jMenuItem4);

        menuGlobal.add(menuPac);

        jMenu1.setText("Gestión Parentesco");

        jMenuItem3.setText("Administrar Parentesco");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        menuGlobal.add(jMenu1);

        setJMenuBar(menuGlobal);

        setSize(new java.awt.Dimension(1364, 743));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuAdmProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdmProvinciaActionPerformed
        this.abrirFrmProvincia();
    }//GEN-LAST:event_menuAdmProvinciaActionPerformed

    private void menuAdmPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdmPaisActionPerformed
        this.abrirFrmPais();
    }//GEN-LAST:event_menuAdmPaisActionPerformed

    private void menuAdmLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdmLocalidadActionPerformed
        this.abrirFrmLocalidad();
    }//GEN-LAST:event_menuAdmLocalidadActionPerformed

    private void menuAdmProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdmProfActionPerformed
        this.abrirFrmProfesional();
    }//GEN-LAST:event_menuAdmProfActionPerformed

    private void menuAdmPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdmPacientesActionPerformed
        this.abrirFrmPaciente();
    }//GEN-LAST:event_menuAdmPacientesActionPerformed

    private void menuAdmSintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdmSintomasActionPerformed
        this.abrirFrmSintomas();
    }//GEN-LAST:event_menuAdmSintomasActionPerformed

    private void menuAdmTipoEnfermedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdmTipoEnfermedadesActionPerformed
        this.abrirFrmTipoEnfermedades();
    }//GEN-LAST:event_menuAdmTipoEnfermedadesActionPerformed

    private void menuAdmProf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdmProf1ActionPerformed
        this.abrirFrmProfesiones();
    }//GEN-LAST:event_menuAdmProf1ActionPerformed

    private void btnSalirSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirSistemaActionPerformed
        this.getGestorVPrincipal().cerrar();
    }//GEN-LAST:event_btnSalirSistemaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.abrirFrmEnfermedad();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.abrirFrmRelacion();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnRegHistClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegHistClinicaActionPerformed
        this.abrirFrmVisualizarTree();
    }//GEN-LAST:event_btnRegHistClinicaActionPerformed

    private void btnRegPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegPacienteActionPerformed
        this.abrirFrmPaciente();
    }//GEN-LAST:event_btnRegPacienteActionPerformed

    private void btnRegEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegEnfermedadActionPerformed
        this.abrirFrmEnfermedad();
    }//GEN-LAST:event_btnRegEnfermedadActionPerformed

    private void btnRegTEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegTEnfermedadActionPerformed
        this.abrirFrmTipoEnfermedades();
    }//GEN-LAST:event_btnRegTEnfermedadActionPerformed

    private void btnRegSintomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegSintomaActionPerformed
        this.abrirFrmSintomas();
    }//GEN-LAST:event_btnRegSintomaActionPerformed

    private void btnRegProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegProfesionalActionPerformed
        this.abrirFrmProfesional();
    }//GEN-LAST:event_btnRegProfesionalActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.abrirFrmTipoParentesco();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnListarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPacienteActionPerformed
        this.imprimirPacientes();
    }//GEN-LAST:event_btnListarPacienteActionPerformed

    private void btnListarEnfermedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarEnfermedadesActionPerformed
        this.imprimirEnfermedades();
    }//GEN-LAST:event_btnListarEnfermedadesActionPerformed

    private void btnListarProfesionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProfesionalesActionPerformed
        this.imprimirProfesionales();
    }//GEN-LAST:event_btnListarProfesionalesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListarEnfermedades;
    private javax.swing.JButton btnListarPaciente;
    private javax.swing.JButton btnListarProfesionales;
    private javax.swing.JButton btnRegEnfermedad;
    private javax.swing.JButton btnRegHistClinica;
    private javax.swing.JButton btnRegPaciente;
    private javax.swing.JButton btnRegProfesional;
    private javax.swing.JButton btnRegSintoma;
    private javax.swing.JButton btnRegTEnfermedad;
    private javax.swing.JButton btnSalirSistema;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JMenu menuAbrir;
    private javax.swing.JMenuItem menuAdmLocalidad;
    private javax.swing.JMenuItem menuAdmPacientes;
    private javax.swing.JMenuItem menuAdmPais;
    private javax.swing.JMenuItem menuAdmProf;
    private javax.swing.JMenuItem menuAdmProf1;
    private javax.swing.JMenuItem menuAdmProvincia;
    private javax.swing.JMenuItem menuAdmSintomas;
    private javax.swing.JMenuItem menuAdmTipoEnfermedades;
    private javax.swing.JMenuBar menuGlobal;
    private javax.swing.JMenu menuPac;
    private javax.swing.JMenu menuProf;
    private javax.swing.JPanel pnlBotonePrincipales;
    // End of variables declaration//GEN-END:variables
}
