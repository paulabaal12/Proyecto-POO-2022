/******************************************************************
Proyecto POO
Autores: 
    Ana Paula Navas #22731
    Sergio Palacios #22808
    Paula Rebeca Barillas #22764

Última modificación: 7/11/2022
 
Driver program/clase 
******************************************************************/
package Functionalities;

import java.util.stream.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Mate {
    // arreglos de orden menor a mayor
    private ArrayList<Integer> Data = new ArrayList<>(Stream.of(3, 5, 7, 12, 18).collect(Collectors.toList()));
    private ArrayList<Integer> Data2 = new ArrayList<>(Stream.of(2, 6, 10, 15, 21).collect(Collectors.toList()));
    private ArrayList<Integer> Data3 = new ArrayList<>(Stream.of(4, 9, 17, 22, 27).collect(Collectors.toList()));
    private ArrayList<Integer> Data4 = new ArrayList<>(
            Stream.of(13, 16, 24, 30, 38).collect(Collectors.toList()));
    private ArrayList<Integer> Data5 = new ArrayList<>(
            Stream.of(5, 18, 21, 27, 35).collect(Collectors.toList()));
    // mayor a menor
    private ArrayList<Integer> Data6 = new ArrayList<>(Stream.of(18, 12, 7, 5, 3).collect(Collectors.toList()));
    private ArrayList<Integer> Data7 = new ArrayList<>(Stream.of(21, 15, 10, 6, 2).collect(Collectors.toList()));
    private ArrayList<Integer> Data8 = new ArrayList<>(Stream.of(27, 22, 17, 9, 4).collect(Collectors.toList()));
    private ArrayList<Integer> Data9 = new ArrayList<>(
            Stream.of(38, 30, 24, 16, 13).collect(Collectors.toList()));
    private ArrayList<Integer> Data10 = new ArrayList<>(
            Stream.of(35, 27, 21, 18, 5).collect(Collectors.toList()));

    public void mate() {

        int option = 0;
        int suma1;
        int suma2;
        int suma3;
        int suma4;
        int suma5;
        int suma6;
        int suma7;
        int suma8;
        int suma9;
        int suma10;

        int resta1;
        int resta2;
        int resta3;
        int resta4;
        int resta5;
        int resta6;
        int resta7;
        int resta8;
        int resta9;
        int resta10;

        int menor1;
        int menor2;
        int menor3;
        int menor4;
        int menor5;

        int mayor1;
        int mayor2;
        int mayor3;
        int mayor4;
        int mayor5;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu Matematicas\n"
                            + "1. Sumas \n"
                            + "2. Restas \n"
                            + "3. Ordenar numero de menor a mayor \n"
                            + "4. Ordenar numero de mayor a menor \n"
                            + "5. Atras \n"));

            switch (option) {
                case 1:
                    suma1 = Integer.parseInt(JOptionPane.showInputDialog("5 + 7"));
                    if (suma1 == 12) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 12");
                    }
                    suma2 = Integer.parseInt(JOptionPane.showInputDialog("8 + 9"));
                    if (suma2 == 17) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 17");
                    }
                    suma3 = Integer.parseInt(JOptionPane.showInputDialog("10 + 4"));
                    if (suma3 == 14) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 14");
                    }
                    suma4 = Integer.parseInt(JOptionPane.showInputDialog("12 + 7"));
                    if (suma4 == 19) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 19");
                    }
                    suma5 = Integer.parseInt(JOptionPane.showInputDialog("15 + 6"));
                    if (suma5 == 21) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 21");
                    }
                    suma6 = Integer.parseInt(JOptionPane.showInputDialog("17 + 13"));
                    if (suma6 == 30) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 30");
                    }
                    suma7 = Integer.parseInt(JOptionPane.showInputDialog("14 + 11"));
                    if (suma7 == 25) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 25");
                    }
                    suma8 = Integer.parseInt(JOptionPane.showInputDialog("23 + 9"));
                    if (suma8 == 32) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 32");
                    }
                    suma9 = Integer.parseInt(JOptionPane.showInputDialog("34 + 13"));
                    if (suma9 == 47) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 47");
                    }
                    suma10 = Integer.parseInt(JOptionPane.showInputDialog("31 + 48"));
                    if (suma10 == 79) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 79");
                    }
                    break;

                case 2:
                    resta1 = Integer.parseInt(JOptionPane.showInputDialog("9 - 7"));
                    if (resta1 == 2) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 2");
                    }
                    resta2 = Integer.parseInt(JOptionPane.showInputDialog("8 - 3"));
                    if (resta2 == 5) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 5");
                    }
                    resta3 = Integer.parseInt(JOptionPane.showInputDialog("13 - 6"));
                    if (resta3 == 7) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 7");
                    }
                    resta4 = Integer.parseInt(JOptionPane.showInputDialog("18 - 9"));
                    if (resta4 == 9) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 9");
                    }
                    resta5 = Integer.parseInt(JOptionPane.showInputDialog("22 - 6"));
                    if (resta5 == 16) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 16");
                    }
                    resta6 = Integer.parseInt(JOptionPane.showInputDialog("17 - 13"));
                    if (resta6 == 4) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 4");
                    }
                    resta7 = Integer.parseInt(JOptionPane.showInputDialog("28 - 15"));
                    if (resta7 == 13) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 13");
                    }
                    resta8 = Integer.parseInt(JOptionPane.showInputDialog("37 - 29"));
                    if (resta8 == 8) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 8");
                    }
                    resta9 = Integer.parseInt(JOptionPane.showInputDialog("48 - 19"));
                    if (resta9 == 29) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 29");
                    }
                    resta10 = Integer.parseInt(JOptionPane.showInputDialog("54 - 18"));
                    if (resta10 == 36) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 36");
                    }
                    break;

                case 3:
                    option = 3;
                    menor1 = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ordena los siguientes sumeros de menor a mayor, separandolos por un espacio\n 5, 18, 7, 12, 3"));
                    if (Data.contains(menor1)) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 3 5 7 12 18");
                    }
                    menor2 = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ordena los siguientes sumeros de menor a mayor, separandolos por un espacio\n 6, 15, 2, 10, 21"));
                    if (Data2.contains(menor2)) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 2 6 10 15 21");
                    }
                    menor3 = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ordena los siguientes sumeros de menor a mayor, separandolos por un espacio\n 9, 17, 4, 27, 22"));
                    if (Data3.contains(menor3)) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 4 9 17 22 27");
                    }
                    menor4 = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ordena los siguientes sumeros de menor a mayor, separandolos por un espacio\n 16, 30, 24, 13, 38"));
                    if (Data4.contains(menor4)) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 13 16 24 30 38");
                    }
                    menor5 = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ordena los siguientes sumeros de menor a mayor, separandolos por un espacio\n 18, 35, 27, 5, 21"));
                    if (Data5.contains(menor5)) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 5 18 21 27 35");
                    }
                    break;

                case 4:
                    option = 4;
                    mayor1 = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ordena los siguientes sumeros de mayor a menor, separandolos por un espacio\n 5, 18, 7, 12, 3"));
                    if (Data6.contains(mayor1)) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 18 12 7 5 3");
                    }
                    mayor2 = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ordena los siguientes sumeros de mayor a menor, separandolos por un espacio\n 6, 15, 2, 10, 21"));
                    if (Data7.contains(mayor2)) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 21 15 10 6 2");
                    }
                    mayor3 = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ordena los siguientes sumeros de mayor a menor, separandolos por un espacio\n 9, 17, 4, 27, 22"));
                    if (Data8.contains(mayor3)) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 27 22 17 9 4");
                    }
                    mayor4 = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ordena los siguientes sumeros de mayor a menor, separandolos por un espacio\n 16, 30, 24, 13, 38"));
                    if (Data9.contains(mayor4)) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 38 30 24 16 13");
                    }
                    mayor5 = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ordena los siguientes sumeros de mayor a menor, separandolos por un espacio\n 18, 35, 27, 5, 21"));
                    if (Data10.contains(mayor5)) {
                        JOptionPane.showMessageDialog(null, "Correcto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, la respuesta correcta es 35 27 21 18 5");
                    }
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Vuelve pronto! :)");

            }

        } while (option != 5);

    }
}