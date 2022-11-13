package Functionalities;
/******************************************************************
Proyecto POO
Autores: 
    Ana Paula Navas #22731
    Sergio Palacios #22808
    Paula Rebeca Barillas #22764

Última modificación: 7/11/2022
 
Driver program/clase 
******************************************************************/

import java.util.stream.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Language {

	String[] vocales = {"a","e","i","o","u"};
	String[] consonantes = {"b","c","d","f","g","h","j","k","l","m","n","ñ","p","q","r","s","t","v","w","x","y","z"};
	String[] ABC = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
	int option = 0; 
	public void lengua(){
	do {
		option = Integer.parseInt(JOptionPane.showInputDialog(
				"Menu Lenguaje\n"
						+ "1. Vocales\n"
						+ "2. Consonantes \n"
						+ "3. Abecedario Completo \n"
						+ "4. Ejemplos de la palabra seleccionada \n"
						+ "5. Escritura de palabras, ,manera correcta \n"
						+ "6. Salir \n"));

		switch (option) {
			case 1:
			//Vocales

				break;
			case 2:
			//Consonantes
				break;

			case 3:
			// Abecedario completo
				break;

			case 4:
			//Ejemplos de la palabra seleccionada
				break;

			case 5:
			//Escritura de palabras, ,manera correcta
				break;
			case 6:
				break;
		}

	} while (option != 6);

}
}
