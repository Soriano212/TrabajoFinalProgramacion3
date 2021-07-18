package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManejoArchivos {

    private static void crearCarpetaData(){
        File directorio = new File("./Data");
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
    }
    
    //Lee el archivo con los datos de los huespedes.
    public static ManejoHuespedes leerDatosHuespedes() {
		
		ManejoHuespedes huespedes = new ManejoHuespedes();

		try {
			
			ObjectInputStream archivo = null;
			File path = new File("./Data/Huespedes.dat");
			
			if(path.exists()) {
				archivo = new ObjectInputStream(new FileInputStream("./Data/Huespedes.dat"));
				huespedes = (ManejoHuespedes)archivo.readObject();
				archivo.close();
			}
			
		}
		catch(IOException ex) {
            System.out.println("Error IO Leer");
			return null;
		}
        catch(ClassNotFoundException ex) {
            System.out.println("Error Class Leer");
			return null;
		}
		
		return huespedes;
		
	}
	
	//Escribe en el archivo con los datos de los huespedes.
	public static boolean EscribirDatosHuespedes(ManejoHuespedes huespedes) {

		crearCarpetaData();
		try {
			ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("./Data/Huespedes.dat"));
			archivo.writeObject(huespedes);
			archivo.flush();
			archivo.close();
		}
		catch(IOException ex) {
            System.out.println("Error IO Escribir");
			return false;
		}
		
		return true;
		
	}

}
