package Hibernate;

import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

    public static SessionFactory sessionFactory;
    public static Session session;

    public static void inicializar() {
        try {
            //sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            AnnotationConfiguration conf = new AnnotationConfiguration();

            conf.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
            conf.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
            conf.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/bdSalud");


            conf.setProperty("hibernate.connection.username","");// Colocar Usuario y contraseña de postgresql
            conf.setProperty("hibernate.connection.password", "");


            conf.setProperty("hibernate.connection.pool_size", "10");
            conf.setProperty("show_sql", "true");
            //conf.setProperty("hibernate.hbm2ddl.auto", "update");


            conf.addPackage("Modelo");
            conf.addAnnotatedClass(Model.Ubicacion.Provincia.class);
            conf.addAnnotatedClass(Model.Ubicacion.Localidad.class);
            conf.addAnnotatedClass(Model.Ubicacion.Pais.class);
            conf.addAnnotatedClass(Model.Profesional.Profesion.class);
            conf.addAnnotatedClass(Model.Profesional.Profesional.class);
            conf.addAnnotatedClass(Model.Persona.Documento.class);
            conf.addAnnotatedClass(Model.Persona.Domicilio.class);
            conf.addAnnotatedClass(Model.Persona.Persona.class);
            conf.addAnnotatedClass(Model.Persona.Telefono.class);
            conf.addAnnotatedClass(Model.Persona.TipoDocumento.class);
            conf.addAnnotatedClass(Model.Paciente.Enfermedad.class);
            conf.addAnnotatedClass(Model.Paciente.GrupoFamiliar.class);
            conf.addAnnotatedClass(Model.Paciente.HistoriaClinica.class);
            conf.addAnnotatedClass(Model.Paciente.Paciente.class);
            conf.addAnnotatedClass(Model.Paciente.Sintoma.class);
            conf.addAnnotatedClass(Model.Paciente.TipoEnfermedad.class);
            conf.addAnnotatedClass(Model.Persona.TipoParentesco.class);
            conf.addAnnotatedClass(Model.Persona.Parentesco.class);
            
            sessionFactory = conf.buildSessionFactory();
            session = sessionFactory.openSession();

        } catch (Throwable ex) {
// Log exception!
            JOptionPane.showMessageDialog(null, ex.toString());
            JOptionPane.showMessageDialog(null, "Verificar la conexión de red");
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession()
            throws HibernateException {
        return session;
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void clearCache() {
        session.clear();
    }

    public static void cerrarSession() {
        session.close();
    }
}
