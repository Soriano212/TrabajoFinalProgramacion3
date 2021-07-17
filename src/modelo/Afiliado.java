package modelo;

import java.time.*;

public class Afiliado extends Huesped{

    private LocalDate fechaAfiliacion;
    private double descuento;
    private boolean usoBonoAfiliado;

    //constructor
    public Afiliado(String identificacion, String nombre, String apellido, LocalDate fechaNacimiento, String telefonoCelular, String direccionOrigen, LocalDate fechaAfiliacion){

		super(identificacion, apellido, nombre, fechaNacimiento, telefonoCelular, direccionOrigen);

        this.fechaAfiliacion = fechaAfiliacion;
        this.usoBonoAfiliado = false;
        this.descuento = 0;

    }


    public LocalDate getFechaAfiliacion() {
        return this.fechaAfiliacion;
    }

    public void setFechaAfiliacion(LocalDate fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public double getDescuento() {
        return this.descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public boolean isUsoBonoAfiliado() {
        return this.usoBonoAfiliado;
    }

    public boolean getUsoBonoAfiliado() {
        return this.usoBonoAfiliado;
    }

    public void setUsoBonoAfiliado(boolean usoBonoAfiliado) {
        this.usoBonoAfiliado = usoBonoAfiliado;
    }
    

}
