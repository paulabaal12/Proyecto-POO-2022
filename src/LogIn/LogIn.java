package LogIn;

import java.util.ArrayList;

import DataStore.OpenFiles;

public class LogIn {
	private OpenFiles files = new OpenFiles();
	private ArrayList<ArrayList<String>> data = null;
	
	
	public void register(Users userData) {
		data = files.leer_CSV();
		ArrayList<String> newUser = new ArrayList<String>();
		newUser.add(userData.getUser());
		newUser.add(userData.getPassword());
		files.save_data(newUser);
	}
	
	public void showUsers() {
		data = files.leer_CSV();
		for(ArrayList<String> user: data) {
			ArrayList<String> tempData = user;
			for(int i = 0; i < tempData.size();i++) {
				System.out.println("Usuario: " + tempData.get(0));
			}
		}
	}
	
	public boolean iniciarSesion(Users user) {
		data = files.leer_CSV();
		ArrayList<String> users = new ArrayList<String>();
		for(ArrayList<String> currentUser: data) {
			users.add(currentUser.get(0));
			users.add(currentUser.get(1));
		}
		if(users.contains(user.getUser()) && users.contains(user.getPassword())) {
			return true;
		}else {
			return false;
		}
	}
}

