/******************************************************************
Proyecto POO
Autores: 
    Ana Paula Navas #22731
    Sergio Palacios #22808
    Paula Rebeca Barillas #22764

Última modificación: 9/10/2022
 
Driver program/clase sobre las funciones de la vista del programa 
******************************************************************/
//import javax.swing.JOptionPane;
import java.util.Scanner;
public class vista {
    Scanner scan = new Scanner(System.in); 

  /*public void Welcome(){
    JOptionPane.showMessageDialog(null, "Bienvenide a Learning is fun!");
  }/* */

//Menú inicial
  public void Menu_principal() {
    System.out.println("\n\nEscoge una materia :) ");
    System.out.println("1. Matemáticas");
    System.out.println("2. Idioma Español ");
    System.out.println("3. Brindar/buscar ayuda ");
    System.out.println("4. Salida\n\n");
 }
//Menú para opción de matemáticas

 public void Menu_mate() {
    System.out.println("\n\nQue opción te gustaría aprender/reforzar");
    System.out.println("1. Sumas básicas");
    System.out.println("2. Restas básicas");
    System.out.println("3. Orden de números");
    System.out.println("4. Mayor o menor que");
    System.out.println("5. Escritura de números");
    System.out.println("6. Exit\n\n");
  } 
  //Menú para opción de Idioma Español 

 public void Menu_idioma() {
    System.out.println("\n\nQue opción te gustaría aprender/reforzar");
    System.out.println("1. Vocales");
    System.out.println("2. Consonantes");
    System.out.println("3. Abecedario Completo");
    System.out.println("4. Ejemplos de la palabra seleccionada");
    System.out.println("5. Escritura de palabras correctas");
    System.out.println("6. Exit\n\n");
  } 

}