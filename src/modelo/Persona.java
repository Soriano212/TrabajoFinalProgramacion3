package modelo;

import java.io.Serializable;

public class Persona implements Serializable{

	private String identificacion;//variables
	private String apellido;
	private String nombre;

	public Persona(String identificacion, String apellido, String nombre) {//Constructor
		this.identificacion = identificacion.toUpperCase();
		this.apellido = apellido;
		this.nombre = nombre;
	}

	//Validacion de cedula
	public static boolean Validacion(String iden, boolean tipoCed) {

		int largo = iden.length();

		if (tipoCed && largo == 10) {

			int sumCed = 0;
			int ultCed = 0;
			for (int i = 0; i <= 8; i++) {
				if (((i + 1) % 2) != 0) {
					ultCed = 2 * Character.getNumericValue(iden.charAt(i));
				} else {
					ultCed = Character.getNumericValue(iden.charAt(i));
				}
				if (ultCed >= 10) {
					ultCed -= 9;
				}
				sumCed = sumCed + ultCed;
			}

			for (int i = 1; i <= 9; i++) {
				ultCed = i * 10;
				if ((ultCed - sumCed) >= 0) {
					ultCed = ultCed - sumCed;
					break;
				}
			}

			if (ultCed == Character.getNumericValue(iden.charAt(9))) {
				return true;
			} else {
				return false;
			}

		} else if (!tipoCed && largo >= 8 && largo <= 12) {
			return true;
		}

		return false;

	}

	//getters y setters
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}
	
	
}
