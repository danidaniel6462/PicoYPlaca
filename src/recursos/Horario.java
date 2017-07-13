/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

/**
 *
 * @author Daniel Loza
 */
public class Horario {

    private String horario;
    private int hora;

    public Horario(String horario) {
        this.horario = horario;
    }
    
    public Horario() {
        this.horario = horario;
        this.hora = hora;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the hora
     */
    public int getHora() {
        String[] parts = horario.split(":");
        String tiempo = parts[0] + parts[1];
        hora = Integer.parseInt(tiempo);
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

}
