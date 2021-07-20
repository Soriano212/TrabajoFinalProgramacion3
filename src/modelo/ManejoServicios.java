package modelo;

import java.io.Serializable;

public class ManejoServicios implements Serializable{

    private static ManejoServicios instancia = null;

    public static int TIPO_TOALLA = 0;
    public static int TIPO_SPA = 1;
    public static int TIPO_PARASOL = 2;
    public static int TIPO_TRASLADO = 3;

    private Servicio toallas;
    private Servicio spas;
    private Servicio parasoles;
    private Servicio traslados;

    public static ManejoServicios getManejoServicios(){
        if(instancia == null){
            instancia = new ManejoServicios();
        }
        return instancia;
    }

    public void lectura(DatosServicios data){
        if(data != null){
            this.toallas = data.toa;
            this.spas = data.spa;
            this.parasoles = data.par;
            this.traslados = data.tras;
        }
    }

    private ManejoServicios(){
        this.toallas = new Servicio("Toallas", 0);
        this.spas = new Servicio("Spas", 0);
        this.parasoles = new Servicio("Parasoles", 0);
        this.traslados = new Servicio("Traslados", 0);
    }

    public Servicio getServicio(int tipo){

        switch(tipo){
            case 0: return toallas;
            case 1: return spas;
            case 2: return parasoles;
            case 3: return traslados;
            default: return null;
        }

    }

    public String[][] getMatrizDatos(){

        String matriz[][] = new String[4][3];

        matriz[0] = toallas.getDatos();
        matriz[1] = spas.getDatos();
        matriz[2] = parasoles.getDatos();
        matriz[3] = traslados.getDatos();

        return matriz;
    }

    public DatosServicios getDatos(){
        return new DatosServicios();
    }

    // Clase para empaquetado

    public class DatosServicios implements Serializable{
        Servicio toa, spa, par, tras;

        private DatosServicios(){
            toa = toallas;
            spa = spas;
            par = parasoles;
            tras = traslados;
        }
    }
}