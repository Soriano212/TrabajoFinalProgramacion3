package controlador;

import vista.Ventana;
import java.awt.event.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import modelo.ManejoArchivos;
import modelo.ManejoHuespedes;

public class ControladorP extends WindowAdapter implements ActionListener{

	private Ventana ven;
	private ControladorRegistro ctrlRegistro;
	private static String nombreOficial = "./Data/";

	private ManejoHuespedes manejoHuespedes;
	
	public ControladorP() {
		ManejoArchivos.crearCarpetaData();
		leerArchivos(nombreOficial);
		ven = new Ventana();
		ven.frame.addWindowListener(this);
		ven.mntmGuardar.addActionListener(this);
		ven.mntmGuardarCopia.addActionListener(this);
		ven.mntmLeerCopia.addActionListener(this);

		this.manejoHuespedes = ManejoHuespedes.getListas();
		ctrlRegistro = new ControladorRegistro(ven.panelRegistro, manejoHuespedes);
	}

	public void actualizarManejos(){
		this.manejoHuespedes = ManejoHuespedes.getListas();
	}

	public String buscarGuardar(){
		JFileChooser archi = new JFileChooser("./");
        archi.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int returnVal = archi.showDialog(ven.frame, "Seleccionar");

		if(returnVal == JFileChooser.APPROVE_OPTION) return archi.getSelectedFile().getPath().replace("\\", "/")+"/";

		return null;
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
		boolean val = ManejoArchivos.leerDatosHuespedes(nombre+"Huespedes.dat");
		if(!val) JOptionPane.showMessageDialog(null, "Error al leer huespedes");

		actualizarManejos();
	}

	@Override
	public void windowClosing(WindowEvent e) {

		int option = JOptionPane.showConfirmDialog(null, "Estas seguro de que quieres cerrar la aplicacion?",
		"Confirmacion de cierre", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (option == JOptionPane.YES_OPTION) {
			guardarArchivos(nombreOficial);
			System.exit(0);
		}
	}

	public ControladorRegistro getCtrlRegistro() {
		return this.ctrlRegistro;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == ven.mntmGuardar){
			guardarArchivos(nombreOficial);
		}
		if(e.getSource() == ven.mntmGuardarCopia){
			String direccion = buscarGuardar();
			if(direccion != null){
				System.out.println(direccion);
				guardarArchivos(direccion);
			}
		}
		if(e.getSource() == ven.mntmLeerCopia){
			String direccion = buscarGuardar();
			if(direccion != null){
				System.out.println(direccion);
				leerArchivos(direccion);
			}
		}
		
	}
	
}
