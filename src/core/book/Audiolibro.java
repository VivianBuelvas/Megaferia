
package core.book;

import core.megaferia.Editorial;
import core.person.Autor;
import core.person.Narrador;
import java.util.ArrayList;


public class Audiolibro extends Libro{    
    private int duración;
    private Narrador narrador;
    
    //constructor
    public Audiolibro(int duración, Narrador narrador, String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, double valor, Editorial editorial) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.duración = duración;
        this.narrador = narrador;
    }
    
    //getters and setters de Audiolibro

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    public Narrador getNarrador() {
        return narrador;
    }

    public void setNarrador(Narrador narrador) {
        this.narrador = narrador;
    }
    
}
