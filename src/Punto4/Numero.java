/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4;

/**
 *
 * @author Usuario
 */
public class Numero {
   
    
    public void MostrarNumero(int vec[]){
        System.out.println("Los números ingresados son:");
    for (int i=0;i<10;i++)
        {
            System.out.println(vec[i]);
        }
       
        
    }
    
    public void CalcularMayor (int vec[])
    {
        int mayor= vec[0];
        for (int i=0; i<10;i++)
        {
            if (vec[i]>mayor)
            {
                mayor=vec[i];
            }
        }
        System.out.println("El mayor de los números ingresados es: "+mayor);
    }
    
    public void CalcularPromedio(int vec[])
    {   int suma=0;
        double prom = 0;
          for (int i=0; i<10;i++)
          {
              suma=suma+vec[i];
          }
          prom=suma/10;
        
          System.out.println("El promedio es: "+prom);
      
              
    }
      
}
