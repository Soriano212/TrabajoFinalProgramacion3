
package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class AgendaReserva implements Serializable{

    private ArrayList<DetalleReserva> listaDetalleReserva;
    private LocalDate fecha;

    public AgendaReserva(LocalDate fecha){
        this.fecha = fecha;
        listaDetalleReserva = new ArrayList<DetalleReserva>();
    }

    public boolean agregarReserva(LocalTime horaInicial, LocalTime horaFinal){ 

        DetalleReserva reser = new DetalleReserva(horaInicial, horaFinal);

        if(entreHoras(horaInicial) && entreHoras(horaFinal)){
            return false;
        }

        if(!listaDetalleReserva.isEmpty()){
            int pos = 0;
            for(DetalleReserva auxR: listaDetalleReserva){
                if(reser.getHoraFinal().isBefore(auxR.getHoraInicial())){
                    listaDetalleReserva.add(pos,reser);
                    return true;
                }
                pos ++;
            }
        }

        return listaDetalleReserva.add(reser);
    }

    public int buscar(LocalTime horaInicial){
        int cont = 0;

        for(DetalleReserva reser: listaDetalleReserva){
            if(reser.getHoraInicial().getMinute() == horaInicial.getMinute() && reser.getHoraInicial().getHour() == horaInicial.getHour()){
                return cont;
            }
            cont ++;
        }
        
        return -1;
    }
    
    public boolean eliminarReserva(LocalTime horaInicial){
        int pos = buscar(horaInicial);

        if(pos != -1){
            listaDetalleReserva.remove(pos);
            return true;
        }
        
        return false;
    }

    public boolean entreHoras(LocalTime hora){
        
        for(DetalleReserva reser: listaDetalleReserva){
            if(reser.entreHoras(hora)){
                return true;
            }
        }

        return false;
        
    }

    public LocalDate getDia() {
        return this.fecha;
    }


}