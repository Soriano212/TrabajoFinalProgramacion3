package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ManejoArchivos {
    
    //Lee el archivo con los datos de los huespedes.
    public static ManejoHuespedes leerDatosHuespedes() {
		
		ManejoHuespedes huespedes = null;
		
		try {
			
			ObjectInputStream archivo = null;
			File path = new File("/Data/Huespedes.dat");
			
			if(path.exists()) {
				archivo = new ObjectInputStream(new FileInputStream("/Data/Huespedes.dat"));
				huespedes = (ManejoHuespedes)archivo.readObject();
				archivo.close();
			}
			
		}
		catch(IOException ex) {
			return null;
		}
		catch(ClassNotFoundException ex) {
			return null;
		}
		
		return huespedes;
		
	}
	
	//Escribe en el archivo con los datos de los huespedes.
	public static boolean EscribirDatosHuespedes(ManejoHuespedes huespedes) {
		
		try {
			ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("/Data/Huespedes.dat"));
			archivo.writeObject(huespedes);
			archivo.flush();
			archivo.close();
		}
		catch(IOException ex) {
			return false;
		}
		
		return true;
		
	}

}
