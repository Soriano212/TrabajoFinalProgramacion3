package controlador;

import vista.Ventana;

public class ControladorP {

	private Ventana ven;
	private ControladorRegistro ctrlRegistro;
	
	public ControladorP() {
		ven = new Ventana();
		ctrlRegistro = new ControladorRegistro(ven.panelRegistro);
	}
	
}
