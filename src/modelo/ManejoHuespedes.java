package modelo;

import java.util.*;

public class ManejoHuespedes {
    
    private static ManejoHuespedes instancia = null;
    private ArrayList<Afiliado> listaAfiliados;
    private ArrayList<NoAfiliado> listaNoAfiliados;
    
    public static ManejoHuespedes getListas(){
        if(instancia == null){
            instancia = new ManejoHuespedes();
        }
        return instancia;
    }

    private ManejoHuespedes(){
        this.listaAfiliados  = new ArrayList<Afiliado>();
        this.listaNoAfiliados  = new ArrayList<NoAfiliado>();
    }
    
    //Agrega a la lista segun afil si es afiliado o no afiliado
    public void addValor(String identificacion, String nombre, String apellido, Date fechaNacimiento,
    String telefonoCelular, String direccionOrigen, Date fechaAfiliacion, boolean afil){

        if(afil){
            Afiliado clienteA = new Afiliado(identificacion, nombre, apellido, fechaNacimiento, telefonoCelular, direccionOrigen, fechaAfiliacion);
            listaAfiliados.add(clienteA);
        }
        else{
            NoAfiliado clienteB = new NoAfiliado(identificacion, nombre, apellido, fechaNacimiento, telefonoCelular, direccionOrigen);
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



}
