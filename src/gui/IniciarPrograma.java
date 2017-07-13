/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;
import recursos.PicoPlaca;

/**
 *
 * @author Daniel Loza
 */
public class IniciarPrograma {

    public void start() {
        
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha que desea predecir el Pico y Placa para su vehículo"
                + "\nNOTA: La fecha debe ser ingresada con formato dd-MM-yyyy");
        String placa = JOptionPane.showInputDialog("Ingrese la placa de su vehículo");
        String horario = JOptionPane.showInputDialog("Ingrese la hora que va a circular"
                + "\nNOTA: La hora debe ser ingresada con formato HH:mm");

        PicoPlaca verPicoPlaca = new PicoPlaca(placa, fecha, horario);

        verPicoPlaca.imprimir();

    }
}
