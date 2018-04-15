/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class GestorCirculo {
    
    private ArrayList<Circulo> arregloCirculo=new ArrayList();

    public ArrayList<Circulo> getArregloCirculo() {
        return arregloCirculo;
    }

    public void setArregloCirculo(ArrayList<Circulo> arregloCirculo) {
        this.arregloCirculo = arregloCirculo;
    }
    
    public void AgregarCirculo(Circulo circulo)
    {
       arregloCirculo.add(circulo);
    }
}
