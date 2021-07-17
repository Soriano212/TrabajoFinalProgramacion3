package modelo;

import java.util.Date;

public class NoAfiliado extends Huesped{
    
    public NoAfiliado(String identificacion, String nombre, String apellido, Date fechaNacimiento,
    String telefonoCelular, String direccionOrigen){

		super(identificacion, apellido, nombre, fechaNacimiento, telefonoCelular, direccionOrigen);
        
    }

}
