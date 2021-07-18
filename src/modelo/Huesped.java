package modelo;

import java.time.LocalDate;

public class Huesped extends Persona{

	private String profesion;
	private LocalDate fechaNacimiento;
	private String telefonoCelular;
	private String telefonoFijo;
	private String direccionOrigen;
	private TarjetaCredito tarjeta;

	public Huesped(String identificacion, String apellido, String nombre, LocalDate fechaNacimiento, String telefonoCelular, String direccionOrigen) {//Constructor

		super(identificacion, apellido, nombre);

		this.fechaNacimiento = fechaNacimiento;
		this.telefonoCelular = telefonoCelular;
		this.direccionOrigen = direccionOrigen;
		this.tarjeta = new TarjetaCredito();

	}

//getters y setters
	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
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

	public void setTarjeta(String ban, String num, LocalDate fecha){

		tarjeta.setBancoEmisor(ban);
		tarjeta.setFechaCaducidad(fecha);
		tarjeta.setNumeroTarjeta(num);

	}

	public TarjetaCredito getTarjeta() {
		return this.tarjeta;
	}


}
