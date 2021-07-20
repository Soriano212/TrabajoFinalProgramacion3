package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VistaServicios extends JPanel {

	public JTable tableSeleccion;
	public JButton btnActualizar;
	public JButton btnLimpiar;
	private JTextField textCapacidad;
	private JButton btnPedir;
	private JButton btnQuitar;
	private JLabel lblIden_1;
	private JLabel lblNewLabel_1_1;
	private JTextField textCantidad;
	private JScrollPane scrollPane_1;
	private JTable tablePedidos;

	/**
	 * Create the panel.
	 */
	public VistaServicios() {
		setLayout(null);
		
		JLabel lblSolicitarServicios = new JLabel("MANEJO SERVICIOS");
		lblSolicitarServicios.setHorizontalAlignment(SwingConstants.CENTER);
		lblSolicitarServicios.setForeground(Color.BLUE);
		lblSolicitarServicios.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblSolicitarServicios.setBounds(10, 11, 659, 32);
		add(lblSolicitarServicios);
		
		JLabel lblReservarCabaa_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1.setForeground(Color.BLUE);
		lblReservarCabaa_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1.setBounds(10, 21, 659, 32);
		add(lblReservarCabaa_1);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccion:");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(91, 64, 135, 32);
		add(lblNewLabel_1);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnActualizar.setBounds(199, 162, 125, 23);
		add(btnActualizar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnLimpiar.setBounds(346, 162, 125, 23);
		add(btnLimpiar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(67, 196, 535, 113);
		add(scrollPane);
		
		tableSeleccion = new JTable();
		tableSeleccion.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		scrollPane.setViewportView(tableSeleccion);
		
		JLabel lblNewLabel_1_2 = new JLabel("Capacidad:");
		lblNewLabel_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(91, 107, 135, 32);
		add(lblNewLabel_1_2);
		
		textCapacidad = new JTextField();
		textCapacidad.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textCapacidad.setHorizontalAlignment(SwingConstants.CENTER);
		textCapacidad.setBounds(296, 116, 302, 20);
		add(textCapacidad);
		textCapacidad.setColumns(10);
		
		btnPedir = new JButton("Agregar");
		btnPedir.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnPedir.setBounds(90, 433, 153, 23);
		add(btnPedir);
		
		btnQuitar = new JButton("Quitar");
		btnQuitar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnQuitar.setBounds(91, 527, 153, 23);
		add(btnQuitar);
		
		lblIden_1 = new JLabel(".....");
		lblIden_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIden_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblIden_1.setBounds(338, 64, 194, 32);
		add(lblIden_1);
		
		lblNewLabel_1_1 = new JLabel("Cantidad:");
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(27, 391, 135, 32);
		add(lblNewLabel_1_1);
		
		textCantidad = new JTextField();
		textCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		textCantidad.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textCantidad.setColumns(10);
		textCantidad.setBounds(151, 398, 158, 20);
		add(textCantidad);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(346, 345, 231, 271);
		add(scrollPane_1);
		
		tablePedidos = new JTable();
		scrollPane_1.setViewportView(tablePedidos);

	}
}
