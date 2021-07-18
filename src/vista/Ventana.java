package vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.Font;

public class Ventana{

	public JFrame frame;
	public Bienvenido panelBienvenido;
	public Registro panelRegistro;
	public Reserva panelReserva;
	public Restaurante panelRestaurante;
	public Servicios panelServicios;
	public Empresa panelEmpresa;
	public Administrar panelAdministrar;
	public Facturas panelFacturas;

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
		frame.setBounds(100, 100, 700, 735);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Administracion Hostal");
		frame.setResizable(false);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 684, 696);
		tabbedPane.setSelectedIndex(-1);
		tabbedPane.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		tabbedPane.setToolTipText("");
		frame.getContentPane().add(tabbedPane);
		
		panelBienvenido = new Bienvenido();
		tabbedPane.addTab("Bienvenido", null, panelBienvenido, null);
		
		panelRegistro = new Registro();
		tabbedPane.addTab("Registro", null, panelRegistro, null);
		
		panelReserva = new Reserva();
		tabbedPane.addTab("Reserva", null, panelReserva, null);
		
		panelRestaurante = new Restaurante();
		tabbedPane.addTab("Restaurante", null, panelRestaurante, null);
		
		panelServicios = new Servicios();
		tabbedPane.addTab("Servicios", null, panelServicios, null);
		
		panelEmpresa =  new Empresa();
		tabbedPane.addTab("Empresa", null, panelEmpresa, null);
		
		panelAdministrar = new Administrar();
		tabbedPane.addTab("Administrar", null, panelAdministrar, null);
		
		panelFacturas = new Facturas();
		tabbedPane.addTab("Facturas", null, panelFacturas, null);
		
	}
}
