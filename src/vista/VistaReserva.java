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
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VistaReserva extends JPanel {
	public JTextField textDiaEn;
	public JTextField textMesEn;
	public JTextField textAnioEn;
	public JTextField textDiaSa;
	public JTextField textMesSa;
	public JTextField textAnioSa;
	public JCheckBox chckbxAplicaDescuento;
	public JButton btnListarCli;
	public JButton btnAgendar;

	public JLabel lblCostoCab;
	public JLabel lblCostoDias;
	public JLabel lblTotalPagar;
	public JLabel lblAplicaDes;
	public JLabel lblCostoServ;
	public JLabel lblTotalDescuento;
	private JLabel lblCostoCab_1;
	private JTable tableCanas;
	private JTable tableReserva;
	

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
		
		JLabel lblReservarCabaa_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1.setForeground(Color.BLUE);
		lblReservarCabaa_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1.setBounds(10, 32, 659, 32);
		add(lblReservarCabaa_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Fecha de Entrada:");
		lblNewLabel_1_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_1_1.setBounds(70, 138, 199, 32);
		add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Dia:");
		lblNewLabel_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(289, 139, 41, 32);
		add(lblNewLabel_1_1_1);
		
		textDiaEn = new JTextField();
		textDiaEn.setHorizontalAlignment(SwingConstants.CENTER);
		textDiaEn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textDiaEn.setColumns(10);
		textDiaEn.setBounds(335, 143, 50, 24);
		add(textDiaEn);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Mes:");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(403, 139, 41, 32);
		add(lblNewLabel_1_1_1_1);
		
		textMesEn = new JTextField();
		textMesEn.setHorizontalAlignment(SwingConstants.CENTER);
		textMesEn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textMesEn.setColumns(10);
		textMesEn.setBounds(449, 143, 50, 24);
		add(textMesEn);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("A\u00F1o:");
		lblNewLabel_1_1_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2.setBounds(520, 139, 41, 32);
		add(lblNewLabel_1_1_1_2);
		
		textAnioEn = new JTextField();
		textAnioEn.setHorizontalAlignment(SwingConstants.CENTER);
		textAnioEn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textAnioEn.setColumns(10);
		textAnioEn.setBounds(565, 143, 50, 24);
		add(textAnioEn);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Fecha de Salida:");
		lblNewLabel_1_2_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_1_1_1.setBounds(70, 181, 199, 32);
		add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Dia:");
		lblNewLabel_1_1_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_3.setBounds(289, 182, 41, 32);
		add(lblNewLabel_1_1_1_3);
		
		textDiaSa = new JTextField();
		textDiaSa.setHorizontalAlignment(SwingConstants.CENTER);
		textDiaSa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textDiaSa.setColumns(10);
		textDiaSa.setBounds(335, 186, 50, 24);
		add(textDiaSa);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Mes:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1.setBounds(403, 182, 41, 32);
		add(lblNewLabel_1_1_1_1_1);
		
		textMesSa = new JTextField();
		textMesSa.setHorizontalAlignment(SwingConstants.CENTER);
		textMesSa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textMesSa.setColumns(10);
		textMesSa.setBounds(449, 186, 50, 24);
		add(textMesSa);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("A\u00F1o:");
		lblNewLabel_1_1_1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2_1.setBounds(520, 182, 41, 32);
		add(lblNewLabel_1_1_1_2_1);
		
		textAnioSa = new JTextField();
		textAnioSa.setHorizontalAlignment(SwingConstants.CENTER);
		textAnioSa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textAnioSa.setColumns(10);
		textAnioSa.setBounds(565, 186, 50, 24);
		add(textAnioSa);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Caba\u00F1as:");
		lblNewLabel_1_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_2.setBounds(10, 268, 94, 32);
		add(lblNewLabel_1_1_2);
		
		JLabel lblReservarCabaa_1_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1_1.setForeground(Color.BLUE);
		lblReservarCabaa_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1_1.setBounds(10, 370, 659, 32);
		add(lblReservarCabaa_1_1);
		
		JLabel lblPresio = new JLabel("PRECIO");
		lblPresio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPresio.setForeground(Color.BLUE);
		lblPresio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblPresio.setBounds(10, 360, 659, 32);
		add(lblPresio);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Total a Pagar:");
		lblNewLabel_1_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3.setBounds(70, 538, 199, 32);
		add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Costo Caba\u00F1a por dia:");
		lblNewLabel_1_1_3_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3_1.setBounds(70, 423, 199, 32);
		add(lblNewLabel_1_1_3_1);
		
		JLabel lblCantida = new JLabel("Cantidad de Dias:");
		lblCantida.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblCantida.setBounds(70, 455, 199, 32);
		add(lblCantida);
		
		btnAgendar = new JButton("Agendar");
		btnAgendar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnAgendar.setBounds(265, 581, 153, 23);
		add(btnAgendar);
		
		btnListarCli = new JButton("Listar Clientes");
		btnListarCli.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnListarCli.setBounds(510, 90, 153, 23);
		add(btnListarCli);
		
		lblCostoCab = new JLabel(".....");
		lblCostoCab.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostoCab.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblCostoCab.setBounds(279, 423, 167, 32);
		add(lblCostoCab);
		
		lblCostoDias = new JLabel(".....");
		lblCostoDias.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostoDias.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblCostoDias.setBounds(279, 455, 167, 32);
		add(lblCostoDias);
		
		lblTotalPagar = new JLabel(".....");
		lblTotalPagar.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalPagar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblTotalPagar.setBounds(279, 538, 167, 32);
		add(lblTotalPagar);
		
		lblAplicaDes = new JLabel(".....");
		lblAplicaDes.setHorizontalAlignment(SwingConstants.CENTER);
		lblAplicaDes.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblAplicaDes.setBounds(448, 487, 199, 32);
		add(lblAplicaDes);
		
		JLabel lblNewLabel_1_1_3_1_2 = new JLabel("Costo Servicios:");
		lblNewLabel_1_1_3_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3_1_2.setBounds(70, 487, 199, 32);
		add(lblNewLabel_1_1_3_1_2);
		
		lblCostoServ = new JLabel(".....");
		lblCostoServ.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostoServ.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblCostoServ.setBounds(279, 487, 167, 32);
		add(lblCostoServ);
		
		lblTotalDescuento = new JLabel(".....");
		lblTotalDescuento.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalDescuento.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblTotalDescuento.setBounds(449, 538, 199, 32);
		add(lblTotalDescuento);
		
		chckbxAplicaDescuento = new JCheckBox("Aplica Descuento");
		chckbxAplicaDescuento.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxAplicaDescuento.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		chckbxAplicaDescuento.setBounds(448, 455, 199, 32);
		add(chckbxAplicaDescuento);
		
		lblCostoCab_1 = new JLabel(".....");
		lblCostoCab_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostoCab_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblCostoCab_1.setBounds(279, 84, 210, 32);
		add(lblCostoCab_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(99, 230, 286, 129);
		add(scrollPane);
		
		tableCanas = new JTable();
		scrollPane.setViewportView(tableCanas);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(403, 230, 286, 129);
		add(scrollPane_1);
		
		tableReserva = new JTable();
		tableReserva.setEnabled(false);
		scrollPane_1.setViewportView(tableReserva);

	}
}
