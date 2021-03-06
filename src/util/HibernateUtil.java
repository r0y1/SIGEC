package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

	
	  public static final SessionFactory sessionFactory;

	    static {
	        try {
	               sessionFactory = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
	        } catch (Throwable ex) {
	              System.err.println("Initial SessionFactory creation failed." + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
}
