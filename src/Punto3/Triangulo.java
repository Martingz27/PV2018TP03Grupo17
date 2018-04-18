/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

/**
 *
 * @author Usuario
 */
public class Triangulo {
   private int a, b, c;

    public Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangulo() {
    }
   
   

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public boolean VerificarTriangulo(int a, int b, int c, boolean band){
    
        if (a+b>c && a+c>b && b+c>a){
             band = true;}
        return band;
        
    }
    
    public int CalcularPerimetro(int a, int b, int c, boolean band){
        int per=0;
     if (band == true){
        per=(a+b+c);}
       return per;
    }
       
    
     
}
