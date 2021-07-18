package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ManejoArchivos {

    public static void crearCarpetaData(){
        File directorio = new File("./Data");
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
    }
    
    //Lee el archivo con los datos de los Afiliados.
    public static ArrayList<Afiliado> leerDatosAfiliados(String nombre) {

		ArrayList<Afiliado> lista = null;

		try {
			
			ObjectInputStream archivo = null;
			File path = new File(nombre);
			
			if(path.exists()) {
				archivo = new ObjectInputStream(new FileInputStream(nombre));
				lista = (ArrayList<Afiliado>)archivo.readObject();
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
		
		return lista;
		
	}
	
	//Escribe en el archivo con los datos de los Afiliados.
	public static boolean escribirDatosAfiliados(String nombre) {

		crearCarpetaData();
		ManejoHuespedes huespedes = ManejoHuespedes.getListas();
		try {
			ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream(nombre));
			archivo.writeObject(huespedes.getListaAfiliados());
			archivo.flush();
			archivo.close();
		}
		catch(IOException ex) {
            System.out.println("Error IO Escribir");
			return false;
		}
		
		return true;
		
	}

	//Lee el archivo con los datos de los NoAfiliados.
    public static ArrayList<NoAfiliado> leerDatosNoAfiliados(String nombre) {

		ArrayList<NoAfiliado> lista = null;

		try {
			
			ObjectInputStream archivo = null;
			File path = new File(nombre);
			
			if(path.exists()) {
				archivo = new ObjectInputStream(new FileInputStream(nombre));
				lista = (ArrayList<NoAfiliado>)archivo.readObject();
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
		
		return lista;
		
	}
	
	//Escribe en el archivo con los datos de los NoAfiliados.
	public static boolean escribirDatosNoAfiliados(String nombre) {

		crearCarpetaData();
		ManejoHuespedes huespedes = ManejoHuespedes.getListas();
		try {
			ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream(nombre));
			archivo.writeObject(huespedes.getListaNoAfiliados());
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
