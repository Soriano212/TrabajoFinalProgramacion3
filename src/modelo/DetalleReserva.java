package modelo;

import java.io.Serializable;
import java.time.*;

public class DetalleReserva implements Serializable{



    private LocalDate horaInicial;
    private LocalDate horaFinal;

    public DetalleReserva(LocalDate horaInicial,LocalDate horaFinal){//Constructor

        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;

    }
    public DetalleReserva(){//Constructor vacio

    }

    //getters y setters
    public void setHoraInicial(LocalDate fec){
        this.horaInicial = fec;
    }

    public LocalDate getHoraInicial() {
        return this.horaInicial;
    }

    public void setHoraFinal(LocalDate fec){
        this.horaFinal = fec;
    }

    public LocalDate getHoraFinal() {
        return this.horaFinal;
    }






}