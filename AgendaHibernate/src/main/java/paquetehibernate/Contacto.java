package paquetehibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contacto {
    private String nombre;
    private String telefono;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    public Contacto(String nombre, String telefono, int id) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.id = id;
    }

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public Contacto() {
        System.out.println("Holi, alguien me está usando");
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
    	System.out.println("Holi, alguien está seteándome un nombre "+nombre);
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
    	System.out.println("Holi, alguien está seteándome un telefono "+telefono);
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return id+" "+nombre+"->"+telefono;
    }
    
}
