/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import recursos.Fecha;
import recursos.Horario;

/**
 *
 * @author Daniel Loza
 */
public class TestHorario {
       Horario objHorario;
    
    public void prueba(){
        
        String hora = "19:46";
        objHorario = new Horario(hora);
        System.out.println(" Hora " + objHorario.getHora());
    }
}
