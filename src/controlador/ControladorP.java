package controlador;

import vista.Ventana;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import modelo.*;

public class ControladorP extends WindowAdapter implements ActionListener{

	private Ventana ven;
	private static String nombreOficial = "./Data/";

	private ControladorRegistro ctrlRegistro;
	private ManejoHuespedes manejoHuespedes = ManejoHuespedes.getListas();

	private ControladorEmpresa ctrlEmpresa;
	private Empresa manejoEmpresa = Empresa.getEmpresa();

	private ControladorAdministrar ctrlAdministrar;
	private ManejoAreas manejoAreas = ManejoAreas.getManejoAreas();
	
	public ControladorP() {
		ManejoArchivos.crearCarpetaData();

		ven = new Ventana();
		ven.frame.addWindowListener(this);
		ven.mntmGuardar.addActionListener(this);
		ven.mntmGuardarCopia.addActionListener(this);
		ven.mntmLeerCopia.addActionListener(this);
		ven.mntmSalir.addActionListener(this);

		ctrlRegistro = new ControladorRegistro(ven.panelRegistro);
		ctrlEmpresa = new ControladorEmpresa(ven.panelEmpresa, ven.panelBienvenido);

		leerArchivos(nombreOficial);

		ven.panelBienvenido.lblNombre.setText(manejoEmpresa.getNombre().toUpperCase());
		ven.panelBienvenido.lblDireccion.setText(manejoEmpresa.getDireccion());
	}

	public void actualizarTablas(){
		ctrlRegistro.actializarTabla();
		ctrlEmpresa.actializarTabla();
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
		ven.frame.setVisible(true);
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
		if(!ManejoArchivos.escribirDatosCabanas(direccion+"Cabanas.dat")){
			JOptionPane.showMessageDialog(null, "Error al guardar Cabanas.dat");
		}
		if(!ManejoArchivos.escribirDatosPiscinas(direccion+"Piscinas.dat")){
			JOptionPane.showMessageDialog(null, "Error al guardar Piscinas.dat");
		}
		if(!ManejoArchivos.escribirDatosRestaurantes(direccion+"Restaurantes.dat")){
			JOptionPane.showMessageDialog(null, "Error al guardar Restaurantes.dat");
		}
	}

	public void leerArchivos(String nombre){
		Empresa.DatosEmpresa dataEmpresa = ManejoArchivos.leerDatosEmpresa(nombre+"DatosEmpresa.dat");
		if(dataEmpresa == null) JOptionPane.showMessageDialog(null, "Error al leer DatosEmpresa.dat");

		ArrayList<Propietario> listaPropietarios = ManejoArchivos.leerDatosPropietarios(nombre+"Propietarios.dat");
		if(listaPropietarios == null) JOptionPane.showMessageDialog(null, "Error al leer Propietarios.dat");

		manejoEmpresa.lectura(listaPropietarios, dataEmpresa);

		ArrayList<Afiliado> listaAfiliados = ManejoArchivos.leerDatosAfiliados(nombre+"Afiliados.dat");
		if(listaAfiliados == null) JOptionPane.showMessageDialog(null, "Error al leer Afiliados.dat");

		ArrayList<NoAfiliado> listaNoAfiliados = ManejoArchivos.leerDatosNoAfiliados(nombre+"NoAfiliados.dat");
		if(listaNoAfiliados == null) JOptionPane.showMessageDialog(null, "Error al leer NoAfiliados.dat");

		manejoHuespedes.lectura(listaAfiliados, listaNoAfiliados);

		ArrayList<Restaurante> listaRestaurantes = ManejoArchivos.leerDatosRestaurantes(nombre+"Restaurantes.dat");
		if(listaRestaurantes == null) JOptionPane.showMessageDialog(null, "Error al leer Restaurantes.dat");

		ArrayList<Piscina> listaPiscinas = ManejoArchivos.leerDatosPiscinas(nombre+"Piscinas.dat");
		if(listaPiscinas == null) JOptionPane.showMessageDialog(null, "Error al leer Piscinas.dat");

		ArrayList<Cabana> listaCabanas = ManejoArchivos.leerDatosCabanas(nombre+"Cabanas.dat");
		if(listaCabanas == null) JOptionPane.showMessageDialog(null, "Error al leer Cabanas.dat");

		manejoAreas.lectura(listaRestaurantes, listaPiscinas, listaCabanas);

		actualizarTablas();
	}

	@Override
	public void windowClosing(WindowEvent e) {

		actualizarTablas();

		int option = JOptionPane.showConfirmDialog(null, "Estas seguro de que quieres cerrar la aplicacion?",
		"Confirmacion de cierre", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (option == JOptionPane.YES_OPTION) {
			guardarArchivos(nombreOficial);
			System.exit(0);
		}
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
		if(e.getSource() == ven.mntmSalir){
			int option = JOptionPane.showConfirmDialog(null, "Estas seguro de que quieres cerrar la aplicacion sin guardar?",
			"Confirmacion de cierre", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

			if (option == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}
		
		actualizarTablas();

	}
	
}
