package modelo;

public class Propietario extends Persona{

	private double porcentaje;
	
	public Propietario(String identificacion, String nombre, String apellido, double porcentaje){

		super(identificacion, apellido, nombre);

		if(porcentaje >= 0 && porcentaje <=1){
			this.porcentaje = porcentaje;
		}
		else{
			this.porcentaje = 0;
		}

	}

	public double getPorcentaje(){
		return porcentaje;
	}

	public boolean setPorcentaje(double porcentaje){

		if(porcentaje >= 0 && porcentaje <=1){
			this.porcentaje = porcentaje;
			return true;
		}
		else{
			return false;
		}

	}
	
}
