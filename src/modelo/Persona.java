package modelo;

public class Persona {

	private String identificacion;
	private String apellido;
	private String nombre;

	public Persona(String identificacion, String apellido, String nombre) {
		this.identificacion = identificacion;
		this.apellido = apellido;
		this.nombre = nombre;
	}

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
