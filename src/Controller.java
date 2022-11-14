
/******************************************************************
Proyecto POO
Autores: 
    Ana Paula Navas #22731
    Sergio Palacios #22808
    Paula Rebeca Barillas #22764

Última modificación: 5/11/2022
 
Driver program/clase sobre las funciones del controlador del sistema = controlador del programa
******************************************************************/


import Functionalities.Language;
import Functionalities.Mate;
import Functionalities.pedirayuda;
import LogIn.LogIn;
import LogIn.Users;

public class Controller {
	private Users currentUser = null;
	private Interaction view = new Interaction();
	private LogIn logIn = new LogIn();
	private Mate mate = new Mate();	
	private Language lengua = new Language();
	private pedirayuda ayuda = new pedirayuda(); 

	public void start() {
		boolean registered = false;
		Users user = null;
		int amountOptions = 0;
		int userInput = 1;
		while (userInput != amountOptions) {
			amountOptions = view.logIn();
			userInput = view.selection(amountOptions);
			switch (userInput) {
				case 1:
					// Iniciar sesion
					user = view.register();
					registered = logIn.iniciarSesion(user);
					if (registered == true) {
						currentUser = user;
						menu();
					} else {
						System.err.println("DEBE CREAR UN USUARIO");
						start();
					}
					break;
				case 2:
					// Registrarse
					user = view.register();
					logIn.register(user); // Save the new User
					currentUser = user;
					menu();
					break;
				default:
					// Salir
					view.end_sys();
					break;
			}
		}
	}

	private void menu() {
		view.welcome();
		int amountOptions = 0;
		int userInput = 1;
		while (userInput != amountOptions) {
			amountOptions = view.Menu_principal();
			userInput = view.selection(amountOptions);
			switch (userInput) {
				case 1:
					// Matematica
					mate.mate();
					break;
				case 2:
					lengua.lengua(); 
					break;
				case 3:
					// Brindar/buscar Ayuda
					ayuda.ayuda();
					break;
				default:
					// Salir
					break;
			}
		}
	}

}