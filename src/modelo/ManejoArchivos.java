package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import modelo.Empresa.DatosEmpresa;

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

	//Lee el archivo con los datos de los Propietarios.
    public static ArrayList<Propietario> leerDatosPropietarios(String nombre) {

		ArrayList<Propietario> lista = null;

		try {
			
			ObjectInputStream archivo = null;
			File path = new File(nombre);
			
			if(path.exists()) {
				archivo = new ObjectInputStream(new FileInputStream(nombre));
				lista = (ArrayList<Propietario>)archivo.readObject();
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
	
	//Escribe en el archivo con los datos de los Propietarios.
	public static boolean escribirDatosPropietarios(String nombre) {

		crearCarpetaData();
		Empresa empresa = Empresa.getEmpresa();
		try {
			ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream(nombre));
			archivo.writeObject(empresa.getListaPropietarios());
			archivo.flush();
			archivo.close();
		}
		catch(IOException ex) {
            System.out.println("Error IO Escribir");
			return false;
		}
		
		return true;
		
	}

	//Lee el archivo con los datos de la Empresa.
    public static DatosEmpresa leerDatosEmpresa(String nombre) {

		DatosEmpresa data = null;

		try {
			
			ObjectInputStream archivo = null;
			File path = new File(nombre);
			
			if(path.exists()) {
				archivo = new ObjectInputStream(new FileInputStream(nombre));
				data = (DatosEmpresa)archivo.readObject();
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
		
		return data;
		
	}
	
	//Escribe en el archivo con los datos de la Empresa.
	public static boolean escribirDatosEmpresa(String nombre) {

		crearCarpetaData();
		DatosEmpresa data = Empresa.getEmpresa().getDatosEmpresa();
		try {
			ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream(nombre));
			archivo.writeObject(data);
			archivo.flush();
			archivo.close();
		}
		catch(IOException ex) {
            System.out.println("Error IO Escribir");
			return false;
		}
		
		return true;
		
	}

	//Lee el archivo con los datos de las Cabañas.
    public static ArrayList<Cabana> leerDatosCabanas(String nombre) {

		ArrayList<Cabana> lista = null;

		try {
			
			ObjectInputStream archivo = null;
			File path = new File(nombre);
			
			if(path.exists()) {
				archivo = new ObjectInputStream(new FileInputStream(nombre));
				lista = (ArrayList<Cabana>)archivo.readObject();
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
	
	//Escribe en el archivo con los datos de las Cabañas.
	public static boolean escribirDatosCabanas(String nombre) {

		crearCarpetaData();
		ManejoAreas area = ManejoAreas.getManejoAreas();
		try {
			ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream(nombre));
			archivo.writeObject(area.getListaCabanas());
			archivo.flush();
			archivo.close();
		}
		catch(IOException ex) {
            System.out.println("Error IO Escribir");
			return false;
		}
		
		return true;
		
	}

	//Lee el archivo con los datos de las Piscinas.
	public static ArrayList<Piscina> leerDatosPiscinas(String nombre) {

		ArrayList<Piscina> lista = null;

		try {
			
			ObjectInputStream archivo = null;
			File path = new File(nombre);
			
			if(path.exists()) {
				archivo = new ObjectInputStream(new FileInputStream(nombre));
				lista = (ArrayList<Piscina>)archivo.readObject();
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

	//Escribe en el archivo con los datos de las Piscinas.
	public static boolean escribirDatosPiscinas(String nombre) {

		crearCarpetaData();
		ManejoAreas area = ManejoAreas.getManejoAreas();
		try {
			ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream(nombre));
			archivo.writeObject(area.getListaPiscinas());
			archivo.flush();
			archivo.close();
		}
		catch(IOException ex) {
			System.out.println("Error IO Escribir");
			return false;
		}
		
		return true;
		
	}

	//Lee el archivo con los datos de los Restaurantes.
    public static ArrayList<Restaurante> leerDatosRestaurantes(String nombre) {

		ArrayList<Restaurante> lista = null;

		try {
			
			ObjectInputStream archivo = null;
			File path = new File(nombre);
			
			if(path.exists()) {
				archivo = new ObjectInputStream(new FileInputStream(nombre));
				lista = (ArrayList<Restaurante>)archivo.readObject();
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
	
	//Escribe en el archivo con los datos de los Restaurantes.
	public static boolean escribirDatosRestaurantes(String nombre) {

		crearCarpetaData();
		ManejoAreas area = ManejoAreas.getManejoAreas();
		try {
			ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream(nombre));
			archivo.writeObject(area.getListaRestaurantes());
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
