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

public class VistaReserva extends JPanel {
	public JTextField textIden;
	public JTextField textDiaEn;
	public JTextField textMesEn;
	public JTextField textAnioEn;
	public JTextField textDiaSa;
	public JTextField textMesSa;
	public JTextField textAnioSa;

	public JCheckBox chckbxParasol;
	public JCheckBox chckbxSpa;
	public JCheckBox chckbxToallas;
	public JCheckBox chckbxTransporte;
	public JCheckBox chckbxAplicaDescuento;

	public JComboBox<String> comboBoxTipoCab;
	public JComboBox<String> comboBoxTamCab;
	public JComboBox<String> comboBoxToallas;

	public JButton btnComprobar;
	public JButton btnListarCli;
	public JButton btnListarCab;
	public JButton btnLimpiar;
	public JButton btnAgendar;

	public JLabel lblCostoCab;
	public JLabel lblCostoDias;
	public JLabel lblTotalPagar;
	public JLabel lblAplicaDes;
	public JLabel lblCostoServ;
	public JLabel lblTotalDescuento;
	

	/**
	 * Create the panel.
	 */
	public VistaReserva() {
		setLayout(null);
		
		JLabel lblReservarCabaa = new JLabel("RESERVAR CABA\u00D1A");
		lblReservarCabaa.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa.setForeground(Color.BLUE);
		lblReservarCabaa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa.setBounds(10, 21, 659, 32);
		add(lblReservarCabaa);
		
		JLabel lblNewLabel_1_1 = new JLabel("Identificacion Cliente:");
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(70, 84, 199, 32);
		add(lblNewLabel_1_1);
		
		textIden = new JTextField();
		textIden.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textIden.setColumns(10);
		textIden.setBounds(279, 89, 221, 24);
		add(textIden);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tipo de Caba\u00F1a:");
		lblNewLabel_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(70, 161, 199, 32);
		add(lblNewLabel_1_2);
		
		JLabel lblReservarCabaa_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1.setForeground(Color.BLUE);
		lblReservarCabaa_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1.setBounds(10, 32, 659, 32);
		add(lblReservarCabaa_1);
		
		btnComprobar = new JButton("Comprobar");
		btnComprobar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnComprobar.setBounds(172, 125, 153, 23);
		add(btnComprobar);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Servicios:");
		lblNewLabel_1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(70, 196, 135, 32);
		add(lblNewLabel_1_2_1);
		
		comboBoxTipoCab = new JComboBox<String>();
		comboBoxTipoCab.setModel(new DefaultComboBoxModel<String>(new String[] {"Piscina", "Playa"}));
		comboBoxTipoCab.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxTipoCab.setBounds(279, 166, 221, 24);
		add(comboBoxTipoCab);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Fecha de Entrada:");
		lblNewLabel_1_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_1_1.setBounds(70, 269, 199, 32);
		add(lblNewLabel_1_2_1_1);
		
		chckbxParasol = new JCheckBox("Parasol");
		chckbxParasol.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		chckbxParasol.setBounds(304, 196, 142, 32);
		add(chckbxParasol);
		
		chckbxSpa = new JCheckBox("Spa");
		chckbxSpa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		chckbxSpa.setBounds(304, 231, 142, 32);
		add(chckbxSpa);
		
		chckbxToallas = new JCheckBox("Toallas");
		chckbxToallas.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		chckbxToallas.setBounds(448, 196, 89, 32);
		add(chckbxToallas);
		
		chckbxTransporte = new JCheckBox("Transporte");
		chckbxTransporte.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		chckbxTransporte.setBounds(448, 231, 142, 32);
		add(chckbxTransporte);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Dia:");
		lblNewLabel_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(279, 269, 41, 32);
		add(lblNewLabel_1_1_1);
		
		textDiaEn = new JTextField();
		textDiaEn.setHorizontalAlignment(SwingConstants.CENTER);
		textDiaEn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textDiaEn.setColumns(10);
		textDiaEn.setBounds(325, 273, 50, 24);
		add(textDiaEn);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Mes:");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(393, 269, 41, 32);
		add(lblNewLabel_1_1_1_1);
		
		textMesEn = new JTextField();
		textMesEn.setHorizontalAlignment(SwingConstants.CENTER);
		textMesEn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textMesEn.setColumns(10);
		textMesEn.setBounds(439, 273, 50, 24);
		add(textMesEn);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("A\u00F1o:");
		lblNewLabel_1_1_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2.setBounds(510, 269, 41, 32);
		add(lblNewLabel_1_1_1_2);
		
		textAnioEn = new JTextField();
		textAnioEn.setHorizontalAlignment(SwingConstants.CENTER);
		textAnioEn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textAnioEn.setColumns(10);
		textAnioEn.setBounds(555, 273, 50, 24);
		add(textAnioEn);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Fecha de Salida:");
		lblNewLabel_1_2_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_1_1_1.setBounds(70, 312, 199, 32);
		add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Dia:");
		lblNewLabel_1_1_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_3.setBounds(279, 312, 41, 32);
		add(lblNewLabel_1_1_1_3);
		
		textDiaSa = new JTextField();
		textDiaSa.setHorizontalAlignment(SwingConstants.CENTER);
		textDiaSa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textDiaSa.setColumns(10);
		textDiaSa.setBounds(325, 316, 50, 24);
		add(textDiaSa);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Mes:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1.setBounds(393, 312, 41, 32);
		add(lblNewLabel_1_1_1_1_1);
		
		textMesSa = new JTextField();
		textMesSa.setHorizontalAlignment(SwingConstants.CENTER);
		textMesSa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textMesSa.setColumns(10);
		textMesSa.setBounds(439, 316, 50, 24);
		add(textMesSa);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("A\u00F1o:");
		lblNewLabel_1_1_1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2_1.setBounds(510, 312, 41, 32);
		add(lblNewLabel_1_1_1_2_1);
		
		textAnioSa = new JTextField();
		textAnioSa.setHorizontalAlignment(SwingConstants.CENTER);
		textAnioSa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textAnioSa.setColumns(10);
		textAnioSa.setBounds(555, 316, 50, 24);
		add(textAnioSa);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Tama\u00F1o de Caba\u00F1a:");
		lblNewLabel_1_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_2.setBounds(70, 355, 199, 32);
		add(lblNewLabel_1_1_2);
		
		comboBoxTamCab = new JComboBox<String>();
		comboBoxTamCab.setModel(new DefaultComboBoxModel<String>(new String[] {"4 Personas", "6 Personas", "8 Personas", "10 Personas"}));
		comboBoxTamCab.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxTamCab.setBounds(346, 363, 204, 24);
		add(comboBoxTamCab);
		
		JLabel lblReservarCabaa_1_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1_1.setForeground(Color.BLUE);
		lblReservarCabaa_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1_1.setBounds(10, 408, 659, 32);
		add(lblReservarCabaa_1_1);
		
		JLabel lblPresio = new JLabel("PRECIO");
		lblPresio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPresio.setForeground(Color.BLUE);
		lblPresio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblPresio.setBounds(10, 398, 659, 32);
		add(lblPresio);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Total a Pagar:");
		lblNewLabel_1_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3.setBounds(70, 562, 199, 32);
		add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Costo Caba\u00F1a por dia:");
		lblNewLabel_1_1_3_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3_1.setBounds(70, 447, 199, 32);
		add(lblNewLabel_1_1_3_1);
		
		JLabel lblCantida = new JLabel("Cantidad de Dias:");
		lblCantida.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblCantida.setBounds(70, 479, 199, 32);
		add(lblCantida);
		
		btnAgendar = new JButton("Agendar");
		btnAgendar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnAgendar.setBounds(265, 605, 153, 23);
		add(btnAgendar);
		
		comboBoxToallas = new JComboBox<String>();
		comboBoxToallas.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4"}));
		comboBoxToallas.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxToallas.setBounds(547, 201, 58, 24);
		add(comboBoxToallas);
		
		btnListarCli = new JButton("Listar Clientes");
		btnListarCli.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnListarCli.setBounds(510, 90, 153, 23);
		add(btnListarCli);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnLimpiar.setBounds(376, 127, 153, 23);
		add(btnLimpiar);
		
		lblCostoCab = new JLabel(".....");
		lblCostoCab.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostoCab.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblCostoCab.setBounds(279, 447, 167, 32);
		add(lblCostoCab);
		
		lblCostoDias = new JLabel(".....");
		lblCostoDias.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostoDias.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblCostoDias.setBounds(279, 479, 167, 32);
		add(lblCostoDias);
		
		lblTotalPagar = new JLabel(".....");
		lblTotalPagar.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalPagar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblTotalPagar.setBounds(279, 562, 167, 32);
		add(lblTotalPagar);
		
		lblAplicaDes = new JLabel(".....");
		lblAplicaDes.setHorizontalAlignment(SwingConstants.CENTER);
		lblAplicaDes.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblAplicaDes.setBounds(448, 511, 199, 32);
		add(lblAplicaDes);
		
		JLabel lblNewLabel_1_1_3_1_2 = new JLabel("Costo Servicios:");
		lblNewLabel_1_1_3_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3_1_2.setBounds(70, 511, 199, 32);
		add(lblNewLabel_1_1_3_1_2);
		
		lblCostoServ = new JLabel(".....");
		lblCostoServ.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostoServ.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblCostoServ.setBounds(279, 511, 167, 32);
		add(lblCostoServ);
		
		lblTotalDescuento = new JLabel(".....");
		lblTotalDescuento.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalDescuento.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblTotalDescuento.setBounds(449, 562, 199, 32);
		add(lblTotalDescuento);
		
		chckbxAplicaDescuento = new JCheckBox("Aplica Descuento");
		chckbxAplicaDescuento.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxAplicaDescuento.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		chckbxAplicaDescuento.setBounds(448, 479, 199, 32);
		add(chckbxAplicaDescuento);
		
		btnListarCab = new JButton("Listar Clientes");
		btnListarCab.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnListarCab.setBounds(510, 169, 153, 23);
		add(btnListarCab);

	}
}
