package modelo;

import java.util.Date;

public class Afiliado extends Huesped{

    private Date fechaAfiliacion;
    private double descuento;
    private boolean usoBonoAfiliado;

    
    public Afiliado(String identificacion, String nombre, String apellido, Date fechaNacimiento,
    String telefonoCelular, String direccionOrigen, Date fechaAfiliacion){

		super(identificacion, apellido, nombre, fechaNacimiento, telefonoCelular, direccionOrigen);

        this.fechaAfiliacion = fechaAfiliacion;
        this.usoBonoAfiliado = false;
        this.descuento = 0;

    }

    

}
