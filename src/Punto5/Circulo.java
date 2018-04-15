/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

/**
 *
 * @author Martin
 */
public class Circulo {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
   
    
    public void CalcularSuperficie(Circulo circ)
    {
        double sup= 3.14 * Math.pow(radio,2);
        System.out.println("La superficie del círculo es: "+sup);
    }
}
