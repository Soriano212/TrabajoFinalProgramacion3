package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Restaurante extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public Restaurante() {
		setLayout(null);
		
		JLabel lblReservarMesa = new JLabel("RESERVAR MESA");
		lblReservarMesa.setBounds(10, 11, 659, 32);
		lblReservarMesa.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarMesa.setForeground(Color.BLUE);
		lblReservarMesa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		add(lblReservarMesa);
		
		JLabel lblReservarCabaa_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1.setBounds(10, 21, 659, 32);
		lblReservarCabaa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1.setForeground(Color.BLUE);
		lblReservarCabaa_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		add(lblReservarCabaa_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Fecha de Reserva:");
		lblNewLabel_1_2_1_1.setBounds(72, 132, 199, 32);
		lblNewLabel_1_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Mes:");
		lblNewLabel_1_1_1_1.setBounds(361, 471, 41, 32);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Dia:");
		lblNewLabel_1_1_1.setBounds(361, 433, 41, 32);
		lblNewLabel_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(422, 437, 50, 24);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField.setColumns(10);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(422, 475, 50, 24);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_1.setColumns(10);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(422, 509, 50, 24);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_2.setColumns(10);
		add(textField_2);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("A\u00F1o:");
		lblNewLabel_1_1_1_2.setBounds(361, 505, 41, 32);
		lblNewLabel_1_1_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Identificacion Cliente:");
		lblNewLabel_1_1.setBounds(72, 54, 199, 32);
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		add(lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(281, 59, 326, 24);
		textField_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_3.setColumns(10);
		add(textField_3);
		
		JButton btnRevisar = new JButton("Comprobar");
		btnRevisar.setBounds(267, 97, 153, 23);
		btnRevisar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		add(btnRevisar);
		
		JLabel lblNewLabel_1_2 = new JLabel("Horario:");
		lblNewLabel_1_2.setBounds(73, 168, 199, 32);
		lblNewLabel_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		add(lblNewLabel_1_2);
		
		JComboBox comboBoxIden = new JComboBox();
		comboBoxIden.setBounds(349, 173, 204, 24);
		comboBoxIden.setModel(new DefaultComboBoxModel(new String[] {"Desayuno", "Almuerzo", "Merienda"}));
		comboBoxIden.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		add(comboBoxIden);
		
		JLabel lblColaRestaurante = new JLabel("COLA RESTAURANTE");
		lblColaRestaurante.setBounds(10, 245, 659, 32);
		lblColaRestaurante.setHorizontalAlignment(SwingConstants.CENTER);
		lblColaRestaurante.setForeground(Color.BLUE);
		lblColaRestaurante.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		add(lblColaRestaurante);
		
		JLabel lblReservarCabaa_1_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1_1.setBounds(10, 255, 659, 32);
		lblReservarCabaa_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1_1.setForeground(Color.BLUE);
		lblReservarCabaa_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		add(lblReservarCabaa_1_1);
		
		JButton btnRevisar_1 = new JButton("Comprobar");
		btnRevisar_1.setBounds(267, 211, 153, 23);
		btnRevisar_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		add(btnRevisar_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(281, 293, 210, 24);
		textField_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_4.setColumns(10);
		add(textField_4);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Identificacion Cliente:");
		lblNewLabel_1_1_2.setBounds(72, 288, 199, 32);
		lblNewLabel_1_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Nombres:");
		lblNewLabel_1_1_3.setBounds(44, 328, 199, 32);
		lblNewLabel_1_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		add(lblNewLabel_1_1_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(147, 333, 163, 24);
		textField_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_5.setColumns(10);
		add(textField_5);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Apellidos:");
		lblNewLabel_1_1_3_1.setBounds(368, 328, 199, 32);
		lblNewLabel_1_1_3_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		add(lblNewLabel_1_1_3_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(471, 333, 163, 24);
		textField_6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_6.setColumns(10);
		add(textField_6);
		
		JButton btnAgregarCola = new JButton("Agregar A Cola");
		btnAgregarCola.setBounds(256, 368, 164, 23);
		btnAgregarCola.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		add(btnAgregarCola);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.setBounds(501, 296, 123, 23);
		btnCargar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		add(btnCargar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(132, 402, 163, 234);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
			},
			new String[] {
				"Cola Restaurante"
			}
		));
		table.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(506, 402, 163, 234);
		add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"#1", "Reservado"},
				{"#2", "Reservado"},
				{"#3", "Reservado"},
				{"#4", "No Reservado"},
				{"#5", "No Reservado"},
				{"#6", "Reservado"},
			},
			new String[] {
				"# Mesa", "Estado"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JComboBox comboBoxIden_1 = new JComboBox();
		comboBoxIden_1.setModel(new DefaultComboBoxModel(new String[] {"Desayuno", "Almuerzo", "Merienda"}));
		comboBoxIden_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxIden_1.setBounds(361, 544, 111, 24);
		add(comboBoxIden_1);
		
		JButton btnCargar_1 = new JButton("Cargar");
		btnCargar_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCargar_1.setBounds(361, 581, 111, 23);
		add(btnCargar_1);
		
		JComboBox comboBoxIden_1_1 = new JComboBox();
		comboBoxIden_1_1.setModel(new DefaultComboBoxModel(new String[] {"Desayuno", "Almuerzo", "Merienda"}));
		comboBoxIden_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxIden_1_1.setBounds(11, 475, 111, 24);
		add(comboBoxIden_1_1);
		
		JButton btnCargar_1_1 = new JButton("Pasar");
		btnCargar_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCargar_1_1.setBounds(10, 512, 111, 23);
		add(btnCargar_1_1);

	}
}
