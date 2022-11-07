
import java.util.Scanner;

import javax.print.attribute.PrintServiceAttributeSet;
import javax.sound.sampled.SourceDataLine;



public class Registrador extends Datos_Registrador {
    Datos_Registrador info = new Datos_Registrador();
    public void registra() {
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.println("-----Bienvenido, Porfarvor Registrate a Continuacion-----");

            System.out.print("Ingresa El nombre de usuario que deseas: ");
            String usuario = sc.nextLine(); 
            info.setUsuario(usuario);

            System.out.print("Ingrese la contraseña que desees: ");
            String contraseña = sc.nextLine();
            info.setContraseña(contraseña);
            System.out.println("Has sido Registrado, Bienvenido...");
            

        }
        
    }
    // Este es el metodo para mostrar los ususarios registrados pero aun no lo puse en el main porque,
    // falta hacer el menu principal y si no capaz da error , entonces mejor evitar jaja, pero ya esta hecho solo para poner en el menu.
    public void Datos_Registrados() {
        System.out.println("\n---Estos son los usuarios registrados---");
        System.out.println(info.getUsuario());
        System.out.println(info.getContraseña());
    }
    
}


