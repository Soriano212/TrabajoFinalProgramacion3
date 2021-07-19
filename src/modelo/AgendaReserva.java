
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class AgendaReserva implements Serializable{



    private static Reserva instancia = null;

    private String dia;
    private String mes;
    private String anio;

   


    public static AgendaReserva getReserva(){
        if(instancia == null){

            instancia = new Reserva();

        }
        return instancia;
    }
    public AgendaReserva( LocalDate fechaNacimiento, ) {//Constructor

		super(identificacion, apellido, nombre);

		this.dia = fechaNacimiento;
		this.mes = telefonoCelular;
		this.anio = direccionOrigen;
		this.tarjeta = new TarjetaCredito();

	}
   
     public void setDia(String dia,String mes,String anio,) {
        this.dia = dia;
    }

    public String getDia() {
        return this.dia;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return this.mes;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getAnio() {
        return this.anio;
    }

}