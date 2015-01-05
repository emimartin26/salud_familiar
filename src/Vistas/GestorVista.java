/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Utilidades.Util;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author Emiliano
 */
public class GestorVista {

    private JInternalFrame frame;
    private JDesktopPane escritorio;
    private int modo;

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public JInternalFrame getFrame() {
        return frame;
    }

    public void setFrame(JInternalFrame frame) {
        this.frame = frame;
    }

    public int getModo() {
        return modo;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }

    public void setNuevo() {
        this.modo = 0;
    }

    public void setModificar() {
        this.modo = 1;
    }
    public void setModoExterno(){
        this.modo = 2;
    }
         
    public boolean isNuevo() {
        return this.getModo() == 0;
    }

    public void soloLetras(java.awt.event.KeyEvent evt) {
        Util.soloLetras(evt);
    }
      public void soloNumeros(java.awt.event.KeyEvent evt) {
        Util.soloEntero(evt);
    }
}
