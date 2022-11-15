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
