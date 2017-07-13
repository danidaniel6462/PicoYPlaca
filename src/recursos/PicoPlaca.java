package recursos;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Loza
 */
public class PicoPlaca {

    private String placa;
    private String fecha;
    private String horario;

    Fecha objFecha = new Fecha();
    Horario objHorario = new Horario();
    Placa objPlaca = new Placa();

    public PicoPlaca(String placa, String fecha, String horario) {
        this.placa = placa;
        this.fecha = fecha;
        this.horario = horario;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
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

    public void imprimir() {
        // ingreso de placa
        objPlaca.setPlaca(placa);
        // ingreso de horario
        objHorario.setHorario(horario);
        // ingreso de fecha
        objFecha.setFecha(fecha);

        System.out.println(" Placa: " + placa
                + "\n Fecha: " + fecha + " Día: " + objFecha.getDia()
                + "\n Hora: " + horario);

        JOptionPane.showMessageDialog(null, "DATOS INGRESADOS EN EL SISTEMA\n"
                + "\n Placa: " + placa
                + "\n Fecha: " + fecha + " Día: " + objFecha.getDia()
                + "\n Hora: " + horario);
        // ********************************************
        // VERIFICAR DATOS
        // ********************************************

        if (700 <= objHorario.getHora() && objHorario.getHora() <= 900 || 1600 <= objHorario.getHora() && objHorario.getHora() <= 1930) {

            switch (objFecha.getDia()) {
                case "Lunes":
                    if (objPlaca.getDigito() == 1 || objPlaca.getDigito() == 2) {
                        JOptionPane.showMessageDialog(null, "No puede circular, es Día y Hora de Pico y Placa ");
                    } else {
                        JOptionPane.showMessageDialog(null, "Puede circular el Día y Hora consultado ");
                    }
                    break;
                case "Martes":
                    if (objPlaca.getDigito() == 3 || objPlaca.getDigito() == 4) {
                        JOptionPane.showMessageDialog(null, "No puede circular, es Día y Hora de Pico y Placa ");
                    } else {
                        JOptionPane.showMessageDialog(null, "Puede circular el Día y Hora consultado ");
                    }
                    break;
                case "Miércoles":
                    if (objPlaca.getDigito() == 5 || objPlaca.getDigito() == 6) {
                        JOptionPane.showMessageDialog(null, "No puede circular, es Día y Hora de Pico y Placa ");
                    } else {
                        JOptionPane.showMessageDialog(null, "Puede circular el Día y Hora consultado ");
                    }
                    break;
                case "Jueves":
                    if (objPlaca.getDigito() == 7 || objPlaca.getDigito() == 8) {
                        JOptionPane.showMessageDialog(null, "No puede circular, es Día y Hora de Pico y Placa ");
                    } else {
                        JOptionPane.showMessageDialog(null, "Puede circular el Día y Hora consultado ");
                    }
                    break;
                case "Viernes":
                    if (objPlaca.getDigito() == 9 || objPlaca.getDigito() == 0) {
                        JOptionPane.showMessageDialog(null, "No puede circular, es Día y Hora de Pico y Placa ");
                    } else {
                        JOptionPane.showMessageDialog(null, "Puede circular el Día y Hora consultado ");
                    }
                    break;
                case "Sábado":
                    JOptionPane.showMessageDialog(null, "Puede Circular ya que su día es Sábado");
                    break;
                case "Domingo":
                    JOptionPane.showMessageDialog(null, "Puede Circular ya que su día es Domingo");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Puede Circular el Horario está fuera del Pico y Placa");
        }
    }
}
