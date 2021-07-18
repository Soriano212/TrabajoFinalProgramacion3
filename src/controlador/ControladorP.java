package controlador;

import vista.Ventana;
import java.awt.event.*;

import javax.swing.JOptionPane;

import modelo.ManejoArchivos;
import modelo.ManejoHuespedes;

public class ControladorP extends WindowAdapter{

	private Ventana ven;
	private ControladorRegistro ctrlRegistro;
	
	public ControladorP() {
		leerArchivos();
		ven = new Ventana();
		ven.frame.addWindowListener(this);
		ctrlRegistro = new ControladorRegistro(ven.panelRegistro);
	}

	public void leerArchivos(){
		ManejoHuespedes huespedes = ManejoHuespedes.getListas(ManejoArchivos.leerDatosHuespedes());
		if(huespedes == null) JOptionPane.showMessageDialog(null, "Error al leer huespedes");;
	}

	@Override
	public void windowClosing(WindowEvent e) {

		int option = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres cerrar la aplicación?",
		"Confirmación de cierre", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (option == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}


	public ControladorRegistro getCtrlRegistro() {
		return this.ctrlRegistro;
	}
	
}
