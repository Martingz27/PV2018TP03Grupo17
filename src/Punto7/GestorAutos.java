/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Martin
 */
public class GestorAutos {
    private List<Auto> listaAutos= new ArrayList<Auto>();

    public void registrarAuto(Auto auto)
    {
        listaAutos.add(auto);
    }
    
    public void eliminarAuto(Auto auto)
    {
        listaAutos.remove(auto);
    }
    
    /**
     * @return the listaAutos
     */
    public List<Auto> getListaAutos() {
        return listaAutos;
    }

    /**
     * @param listaAutos the listaAutos to set
     */
    public void setListaAutos(List<Auto> listaAutos) {
        this.listaAutos = listaAutos;
    }
    
}
