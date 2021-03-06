package modelo;

import java.util.*;
import java.io.Serializable;
import java.time.*;

public class ManejoHuespedes implements Serializable{
    
    private static ManejoHuespedes instancia = null;
    private ArrayList<Afiliado> listaAfiliados;
    private ArrayList<NoAfiliado> listaNoAfiliados;
    
    public static ManejoHuespedes getListas(){
        if(instancia == null){
            instancia = new ManejoHuespedes();
        }
        return instancia;
    }

    public void lectura(ArrayList<Afiliado> afil, ArrayList<NoAfiliado> noafil){
        if(afil != null){
            this.listaAfiliados = afil;
        }
        if(noafil != null){
            this.listaNoAfiliados = noafil;
        }
    }

    private ManejoHuespedes(){
        this.listaAfiliados  = new ArrayList<Afiliado>();
        this.listaNoAfiliados  = new ArrayList<NoAfiliado>();
    }
    
    //Agrega a la lista segun afil si es afiliado o no afiliado
    public void addValor(String identificacion, String nombre, String apellido, LocalDate fechaNacimiento, String telefonoCelular, 
    String telefonoFijo, String direccionOrigen, String profesion, String banco, String numeroTarjeta, LocalDate fechaCaducidad,
    boolean afil, LocalDate fechaAfiliacion){

        if(afil){
            Afiliado clienteA = new Afiliado(identificacion, nombre, apellido, fechaNacimiento, telefonoCelular, direccionOrigen, fechaAfiliacion);
            clienteA.setProfesion(profesion);
            clienteA.setTelefonoFijo(telefonoFijo);
            clienteA.setTarjeta(banco, numeroTarjeta, fechaCaducidad);

            listaAfiliados.add(clienteA);
        }
        else{
            NoAfiliado clienteB = new NoAfiliado(identificacion, nombre, apellido, fechaNacimiento, telefonoCelular, direccionOrigen);
            clienteB.setProfesion(profesion);
            clienteB.setTelefonoFijo(telefonoFijo);
            clienteB.setTarjeta(banco, numeroTarjeta, fechaCaducidad);

            listaNoAfiliados.add(clienteB);
        }

    }

    //Busca en la lista segun afil si es afiliado o no afiliado
    public int buscar(boolean afil, String iden){ 

        int cont = 0;

        if(afil){
            for(Afiliado cliente: listaAfiliados){
                if(cliente.getIdentificacion().equals(iden)){
                    return cont;
                }
                cont ++;
            }
        }
        else{
            for(NoAfiliado cliente: listaNoAfiliados){
                if(cliente.getIdentificacion().equals(iden)){
                    return cont;
                }
                cont ++;
            }
        }
        
        return -1;
    }

    public Huesped getHuesped(String iden){//

        int pos;

        pos = buscar(true, iden);
        if(pos != -1) return listaAfiliados.get(pos);

        pos = buscar(false, iden);
        if(pos != -1) return listaNoAfiliados.get(pos);
        
        return null;

    }

    public String[][] getMatrizAfiliados(){//Obtiene datos en una matrix de los afiliados

        String matriz[][] = new String[listaAfiliados.size()][3];
        int cont = 0;

        for (Afiliado cliente : listaAfiliados) {
            String[] datos = cliente.getDatos();
            matriz[cont] = datos;
            cont ++;
        }

        return matriz;
    }

    public String[][] getMatrizNoAfiliados(){//Obtiene datos en una matrix de los no afiliados

        String matriz[][] = new String[listaNoAfiliados.size()][3];
        int cont = 0;

        for (NoAfiliado cliente : listaNoAfiliados) {
            String[] datos = cliente.getDatos();
            matriz[cont] = datos;
            cont ++;
        }

        return matriz;
    }

    public boolean eliminarHuesped(boolean afil, String iden){//Elimina en la lista segun afil si es afiliado o no afiliado

        int pos = buscar(afil, iden);
        if(pos != -1){
            if(afil) listaAfiliados.remove(pos);
            if(!afil) listaNoAfiliados.remove(pos);
            return true;
        }
        return false;
    }

    public boolean modificarHuesped(String identificacion, String nombre, String apellido, LocalDate fechaNacimiento, String telefonoCelular, 
    String telefonoFijo, String direccionOrigen, String profesion, String banco, String numeroTarjeta, LocalDate fechaCaducidad, boolean afil){

        int pos = buscar(afil, identificacion);

        if(pos != -1){

            Huesped cliente;
            if(afil){
                cliente = listaAfiliados.get(pos);
            }else{
                cliente = listaNoAfiliados.get(pos);
            }
            cliente.setApellido(apellido);
            cliente.setNombre(nombre);
            cliente.setDireccionOrigen(direccionOrigen);
            cliente.setFechaNacimiento(fechaNacimiento);
            cliente.setTelefonoCelular(telefonoCelular);
            cliente.setTelefonoFijo(telefonoFijo);
            cliente.setTarjeta(banco, numeroTarjeta, fechaCaducidad);
            cliente.setProfesion(profesion);

            return true;
        }
        return false;

    }

    public boolean moverHuespedLista(String iden, boolean afil){
        int pos = buscar(afil, iden);
        Huesped cliente;
        if(pos != -1){

            if(afil){
                cliente = listaAfiliados.get(pos);
            }
            else{
                cliente = listaNoAfiliados.get(pos);
            }

            String nom = cliente.getNombre();
            String ape = cliente.getApellido();
            String prof = cliente.getProfesion();
            String cell = cliente.getTelefonoCelular();
            String fijo = cliente.getTelefonoFijo();
            String dir = cliente.getDireccionOrigen();
            String banco = cliente.getTarjeta().getBancoEmisor();
            String numtar = cliente.getTarjeta().getNumeroTarjeta();
            LocalDate fecNac = cliente.getFechaNacimiento();
            LocalDate fecCad = cliente.getTarjeta().getFechaCaducidad();

            addValor(iden, nom, ape, fecNac, cell, fijo, dir, prof, banco, numtar, fecCad, !afil, null);
            eliminarHuesped(afil, iden);

            return true;
        }

        return true;
    }

    public boolean modificarAfiliacion(LocalDate fecha, String iden){
        int pos = buscar(true, iden);

        if(pos != -1){
            listaAfiliados.get(pos).setFechaAfiliacion(fecha);
            return true;
        }
        return false;
    }

    public LocalDate obtenerAfiliacion(String iden){
        int pos = buscar(true, iden);

        if(pos != -1){
            return listaAfiliados.get(pos).getFechaAfiliacion();
        }
        return null;
    }

    public ArrayList<Afiliado> getListaAfiliados() {
        return this.listaAfiliados;
    }

    public ArrayList<NoAfiliado> getListaNoAfiliados() {
        return this.listaNoAfiliados;
    }
    

}