/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Hibernate.GestorHibernate;
import Model.Paciente.Enfermedad;
import Model.Paciente.Paciente;
import Model.Paciente.Sintoma;
import Model.Paciente.TipoEnfermedad;
import Model.Persona.Documento;
import Model.Persona.Domicilio;
import Model.Persona.Telefono;
import Model.Persona.TipoDocumento;
import Model.Profesional.Profesion;
import Model.Profesional.Profesional;
import Model.Ubicacion.Localidad;
import Model.Ubicacion.Pais;
import Model.Ubicacion.Provincia;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Emiliano
 */
public class Util {

    public static boolean estaVacioTxt(JTextField txt) {
        return ("".equals(txt.getText().trim()));
    }

    public static boolean estaSeleccionadoCombo(JComboBox combo) {
        return (combo.getSelectedItem() == null);
    }

    public static void soloLetras(java.awt.event.KeyEvent evt) {
        char teclaPulsada = evt.getKeyChar();  // Recogemos, a partir del evento, la tecla que se pulsó
        if (Character.isLetter(teclaPulsada) || Character.isSpaceChar(teclaPulsada)) { //Si la tecla pulsada es una letra o es la tecla espacio no sucede nada.
        } else { // Si la tecla pulsada  no es un letra o no es la tecla espacio.
            evt.consume();// Borramos la última letra introducida (lo hace muy rápido, la
            // letra nunca se escribe en el textfield)
        }
    }

    public static void soloEntero(java.awt.event.KeyEvent evt) {
        char teclaPulsada = evt.getKeyChar(); // Recogemos, a partir del evento, la tecla que se pulsó

        if (!Character.isDigit(teclaPulsada)) { // Si la tecla pulsada no es un dígito, entonces... 
            evt.consume(); // Borramos la última letra introducida (lo hace muy rápido, la
            // letra nunca se escribe en el textfield)
        }
    }

    public void convierteMayusculas(java.awt.event.KeyEvent evt) {
        char teclaPulsada = evt.getKeyChar(); // Recogemos, a partir del evento, la tecla que se pulsó

        Character.toUpperCase(teclaPulsada); // La convertimos a mayúsculas

    }

