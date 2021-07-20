package modelo;

import java.io.Serializable;
import java.time.*;

public class DetalleReserva implements Serializable{

    private LocalTime horaInicial;
    private LocalTime horaFinal;

    public DetalleReserva(LocalTime horaInicial, LocalTime horaFinal){//Constructor

        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;

    }
    public DetalleReserva(){//Constructor vacio
    }

    //getters y setters

    public void setHoraInicial(String hora){
        this.horaInicial = LocalTime.parse(hora);
    }

    public void setHoraInicial(LocalTime hora){
        this.horaInicial = hora;
    }

    public LocalTime getHoraInicial() {
        return this.horaInicial;
    }

    public void setHoraFinal(String hora){
        this.horaFinal = LocalTime.parse(hora);
    }

    public void setHoraFinal(LocalTime hora){
        this.horaFinal = hora;
    }

    public LocalTime getHoraFinal() {
        return this.horaFinal;
    }

    public boolean entreHoras(LocalTime hora){
        
        if(horaInicial.isAfter(hora) && horaFinal.isBefore(hora)){
            return true;
        }
        else{
            return false;
        }

    }

    public String[] getDatos(){

		String vector[] = new String[2];
		vector[0] = this.horaInicial.toString();
		vector[1] = this.horaFinal.toString();

		return vector;

	}

}