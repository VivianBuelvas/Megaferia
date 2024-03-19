
package core.person;


public class Persona {
    protected String nombre;
    protected int cédula;

    
    //constructor
    public Persona(String nombre, int cédula) {
        this.nombre = nombre;
        this.cédula = cédula;
    }

    //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCédula() {
        return cédula;
    }

    public void setCédula(int cédula) {
        this.cédula = cédula;
    }
    
    
    
}
