
package core.person;

import core.book.Libro;
import java.util.ArrayList;


public class Autor extends Persona{
    private ArrayList<Libro> libros; 

    public Autor(ArrayList<Libro> libros, String nombre, int cédula) {
        super(nombre, cédula); // Llama al constructor de la clase Persona
        this.libros = libros;
    }
    
    //getters and setters de Autor

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    
    
}
