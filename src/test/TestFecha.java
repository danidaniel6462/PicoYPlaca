/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import recursos.Fecha;

/**
 *
 * @author Daniel Loza
 */
public class TestFecha {
    
    Fecha objFecha;
    
    public void prueba(){
        
        String fecha = "13-08-2020";
        objFecha = new Fecha(fecha);
        objFecha.setFecha(objFecha.getFecha());
        System.out.println(" Fecha " + objFecha.getFecha() + " Día: " + objFecha.getDia());
    }
    
    
    
}
