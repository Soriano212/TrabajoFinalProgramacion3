
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class AgendaReserva implements Serializable{

    private LocalDate fecha;

   
    public AgendaReserva(LocalDate fecha) {//Constructor

		

		this.fecha = fecha;
		this.detalle = new DetalleReserva();

	}


    public void setDetalle(LocalTime ini, LocalTime fin){

		detalle.horaInicial(ini);
		detalle.horaFinal(fin);

	}
    public DetalleReserva getDetalle() {
		return this.detalle;
	}


     public void setDia(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getDia() {
        return this.fecha;
    }


}