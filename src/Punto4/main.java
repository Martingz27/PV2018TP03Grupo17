/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4;

import java.util.Scanner;

/**
 *
 * @author Malen Cuellar
 */
public class main {
    
     
     public static void main (String [] args)
     {
          int vec []=new int[10];
          Numero num=new Numero();
          Scanner sc=new Scanner(System.in);
          
         for (int i=0; i<10;i++)
         {
          System.out.println("Ingrese un número entero");
          vec[i]= sc.nextInt();
          
         } 
         
        num.MostrarNumero(vec);
        num.CalcularPromedio(vec);
        num.CalcularMayor(vec);
         
     }
    
}
