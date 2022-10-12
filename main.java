/******************************************************************
Proyecto POO
Autores: 
    Ana Paula Navas #22731
    Sergio Palacios #22808
    Paula Rebeca Barillas #22764

Última modificación: 9/10/2022
 
Driver program/clase sobre el main del sistema
******************************************************************/
//Importaciones 
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        vista VistaUser = new vista();
        Scanner sc= new Scanner(System.in);
        int opcion = 0;
    }
    private int opcion;
    {
        while (opcion != 4) {
            int opcion = 0;

            VistaUser.Menu_principal();
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("prueba");

    }}}


