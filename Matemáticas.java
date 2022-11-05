/******************************************************************
Proyecto POO
Autores: 
    Ana Paula Navas #22731
    Sergio Palacios #22808
    Paula Rebeca Barillas #22764

Última modificación: 9/10/2022
 
Driver program/clase sobre Matemáticas, la cuál va a heredar otras 
******************************************************************/

public class Matemáticas {
    int numeros;
    int orden_numeros;
    String nombre_num;

    Matemáticas(){
        numeros = 0;
    
    }
    public int getNumeros() {
        return numeros;
    }
    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }
    public int getOrden_numeros() {
        return orden_numeros;
    }
    public void setOrden_numeros(int orden_numeros) {
        this.orden_numeros = orden_numeros;
    }
    public String getNombre_num() {
        return nombre_num;
    }
    public void setNombre_num(String nombre_num) {
        this.nombre_num = nombre_num;
    }

}
