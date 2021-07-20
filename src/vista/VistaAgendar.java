package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

public class VistaAgendar extends JPanel {

	public JTextField textDia;
	public JTextField textMes;
	public JTextField textAnio;

	public JTable tableSeleccion;
	public JTable tableMesas;

	public JComboBox<String> comboBoxHoraInicio;
	public JComboBox<String> comboBoxHoraFin;
	public JComboBox<String> comboBoxMinutosInicio;
	public JComboBox<String> comboBoxMinutosFin;

	public JButton btnAgregar;
	public JButton btnQuitar;
	public JButton btnListarAgenda;
	public JButton btnListar;

	/**
	 * Create the panel.
	 */
	public VistaAgendar() {
		setLayout(null);
		
		JLabel lblAgendar = new JLabel("AGENDAR");
		lblAgendar.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgendar.setForeground(Color.BLUE);
		lblAgendar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblAgendar.setBounds(10, 21, 659, 32);
		add(lblAgendar);
		
		JLabel lblNewLabel_1_1 = new JLabel("Identificacion Cliente:");
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(54, 441, 199, 32);
		add(lblNewLabel_1_1);
		
		JLabel lblIden = new JLabel(".....");
		lblIden.setHorizontalAlignment(SwingConstants.CENTER);
		lblIden.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblIden.setBounds(263, 441, 194, 32);
		add(lblIden);
		
		btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnListar.setBounds(463, 447, 153, 23);
		add(btnListar);
		
		JLabel lblReservarCabaa_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1.setForeground(Color.BLUE);
		lblReservarCabaa_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1.setBounds(10, 31, 659, 32);
		add(lblReservarCabaa_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Fecha de Reserva:");
		lblNewLabel_1_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_1_1.setBounds(54, 481, 199, 32);
		add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Dia:");
		lblNewLabel_1_1_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_3.setBounds(263, 481, 41, 32);
		add(lblNewLabel_1_1_1_3);
		
		textDia = new JTextField();
		textDia.setHorizontalAlignment(SwingConstants.CENTER);
		textDia.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textDia.setColumns(10);
		textDia.setBounds(309, 485, 50, 24);
		add(textDia);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Mes:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1.setBounds(377, 481, 41, 32);
		add(lblNewLabel_1_1_1_1_1);
		
		textMes = new JTextField();
		textMes.setHorizontalAlignment(SwingConstants.CENTER);
		textMes.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textMes.setColumns(10);
		textMes.setBounds(423, 485, 50, 24);
		add(textMes);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("A\u00F1o:");
		lblNewLabel_1_1_1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2_1.setBounds(494, 481, 41, 32);
		add(lblNewLabel_1_1_1_2_1);
		
		textAnio = new JTextField();
		textAnio.setHorizontalAlignment(SwingConstants.CENTER);
		textAnio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textAnio.setColumns(10);
		textAnio.setBounds(539, 485, 50, 24);
		add(textAnio);
		
		JLabel lblNewLabel_1_2 = new JLabel("Hora Inicio:");
		lblNewLabel_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(54, 520, 199, 32);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1_3_1 = new JLabel("Hora:");
		lblNewLabel_1_1_1_3_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_3_1.setBounds(273, 520, 50, 32);
		add(lblNewLabel_1_1_1_3_1);
		
		comboBoxHoraInicio = new JComboBox<String>();
		comboBoxHoraInicio.setModel(new DefaultComboBoxModel<String>(new String[] {"6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22"}));
		comboBoxHoraInicio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxHoraInicio.setBounds(332, 525, 70, 24);
		add(comboBoxHoraInicio);
		
		JLabel lblNewLabel_1_1_1_3_1_1 = new JLabel("Minutos:");
		lblNewLabel_1_1_1_3_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_3_1_1.setBounds(422, 520, 77, 32);
		add(lblNewLabel_1_1_1_3_1_1);
		
		comboBoxMinutosInicio = new JComboBox<String>();
		comboBoxMinutosInicio.setModel(new DefaultComboBoxModel<String>(new String[] {"00", "10", "20", "30", "40", "50"}));
		comboBoxMinutosInicio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxMinutosInicio.setBounds(493, 525, 70, 24);
		add(comboBoxMinutosInicio);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Hora Fin:");
		lblNewLabel_1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(54, 549, 199, 32);
		add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_1_3_1_2 = new JLabel("Hora:");
		lblNewLabel_1_1_1_3_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_3_1_2.setBounds(273, 549, 50, 32);
		add(lblNewLabel_1_1_1_3_1_2);
		
		comboBoxHoraFin = new JComboBox<String>();
		comboBoxHoraFin.setModel(new DefaultComboBoxModel<String>(new String[] {"6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22"}));
		comboBoxHoraFin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxHoraFin.setBounds(332, 554, 70, 24);
		add(comboBoxHoraFin);
		
		JLabel lblNewLabel_1_1_1_3_1_1_1 = new JLabel("Minutos:");
		lblNewLabel_1_1_1_3_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_3_1_1_1.setBounds(422, 549, 77, 32);
		add(lblNewLabel_1_1_1_3_1_1_1);
		
		comboBoxMinutosFin = new JComboBox<String>();
		comboBoxMinutosFin.setModel(new DefaultComboBoxModel<String>(new String[] {"00", "10", "20", "30", "40", "50"}));
		comboBoxMinutosFin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxMinutosFin.setBounds(493, 554, 70, 24);
		add(comboBoxMinutosFin);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnAgregar.setBounds(64, 592, 153, 23);
		add(btnAgregar);
		
		btnQuitar = new JButton("Quitar");
		btnQuitar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnQuitar.setBounds(251, 592, 153, 23);
		add(btnQuitar);
		
		btnListarAgenda = new JButton("Agenda");
		btnListarAgenda.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnListarAgenda.setBounds(436, 592, 153, 23);
		add(btnListarAgenda);
		
		JLabel lblNewLabel_1_3 = new JLabel("Seleccion:");
		lblNewLabel_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(69, -132, 135, 32);
		add(lblNewLabel_1_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(69, 112, 535, 163);
		add(scrollPane);
		
		tableSeleccion = new JTable();
		scrollPane.setViewportView(tableSeleccion);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(277, 294, 263, 113);
		add(scrollPane_1);
		
		tableMesas = new JTable();
		scrollPane_1.setViewportView(tableMesas);
		
		JLabel lblNewLabel_1_4 = new JLabel("Mesas:");
		lblNewLabel_1_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_4.setBounds(93, 329, 135, 32);
		add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Restaurantes");
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_4_1.setBounds(267, 69, 135, 32);
		add(lblNewLabel_1_4_1);

	}
}
