
package core.book;

import core.megaferia.Editorial;
import core.person.Autor;
import java.util.ArrayList;


public class LibroImpreso extends Libro{
    private int páginas;
    private int numEjemplares;
    
    //constructor
    public LibroImpreso(int páginas, int numEjemplares, String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, double valor, Editorial editorial) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.páginas = páginas;
        this.numEjemplares = numEjemplares;
    }
    
    //getters and setters
    public int getPáginas() {
        return páginas;
    }

    public void setPáginas(int páginas) {
        this.páginas = páginas;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }
    
            
}
