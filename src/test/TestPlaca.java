/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import recursos.Placa;
/**
 *
 * @author Daniel Loza
 */
public class TestPlaca {
       Placa objPlaca;
    
    public void prueba(){
        
        String placa = "AFS154";
        objPlaca = new Placa();
        objPlaca.setPlaca(placa);
        System.out.println(" Placa Ingresada" + objPlaca.getPlaca() + "\núltimo dígito de placa " + objPlaca.getDigito());
    }
}
