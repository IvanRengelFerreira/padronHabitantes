          /*En este codigo creamos una clase llamada habitante. Creamos los atributos de la clase para luego crear los metodos set. Estos serviran para luego establecer los atributos de la clase
 * 
 */
/* En los metodos les agregamos el public porque tiene que poder verse
 * en el main. De ahi se usa el this. para que la maquina entienda que 
 * quiero referenciar a los atributos de la clase y no haya una colision.
 */
package Dominio;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class Habitante 
{ 
    private String nombre;
    private String apellido1;
    private String apellido2;
    
   public Habitante(String nombre, String apellido1, String apellido2){
       this.nombre = nombre;
       this.apellido1 = apellido1;
       this.apellido2 = apellido2;
   }
   
   public String getNombre(){
       return nombre;
   }
    public String getApellido1(){
       return apellido1;
   }
    public String getApellido2(){
       return apellido2;
   }
    }


  


