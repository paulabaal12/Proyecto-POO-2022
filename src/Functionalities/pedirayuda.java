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

import java.util.stream.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class pedirayuda {
    int option = 0; 
    public void ayuda(){
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu Pedir/Dar ayuda\n"
                            + "1. Registro para dar ayuda\n"
                            + "2. Buscar ayuda \n"
                            + "3. Lista de centros de educación públicos\n"
                            + "4. Lista de lugares para contribuir\n"
                            + "5. Salir \n"));
    
            switch (option) {
                case 1:
                //Registro para dar ayuda
                     break;

                case 2:
                //Buscar ayuda
                     break;
                
                case 3:
                //Lista de centros de educación públicos
                     break;
                
                case 4:
                //Lista de lugares para contribuir
                     break;

                case 5:
                    break;
            }
    
        } while (option != 5);
    
    }
    }
    



