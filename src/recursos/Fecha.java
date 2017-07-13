/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Daniel Loza
 */
public class Fecha {

    private String fecha;
    private String dia;
    private SimpleDateFormat formatoFecha;

    public Fecha(String fecha) {
        this.fecha = fecha;
    }

    public Fecha() {
        this.fecha = fecha;
        this.dia = dia;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
        formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaActual = null;
        try {
            fechaActual = formatoFecha.parse(fecha);
        } catch (ParseException e) {
            System.err.println("No se ha podido parsear la fecha.");
            e.printStackTrace();
        }
        GregorianCalendar fechaCalendario = new GregorianCalendar();
        fechaCalendario.setTime(fechaActual);
        int diaSemana = fechaCalendario.get(Calendar.DAY_OF_WEEK);

        switch (diaSemana) {
            case 1:
                setDia("Domingo");
                break;
            case 2:
                setDia("Lunes");
                break;
            case 3:
                setDia("Martes");
                break;
            case 4:
                setDia("Miércoles");
                break;
            case 5:
                setDia("Jueves");
                break;
            case 6:
                setDia("Viernes");
                break;
            case 7:
                setDia("Sábado");
                break;
            default:
                break;
        } 
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }
}
