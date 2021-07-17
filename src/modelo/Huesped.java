package modelo;

import java.util.Date;

public class Huesped extends Persona {

	private String profesion;
	private Date fechaNacimiento;
	private String telefonoCelular;
	private String telefonoFijo;
	private String direccionOrigen;
	private TarjetaCredito tarjeta;

	public Huesped(String identificacion, String apellido, String nombre, Date fechaNacimiento,
			String telefonoCelular, String direccionOrigen) {

		super(identificacion, apellido, nombre);

		this.fechaNacimiento = fechaNacimiento;
		this.telefonoCelular = telefonoCelular;
		this.direccionOrigen = direccionOrigen;
		this.tarjeta = new TarjetaCredito();

	}

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

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefonoCelular() {
		return telefonoCelular;
	}

	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}

	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public String getDireccionOrigen() {
		return direccionOrigen;
	}

	public void setDireccionOrigen(String direccionOrigen) {
		this.direccionOrigen = direccionOrigen;
	}

	public String[] getDatos(){

		String vector[] = new String[3];
		vector[0] = this.getIdentificacion();
		vector[1] = this.getNombre();
		vector[2] = this.getApellido();

		return vector;

	}

	public void setTarjeta(String ban, String num, Date fecha){

		tarjeta.setBancoEmisor(ban);
		tarjeta.setFechaCaducidad(fecha);
		tarjeta.setNumeroTarjeta(num);
		
	}

}
