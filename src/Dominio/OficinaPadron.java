package Dominio;
import java.util.ArrayList;
import java.io.File;
import java.util.*;
import java.io.IOException;
import java.io.FileWriter;

public class OficinaPadron{
    private ArrayList<Habitante> habitantesPadron = new
    ArrayList<>();
    
   
    public void annadir(Habitante habitante){
        habitantesPadron.add(habitante);
        volcarContactos();
    }
    public ArrayList getHabitantesPadron(){
        return habitantesPadron;
    }
    
    public int calcularNumeroHabitantes(){
        int suma = 0;
        for(Habitante habitante : habitantesPadron){
            suma++;
        }
            return suma;}
            
    private  void cargarhabitantes(){
        try{
            File fichero = new File("padron.csv");
            fichero.createNewFile();
            Scanner sc = new Scanner(fichero);
            sc.useDelimiter(",|\n");
            while(sc.hasNext()){
                Habitante habitante = new Habitante(sc.next(),sc.next(),sc.next());
                habitantesPadron.add(habitante);
            }
            sc.close();
        }catch(IOException ex){
            System.out.println("No hay habitantes inscritos");
        }
        }
    public OficinaPadron(){
        cargarhabitantes();
    }
    public void volcarContactos(){
        try{
            FileWriter fw = new FileWriter("padron.csv");
            for(Habitante habitante : habitantesPadron){
                fw.write(habitante.getNombre() + "," +habitante.getApellido1() + "," +habitante.getApellido2() + "n");
            }
            fw.close();
        }catch(IOException ex){
            System.err.println(ex);}}
    }
    


