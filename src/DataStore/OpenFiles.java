package DataStore;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class OpenFiles {
	
	 public ArrayList<ArrayList<String>> leer_CSV() {
	        // StringBuilder sb = new StringBuilder();
	        ArrayList<ArrayList<String>> usuarios =  new ArrayList<ArrayList<String>>();

	        Path filePath = Paths.get("src\\DataStore\\Archivos\\Users.csv");
	        try {
	            // Tratar de leer el archivo segun su ruta.
	            BufferedReader br = Files.newBufferedReader(filePath);
	            String linea;
	            // Lectura linea por linea del archivo.
	            while ((linea = br.readLine()) != null) {
	                // Para la lectura de caracteres
	                // sb.append(linea).append("\n");
	                String[] datosDeLinea = linea.split(",");
	                ArrayList<String> datos_temporal = new ArrayList<String>();
	                for (String dato : datosDeLinea) {
	                    datos_temporal.add(dato);
	                }
	                usuarios.add(datos_temporal);
	            }
	        } catch (IOException exception) {
	            exception.printStackTrace();
	        }
	        return usuarios;
	 }
	 
	 /**
	  * 
	  */
	 public void save_data(ArrayList<String> saveData) {
		 File archivo;
        try {
            // Modificar la ruta del arhcivo a la ruta donde se ubica actualmente
            archivo = new File("src\\DataStore\\Archivos\\Users.csv");
            if (archivo.exists()) {
                BufferedWriter bw = new BufferedWriter(new FileWriter("src\\DataStore\\Archivos\\Users.csv", true));
                // bw.write(titulos + "\n");
                for (int i = 0; i < saveData.size(); i++) {
                    int maximo = saveData.size() - 1;
                    if (i == maximo) {
                        bw.write(saveData.get(i) + "\n");
                    } else {
                        // if (i == 0) {
                        // bw.write("\n" + datos[i] + ",");
                        // } else {
                        bw.write(saveData.get(i) + ",");
                        // }
                    }
                }
                bw.close();
            }
        } catch (IOException exception) {
            System.err.println("NO SE PUDO HACER NADA PARA ALMACENAR EN EL ARCHIVO");
        }
		 
	 }
	 /**
	  * 
	  * @param nombre_archivo
	  */
	 public void crear_archivo(String nombre_archivo) {
		File archivo;
		try {
		    // ruta archivos
		    archivo = new File("src\\DataStore\\Archivos\\" +nombre_archivo + ".csv");
		    // Verificar si existe
		    if (archivo.exists()) {
		        System.out.println("el arhcivo ya existe");
		    } else if (archivo.createNewFile()) {// crear en caso de no existir
		        System.out.println("Se ha creado el archivo");
		    }
		} catch (IOException exception) {// Throwable, excepcion padre (general) de todas las excepciones.
		    System.err.println("No se ha creado el archivo");
		}
	 }
}
