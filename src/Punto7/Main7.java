/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto7;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Main7 {
    public static void main(String []args)
    {
        Scanner teclado=new Scanner (System.in);
        
        GestorAutos lista =new GestorAutos();
        
        int respuesta;
        
        do
        {
            Auto auto= new Auto();
            System.out.println("ingresar patente");
            auto.setPatente(teclado.nextLine());
            System.out.println("ingresar marca");
            auto.setMarca(teclado.nextLine());
            System.out.println("ingresar color");
            auto.setColor(teclado.nextLine());
            System.out.println("igresar combustible");
            auto.setTipoCombustible(teclado.nextLine());
            System.out.println("ingresar modelo");
            auto.setModelo(teclado.nextInt());
            
            lista.registrarAuto(auto);
            
            System.out.println("voler a registrar?");
            respuesta=teclado.nextInt();
        }while(respuesta != 0);
        
        for(Auto listar : lista.getListaAutos())
        {
            System.out.println("la patente es "+listar.getPatente());
            System.out.println("la marca es "+listar.getMarca());
            System.out.println("el color es "+listar.getColor());
            System.out.println("el combustible es "+listar.getTipoCombustible());
            System.out.println("el modelo es "+listar.getModelo());
        }
        
        System.out.println("desea modificar las caracteristicas de algun auto?");
        respuesta=teclado.nextInt();
        if(respuesta==1){
            Auto auto=new Auto();
            
            lista.eliminarAuto(auto);
            
            System.out.println("ingresar patente");
            auto.setPatente(teclado.nextLine());
            System.out.println("ingresar marca");
            auto.setMarca(teclado.nextLine());
            System.out.println("ingresar color");
            auto.setColor(teclado.nextLine());
            System.out.println("igresar combustible");
            auto.setTipoCombustible(teclado.nextLine());
            System.out.println("ingresar modelo");
            auto.setModelo(teclado.nextInt());
            
            lista.registrarAuto(auto);
        }
        else
        {
            System.out.println("Fin programa");
        }
        
    }
}
