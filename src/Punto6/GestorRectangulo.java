/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Martin
 */
public class GestorRectangulo {
    
    private List<Rectangulo> listaRectangulo= new ArrayList<Rectangulo>();
    
    public void registrarRectangulo(Rectangulo rectangulo)
    {
            listaRectangulo.add(rectangulo);
    }

    /**
     * @return the listaRectangulo
     */
    public List<Rectangulo> getListaRectangulo() {
        return listaRectangulo;
    }

    /**
     * @param listaRectangulo the listaRectangulo to set
     */
    public void setListaRectangulo(List<Rectangulo> listaRectangulo) {
        this.listaRectangulo = listaRectangulo;
    }
    
    
}
