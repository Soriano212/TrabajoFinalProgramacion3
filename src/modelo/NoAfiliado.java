package modelo;

import java.time.*;

public class NoAfiliado extends Huesped{
    
    public NoAfiliado(String identificacion, String nombre, String apellido, LocalDate fechaNacimiento, String telefonoCelular, String direccionOrigen){//Constructor

        super(identificacion, apellido, nombre, fechaNacimiento, telefonoCelular, direccionOrigen);
        
    }

}
