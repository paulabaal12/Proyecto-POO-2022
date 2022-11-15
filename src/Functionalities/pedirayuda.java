package Functionalities;
/******************************************************************
Proyecto POO
Autores: 
    Ana Paula Navas #22731
    Sergio Palacios #22808
    Paula Rebeca Barillas #22764

Última modificación: 14/11/2022
 
Driver program/clase 
******************************************************************/
import java.util.Scanner;
import java.util.stream.*;
import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.ArrayList;
import DataStore.OpenFiles;

public class PedirAyuda {
    private int option;
    private Scanner sc;
    private Registro_Ayuda registro;
    private OpenFiles openFile;

    public PedirAyuda(){
        option = 0;
        sc = new Scanner(System.in);
        registro = new Registro_Ayuda();
        openFile = new OpenFiles();
    }

    public void ayuda(){
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu Pedir/Dar ayuda\n"
                            + "1. Registro para dar ayuda\n"
                            + "2. Buscar ayuda \n"
                            + "3. Lista de centros de educación públicos\n"
                            + "4. Lista de lugares para contribuir\n"
                            + "5. Salir y guardar \n"));
    
            switch (option) {
                case 1:
                    System.out.println("---Bienvenido Por favor ingresa tus datos---");
                    
                    System.out.println("Nombre: ");
                    String nombre = sc.nextLine();
                    registro.setNombre(nombre);

                    System.out.println("Apellido: ");
                    String apellido = sc.nextLine();
                    registro.setApellido(apellido);

                    System.out.println("Numero de Teléfono: ");
                    int telefono = sc.nextInt();
                    registro.setNumero_tele(telefono);

                    System.out.println("DPI: ");
                    int dpi = sc.nextInt();
                    registro.setDPI(dpi);
                    sc.nextLine();

                    System.out.println("Profesion: ");
                    String profesion = sc.nextLine();
                    registro.setProfesion(profesion);

                    System.out.println();
                    
                    System.out.println("Gracias, has sido registrado...");

                     break;

                case 2:
                    System.out.println("Bienvenid@, Por favor cuéntanos a continuación en que te podemos ayudar: \n");
                    String data = sc.nextLine();
                    registro.setData(data);
                    System.out.println("Pronto te ayudaremos...");
                
                    System.out.println("Coméntanos que piensas sobre nuestro servicio: \n");
                    String opinion = sc.nextLine();
                    registro.setOpinion(opinion);
                    System.out.println("Gracias por tu opinión...");
                     break;
                
                case 3:
                    System.out.println("Nuestros Centros de educación públicos: ");
                    System.out.println("1. Centro Principal \nCalzada Roosevelt, Cdad. de Guatemala 01011 \nNumero Telefónico: 2285-4302");
                    System.out.println("2. Centro Buena Vista \nGuatemala, 13 Calle 8, Guatemala \nNumero Telefónico: 2375-5728");
                    System.out.println("3. Centro Unidos Por Un mejor Día \nJ2j6+P62, Jalapa\nNumero Telefónico: 7845-4173");
                     break;
                
                case 4:
                    System.out.println("---Si deseas contribuir a nuestra organización, te dejamos los datos para que puedas hacerlo, de antemano te agradecemos tu colarboración.---");
                    System.out.println("Dirección para contribuciones: \n1. Centro Principal \nCalzada Roosevelt, Cdad. de Guatemala 01011 \nNumero Telefónico: 2285-4302 \n2. Centro Unidos Por Un mejor Día \nJ2j6+P62, Jalapa\nNumero Telefónico: 7845-4173");
                    System.out.println("¿Tienes algun comentario o opinon sobre las contribuciones? Dejanos saber a continuación: ");
                    String coments = sc.nextLine();
                    registro.setComentario(coments);
                    System.out.println("Gracias por tu comentario...");
                    break;

                case 5:
                    String linea = registro.getNombre() + ","
                        + registro.getApellido() + ","
                        + registro.getProfesion() + ","
                        + registro.getNumero_tele() + ","
                        + registro.getDPI() + ","
                        + registro.getData() + ","
                        + registro.getOpinion() + ","
                        + registro.getComentario()
                        ;
                    openFile.agregar_nueva_linea("\n" + linea, "src\\DataStore\\Archivos\\RegistroAyuda.csv");
                    break;
            }
    
        } while (option != 5);
    
    }
}