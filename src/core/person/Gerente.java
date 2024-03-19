
package core.person;

import core.megaferia.Editorial;


public class Gerente extends Persona{
    
    private Editorial editorial;

    public Gerente(Editorial editorial, String nombre, int cédula) {
        super(nombre, cédula);
        this.editorial = editorial;
    }
    
    //getters and setters de Gerente

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    
}
