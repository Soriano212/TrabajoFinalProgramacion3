package controlador;

import vista.Ventana;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import modelo.Afiliado;
import modelo.Empresa;
import modelo.ManejoArchivos;
import modelo.ManejoHuespedes;
import modelo.NoAfiliado;
import modelo.Propietario;

public class ControladorP extends WindowAdapter implements ActionListener{

	private Ventana ven;
	private static String nombreOficial = "./Data/";

	private ControladorRegistro ctrlRegistro;
	private ManejoHuespedes manejoHuespedes = ManejoHuespedes.getListas();

	private ControladorEmpresa ctrlEmpresa;
	private Empresa empresa = Empresa.getEmpresa();
	
	public ControladorP() {
		ManejoArchivos.crearCarpetaData();

		ven = new Ventana();
		ven.frame.addWindowListener(this);
		ven.mntmGuardar.addActionListener(this);
		ven.mntmGuardarCopia.addActionListener(this);
		ven.mntmLeerCopia.addActionListener(this);

		ctrlRegistro = new ControladorRegistro(ven.panelRegistro);

		leerArchivos(nombreOficial);
	}

	public void actualizarTablas(){
		ctrlRegistro.actializarTabla();
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

	public void guardarArchivos(String direccion){
		if(!ManejoArchivos.escribirDatosEmpresa(direccion+"DatosEmpresa.dat")){
			JOptionPane.showMessageDialog(null, "Error al guardar DatosEmpresa.dat");
		}
		if(!ManejoArchivos.escribirDatosPropietarios(direccion+"Propietarios.dat")){
			JOptionPane.showMessageDialog(null, "Error al guardar Propietarios.dat");
		}
		if(!ManejoArchivos.escribirDatosAfiliados(direccion+"Afiliados.dat")){
			JOptionPane.showMessageDialog(null, "Error al guardar Afiliados.dat");
		}
		if(!ManejoArchivos.escribirDatosNoAfiliados(direccion+"NoAfiliados.dat")){
			JOptionPane.showMessageDialog(null, "Error al guardar NoAfiliados.dat");
		}
	}

	public void leerArchivos(String nombre){
		Empresa.DatosEmpresa dataEmpresa = ManejoArchivos.leerDatosEmpresa(nombre+"DatosEmpresa.dat");
		if(dataEmpresa == null) JOptionPane.showMessageDialog(null, "Error al leer DatosEmpresa.dat");

		ArrayList<Propietario> listaPropietarios = ManejoArchivos.leerDatosPropietarios(nombre+"Propietarios.dat");
		if(listaPropietarios == null) JOptionPane.showMessageDialog(null, "Error al leer Propietarios.dat");

		empresa.Lectura(listaPropietarios, dataEmpresa);

		ArrayList<Afiliado> listaAfiliados = ManejoArchivos.leerDatosAfiliados(nombre+"Afiliados.dat");
		if(listaAfiliados == null) JOptionPane.showMessageDialog(null, "Error al leer Afiliados.dat");

		ArrayList<NoAfiliado> listaNoAfiliados = ManejoArchivos.leerDatosNoAfiliados(nombre+"NoAfiliados.dat");
		if(listaNoAfiliados == null) JOptionPane.showMessageDialog(null, "Error al leer NoAfiliados.dat");

		manejoHuespedes.Lectura(listaAfiliados, listaNoAfiliados);

		actualizarTablas();
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
