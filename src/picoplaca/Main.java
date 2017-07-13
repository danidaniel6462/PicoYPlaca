package picoplaca;

import gui.IniciarPrograma;
import test.TestFecha;
import test.TestHorario;
import test.TestPlaca;

/**
 *
 * @author Daniel Loza
 */
public class Main {

    public static void main(String[] args) {

        TestFecha testFecha = new TestFecha();
        TestHorario testHorario = new TestHorario();
        TestPlaca testPlaca = new TestPlaca();
        testFecha.prueba();
        testHorario.prueba();
        testPlaca.prueba();
        
        
        IniciarPrograma programa = new IniciarPrograma();
        
        programa.start();
        
    }
}
