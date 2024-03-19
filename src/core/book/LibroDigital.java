
package core.book;

import core.megaferia.Editorial;
import core.person.Autor;
import java.util.ArrayList;


public class LibroDigital extends Libro{
    private ArrayList<String> hipervinculos;
        
    //constructor
    public LibroDigital(ArrayList<String> hipervinculos, String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, double valor, Editorial editorial) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.hipervinculos = hipervinculos;
    }
    
    //getters and setters de LibroDigital
    public ArrayList<String> getHipervinculos() {
        return hipervinculos;
    }

    public void setHipervinculos(ArrayList<String> hipervinculos) {
        this.hipervinculos = hipervinculos;
    }
    
}
