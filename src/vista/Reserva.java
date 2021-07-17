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
import javax.swing.JCheckBox;

public class Reserva extends JPanel {
	private JTextField textFieldIden;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Create the panel.
	 */
	public Reserva() {
		setLayout(null);
		
		JLabel lblReservarCabaa = new JLabel("RESERVAR CABA\u00D1A");
		lblReservarCabaa.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa.setForeground(Color.BLUE);
		lblReservarCabaa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa.setBounds(10, 23, 659, 32);
		add(lblReservarCabaa);
		
		JLabel lblNewLabel_1_1 = new JLabel("Identificacion Cliente:");
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(70, 84, 199, 32);
		add(lblNewLabel_1_1);
		
		textFieldIden = new JTextField();
		textFieldIden.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textFieldIden.setColumns(10);
		textFieldIden.setBounds(279, 89, 326, 24);
		add(textFieldIden);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tipo de Caba\u00F1a:");
		lblNewLabel_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(70, 161, 199, 32);
		add(lblNewLabel_1_2);
		
		JLabel lblReservarCabaa_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1.setForeground(Color.BLUE);
		lblReservarCabaa_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1.setBounds(20, 33, 659, 32);
		add(lblReservarCabaa_1);
		
		JButton btnRevisar = new JButton("Comprobar");
		btnRevisar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnRevisar.setBounds(265, 127, 153, 23);
		add(btnRevisar);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Servicios:");
		lblNewLabel_1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(70, 196, 135, 32);
		add(lblNewLabel_1_2_1);
		
		JComboBox comboBoxIden = new JComboBox();
		comboBoxIden.setModel(new DefaultComboBoxModel(new String[] {"Piscina", "Playa"}));
		comboBoxIden.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxIden.setBounds(346, 166, 204, 24);
		add(comboBoxIden);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Fecha de Entrada:");
		lblNewLabel_1_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_1_1.setBounds(70, 269, 199, 32);
		add(lblNewLabel_1_2_1_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Parasol");
		chckbxNewCheckBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		chckbxNewCheckBox.setBounds(304, 196, 142, 32);
		add(chckbxNewCheckBox);
		
		JCheckBox chckbxSpa = new JCheckBox("Spa");
		chckbxSpa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		chckbxSpa.setBounds(304, 231, 142, 32);
		add(chckbxSpa);
		
		JCheckBox chckbxToallas = new JCheckBox("Toallas");
		chckbxToallas.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		chckbxToallas.setBounds(448, 196, 89, 32);
		add(chckbxToallas);
		
		JCheckBox chckbxTransporte = new JCheckBox("Transporte");
		chckbxTransporte.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		chckbxTransporte.setBounds(448, 231, 142, 32);
		add(chckbxTransporte);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Dia:");
		lblNewLabel_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(279, 269, 41, 32);
		add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(325, 273, 50, 24);
		add(textField);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Mes:");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(393, 269, 41, 32);
		add(lblNewLabel_1_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(439, 273, 50, 24);
		add(textField_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("A\u00F1o:");
		lblNewLabel_1_1_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2.setBounds(510, 269, 41, 32);
		add(lblNewLabel_1_1_1_2);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(555, 273, 50, 24);
		add(textField_2);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Fecha de Salida:");
		lblNewLabel_1_2_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_1_1_1.setBounds(70, 312, 199, 32);
		add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Dia:");
		lblNewLabel_1_1_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_3.setBounds(279, 312, 41, 32);
		add(lblNewLabel_1_1_1_3);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(325, 316, 50, 24);
		add(textField_3);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Mes:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1.setBounds(393, 312, 41, 32);
		add(lblNewLabel_1_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(439, 316, 50, 24);
		add(textField_4);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("A\u00F1o:");
		lblNewLabel_1_1_1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2_1.setBounds(510, 312, 41, 32);
		add(lblNewLabel_1_1_1_2_1);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBounds(555, 316, 50, 24);
		add(textField_5);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Tama\u00F1o de Caba\u00F1a:");
		lblNewLabel_1_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_2.setBounds(70, 355, 199, 32);
		add(lblNewLabel_1_1_2);
		
		JComboBox comboBoxIden_1 = new JComboBox();
		comboBoxIden_1.setModel(new DefaultComboBoxModel(new String[] {"4 Personas", "6 Personas", "8 Personas", "10 Personas"}));
		comboBoxIden_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxIden_1.setBounds(346, 363, 204, 24);
		add(comboBoxIden_1);
		
		JLabel lblReservarCabaa_1_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1_1.setForeground(Color.BLUE);
		lblReservarCabaa_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1_1.setBounds(10, 425, 659, 32);
		add(lblReservarCabaa_1_1);
		
		JLabel lblPresio = new JLabel("PRECIO");
		lblPresio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPresio.setForeground(Color.BLUE);
		lblPresio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblPresio.setBounds(10, 415, 659, 32);
		add(lblPresio);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Total a Pagar:");
		lblNewLabel_1_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3.setBounds(70, 562, 199, 32);
		add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Costo Caba\u00F1a:");
		lblNewLabel_1_1_3_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3_1.setBounds(70, 476, 199, 32);
		add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_1_3_1_1 = new JLabel("Costo Dias:");
		lblNewLabel_1_1_3_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3_1_1.setBounds(70, 519, 199, 32);
		add(lblNewLabel_1_1_3_1_1);
		
		JLabel lblNewLabel_1_1_3_1_1_1 = new JLabel("Aplica Descuento");
		lblNewLabel_1_1_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3_1_1_1.setBounds(439, 476, 199, 32);
		add(lblNewLabel_1_1_3_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(225, 476, 173, 24);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_7.setColumns(10);
		textField_7.setBounds(225, 519, 173, 24);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(448, 519, 173, 24);
		add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(225, 562, 173, 24);
		add(textField_9);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnPagar.setBounds(265, 605, 153, 23);
		add(btnPagar);
		
		JComboBox comboBoxIden_2 = new JComboBox();
		comboBoxIden_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBoxIden_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxIden_2.setBounds(547, 201, 58, 24);
		add(comboBoxIden_2);

	}
}
