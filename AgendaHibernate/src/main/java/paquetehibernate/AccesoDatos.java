package paquetehibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



/**
 *
 * @author CDMFP
 */
public class AccesoDatos {
	static StandardServiceRegistry s=null;
	static SessionFactory sf=null;
public static void inicializarBD()
	{
	 s=new StandardServiceRegistryBuilder().configure().build();
	   sf=new MetadataSources(s).buildMetadata().buildSessionFactory();
	   
	}
    static void insertarContacto(Contacto c) {
    	 Session sesion=sf.openSession();
    	 Transaction t=sesion.beginTransaction();
    	 sesion.save(c);
    	 t.commit();
    }

    static ArrayList<Contacto> recuperarContactos(String nombre_buscado) {
       
    	Session s=sf.openSession();
    	Query q=s.createQuery("FROM Contacto");
    	List lista_contactos= q.getResultList();
    	
        return (ArrayList)lista_contactos;
    }

    static void actualizarNombre(int id, String nuevo_nombre) {
      
    }


    static void actualizarTelefono(int id, String nuevo_telefono) {
 
    }
    
}
