/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto9;

import Punto8.GestorLibros;
import Punto8.Libro;

/**
 *
 * @author Martin
 */
public class Busqueda {
    public void BusquedadeLibros(String btitulo)
    {
        Libro libro =new Libro();
        GestorLibros gestorl = new GestorLibros();
        for (Libro libro: gestorl.getArregloLibro())
        {
            String aux = libro.getTitulo();
            if(aux.equals(btitulo)){
                System.out.println("Libro Encontrado!!!");
            }
            else
                System.out.println("El Libro no existe!!!");
        }
    }
}
