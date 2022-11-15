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
	String[] vocales = {"a","e","i","o","u"};
	String[] consonantes = {"b","c","d","f","g","h","j","k","l","m","n","ñ","p","q","r","s","t","v","w","x","y","z"};
	String[] ABC = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
	int option = 0; 
	public void lengua(){
		String pregunta;
	    String respuesta; 
		
		String pre1; 
		String pre2; 
		String pre3; 
		String pre4;
		String pre5;
		String pre6;	
		String pre7; 
		String pre8; 
		String pre9; 
		String pre10;
		String pre11;
		String pre12;
		String pre13;
		String pre14;
		String pre15;
		String pre16;
		String pre17;
		String pre18;
		String pre19;
		String pre20;
	do {
		option = Integer.parseInt(JOptionPane.showInputDialog(
				"Menu Lenguaje\n"
						+ "1. Vocales\n"
						+ "2. Consonantes \n"
						+ "3. Mostrar Abecedario Completo \n"
						+ "4. Ejemplos de la palabra seleccionada \n"
						+ "5. Escritura de palabras, ,manera correcta \n"
						+ "6. Salir \n"));

		switch (option) {
			case 1:
			//Vocales
				pre1 = (JOptionPane.showInputDialog("¿Cuál de las siguientes palabras tienen más vocales con la letra a?\n" 
				+ "(a)Avión \n(b)Jaguar\n(c)Periodista\n(d)Manzana\n"));
				if (pre1.equals("d") ){
					JOptionPane.showMessageDialog(null, "Correcto");
				} else {
					JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es la d");
					}
				pre2 = (JOptionPane.showInputDialog("¿Cuál de las siguientes palabras tienen más vocales con la letra e?\n" 
				+ "(a)Murcielago \n(b)Celeste\n(c)Carne\n(d)Estrella\n"));
				if (pre2.equals("b")) {
					JOptionPane.showMessageDialog(null, "Correcto");
				} else {
					JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es la b");
						}
				pre3 = (JOptionPane.showInputDialog("¿Cuál de las siguientes palabras tienen más vocales con la letra i?\n" 
				+ "(a)Iglú \n(b)Isopo\n(c)Infinito\n(d)Incendio\n"));
				if (pre3.equals("c")) {
					JOptionPane.showMessageDialog(null, "Correcto");
				} else {
					JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es la c");
					}
				pre4 = (JOptionPane.showInputDialog("¿Cuál de las siguientes palabras tienen más vocales con la letra o?\n" 
				+ "(a)Oreja \n(b)Olla\n(c)Ordenador\n(d)Oruga\n"));
				if (pre4.equals("c")) {
						JOptionPane.showMessageDialog(null, "Correcto");
				} else {
						JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es la c");
					}
				pre5 = (JOptionPane.showInputDialog("¿Cuál de las siguientes palabras tienen más vocales con la letra U?\n" 
				+ "(a)Universidad \n(b)Uno\n(c)Urgencia\n(d)Uruguay\n"));
				if (pre5.equals("d")) {
						JOptionPane.showMessageDialog(null, "Correcto");
				} else {
						JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es la d");
					}
				pre6 = (JOptionPane.showInputDialog("¿Cuál de las siguientes palabras tienen más vocales\n" 
				+ "(a)Sexagesimocuarto \n(b)Murcielago\n(c)Abecedario\n(d)Gaseosa\n"));
				if (pre6.equals("a")) {
						JOptionPane.showMessageDialog(null, "Correcto");
				} else {
						JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es la a");
					}
				break;
			case 2:
			//Consonantes
			pre7 = (JOptionPane.showInputDialog("¿Cuantas consonantes tiene la siguiente palabra:Adscribir? \n" 
				+ "(a)6 \n(b)3\n(c)5\n(d)7\n"));
				if (pre7.equals("a")) {
						JOptionPane.showMessageDialog(null, "Correcto");
				} else {
						JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es la a");
					}
			pre8 = (JOptionPane.showInputDialog("¿Cuantas consonantes tiene la siguiente palabra:Monstruo? \n" 
					+ "(a)10 \n(b)3\n(c)5\n(d)6\n"));
					if (pre8.equals("c")) {
							JOptionPane.showMessageDialog(null, "Correcto");
					} else {
							JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es la c");
						}
			pre9 = (JOptionPane.showInputDialog("¿Cuantas consonantes tiene la siguiente palabra:Transgredir? \n" 
					+ "(a)8 \n(b)7\n(c)9\n(d)6\n"));
					if (pre9.equals("c")) {
							JOptionPane.showMessageDialog(null, "Correcto");
					} else {
							JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es la b");
						}
			pre10 = (JOptionPane.showInputDialog("¿Cuantas consonantes tiene la siguiente palabra:Combinaciones? \n" 
					+ "(a)9 \n(b)7\n(c)3\n(d)6\n"));
					if (pre10.equals("b")) {
							JOptionPane.showMessageDialog(null, "Correcto");
					} else {
							JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es la b");
							}
			pre11 = (JOptionPane.showInputDialog("¿Cuantas consonantes tiene la siguiente palabra:Carrera? \n" 
					+ "(a)2 \n(b)7\n(c)3\n(d)4\n"));
					if (pre11.equals("d")) {
							JOptionPane.showMessageDialog(null, "Correcto");
					} else {
							JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es la d");
							}
			pre12 = (JOptionPane.showInputDialog("¿Cuantas consonantes tiene la siguiente palabra:Obstrucción? \n" 
				    + "(a)12 \n(b)7\n(c)8\n(d)4\n"));
					if (pre12.equals("b")) {
					       JOptionPane.showMessageDialog(null, "Correcto");
					} else {
							JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es la b");
							}
				break;

			case 3:
			// Abecedario completo
			char c;
			for(c = 'a'; c <= 'z'; ++c)
			System.out.print(c + " ");
	    		break;

			case 4:
			//Ejemplos de la palabra seleccionada
			pre13 = (JOptionPane.showInputDialog("De las letras del ABC, escribe que palabra te gustaría tener un ejemplo"));
					if (pre13.equals("a")) {
					       JOptionPane.showMessageDialog(null, "araña, año, arco, alambre, almidón");
					if (pre13.equals("b")) {
							JOptionPane.showMessageDialog(null, "burro, barro, banco, barón, blanco");
					if (pre13.equals("c")) {
							JOptionPane.showMessageDialog(null, "carro, camión, casa, celeste, cantar");
					if (pre13.equals("d")) {
					        JOptionPane.showMessageDialog(null, "dado, delfín, dinosaurio, dardo, diez");
					if (pre13.equals("e")) {
							JOptionPane.showMessageDialog(null, "elefante, estribo, estaca, España, escoba");
					if (pre13.equals("f")) {
							JOptionPane.showMessageDialog(null, "Francia, fósforo, faraón, felino, fantasma");
					if (pre13.equals("g")) {
							JOptionPane.showMessageDialog(null, "gato, gimnasia, gris, ganso, gancho");
					if (pre13.equals("h")) {
							JOptionPane.showMessageDialog(null, "hilo, helio, huevo, harina, hormiga");
					if (pre13.equals("i")) {
							JOptionPane.showMessageDialog(null, "iglesia, institución, invitación, interno, isla");
					if (pre13.equals("j")) {
							JOptionPane.showMessageDialog(null, "jaula, Jamaica, jarrón, juntar, jinete");
					if (pre13.equals("k")) {
							JOptionPane.showMessageDialog(null, "koala, kiosco, karma, kerosene, kilo");
					if (pre13.equals("l")) {
							JOptionPane.showMessageDialog(null, "ladrar, ladrón, lagarto, lila, largo");
					if (pre13.equals("m")) {
						    JOptionPane.showMessageDialog(null, "mano, malo, manso, marrón, millón");
					if (pre13.equals("n")) {
							 JOptionPane.showMessageDialog(null, "naranja, negro, ninguno, nube, nariz");
					if (pre13.equals("ñ")) {
							JOptionPane.showMessageDialog(null, "ñuzco, ñu, ñudoso, ñacunda, ñanduti");
					if (pre13.equals("o")) {
							JOptionPane.showMessageDialog(null, "obrero, orfebrería, oso, oscuro, octavo");
					if (pre13.equals("p")) {
							JOptionPane.showMessageDialog(null, "púrpura, pera, piso, pantalla, pulso");
					if (pre13.equals("q")) {
							JOptionPane.showMessageDialog(null, "querer, quemar, quedar, queso");
					if (pre13.equals("r")) {
							JOptionPane.showMessageDialog(null, "ratón, rosa, rama, rito, rodar");
					if (pre13.equals("s")) {
							JOptionPane.showMessageDialog(null, "salmón, saltar, soltar, silbar, sol");
					if (pre13.equals("t")) {
							JOptionPane.showMessageDialog(null, "tirar, tratar, timar, tocar, tomar");
					if (pre13.equals("u")) {
						     JOptionPane.showMessageDialog(null, "uva, uña, ultra, unir, único");
					if (pre13.equals("v")) {
							JOptionPane.showMessageDialog(null, "velar, vela, volver, ver, vigilar");
				    if (pre13.equals("w")) {
							JOptionPane.showMessageDialog(null, "Washington, watts, waffle, whisky, walkman.");
					if (pre13.equals("x")) {
							JOptionPane.showMessageDialog(null, "xilófono, xenofobia, xilografía, xiloprotector, xerófito");
					if (pre13.equals("y")) {
							JOptionPane.showMessageDialog(null, "Yodo, yoyo, yacía, yaga, yegua");
					if (pre13.equals("z")) {
							JOptionPane.showMessageDialog(null, "zapato, zapatilla, zorro, zarza, zarpa");

					} else {
							JOptionPane.showMessageDialog(null, "Incorrecto, escribe una letra");
							}
						}
					}
				}
			}
		}}}}}}}}}}}}}}}}}}}}}}
					
			break;

			case 5:
			//Escritura de palabras, ,manera correcta
			pre13 = (JOptionPane.showInputDialog("Escribe correctamente lo siguiente: saaditm \n" ));
			if (pre13.equals("amistad")) {
					JOptionPane.showMessageDialog(null, "Correcto");
			} else {
					JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es amistad");
				}
			pre14 = (JOptionPane.showInputDialog("Escribe correctamente lo siguiente: mddhiual\n"));
					if (pre14.equals("humildad")) {
							JOptionPane.showMessageDialog(null, "Correcto");
					} else {
							JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es humildad");
						}
			pre15 = (JOptionPane.showInputDialog("Escribe correctamente lo siguiente:anormdcióe \n"));
					if (pre15.equals("moderación")) {
							JOptionPane.showMessageDialog(null, "Correcto");
					} else {
							JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es moderación");
						}
			pre16 = (JOptionPane.showInputDialog("Escribe correctamente lo siguiente: bnidesdalisi \n" ));
					if (pre16.equals("sensibilidad")) {
							JOptionPane.showMessageDialog(null, "Correcto");
					} else {
							JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es sensibilidad");
							}
			pre17 = (JOptionPane.showInputDialog("Escribe correctamente lo siguiente: cairnedup \n" ));
					if (pre17.equals("prudencia")) {
							JOptionPane.showMessageDialog(null, "Correcto");
					} else {
							JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es prudencia");
							}
			pre18 = (JOptionPane.showInputDialog("Escribe correctamente lo siguiente: dasogneerdi\n" ));
					if (pre18.equals("generosidad")) {
						JOptionPane.showMessageDialog(null, "Correcto");
					} else {
							JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es generosidad");
							}
			pre19 = (JOptionPane.showInputDialog("Escribe correctamente lo siguiente:ttirgdua \n" ));
					if (pre19.equals("gratitud")) {
							JOptionPane.showMessageDialog(null, "Correcto");
					} else {
							JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta gratitud");
									}
			pre20 = (JOptionPane.showInputDialog("Escribe correctamente lo siguiente:paecniaci\n"));
					if (pre20.equals("paciencia")) {
						JOptionPane.showMessageDialog(null, "Correcto");
					  } else {
						JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es paciencia");
									}
				break;
			case 6:
				break;
		}

	} while (option != 6);

}
}
