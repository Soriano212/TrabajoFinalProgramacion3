package modelo;

public class Piscina extends Area{
    
    public static enum tipoPiscina {A,B};
    private tipoPiscina tipo;

    public Piscina(String tipo, String nombre, int capacidad) {
        super(nombre, capacidad);
        this.tipo =  tipoPiscina.A;
        setTipo(tipo);
    }

    public String getTipo() {
        return this.tipo + "";
    }

    public void setTipo(String tipo) {
        if(tipo.equalsIgnoreCase(tipoPiscina.A+"")) this.tipo = tipoPiscina.A;
        if(tipo.equalsIgnoreCase(tipoPiscina.B+"")) this.tipo = tipoPiscina.B;
    }

}
