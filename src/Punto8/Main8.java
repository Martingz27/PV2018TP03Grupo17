/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto8;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Main8 {
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        GestorLibros gl = new GestorLibros();
        int resp;
        
        do
        {
            Libro libro = new Libro();
            System.out.println("Ingrese el ISBN del Libro: ");
            libro.setISBN(sc.next());
            System.out.println("Ingrese el Título del Libro");
            libro.setTitulo(sc.next());
            System.out.println("Ingrese el Autor el Libro");
            libro.setAutor(sc.next());
            System.out.println("Ingrese el Precio del Libro");
            libro.setPrecio(sc.nextDouble());
            gl.AgregarLibro(libro);
            System.out.println("¿Desea ingresar otro Libro?Si=1/No=0");
            resp=sc.nextInt();
            
        }while(resp  != 0);
            for(Libro libro: gl.getArregloLibro())
                {
                    System.out.println("El IBSN del Libro es : "+libro.getISBN());
                    System.out.println("El Título del Libro es : "+libro.getTitulo());
                    System.out.println("El Autor del Libro es : "+libro.getAutor());
                    System.out.println("El Precio del Libro es : "+libro.getPrecio());
                    System.out.println("------------------------------------");
                }
    }
}
