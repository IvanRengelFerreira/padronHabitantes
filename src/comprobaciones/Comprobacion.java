/*Usamos un static para no crear una isntancia nueva y poder llamar al metodo a traves de la clase
 * 
 */
package comprobaciones;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import Dominio.*;

public class Comprobacion{
    
    public static void realizarComprobacion()
    {
        OficinaPadron padron = new OficinaPadron();
            ArrayList<Habitante> habitantes = padron.getHabitantesPadron();
            for(Habitante habitante : habitantes){
                System.out.println(habitante.getNombre() + " " +habitante.getApellido1() + " " +habitante.getApellido2());
            }
        System.out.println("El numero total de habitantes es " + padron.calcularNumeroHabitantes());
    }
}

