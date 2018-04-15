/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *
 * @author Martin
 */
public class Main1 {
    public static void main (String[] args){
        
       Punto  punto1=new Punto(2, 3);
       Punto  punto2=new Punto(5, 6);
       Punto calDistancia = new Punto();
       double in=calDistancia.CalcularDistancia(punto1.getX(),punto2.getX(), punto1.getY(), punto2.getY());
        System.out.println("La distancia entre dos puntos es: "+in);
    }
}
