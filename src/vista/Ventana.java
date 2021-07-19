package vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Ventana{

	public JFrame frame;
	
	public VistaBienvenido panelBienvenido;
	public VistaRegistro panelRegistro;
	public VistaReserva panelReserva;
	public VistaRestaurante panelRestaurante;
	public VistaServicios panelServicios;
	public VistaEmpresa panelEmpresa;
	public VistaAdministrar panelAdministrar;
	public VistaFacturas panelFacturas;
	
	public JMenuItem mntmGuardar;
	public JMenuItem mntmGuardarCopia;
	public JMenuItem mntmLeerCopia;
	public JMenuItem mntmMostrarFecha;
	public JMenuItem mntmSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 700, 756);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Administracion Hostal");
		frame.setResizable(false);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmGuardar = new JMenuItem("Guardar");
		mnArchivo.add(mntmGuardar);
		
		mntmGuardarCopia = new JMenuItem("Guardar Copia");
		mnArchivo.add(mntmGuardarCopia);
		
		mntmLeerCopia = new JMenuItem("Leer Copia");
		mnArchivo.add(mntmLeerCopia);
		
		JMenu mnFecha = new JMenu("Fecha y Hora");
		menuBar.add(mnFecha);
		
		mntmMostrarFecha = new JMenuItem("Mostrar Ventana Fecha");
		mnFecha.add(mntmMostrarFecha);
		
		JMenu mnNewMenu = new JMenu("Opciones");
		menuBar.add(mnNewMenu);
		
		mntmSalir = new JMenuItem("Salir sin Guardar");
		mnNewMenu.add(mntmSalir);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 684, 696);
		tabbedPane.setSelectedIndex(-1);
		tabbedPane.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		tabbedPane.setToolTipText("");
		frame.getContentPane().add(tabbedPane);
		
		panelBienvenido = new VistaBienvenido();
		tabbedPane.addTab("Bienvenido", null, panelBienvenido, null);
		
		panelRegistro = new VistaRegistro();
		tabbedPane.addTab("Registro", null, panelRegistro, null);
		
		panelReserva = new VistaReserva();
		tabbedPane.addTab("Reserva", null, panelReserva, null);
		
		panelRestaurante = new VistaRestaurante();
		tabbedPane.addTab("Restaurante", null, panelRestaurante, null);
		
		panelServicios = new VistaServicios();
		tabbedPane.addTab("Servicios", null, panelServicios, null);
		
		panelEmpresa =  new VistaEmpresa();
		tabbedPane.addTab("Empresa", null, panelEmpresa, null);
		
		panelAdministrar = new VistaAdministrar();
		tabbedPane.addTab("Administrar", null, panelAdministrar, null);
		
		panelFacturas = new VistaFacturas();
		tabbedPane.addTab("Facturas", null, panelFacturas, null);
		
	}
}
