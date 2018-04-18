/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class main3 {
    public static void main (String[] args){
    Triangulo tri=new Triangulo();
    Scanner sc=new Scanner(System.in);
    boolean band=false;
    
        System.out.println("Ingrese el lado A: ");
        tri.setA(sc.nextInt());
          System.out.println("Ingrese el lado B: ");
        tri.setB(sc.nextInt());
          System.out.println("Ingrese el lado C: ");
        tri.setC(sc.nextInt());
        
    
        band=tri.VerificarTriangulo(tri.getA(), tri.getB(), tri.getC(), band);
        
        if (band==true){
        System.out.println("Los lados ingresados forman un Triángulo");
        System.out.println("El perímetro del triangulo es: "+ tri.CalcularPerimetro(tri.getA(), tri.getB(), tri.getC(),band));}
       
    
    
    }
    
}

