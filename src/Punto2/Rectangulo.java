/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

/**
 *
 * @author Martin
 */
public class Rectangulo {
    public double ObtenerPerimetro(double b, double h)
   {  
       double peri = 2*(b+h);
       return peri;
   }
   
   public double ObtenerSuperficie (double b, double h)
   {
       double sup = b*h;
       return sup;
   }
   
   public void ObtenerSegundoP(Punto punto, double base){
       
       double x2,y2;
       x2=punto.getX()+base;
       y2=punto.getY();
       System.out.println("La posicion del segundo punto es : " +"("+x2+", "+y2+")");
   }
   
   public void ObtenerTercerP(Punto punto, double base, double altura)
   {
       double x3,y3;
       x3 = punto.getX()+base;
       y3 = punto.getY()+altura;
       System.out.println("La posicion del tercer punto es : " +"("+ x3+", "+y3+")");
   }
   
   public void ObtenerCuartoP(Punto punto, double altura)
   {
       double x4,y4;
       x4 = punto.getX();
       y4 = punto.getY()+altura;
       System.out.println("La posicion del cuarto punto es : " +"("+ x4+", "+y4+")");
   }
}
