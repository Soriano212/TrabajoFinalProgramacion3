package modelo;

import java.io.Serializable;

public class Area implements Serializable{

    private String nombre;
    private int capacidad;

    public Area(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
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

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public String[] getDatos(){

		String vector[] = new String[2];
		vector[0] = this.getNombre();
		vector[1] = this.getCapacidad() + "";

		return vector;

	}
    
}
