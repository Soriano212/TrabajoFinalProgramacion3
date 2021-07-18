package controlador;

import vista.Ventana;
import java.awt.event.*;

import javax.swing.JOptionPane;

import modelo.ManejoArchivos;
import modelo.ManejoHuespedes;

public class ControladorP extends WindowAdapter{

	private Ventana ven;
	private ControladorRegistro ctrlRegistro;
	private static String nombreOficial = "./Data/";
	private static String nombreCopia = "./DataCopia/";
	
	public ControladorP() {
		ManejoArchivos.crearCarpetaData();
		leerArchivos(nombreOficial);
		ven = new Ventana();
		ven.frame.addWindowListener(this);
		ctrlRegistro = new ControladorRegistro(ven.panelRegistro);
	}

	public void Iniciar()
    {
        ven.frame.setLocationRelativeTo(null);
    }

	public void guardarArchivos(String nombre){
		if(!ManejoArchivos.EscribirDatosHuespedes(ManejoHuespedes.getListas(), nombre+"Huespedes.dat")){
			JOptionPane.showMessageDialog(null, "Error al guardar Huespedes");
		}
	}

	public void leerArchivos(String nombre){
		ManejoHuespedes huespedes = ManejoHuespedes.getListas(ManejoArchivos.leerDatosHuespedes(nombre+"Huespedes.dat"));
		if(huespedes == null) JOptionPane.showMessageDialog(null, "Error al leer huespedes");;
	}



	@Override
	public void windowClosing(WindowEvent e) {

		int option = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres cerrar la aplicación?",
		"Confirmación de cierre", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (option == JOptionPane.YES_OPTION) {
			guardarArchivos(nombreOficial);
			System.exit(0);
		}
	}


	public ControladorRegistro getCtrlRegistro() {
		return this.ctrlRegistro;
	}
	
}
