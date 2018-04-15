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
public class Punto {
    private double x,y;
    
    
    public Punto(double x, double y) {//CONSTRUCTOR
        this.x = x;
        this.y = y;
    }

    public Punto() {
    }
    
    public double getX() {//Get metodo para mostrar el valor de x.
        return x;
    }

    public void setX(double x) {//set metodo para asignar un valor al atributo x.
        this.x = x;
    }

    public double getY() {//Get metodo para mostrar el valor de y.
        return y;
    }

    public void setY(double y) {//set metodo para asignar un valor al atributo y.
        this.y = y;
    }
    
    public double CalcularDistancia(double x1, double x2, double y1, double y2){//metodo que devuelve la distancia entre 2 puntos.
        double d;
        d= Math.pow((Math.pow((x2-x1),2)+ Math.pow((y2-y1),2)),0.5);
        return d;
    }
}
