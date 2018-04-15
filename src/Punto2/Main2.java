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
public class Main2 {
    public static void main(String[] args) {
        
        Rectangulo rectangulo = new Rectangulo();
        Punto punto = new Punto();
        punto.PuntoAsignarValor(3, 6);
        rectangulo.ObtenerSegundoP(punto, 7);
        rectangulo.ObtenerTercerP(punto, 7, 5);
        rectangulo.ObtenerCuartoP(punto, 6);
        double peri = rectangulo.ObtenerPerimetro(7, 6);
        double sup = rectangulo.ObtenerSuperficie(7, 6);
        System.out.println("El perimetro del rectangulo es : "+peri);
        System.out.println("La superficie del rectangulo es : "+sup);
    }
}
