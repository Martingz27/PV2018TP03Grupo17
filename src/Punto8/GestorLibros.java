/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto8;

import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class GestorLibros {
    private ArrayList<Libro> arregloLibro =new ArrayList<>();

    public ArrayList<Libro> getArregloLibro() {
        return arregloLibro;
    }

    public void setArregloLibro(ArrayList<Libro> arregloLibro) {
        this.arregloLibro = arregloLibro;
    }

    public void AgregarLibro (Libro libro)
    {
        arregloLibro.add(libro);
    }
}
