package modelo;

import java.io.Serializable;

public class Mesa implements Serializable{
    
    private int capacidad;
    private int idMesa;
    private boolean ocupada;
    private ManejoAgenda manejoAgenda;

    public Mesa(int capacidad, int idMesa, boolean ocupada) {
        this.capacidad = capacidad;
        this.idMesa = idMesa;
        this.ocupada = ocupada;
        this.manejoAgenda = new ManejoAgenda();
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

    public String[] getDatos(){

		String vector[] = new String[2];
		vector[0] = this.getIdMesa() + "";
		vector[1] = this.getCapacidad() + "";

		return vector;

	}

    public ManejoAgenda getManejoAgenda() {
        return this.manejoAgenda;
    }

}
