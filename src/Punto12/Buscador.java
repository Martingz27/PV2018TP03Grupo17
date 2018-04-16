/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12;
import Punto8.Libro;
import Punto8.GestorLibros;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Martin
 */
public class Buscador {
    
    Buscador(){}

    public void buscarAutor(String titulo)
    {
        GestorLibros libros= new GestorLibros();
        for(Libro iterator : libros.getArregloLibro())
        {
            String tituloAuxiliar=iterator.getAutor();
            if(tituloAuxiliar.equals(titulo))
            {
                System.out.println("libro encontrado");
            }
            else
            {
                System.out.println("libro no encontrado");
            }
        }
    }
    
  
}
