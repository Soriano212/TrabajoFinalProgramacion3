package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VistaAdministrar extends JPanel {

	public JTextField textNombre;
	public JTextField textUbicacion;

	public JTable tableAgregar;
	public JTable tableMesas;

	public JComboBox<String> comboBoxSeleccion;
	public JComboBox<String> comboBoxTipo;
	public JComboBox<String> comboBoxMesaCap;
	public JComboBox<String> comboBoxCapacidad;

	public JButton btnAgregar;
	public JButton btnModificar;
	public JButton btnQuitar;
	public JButton btnLimpiar;
	public JButton btnMesaAgregar;
	public JButton btnMesaLimpiar;
	public JButton btnMesaQuitar;

	public JLabel lblRestaurante;
	public JLabel lblMesa;

	/**
	 * Create the panel.
	 */
	public VistaAdministrar() {
		setLayout(null);
		
		JLabel lblAgregar = new JLabel("AGREGAR");
		lblAgregar.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregar.setForeground(Color.BLUE);
		lblAgregar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblAgregar.setBounds(15, 11, 659, 32);
		add(lblAgregar);
		
		JLabel lblReservarCabaa_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1.setForeground(Color.BLUE);
		lblReservarCabaa_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1.setBounds(15, 16, 659, 32);
		add(lblReservarCabaa_1);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccion:");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(75, 54, 135, 32);
		add(lblNewLabel_1);
		
		comboBoxSeleccion = new JComboBox<String>();
		comboBoxSeleccion.setModel(new DefaultComboBoxModel(new String[] {"Caba\u00F1a", "Piscina", "Restaurante"}));
		comboBoxSeleccion.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxSeleccion.setBounds(333, 59, 217, 24);
		add(comboBoxSeleccion);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre:");
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(75, 97, 135, 32);
		add(lblNewLabel_1_1);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textNombre.setColumns(10);
		textNombre.setBounds(284, 102, 326, 24);
		add(textNombre);
		
		JLabel lblNewLabel_1_2 = new JLabel("Capacidad:");
		lblNewLabel_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(75, 139, 135, 32);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tipo:");
		lblNewLabel_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(75, 182, 135, 32);
		add(lblNewLabel_1_3);
		
		comboBoxTipo = new JComboBox<String>();
		comboBoxTipo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxTipo.setBounds(333, 187, 217, 24);
		add(comboBoxTipo);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Ubicacion:");
		lblNewLabel_1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(75, 225, 135, 32);
		add(lblNewLabel_1_2_1);
		
		textUbicacion = new JTextField();
		textUbicacion.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textUbicacion.setColumns(10);
		textUbicacion.setBounds(284, 230, 326, 24);
		add(textUbicacion);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnAgregar.setBounds(75, 271, 125, 23);
		add(btnAgregar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(75, 305, 535, 113);
		add(scrollPane);
		
		tableAgregar = new JTable();
		tableAgregar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		scrollPane.setViewportView(tableAgregar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnModificar.setBounds(210, 271, 125, 23);
		add(btnModificar);
		
		btnQuitar = new JButton("Quitar");
		btnQuitar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnQuitar.setBounds(345, 271, 125, 23);
		add(btnQuitar);
		
		JLabel lblMesas = new JLabel("MESAS");
		lblMesas.setHorizontalAlignment(SwingConstants.CENTER);
		lblMesas.setForeground(Color.BLUE);
		lblMesas.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblMesas.setBounds(15, 429, 659, 32);
		add(lblMesas);
		
		JLabel lblReservarCabaa_1_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1_1.setForeground(Color.BLUE);
		lblReservarCabaa_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1_1.setBounds(15, 434, 659, 32);
		add(lblReservarCabaa_1_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("Administracion de Mesas de:");
		lblNewLabel_1_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_4.setBounds(75, 472, 263, 32);
		add(lblNewLabel_1_4);
		
		lblRestaurante = new JLabel(".....");
		lblRestaurante.setHorizontalAlignment(SwingConstants.CENTER);
		lblRestaurante.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblRestaurante.setBounds(347, 472, 263, 32);
		add(lblRestaurante);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Capacidad:");
		lblNewLabel_1_2_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_2.setBounds(75, 557, 135, 32);
		add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ID Mesa:");
		lblNewLabel_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(75, 515, 135, 32);
		add(lblNewLabel_1_1_1);
		
		lblMesa = new JLabel(".....");
		lblMesa.setHorizontalAlignment(SwingConstants.CENTER);
		lblMesa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblMesa.setBounds(185, 515, 217, 32);
		add(lblMesa);
		
		comboBoxMesaCap = new JComboBox<String>();
		comboBoxMesaCap.setModel(new DefaultComboBoxModel<String>(new String[] {"2", "4", "6", "8"}));
		comboBoxMesaCap.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxMesaCap.setBounds(207, 562, 169, 24);
		add(comboBoxMesaCap);
		
		btnMesaAgregar = new JButton("Agregar");
		btnMesaAgregar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnMesaAgregar.setBounds(75, 600, 95, 23);
		add(btnMesaAgregar);
		
		btnMesaQuitar = new JButton("Quitar");
		btnMesaQuitar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnMesaQuitar.setBounds(180, 600, 95, 23);
		add(btnMesaQuitar);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(398, 510, 263, 113);
		add(scrollPane_1);
		
		tableMesas = new JTable();
		tableMesas.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane_1.setViewportView(tableMesas);
		
		comboBoxCapacidad = new JComboBox<String>();
		comboBoxCapacidad.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxCapacidad.setBounds(333, 144, 217, 24);
		add(comboBoxCapacidad);
		
		btnMesaLimpiar = new JButton("Limpiar");
		btnMesaLimpiar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnMesaLimpiar.setBounds(281, 600, 95, 23);
		add(btnMesaLimpiar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnLimpiar.setBounds(485, 273, 125, 23);
		add(btnLimpiar);

	}
}
