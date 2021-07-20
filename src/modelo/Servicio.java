package modelo;

import java.io.Serializable;

public class Servicio implements Serializable{

    private int id;
    private int capacidad;
    private boolean disponible;
    private ManejoAgenda manejoAgenda;

    public Servicio(int capacidad, int id) {
        this.id = id;
        this.capacidad = capacidad;
        this.disponible = false;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public String[] getDatos(){

		String vector[] = new String[2];
		vector[0] = this.getId() + "";
		vector[1] = this.getCapacidad() + "";

		return vector;

	}

    public ManejoAgenda getManejoAgenda() {
        return this.manejoAgenda;
    }

}