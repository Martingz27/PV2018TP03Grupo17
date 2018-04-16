
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Main {
    public static void main(String []args)
    {
        Scanner teclado= new Scanner (System.in);
        Buscador buscar=new Buscador();
        
        System.out.println("ingresar titulo");
        String titulo=teclado.nextLine();
        
        buscar.buscarAutor(titulo);
        
    }
}
