package presentacion;
import java.util.ArrayList;
import Dominio.*;
public class InterfazUsuario{
    
    /* Se usa el String[] instruccion, para que el parametro sea un array y cuando se llame al metodo lo que se ponga se almacene. Al ser String serian 
     * contenedores de caracteres
       */
    public static void ejecutar(String[] instruccion){
        OficinaPadron padron = new OficinaPadron();
        if (instruccion[0].equalsIgnoreCase("mostrar") && instruccion.length == 1){
            mostrarOficinaPadron(padron);
        }else if (instruccion[0].equalsIgnoreCase("añadir")&& instruccion.length == 4){
            padron.annadir(new Habitante(instruccion[1],instruccion[2], instruccion[3]));
            System.out.println("Habitante añadido correctamente");
        }else{System.out.println("Error en la instrucción");
        }
    }
    
    private static void mostrarOficinaPadron(OficinaPadron padron){
        ArrayList<Habitante> habitantes = padron.getHabitantesPadron();
        for(Habitante habitante : habitantes){System.out.println(habitante.getNombre() + " " +habitante.getApellido1() + " "+habitante.getApellido2());
        }
        
        System.out.println("El numero total de habitantes es" + padron.calcularNumeroHabitantes());
    }
}


