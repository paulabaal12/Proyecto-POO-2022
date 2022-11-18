
//import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

import LogIn.Users;
public class Interaction { 

    public void welcome() {
    	JOptionPane.showMessageDialog(null, "Bienvenido a reforzar tu educación!!");
    }
    
    public void end_sys() {
    	JOptionPane.showMessageDialog(null, "Saliendo...");
    }
  /**
   * Home. This is the main menu of the project
   * @return
   */
    public int Menu_principal() {
		String[] options = {"Matemáticas", "Idioma Español", "Brindar/buscar ayuda", "Salida"};
	    System.out.println("\nMenu principal, Escoge una materia :)\n");
	    for(int i = 0; i < options.length; i++) {
	    	System.out.println((i+1) + ". " + options[i]);
	    }
	    return options.length;
    }

  /**
   * Menú para opción de matemáticas 
   * @return
   */
  	public int Menu_mate() {
		String[] options = {"Sumas básicas", "Restas básicas","Orden de números","Mayor o menor que","Escritura de números","Exit"};
	    System.out.println("\n\nQue opción te gustaría aprender/reforzar");
	    for(int i = 0; i < options.length; i++) {
	    	System.out.println((i+1) + ". " + options[i]);
	    }
	    return options.length;
  	} 
   
/**
 * Menú para opción de Idioma Español
 */
 	public int Menu_idioma() {
		String[] options = {"Vocales", "Consonantes","Mostrar Abecedario Completo","Ejemplos de la palabra seleccionada","Escritura de palabras correctas","Exit"};
	    System.out.println("\n\nQue opción te gustaría aprender/reforzar");
	    for(int i = 0; i < options.length; i++) {
	    	System.out.println((i+1) + ". " + options[i]);
	    }
	    return options.length; 	    
 	} 
 
 	public Users register() {
 		String name = JOptionPane.showInputDialog("Ingrese el nombre de usuario: ");
 		String password = JOptionPane.showInputDialog("Ingrese su contraseña");
 		return new Users(name, password);
 	}
 	/**
 	 * 
 	 * @return
 	 */
 	public int logIn() {
 		String[] options = {"Iniciar sesion", "Registrarse","Salir"};
	    System.out.println("\n\nQue opción te gustaría aprender/reforzar");
	    for(int i = 0; i < options.length; i++) {
	    	System.out.println((i+1) + ". " + options[i]);
	    }
	    return options.length;
 	}
 	/**
 	 * 
 	 * @param amountOptions
 	 * @return
 	 */
	public int selection(int amountOptions) {
		int selection = 0;
		boolean next_step = false;
		do {
			try {
				selection = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las opciones\n 1. Iniciar sesion\n 2. Registrarse\n 3. Salir"));
				if(selection < 1 || selection > amountOptions) {
					JOptionPane.showInputDialog("DEBE INGRESAR UNA OPCION VALIDA");
				}else {
					next_step = true;
				}
			}catch(NumberFormatException e){
				JOptionPane.showInputDialog("DEBE INGRESAR UN VALOR NUMERICO");
			}
			
		}while(!next_step);
		return selection;
	}
}