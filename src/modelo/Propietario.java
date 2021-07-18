package modelo;

public class Propietario extends Persona{

	private int porcentaje;
	
	public Propietario(String identificacion, String nombre, String apellido){//constructor

		super(identificacion, apellido, nombre);

		this.porcentaje = 0;

	}

	public int getPorcentaje(){
		return porcentaje;
	}

	public boolean setPorcentaje(int porcentaje){

		if(porcentaje >= 0 && porcentaje <=100){
			this.porcentaje = porcentaje;
			return true;
		}
		else{
			return false;
		}

	}
	
}
