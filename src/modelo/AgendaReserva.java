
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class AgendaReserva implements Serializable{





    private ArrayList<DetalleReserva> listaDetalleReserva;

    public DetalleReserva( LocalTime nombre) {
        super(nombre, 0);
        this.listaDetalleReserva = new ArrayList<DetalleReserva>();
    }

    public boolean agregarMesa(int capacidad){
        int id = 0;

        if(listaMesas.isEmpty()){
            id = 1;
        }
        else{
            id = listaMesas.get(listaMesas.size()-1).getIdMesa();
            id ++;
        }

        Mesa mesa = new Mesa(capacidad, id, false);
        boolean val = listaMesas.add(mesa);
        if(val) actualizarCapacidad();

        return val;
    }

    public boolean eliminarMesa(int id){
        if(id > 0 && id < listaMesas.size()){
            listaMesas.remove(id-1);
            actualizarIDs();
            actualizarCapacidad();
            return true;
        }
        else return false;
    }

    public boolean modificarMesa(int capacidad, int id){
        if(id > 0 && id < listaMesas.size()){
            listaMesas.get(id-1).setCapacidad(capacidad);
            actualizarIDs();
            actualizarCapacidad();
            return true;
        }
        else return false;
    }

    public Mesa getMesa(int id){
        if(id > 0 && id <= listaMesas.size()){
            return listaMesas.get(id-1);
        }
        else return null;
    }

    public void actualizarCapacidad(){
        this.setCapacidad(listaMesas.size());
    }

    public void actualizarIDs(){
        int i = 1;
        for(Mesa mesa: listaMesas){
            mesa.setIdMesa(i);
            i ++;
        }
    }

    public String[][] getMatrizDatos(){
        String matriz[][] = new String[listaMesas.size()][2];

        int cont = 0;
        for (Mesa mesa : listaMesas) {
            String[] datos = mesa.getDatos();
            matriz[cont] = datos;
            cont ++;
        }

        return matriz;
    }
































    private LocalDate fecha;

   
    public AgendaReserva(LocalDate fecha) {//Constructor

		

		this.fecha = fecha;
		this.detalle = new DetalleReserva();

	}


    public void setDetalle(LocalTime ini, LocalTime fin){

		detalle.horaInicial(ini);
		detalle.horaFinal(fin);

	}
    public DetalleReserva getDetalle() {
		return this.detalle;
	}


     public void setDia(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getDia() {
        return this.fecha;
    }


}