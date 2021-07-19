package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Empresa {
    
    private static Empresa instancia = null;

    private static int porTotal = 100;
    private String nombre;
    private String direccion;
    private ArrayList<Propietario> listaPropietarios;

    public static Empresa getEmpresa(){
        if(instancia == null){
            instancia = new Empresa();
        }
        return instancia;
    }

    public void Lectura(ArrayList<Propietario> prop, DatosEmpresa data){
        if(prop != null){
            this.listaPropietarios = prop;
        }
        if(data != null){
            this.nombre = data.getNom();
            this.direccion = data.getDir();
        }
    }

    private Empresa(){
        this.listaPropietarios  = new ArrayList<Propietario>();
        this.direccion = "Playas - Ecuador";
        this.nombre = "Recreaciones CIA. LTDA.";
    }

    public boolean agregarPropietario(String iden, String nombre, String apellido){
        Propietario prop = new Propietario(iden, nombre, apellido);
        if(listaPropietarios.get(0) == null){
            prop.setPorcentaje(porTotal);
        }
        return listaPropietarios.add(prop);
    }

    public int buscar(String iden){ 

        int cont = 0;

        for(Propietario prop: listaPropietarios){
            if(prop.getIdentificacion().equals(iden)){
                return cont;
            }
            cont ++;
        }
        
        return -1;
    }

    public Propietario getPropietario(String iden){
        int pos = buscar(iden);

        if(pos != -1) return listaPropietarios.get(pos);

        return null;
    }

    public boolean eliminarPropietario(String iden){
        int pos = buscar(iden);

        if(pos != -1){
            if(listaPropietarios.get(pos).getPorcentaje() == 0){
                listaPropietarios.get(pos);
                return true;
            }
        }

        return false;
    }

    public boolean modificarPropietario(String nombre, String apellido, String iden){
        int pos = buscar(iden);
        if(pos != -1){
            listaPropietarios.get(pos).setApellido(apellido);
            listaPropietarios.get(pos).setNombre(nombre);
            return true;
        }
        return false;
    }

    public int cambiarPorcentaje(String idenReceptor, String idenEmisor, int quitar){
        int posRec = buscar(idenReceptor);
        if(posRec == -1) return 0;
    
        int posEmi = buscar(idenEmisor);
        if(posRec == -1) return 1;

        Propietario propRec = listaPropietarios.get(posRec);
        Propietario propEmi = listaPropietarios.get(posEmi);

        int porcentajeRec = propRec.getPorcentaje();
        int porcentajeEmi = propEmi.getPorcentaje();
        porcentajeEmi -= quitar;
        porcentajeRec += quitar;

        if(porcentajeEmi >= 0 && porcentajeRec <= 100){
            propRec.setPorcentaje(porcentajeRec);
            propEmi.setPorcentaje(porcentajeEmi);
            return 3;
        }

        return 2;
        
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Propietario> getListaPropietarios() {
        return this.listaPropietarios;
    }

    public String[][] getMatrizPropietarios(){

        String matriz[][] = new String[listaPropietarios.size()][3];
        int cont = 0;

        for (Propietario prop : listaPropietarios) {
            String[] datos = prop.getDatos();
            matriz[cont] = datos;
            cont ++;
        }

        return matriz;
    }

    public DatosEmpresa getDatosEmpresa(){
        return new DatosEmpresa();
    }

    public class DatosEmpresa implements Serializable {
        protected String nom;
        protected String dir;
        
        public DatosEmpresa (){
            nom = nombre;
            dir = direccion;
        }

        public String getNom(){
            return nom;
        }

        public String getDir(){
            return dir;
        }
        
    }

}
