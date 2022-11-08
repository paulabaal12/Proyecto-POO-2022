/******************************************************************
Proyecto POO
Autores: 
    Ana Paula Navas #22731
    Sergio Palacios #22808
    Paula Rebeca Barillas #22764

Última modificación: 7/11/2022
 
Driver program/clase 
******************************************************************/
package LogIn;

public class Users {

    private String name;
    private String password;

    public Users(String name, String password) {
    	this.name = name;
    	this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String pasword) {
        this.password = pasword;
    }

    public String getUser() {
        return name;
    }

    public void setUsuario(String name) {
        this.name = name;
    }

}