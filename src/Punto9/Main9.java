/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto9;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Título del libro a buscar : ");
        String btitulo = sc.next();
        Busqueda busqueda = new Busqueda();
        busqueda.BusquedadeLibros(btitulo);
    }
}
