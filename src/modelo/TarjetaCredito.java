package modelo;

import java.io.Serializable;
import java.time.*;

public class TarjetaCredito implements Serializable{

    private String bancoEmisor;
    private String numeroTarjeta;
    private LocalDate fechaCaducidad;

    public TarjetaCredito(String ban, String num, LocalDate fec){//Constructor

        this.bancoEmisor = ban;
        this.numeroTarjeta = num;
        this.fechaCaducidad = fec;

    }
    public TarjetaCredito(){//Constructor vacio

    }

    //getters y setters
    public void setBancoEmisor(String ban){
        this.bancoEmisor = ban;
    }

    public void setNumeroTarjeta(String num){
        this.numeroTarjeta = num;
    }

    public void setFechaCaducidad(LocalDate fec){
        this.fechaCaducidad = fec;
    }
    
    public String getBancoEmisor() {
        return this.bancoEmisor;
    }

    public String getNumeroTarjeta() {
        return this.numeroTarjeta;
    }

    public LocalDate getFechaCaducidad() {
        return this.fechaCaducidad;
    }

}