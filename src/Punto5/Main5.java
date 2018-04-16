/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Main5 {
        public static void main (String [] args)
    {
        
        Scanner sc = new Scanner(System.in);
        GestorCirculo gestor = new GestorCirculo();
        int resp;
        do
        {
            Circulo circulo =new Circulo();
            System.out.println("Ingrese el radio de un círculo");
            circulo.setRadio(sc.nextDouble());
            gestor.AgregarCirculo(circulo);
            System.out.println("¿Desea ingresar otro circulo?Si=1/No=0");
            resp=sc.nextInt();
        }while (resp  != 0);
        for(Circulo circulo: gestor.getArregloCirculo())
        {
            System.out.println("El Radio del Circulo es : " + circulo.getRadio());
            circulo.CalcularSuperficie(circulo);
        }
        
    }
}
