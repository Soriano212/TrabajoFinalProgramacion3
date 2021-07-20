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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VistaRestaurante extends JPanel {
	private JTextField textNombre;
	private JTextField textAprellido;
	private JTable tableRestaurante;
	private JTable tableMesas;

	/**
	 * Create the panel.
	 */
	public VistaRestaurante() {
		setLayout(null);
		
		JLabel lblColaRestaurante = new JLabel("RESTAURANTE");
		lblColaRestaurante.setBounds(10, 11, 659, 32);
		lblColaRestaurante.setHorizontalAlignment(SwingConstants.CENTER);
		lblColaRestaurante.setForeground(Color.BLUE);
		lblColaRestaurante.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		add(lblColaRestaurante);
		
		JLabel lblReservarCabaa_1_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1_1.setBounds(10, 21, 659, 32);
		lblReservarCabaa_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1_1.setForeground(Color.BLUE);
		lblReservarCabaa_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		add(lblReservarCabaa_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Identificacion Cliente:");
		lblNewLabel_1_1_2.setBounds(58, 70, 199, 32);
		lblNewLabel_1_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Nombres:");
		lblNewLabel_1_1_3.setBounds(44, 113, 115, 32);
		lblNewLabel_1_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		add(lblNewLabel_1_1_3);
		
		textNombre = new JTextField();
		textNombre.setBounds(147, 118, 101, 24);
		textNombre.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textNombre.setColumns(10);
		add(textNombre);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Apellidos:");
		lblNewLabel_1_1_3_1.setBounds(276, 113, 199, 32);
		lblNewLabel_1_1_3_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		add(lblNewLabel_1_1_3_1);
		
		textAprellido = new JTextField();
		textAprellido.setBounds(379, 118, 131, 24);
		textAprellido.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textAprellido.setColumns(10);
		add(textAprellido);
		
		JButton btnAgregarCola = new JButton("Agregar A Cola");
		btnAgregarCola.setBounds(132, 167, 164, 23);
		btnAgregarCola.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		add(btnAgregarCola);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(58, 269, 256, 234);
		add(scrollPane);
		
		tableRestaurante = new JTable();
		tableRestaurante.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
			},
			new String[] {
				"Cola Restaurante"
			}
		));
		tableRestaurante.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane.setViewportView(tableRestaurante);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(346, 270, 274, 234);
		add(scrollPane_1);
		
		tableMesas = new JTable();
		tableMesas.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		tableMesas.setModel(new DefaultTableModel(
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
		scrollPane_1.setViewportView(tableMesas);
		
		JLabel lblIden2 = new JLabel(".....");
		lblIden2.setHorizontalAlignment(SwingConstants.CENTER);
		lblIden2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblIden2.setBounds(263, 70, 194, 32);
		add(lblIden2);
		
		JButton btnListar2 = new JButton("Listar");
		btnListar2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnListar2.setBounds(467, 76, 153, 23);
		add(btnListar2);
		
		JLabel lblNewLabel_1_1_3_1_1 = new JLabel("Cant:");
		lblNewLabel_1_1_3_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3_1_1.setBounds(524, 113, 58, 32);
		add(lblNewLabel_1_1_3_1_1);
		
		JComboBox comboBoxCant = new JComboBox();
		comboBoxCant.setModel(new DefaultComboBoxModel(new String[] {"2", "4", "6", "8"}));
		comboBoxCant.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxCant.setBounds(578, 118, 70, 24);
		add(comboBoxCant);
		
		JButton btnRestaurante = new JButton("Restaurante");
		btnRestaurante.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnRestaurante.setBounds(360, 167, 164, 23);
		add(btnRestaurante);
		
		JLabel lblRestaurante = new JLabel(".....");
		lblRestaurante.setHorizontalAlignment(SwingConstants.CENTER);
		lblRestaurante.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblRestaurante.setBounds(233, 201, 194, 32);
		add(lblRestaurante);
		
		JLabel lblNewLabel_1_1_3_2 = new JLabel("Nombre:");
		lblNewLabel_1_1_3_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3_2.setBounds(132, 528, 115, 32);
		add(lblNewLabel_1_1_3_2);
		
		JLabel lblNewLabel_1_1_3_2_1 = new JLabel("Hora Inicio:");
		lblNewLabel_1_1_3_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3_2_1.setBounds(44, 581, 115, 32);
		add(lblNewLabel_1_1_3_2_1);
		
		JLabel lblNewLabel_1_1_3_2_1_1 = new JLabel("Hora Fin:");
		lblNewLabel_1_1_3_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3_2_1_1.setBounds(360, 581, 115, 32);
		add(lblNewLabel_1_1_3_2_1_1);
		
		JLabel lblNombre = new JLabel(".....");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNombre.setBounds(263, 528, 248, 32);
		add(lblNombre);
		
		JLabel lblHoraInicio = new JLabel(".....");
		lblHoraInicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoraInicio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblHoraInicio.setBounds(157, 581, 175, 32);
		add(lblHoraInicio);
		
		JLabel lblHoraFin = new JLabel(".....");
		lblHoraFin.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoraFin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblHoraFin.setBounds(445, 581, 175, 32);
		add(lblHoraFin);

	}
}
