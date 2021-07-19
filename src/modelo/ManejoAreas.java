package modelo;

import java.util.ArrayList;

public class ManejoAreas {
    
    private static ManejoAreas instancia = null;

    public enum selec {Piscina, Restaurante, Cabana};
    private ArrayList<Restaurante> listaRestaurantes;
    private ArrayList<Piscina> listaPiscinas;
    private ArrayList<Cabana> listaCabanas;

    public static ManejoAreas getManejoAreas(){
        if(instancia == null){
            instancia = new ManejoAreas();
        }
        return instancia;
    }

    public void lectura(ArrayList<Restaurante> res, ArrayList<Piscina> pisc, ArrayList<Cabana> cab){
        if(res != null){
            this.listaRestaurantes = res;
        }
        if(pisc != null){
            this.listaPiscinas = pisc;
        }
        if(cab != null){
            this.listaCabanas = cab;
        }
    }

    private ManejoAreas(){
        this.listaRestaurantes = new ArrayList<Restaurante>();
        this.listaPiscinas = new ArrayList<Piscina>();
        this.listaCabanas = new ArrayList<Cabana>();
    }

    //Manejo de Restaurantes

    public boolean agregarRestaurante(String nombre){
        Restaurante res = new Restaurante(nombre);
        return listaRestaurantes.add(res);
    }

    public int buscarRestaurante(String nombre){ 

        int cont = 0;

        for(Restaurante res: listaRestaurantes){
            if(res.getNombre().equals(nombre)){
                return cont;
            }
            cont ++;
        }
        
        return -1;
    }

    public Restaurante getRestaurante(String nombre){
        int pos = buscarRestaurante(nombre);

        if(pos != -1) return listaRestaurantes.get(pos);

        return null;
    }

    public boolean modificarRestaurante(String nombre){
        Restaurante res = getRestaurante(nombre);
        if(res != null){
            res.setNombre(nombre);
            return true;
        }

        return false;
    }

    public boolean eliminarRestaurante(String nombre){
        int pos = buscarRestaurante(nombre);

        if(pos != -1){
            listaRestaurantes.remove(pos);
            return true;
        }

        return false;
    }

    //Manejo de Piscinas

    public boolean agregarPiscina(String nombre, int capacidad, String tipo){
        Piscina pisc = new Piscina(tipo, nombre, capacidad);
        return listaPiscinas.add(pisc);
    }

    public int buscarPiscina(String nombre){ 

        int cont = 0;

        for(Piscina pisc: listaPiscinas){
            if(pisc.getNombre().equals(nombre)){
                return cont;
            }
            cont ++;
        }
        
        return -1;
    }

    public Piscina getPiscina(String nombre){
        int pos = buscarPiscina(nombre);

        if(pos != -1) return listaPiscinas.get(pos);

        return null;
    }

    public boolean modificarPiscina(String nombre, int capacidad, String tipo){
        Piscina pisc = getPiscina(nombre);
        if(pisc != null){
            pisc.setNombre(nombre);
            pisc.setCapacidad(capacidad);
            pisc.setTipo(tipo);
            return true;
        }

        return false;
    }

    public boolean eliminarPiscina(String nombre){
        int pos = buscarPiscina(nombre);

        if(pos != -1){
            listaPiscinas.remove(pos);
            return true;
        }

        return false;
    }

    //Manejo de Cabañas

    public boolean agregarCabana(String tipo, String ubicacion, int capacidad, String nombre){
        Cabana cab = new Cabana(tipo, ubicacion, capacidad, nombre);
        return listaCabanas.add(cab);
    }

    public int buscarCabana(String nombre){ 

        int cont = 0;

        for(Cabana cab: listaCabanas){
            if(cab.getNombre().equals(nombre)){
                return cont;
            }
            cont ++;
        }
        
        return -1;
    }

    public Cabana getCabana(String nombre){
        int pos = buscarCabana(nombre);

        if(pos != -1) return listaCabanas.get(pos);

        return null;
    }

    public boolean modificarCabana(String tipo, String ubicacion, int capacidad, String nombre){
        Cabana cab = getCabana(nombre);
        if(cab != null){
            cab.setNombre(nombre);
            cab.setCapacidad(capacidad);
            cab.setTipo(tipo);
            cab.getCapacidad();
            return true;
        }

        return false;
    }

    public boolean eliminarCabana(String nombre){
        int pos = buscarCabana(nombre);

        if(pos != -1){
            listaCabanas.remove(pos);
            return true;
        }

        return false;
    }

    //Obtener Datos

    public String[][] getMatrizPropietarios(selec tipo){
        String matriz[][] =  new String[0][0];

        switch(tipo){
        case Cabana: {
            matriz = new String[listaCabanas.size()][3];
            int cont = 0;
            for (Area area : listaCabanas) {
                String[] datos = area.getDatos();
                matriz[cont] = datos;
                cont ++;
            }
        } break;
        case Piscina: {
            matriz = new String[listaCabanas.size()][3];
            int cont = 0;
            for (Area area : listaCabanas) {
                String[] datos = area.getDatos();
                matriz[cont] = datos;
                cont ++;
            }
        } break;
        case Restaurante: {
            matriz = new String[listaCabanas.size()][3];
            int cont = 0;
            for (Area area : listaCabanas) {
                String[] datos = area.getDatos();
                matriz[cont] = datos;
                cont ++;
            }
        } break;
        }

        return matriz;
    }

    public ArrayList<Restaurante> getListaRestaurantes() {
        return this.listaRestaurantes;
    }

    public ArrayList<Piscina> getListaPiscinas() {
        return this.listaPiscinas;
    }

    public ArrayList<Cabana> getListaCabanas() {
        return this.listaCabanas;
    }


}
