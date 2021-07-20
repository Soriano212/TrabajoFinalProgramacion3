package modelo;

import java.util.ArrayList;

public class ManejoServicios {

    private static ManejoServicios instancia = null;

    public static int TIPO_TOALLA = 0;
    public static int TIPO_SPA = 1;
    public static int TIPO_PARASOL = 2;
    public static int TIPO_TRASLADO = 3;

    private ArrayList<Servicio> listaToallas;
    private ArrayList<Servicio> listaSpas;
    private ArrayList<Servicio> listaParasoles;
    private ArrayList<Servicio> listaTraslados;

    public static ManejoServicios getManejoServicios(){
        if(instancia == null){
            instancia = new ManejoServicios();
        }
        return instancia;
    }

    public void lectura(ArrayList<Servicio> toa, ArrayList<Servicio> spa, ArrayList<Servicio> para, ArrayList<Servicio> tras){
        if(toa != null){
            this.listaToallas = toa;
        }
        if(spa != null){
            this.listaSpas = spa;
        }
        if(para != null){
            this.listaParasoles = para;
        }
        if(tras != null){
            this.listaTraslados = tras;
        }
    }

    private ManejoServicios(){
        this.listaToallas = new ArrayList<Servicio>();
        this.listaSpas = new ArrayList<Servicio>();
        this.listaParasoles = new ArrayList<Servicio>();
        this.listaTraslados = new ArrayList<Servicio>();
    }



}