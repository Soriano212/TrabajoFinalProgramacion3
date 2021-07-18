package modelo;

public class Cabana extends Area{
    
    public static enum tipoCabana {Piscina, Playa};
    private tipoCabana tipo;
    private String ubicacion;
    private boolean disponible;

    public Cabana(String tipo, String ubicacion, boolean disponible, int capacidad, String nombre) {
        super(nombre, capacidad);
        this.tipo = tipoCabana.Piscina;
        setTipo(tipo);
        this.ubicacion = ubicacion;
        this.disponible = disponible;
    }

    public String getTipo() {
        return this.tipo + "";
    }

    public void setTipo(String tipo) {
        if(tipo.equalsIgnoreCase(tipoCabana.Playa+"")) this.tipo = tipoCabana.Playa;
        if(tipo.equalsIgnoreCase(tipoCabana.Piscina+"")) this.tipo = tipoCabana.Piscina;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
