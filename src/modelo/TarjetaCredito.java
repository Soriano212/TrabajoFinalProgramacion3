package modelo;

import java.util.Date;

public class TarjetaCredito {

    private String bancoEmisor;
    private String numeroTarjeta;
    private Date fechaCaducidad;

    public TarjetaCredito(String ban, String num, Date fec){

        this.bancoEmisor = ban;
        this.numeroTarjeta = num;
        this.fechaCaducidad = fec;

    }

    public void setBancoEmisor(String ban){
        this.bancoEmisor = ban;
    }

    public void setNumeroTarjeta(String num){
        this.numeroTarjeta = num;
    }

    public void setFechaCaducidad(Date fec){
        this.fechaCaducidad = fec;
    }

    

}