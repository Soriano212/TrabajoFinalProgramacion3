package modelo;

import java.io.Serializable;

public class Servicio implements Serializable{

    private String nombre;
    private int capacidad;
    private int enUso;
    private boolean disponible;
    private ManejoAgenda manejoAgenda;

    public Servicio(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.disponible = true;
        this.enUso = 0;
        manejoAgenda = new ManejoAgenda();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public boolean setCapacidad(int capacidad) {
        if(capacidad >=0 && capacidad>getEnUso()){
            this.capacidad = capacidad;
            return true;
        }
        return false;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public int getEnUso() {
        return this.enUso;
    }

    public boolean setEnUso(int enUso) {
        if(enUso >=0 && enUso<=getCapacidad()){
            this.enUso = enUso;
            return true;
        }
        return false;
    }

    public int getRestantes(){
        return getCapacidad() - getEnUso();
    }

    public String[] getDatos(){

		String vector[] = new String[3];
		vector[0] = this.getNombre();
		vector[1] = this.getCapacidad() + "";
        if(getDisponible()) vector[2] = "Si";
        if(!getDisponible()) vector[2] = "No";

		return vector;

	}

    public ManejoAgenda getManejoAgenda() {
        return this.manejoAgenda;
    }

}