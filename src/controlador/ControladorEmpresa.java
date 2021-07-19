package controlador;

import javax.swing.table.DefaultTableModel;

import modelo.Empresa;
import vista.VistaEmpresa;

public class ControladorEmpresa extends AdaptadorListener{
    
    private VistaEmpresa vista;
    private Empresa manejo;
    private DefaultTableModel modelTabla;
    private ControladorTeclado soloNumeros;
    private ControladorTeclado soloIden;

    public ControladorEmpresa(VistaEmpresa vista){
        this.vista = vista;
        this.manejo = Empresa.getEmpresa();

        //Deshabilitamos valores

    }

}
