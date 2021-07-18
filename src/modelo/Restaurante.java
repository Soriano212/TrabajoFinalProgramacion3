package modelo;

import java.util.ArrayList;

public class Restaurante extends Area{
    
    private ArrayList<Mesa> listaMesas;

    public Restaurante(ArrayList<Mesa> listaMesas, String nombre) {
        super(nombre, 0);
        this.listaMesas = new ArrayList<Mesa>();
    }

    public boolean agregarMesa(int capacidad, boolean ocupada){
        int id = 0;

        if(listaMesas.get(0) == null){
            id = 1;
        }
        else{
            id = listaMesas.get(listaMesas.size()-1).getIdMesa();
            id ++;
        }

        Mesa mesa = new Mesa(capacidad, id, ocupada);
        boolean val = listaMesas.add(mesa);
        if(val) actualizarCapacidad();

        return val;
    }

    public boolean eliminarMesa(int id){
        if(id > 0 && id < listaMesas.size()){
            listaMesas.remove(id-1);
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

}
