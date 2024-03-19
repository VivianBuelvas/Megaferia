
package core.person;

import core.book.Audiolibro;
import java.util.ArrayList;


public class Narrador extends Persona{    
    private ArrayList<Audiolibro> libros;

    public Narrador(ArrayList<Audiolibro> libros, String nombre, int cédula) {
        super(nombre, cédula);
        this.libros = libros;
    }
    
    //getters and setters de Narrador

    public ArrayList<Audiolibro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Audiolibro> libros) {
        this.libros = libros;
    }
    
    
}
