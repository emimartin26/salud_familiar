/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paciente;

import Model.Paciente.Enfermedad;
import Model.Paciente.GestorEnfermedad;
import Model.Paciente.GestorTipoEnfermedad;
import Model.Paciente.Sintoma;
import Model.Paciente.TipoEnfermedad;
import Utilidades.GestorLista;
import Vistas.GestorVista;
import Vistas.InterfazFrm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author emiliano
 */
public class GestorVistaVisualizarTree extends GestorVista implements InterfazFrm {
    
    public GestorVistaVisualizarTree(JDesktopPane escritorio) {
        this.setEscritorio(escritorio);
        this.setFrame(new FrmVisualizarTree(this));
    }
    
    @Override
    public void abrir() {
        this.getEscritorio().add(this.getFrame());
        this.getFrame().setVisible(true);
    }
    
    public FrmVisualizarTree getFormularioEspecifico() {
        return (FrmVisualizarTree) this.getFrame();
    }

    public int getNivelJtree() {
        return this.getFormularioEspecifico().getTree().getSelectionModel().getLeadSelectionPath().getPathCount();
    }

    public TipoEnfermedad seleccionTipoEnfermedad() {        
        DefaultMutableTreeNode dmtn = (DefaultMutableTreeNode) this.getFormularioEspecifico().getTree().getLastSelectedPathComponent();
        return (TipoEnfermedad) dmtn.getUserObject();
    }

    public Enfermedad seleccionEnfermedad() {
        DefaultMutableTreeNode dmtn = (DefaultMutableTreeNode) this.getFormularioEspecifico().getTree().getLastSelectedPathComponent();
        return (Enfermedad) dmtn.getUserObject();
    }

    public void seleccionJtree() {        
        if (this.getNivelJtree() == 1) {
            GestorTipoEnfermedad gestorTipo = new GestorTipoEnfermedad();
            this.llenarList(gestorTipo.listarTipoEnfermedad());            
        }
        if (this.getNivelJtree() == 2) {            
            GestorEnfermedad gestorEnf = new GestorEnfermedad();
            this.llenarList(gestorEnf.filtrarTipoEnfermedad(this.seleccionTipoEnfermedad()));
        }
        if (this.getNivelJtree() == 3) {
            List lista = new ArrayList();
            Iterator it = this.seleccionEnfermedad().getSintoma().iterator();
            while (it.hasNext()) {
                lista.add((Sintoma) it.next());
            }
            this.llenarList(lista);
        }
    }
    
    public void llenarList(List lista) {
        GestorLista gestor = new GestorLista();
        gestor.llenarList(lista, this.getFormularioEspecifico().getListaObejetos());
    }

    public void cargarJtree() {
        DefaultMutableTreeNode inicio = new DefaultMutableTreeNode("Inicio");
        DefaultTreeModel modelo = new DefaultTreeModel(inicio);
        GestorEnfermedad gestorEnfermedad = new GestorEnfermedad();
        GestorTipoEnfermedad gestor = new GestorTipoEnfermedad();
        Iterator it = gestor.listarTipoEnfermedad().iterator();
        while (it.hasNext()) {
            int cont = 0;
            TipoEnfermedad tipo = (TipoEnfermedad) it.next();
            DefaultMutableTreeNode tipoEnfermedad = new DefaultMutableTreeNode(tipo);
            modelo.insertNodeInto(tipoEnfermedad, inicio, cont);
            Iterator itEnf = gestorEnfermedad.filtrarTipoEnfermedad(tipo).iterator();
            while (itEnf.hasNext()) {
                int cont2 = 0;
                Enfermedad enf = (Enfermedad) itEnf.next();
                DefaultMutableTreeNode enfermedad = new DefaultMutableTreeNode(enf);
                modelo.insertNodeInto(enfermedad, tipoEnfermedad, cont2);
                cont2++;
            }
            cont++;
        }
        this.getFormularioEspecifico().getTree().setModel(modelo);
    }
    
    @Override
    public void cerrar() {
        this.getFormularioEspecifico().setVisible(false);
    }
}
