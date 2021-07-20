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
    public void setHoraInicial(LocalTime fec){
        this.horaInicial = fec;
    }

    public LocalTime getHoraInicial() {
        return this.horaInicial;
    }

    public void setHoraFinal(LocalTime fec){
        this.horaFinal = fec;
    }

    public LocalTime getHoraFinal() {
        return this.horaFinal;
    }


}