package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import java.awt.SystemColor;

public class Ventana {

	private JFrame frame;
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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
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
