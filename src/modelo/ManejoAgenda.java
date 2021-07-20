package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class ManejoAgenda implements Serializable{
    
    private ArrayList<AgendaReserva> listaAgenda;

    public ManejoAgenda(){
        this.listaAgenda = new ArrayList<AgendaReserva>();
    }

    public boolean agregarDia(LocalDate fecha){ 

        AgendaReserva agen = new AgendaReserva(fecha);

        if(!listaAgenda.isEmpty()){
            int pos = 0;
            for(AgendaReserva auxA: listaAgenda){
                if(fecha.isBefore(auxA.getDia())){
                    listaAgenda.add(pos,agen);
                    return true;
                }
                pos ++;
            }
        }

        return listaAgenda.add(agen);
    }

    public int buscar(LocalDate fecha){
        int cont = 0;

        for(AgendaReserva agen: listaAgenda){
            if(fecha.isEqual(agen.getDia())){
                return cont;
            }
            cont ++;
        }
        
        return -1;
    }

    public AgendaReserva getAgenda(LocalDate fecha) {
        int pos = buscar(fecha);

        if(pos != -1){
            return listaAgenda.get(pos);
        }

        return null;
    }

}
