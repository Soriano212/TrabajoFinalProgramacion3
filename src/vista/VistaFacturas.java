package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VistaFacturas extends JPanel {

	/**
	 * Create the panel.
	 */
	public VistaFacturas() {
		setLayout(null);
		
		JLabel lblCostosCliente = new JLabel("CLIENTE");
		lblCostosCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostosCliente.setForeground(Color.BLUE);
		lblCostosCliente.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblCostosCliente.setBounds(10, 11, 659, 32);
		add(lblCostosCliente);
		
		JLabel lblReservarCabaa_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1.setForeground(Color.BLUE);
		lblReservarCabaa_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1.setBounds(20, 16, 659, 32);
		add(lblReservarCabaa_1);
		
		JLabel lblNewLabel_1 = new JLabel("Identificacion:");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(70, 54, 135, 32);
		add(lblNewLabel_1);
		
		JButton btnVer = new JButton("Listar");
		btnVer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnVer.setBounds(564, 60, 92, 23);
		add(btnVer);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombres:");
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(70, 97, 135, 32);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Apellidos:");
		lblNewLabel_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(70, 139, 135, 32);
		add(lblNewLabel_1_2);
		
		JLabel lblNombres = new JLabel(".....");
		lblNombres.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombres.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNombres.setBounds(279, 97, 326, 32);
		add(lblNombres);
		
		JLabel lblApellidos = new JLabel(".....");
		lblApellidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellidos.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblApellidos.setBounds(279, 139, 326, 32);
		add(lblApellidos);
		
		JLabel lblDatosBancarios = new JLabel("DATOS BANCARIOS");
		lblDatosBancarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosBancarios.setForeground(Color.BLUE);
		lblDatosBancarios.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblDatosBancarios.setBounds(10, 182, 659, 32);
		add(lblDatosBancarios);
		
		JLabel lblReservarCabaa_1_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1_1.setForeground(Color.BLUE);
		lblReservarCabaa_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1_1.setBounds(10, 187, 659, 32);
		add(lblReservarCabaa_1_1);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Banco Emisor:");
		lblNewLabel_1_2_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_3.setBounds(70, 225, 135, 32);
		add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Numero de Tarjeta:");
		lblNewLabel_1_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_1_1.setBounds(70, 268, 194, 32);
		add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("Fecha de Caducidad:");
		lblNewLabel_1_2_2_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_2_2.setBounds(70, 307, 194, 32);
		add(lblNewLabel_1_2_2_2);
		
		JLabel lblBanco = new JLabel(".....");
		lblBanco.setHorizontalAlignment(SwingConstants.CENTER);
		lblBanco.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblBanco.setBounds(279, 225, 326, 32);
		add(lblBanco);
		
		JLabel lblTarjeta = new JLabel(".....");
		lblTarjeta.setHorizontalAlignment(SwingConstants.CENTER);
		lblTarjeta.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblTarjeta.setBounds(279, 268, 326, 32);
		add(lblTarjeta);
		
		JLabel lblCaducidad = new JLabel(".....");
		lblCaducidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCaducidad.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblCaducidad.setBounds(279, 307, 326, 32);
		add(lblCaducidad);
		
		JLabel lblCostos = new JLabel("COSTOS");
		lblCostos.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostos.setForeground(Color.BLUE);
		lblCostos.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblCostos.setBounds(10, 354, 659, 32);
		add(lblCostos);
		
		JLabel lblReservarCabaa_1_1_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1_1_1.setForeground(Color.BLUE);
		lblReservarCabaa_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1_1_1.setBounds(10, 359, 659, 32);
		add(lblReservarCabaa_1_1_1);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Hospedaje:");
		lblNewLabel_1_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3.setBounds(70, 511, 199, 32);
		add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_3_1_1_1 = new JLabel("Aplica Descuento");
		lblNewLabel_1_1_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3_1_1_1.setBounds(439, 452, 199, 32);
		add(lblNewLabel_1_1_3_1_1_1);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Restaurante:");
		lblNewLabel_1_1_3_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3_1.setBounds(70, 468, 199, 32);
		add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_1_3_2 = new JLabel("Servicios:");
		lblNewLabel_1_1_3_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3_2.setBounds(70, 425, 199, 32);
		add(lblNewLabel_1_1_3_2);
		
		JLabel lblServicios = new JLabel(".....");
		lblServicios.setHorizontalAlignment(SwingConstants.CENTER);
		lblServicios.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblServicios.setBounds(201, 425, 222, 32);
		add(lblServicios);
		
		JLabel lblRestaurante = new JLabel(".....");
		lblRestaurante.setHorizontalAlignment(SwingConstants.CENTER);
		lblRestaurante.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblRestaurante.setBounds(201, 464, 222, 32);
		add(lblRestaurante);
		
		JLabel lblHospedaje = new JLabel(".....");
		lblHospedaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblHospedaje.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblHospedaje.setBounds(201, 511, 222, 32);
		add(lblHospedaje);
		
		JLabel lblDescuento = new JLabel(".....");
		lblDescuento.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescuento.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblDescuento.setBounds(421, 495, 222, 32);
		add(lblDescuento);
		
		JLabel lblIden = new JLabel(".....");
		lblIden.setHorizontalAlignment(SwingConstants.CENTER);
		lblIden.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblIden.setBounds(279, 54, 326, 32);
		add(lblIden);
		
		JLabel lblTotalPagar = new JLabel(".....");
		lblTotalPagar.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalPagar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblTotalPagar.setBounds(201, 576, 222, 32);
		add(lblTotalPagar);
		
		JLabel lblNewLabel_1_1_3_3 = new JLabel("Total a Pagar:");
		lblNewLabel_1_1_3_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_3_3.setBounds(70, 576, 199, 32);
		add(lblNewLabel_1_1_3_3);

	}

}
