/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Main {
    public static void main(String [] args)
    {
        Scanner teclado= new Scanner (System.in);
        
        GestorRectangulo lista=new GestorRectangulo();
        int respuesta;
        
        do
        {
            Rectangulo rectangulo=new Rectangulo();
            System.out.println("ingresar base");
            rectangulo.setBase(teclado.nextDouble());
            System.out.println("ingresar altura");
            rectangulo.setAltura(teclado.nextDouble());
            System.out.println("ingresar un punto del rectangulo");
            rectangulo.setX(teclado.nextDouble());
            rectangulo.setY(teclado.nextDouble());
            
            lista.registrarRectangulo(rectangulo);
            
            System.out.println("desea registrar otro rectangulo?");
            respuesta=teclado.nextInt();
        }while(respuesta != 0);
        
        for(Rectangulo rectangulo: lista.getListaRectangulo())
        {
            System.out.println("la base del rectangulo es "+rectangulo.getBase());
            System.out.println("la altura del rectangulo es"+rectangulo.getAltura());
            System.out.println("el punto del rectangulo es ("+rectangulo.getX()+", "+rectangulo.getY()+")");
            System.out.println("la superficie del rectangulo es "+rectangulo.obtenerSuperficie());
            System.out.println("el perimetro del rectangulo es "+rectangulo.obtenerPerimetro());
        }
          
    }
}
