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

public class Language {
	

/*public Language(String pregunta, String respuesta){
	this.pregunta = pregunta; 
	this.respuesta = respuesta;
}*/ 

	String[] vocales = {"a","e","i","o","u"};
	String[] consonantes = {"b","c","d","f","g","h","j","k","l","m","n","ñ","p","q","r","s","t","v","w","x","y","z"};
	String[] ABC = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
	int option = 0; 
	public void lengua(){
		String pregunta;
	    String respuesta; 
		this.pregunta = pregunta; 
	    this.respuesta = respuesta;
		String pre1; 
		String pre2; 
		String pre3; 
		String pre4;
		String pre5;
		String pre6;
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
			/*Pregunta [] pregunta ={
			    new Pregunta(pre1, "d"),
			    new Pregunta(pre2, "b"),
				new Pregunta(pre3, "c"),
				new Pregunta(pre4, "c"),
				new Pregunta(pre5, "d"),
				new Pregunta(pre6, "a"),};*/
				pre1 = Integer.parseString(JOptionPane.showInputDialog("¿Cuál de las siguientes palabras tienen más vocales con la letra a?\n" 
				+ "(a)Avión \n(b)Jaguar\n(c)Periodista\n(d)Manzana\n"));
				if (pre1 == "d") {
					JOptionPane.showMessageDialog(null, "Correcto");
				} else {
					JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es la d");
					}
				pre2 = Integer.parseString(JOptionPane.showInputDialog("¿Cuál de las siguientes palabras tienen más vocales con la letra e?\n" 
				+ "(a)Murcielago \n(b)Celeste\n(c)Carne\n(d)Estrella\n"));
				if (pre2 == "b") {
					JOptionPane.showMessageDialog(null, "Correcto");
				} else {
					JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es la b");
						}
				pre3 = Integer.parseString(JOptionPane.showInputDialog("¿Cuál de las siguientes palabras tienen más vocales con la letra i?\n" 
				+ "(a)Iglú \n(b)Isopo\n(c)Infinito\n(d)Incendio\n"));
				if (pre3 == "c") {
					JOptionPane.showMessageDialog(null, "Correcto");
				} else {
					JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es la c");
					}
				pre4 = Integer.parseString(JOptionPane.showInputDialog("¿Cuál de las siguientes palabras tienen más vocales con la letra o?\n" 
				+ "(a)Oreja \n(b)Olla\n(c)Ordenador\n(d)Oruga\n"));
				if (pre4 == "c") {
						JOptionPane.showMessageDialog(null, "Correcto");
				} else {
						JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es la c");
					}
				pre5 = Integer.parseString(JOptionPane.showInputDialog("¿Cuál de las siguientes palabras tienen más vocales con la letra U?\n" 
				+ "(a)Universidad \n(b)Uno\n(c)Urgencia\n(d)Uruguay\n"));
				if (pre5 == "d") {
						JOptionPane.showMessageDialog(null, "Correcto");
				} else {
						JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es la d");
					}
				pre6 = Integer.parseString(JOptionPane.showInputDialog("¿Cuál de las siguientes palabras tienen más vocales\n" 
				+ "(a)Sexagesimocuarto \n(b)Murcielago\n(c)Abecedario\n(d)Gaseosa\n"));
				if (pre6 == "a") {
						JOptionPane.showMessageDialog(null, "Correcto");
				} else {
						JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es la a");
					}
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
