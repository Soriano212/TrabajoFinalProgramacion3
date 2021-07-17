package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Servicios extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public Servicios() {
		setLayout(null);
		
		JLabel lblSolicitarServicios = new JLabel("SOLICITAR SERVICIOS");
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
		
		JLabel lblNewLabel_1_1 = new JLabel("Identificacion Cliente:");
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(72, 54, 199, 32);
		add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(281, 59, 326, 24);
		add(textField);
		
		JButton btnRevisar = new JButton("Comprobar");
		btnRevisar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnRevisar.setBounds(267, 97, 153, 23);
		add(btnRevisar);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Parasol");
		chckbxNewCheckBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		chckbxNewCheckBox.setBounds(72, 127, 142, 32);
		add(chckbxNewCheckBox);
		
		JCheckBox chckbxSpa = new JCheckBox("Spa");
		chckbxSpa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		chckbxSpa.setBounds(72, 162, 142, 32);
		add(chckbxSpa);
		
		JCheckBox chckbxToallas = new JCheckBox("Toallas");
		chckbxToallas.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		chckbxToallas.setBounds(216, 127, 89, 32);
		add(chckbxToallas);
		
		JCheckBox chckbxTransporte = new JCheckBox("Transporte");
		chckbxTransporte.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		chckbxTransporte.setBounds(216, 162, 142, 32);
		add(chckbxTransporte);
		
		JComboBox comboBoxIden_2 = new JComboBox();
		comboBoxIden_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBoxIden_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxIden_2.setBounds(315, 132, 58, 24);
		add(comboBoxIden_2);
		
		JButton btnSolicitar = new JButton("Solicitar");
		btnSolicitar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnSolicitar.setBounds(419, 147, 153, 23);
		add(btnSolicitar);
		
		JLabel lblCostos = new JLabel("COSTOS");
		lblCostos.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostos.setForeground(Color.BLUE);
		lblCostos.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblCostos.setBounds(10, 201, 659, 32);
		add(lblCostos);
		
		JLabel lblReservarCabaa_1_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1_1.setForeground(Color.BLUE);
		lblReservarCabaa_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1_1.setBounds(10, 211, 659, 32);
		add(lblReservarCabaa_1_1);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Total a Pagar:");
		lblNewLabel_1_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3.setBounds(56, 270, 199, 32);
		add(lblNewLabel_1_1_3);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(216, 275, 173, 24);
		add(textField_1);
		
		JLabel lblNewLabel_1_1_3_1_1_1 = new JLabel("Aplica Descuento");
		lblNewLabel_1_1_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3_1_1_1.setBounds(425, 254, 199, 32);
		add(lblNewLabel_1_1_3_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(434, 297, 173, 24);
		add(textField_2);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnPagar.setBounds(267, 336, 153, 23);
		add(btnPagar);
		
		JLabel lblRetirarServicio = new JLabel("RETIRAR SERVICIO");
		lblRetirarServicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblRetirarServicio.setForeground(Color.BLUE);
		lblRetirarServicio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblRetirarServicio.setBounds(10, 389, 659, 32);
		add(lblRetirarServicio);
		
		JLabel lblReservarCabaa_1_1_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1_1_1.setForeground(Color.BLUE);
		lblReservarCabaa_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1_1_1.setBounds(10, 399, 659, 32);
		add(lblReservarCabaa_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(281, 501, 326, 24);
		add(textField_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Identificacion Cliente:");
		lblNewLabel_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(72, 496, 199, 32);
		add(lblNewLabel_1_1_1);
		
		JButton btnRetirar = new JButton("Retirar");
		btnRetirar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnRetirar.setBounds(267, 539, 153, 23);
		add(btnRetirar);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Servicios:");
		lblNewLabel_1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(72, 442, 135, 32);
		add(lblNewLabel_1_2_1);
		
		JComboBox comboBoxIden = new JComboBox();
		comboBoxIden.setModel(new DefaultComboBoxModel(new String[] {"Toalllas", "Parasol", "Spa", "Transporte"}));
		comboBoxIden.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxIden.setBounds(337, 447, 204, 24);
		add(comboBoxIden);

	}
}