    public void getMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE, new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/m_error.png")).getImage()));

    }

    public void getMensajeWarning(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE, new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/m_atencion.png")).getImage()));
    }

    public void getMensajeInformation(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/m_bien.png")).getImage()));
    }

    public int confirmacion(String mensaje) {
        int opcion = JOptionPane.showConfirmDialog(null, mensaje, "Confirmación", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/m_pregunta.png")).getImage()));
        return opcion;

    }

    public static String fecha() {
        SimpleDateFormat formateador = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("es"));
        Date fechaDate = new Date();
        String fecha = formateador.format(fechaDate);
        return fecha;
    }

    public static String formatFecha(Date fecha) {
        SimpleDateFormat formateador = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("es"));
        String fechaFormat = formateador.format(fecha);
        return fechaFormat;
    }

    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }

    }

    public static boolean estaIngresadoList(List lista, Object obj) {
        return lista.contains(obj); //verifica si el objeto pasado como parametro, ya esta ingresado en la lista
    }

    public  void generadorObjetos(GestorHibernate g) {
        for (int i = 0; i < 20; i++) {
            Pais pais = new Pais();
            pais.setNombre("Pais " + i);
            g.guardarObjeto(pais);
            System.out.println(i);
            for (int j = 0; j < 10; j++) {
                Provincia prov = new Provincia();
                prov.setNombre("Provincia " + j);
                pais.getProvincias().add(prov);
                g.guardarObjeto(prov);
                System.out.println(j);
                for (int x = 0; x < 30; x++) {
                    Localidad loc = new Localidad();
                    loc.setNombre("Localidad " + x);
                    loc.setCodigoPostal(x);
                    loc.setProv(prov);
                    g.guardarObjeto(loc);
                    System.out.println(x);
                }
            }

        }
        System.out.println("listo");

        TipoEnfermedad tipo1 = new TipoEnfermedad();
        tipo1.setNombre("Tipo Enfermedad 1");
        g.guardarObjeto(tipo1);

        TipoEnfermedad tipo2 = new TipoEnfermedad();
        tipo2.setNombre("Tipo Enfermedad 2");
        g.guardarObjeto(tipo2);


        TipoEnfermedad tipo3 = new TipoEnfermedad();
        tipo3.setNombre("Tipo Enfermedad 3");
        g.guardarObjeto(tipo3);


        TipoEnfermedad tipo4 = new TipoEnfermedad();
        tipo4.setNombre("Tipo Enfermedad 4");
        g.guardarObjeto(tipo4);

        TipoEnfermedad tipo5 = new TipoEnfermedad();
        tipo5.setNombre("Tipo Enfermedad 5");
        g.guardarObjeto(tipo5);



        for (int j = 0; j < 20; j++) {
            Enfermedad enf = new Enfermedad();
            enf.setNombre("Enfermedad " + j);
            if (j % 2 == 0) {
                enf.setTipoEnfermedad(tipo1);
            } else {
                enf.setTipoEnfermedad(tipo2);
            }
            for (int i = 0; i < 6; i++) {
                Sintoma sint = new Sintoma();
                sint.setNombre("sintomas " + i);
                g.guardarObjeto(sint);
                enf.getSintoma().add(sint);
            }

            g.guardarObjeto(enf);

        }
        System.out.println("Ready!");
        TipoDocumento tipoDoc = new TipoDocumento();
        tipoDoc.setNombre("DNI");
        g.guardarObjeto(tipoDoc);

        Pais pais = new Pais();
        pais.setNombre("Argentina");
        g.guardarObjeto(pais);
        
        
        Provincia provincia = new Provincia();
        provincia.setNombre("Cordoba");
        g.guardarObjeto(provincia);
        
        pais.add(provincia);
        g.actualizarObjeto(pais);
        
               
        
        Localidad local = new Localidad();
        local.setNombre("Villa Maria");
        local.setCodigoPostal(5903);
        local.setProv(provincia);
        g.guardarObjeto(local);
        
        provincia.getLocalidades().add(local);
        g.actualizarObjeto(provincia);

   

  





        for (int i = 0; i < 50; i++) {
            Profesion prof = new Profesion();
            prof.setNombre("Profesion " + i);
            g.guardarObjeto(prof);
        }

        for (int i = 0; i < 100; i++) {
            Profesional profesional = new Profesional();
            profesional.setNombre("Nombre" + i);
            profesional.setApellido("Apellido" + i);
            profesional.setFechaNac(new Date());
            profesional.setMatricula("Matricula " + i);
            Documento doc = new Documento();
            doc.setNum("36373820" + i);
            doc.setTipoDocumento(tipoDoc);
            profesional.setDocumento(doc);


            Domicilio domicilio = new Domicilio();
            domicilio.setLocalidad(local);
            domicilio.setDireccion("Direccion" + i);
            domicilio.setNumDepto("23" + i);
            domicilio.setNumero(i);
            g.guardarObjeto(domicilio);

            profesional.setDomicilio(domicilio);

            Profesion profesionx = new Profesion();
            profesionx.setNombre("Profesion");
            g.guardarObjeto(profesionx);
            profesional.getProfesiones().add(profesionx);

            Telefono tel = new Telefono();
            tel.setNumero(154254754);
            tel.setCaracteristica(0353);
            g.guardarObjeto(tel);

            profesional.getTelefonos().add(tel);

            g.guardarObjeto(profesional);
        }

        System.out.println("Ready!");
        
        
         for (int i = 0; i < 100; i++) {
            Paciente profesional = new Paciente();
            profesional.setNombre("Nombre" + i);
            profesional.setApellido("Apellido" + i);
            profesional.setFechaNac(new Date());
          
            Documento doc = new Documento();
            doc.setNum("36373820" + i);
            doc.setTipoDocumento(tipoDoc);
            profesional.setDocumento(doc);


            Domicilio domicilio = new Domicilio();
            domicilio.setLocalidad(local);
            domicilio.setDireccion("Direccion" + i);
            domicilio.setNumDepto("23" + i);
            domicilio.setNumero(i);
            g.guardarObjeto(domicilio);

            profesional.setDomicilio(domicilio);

            Profesion profesionx = new Profesion();
     
   

            Telefono tel = new Telefono();
            tel.setNumero(154254754);
            tel.setCaracteristica(0353);
            g.guardarObjeto(tel);

            profesional.getTelefonos().add(tel);

            g.guardarObjeto(profesional);
        }
    }
}
