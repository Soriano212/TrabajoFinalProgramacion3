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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable tableAgregar;
	private JTable table;

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
		
		JComboBox comboBoxSeleccion = new JComboBox();
		comboBoxSeleccion.setModel(new DefaultComboBoxModel(new String[] {"Caba\u00F1a", "Piscina", "Restaurante"}));
		comboBoxSeleccion.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxSeleccion.setBounds(333, 59, 217, 24);
		add(comboBoxSeleccion);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre:");
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(75, 97, 135, 32);
		add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(284, 102, 326, 24);
		add(textField);
		
		JLabel lblNewLabel_1_2 = new JLabel("Capacidad:");
		lblNewLabel_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(75, 139, 135, 32);
		add(lblNewLabel_1_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(284, 144, 326, 24);
		add(textField_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tipo:");
		lblNewLabel_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(75, 182, 135, 32);
		add(lblNewLabel_1_3);
		
		JComboBox comboBoxTipo = new JComboBox();
		comboBoxTipo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxTipo.setBounds(333, 187, 217, 24);
		add(comboBoxTipo);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Ubicacion:");
		lblNewLabel_1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(75, 225, 135, 32);
		add(lblNewLabel_1_2_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(284, 230, 326, 24);
		add(textField_2);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnAgregar.setBounds(75, 271, 153, 23);
		add(btnAgregar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(75, 305, 535, 113);
		add(scrollPane);
		
		tableAgregar = new JTable();
		tableAgregar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		scrollPane.setViewportView(tableAgregar);
		
		JButton btnModificarAgregar = new JButton("Modificar");
		btnModificarAgregar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnModificarAgregar.setBounds(269, 271, 153, 23);
		add(btnModificarAgregar);
		
		JButton btnLimpiar = new JButton("Quitar");
		btnLimpiar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnLimpiar.setBounds(457, 268, 153, 23);
		add(btnLimpiar);
		
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
		
		JLabel lblRestaurante = new JLabel(".....");
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
		
		JLabel lblMesa = new JLabel(".....");
		lblMesa.setHorizontalAlignment(SwingConstants.CENTER);
		lblMesa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblMesa.setBounds(185, 515, 217, 32);
		add(lblMesa);
		
		JComboBox comboBoxMesaCap = new JComboBox();
		comboBoxMesaCap.setModel(new DefaultComboBoxModel(new String[] {"2", "4", "6", "8"}));
		comboBoxMesaCap.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxMesaCap.setBounds(207, 562, 169, 24);
		add(comboBoxMesaCap);
		
		JButton btnMesaAgregar = new JButton("Agregar");
		btnMesaAgregar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnMesaAgregar.setBounds(111, 600, 99, 23);
		add(btnMesaAgregar);
		
		JButton btnMesaQuitar = new JButton("Quitar");
		btnMesaQuitar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnMesaQuitar.setBounds(233, 600, 105, 23);
		add(btnMesaQuitar);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(398, 510, 263, 113);
		add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);

	}
}
