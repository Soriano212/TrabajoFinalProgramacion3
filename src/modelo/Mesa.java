package modelo;

import java.io.Serializable;

public class Mesa implements Serializable{
    
    private int capacidad;
    private int idMesa;
    private boolean ocupada;

    public Mesa(int capacidad, int idMesa, boolean ocupada) {
        this.capacidad = capacidad;
        this.idMesa = idMesa;
        this.ocupada = ocupada;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getIdMesa() {
        return this.idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public boolean isOcupada() {
        return this.ocupada;
    }

    public boolean getOcupada() {
        return this.ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

}
