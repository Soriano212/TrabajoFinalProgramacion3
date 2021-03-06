package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VistaEmpresa extends JPanel {
	public JTextField textIden;
	public JTextField textNombres;
	public JTextField textApellidos;
	public JTextField textNombreEmpresa;
	public JTextField textDireccionEmpresa;
	public JTextField textIden2;
	public JTextField textProcentaje;

	public JLabel lblPorcentaje;

	public JButton btnRegistrar;
	public JButton btnModificarProp;
	public JButton btnLimpiar;
	public JButton btnModificarEmpresa;
	public JButton btnMas;
	public JButton btnEliminar;
	public JButton btnVer;

	public JTable tablePropietarios;

	public JComboBox<String> comboBoxIden;

	/**
	 * Create the panel.
	 */
	public VistaEmpresa() {
		setLayout(null);
		
		JLabel lblGestionarPropietarios = new JLabel("PROPIETARIOS");
		lblGestionarPropietarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionarPropietarios.setForeground(Color.BLUE);
		lblGestionarPropietarios.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblGestionarPropietarios.setBounds(10, 11, 659, 32);
		add(lblGestionarPropietarios);
		
		JLabel lblReservarCabaa_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1.setForeground(Color.BLUE);
		lblReservarCabaa_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1.setBounds(10, 16, 659, 32);
		add(lblReservarCabaa_1);
		
		JLabel lblNewLabel_1 = new JLabel("Identificacion:");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(70, 54, 135, 32);
		add(lblNewLabel_1);
		
		comboBoxIden = new JComboBox<String>();
		comboBoxIden.setModel(new DefaultComboBoxModel<String>(new String[] {"Cedula", "Pasaporte"}));
		comboBoxIden.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxIden.setBounds(279, 59, 115, 24);
		add(comboBoxIden);
		
		textIden = new JTextField();
		textIden.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textIden.setColumns(10);
		textIden.setBounds(404, 59, 109, 24);
		add(textIden);
		
		btnVer = new JButton("Ver");
		btnVer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnVer.setBounds(523, 60, 82, 23);
		add(btnVer);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombres:");
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(70, 97, 135, 32);
		add(lblNewLabel_1_1);
		
		textNombres = new JTextField();
		textNombres.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textNombres.setColumns(10);
		textNombres.setBounds(279, 102, 326, 24);
		add(textNombres);
		
		JLabel lblNewLabel_1_2 = new JLabel("Apellidos:");
		lblNewLabel_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(70, 139, 135, 32);
		add(lblNewLabel_1_2);
		
		textApellidos = new JTextField();
		textApellidos.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textApellidos.setColumns(10);
		textApellidos.setBounds(279, 144, 326, 24);
		add(textApellidos);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnRegistrar.setBounds(70, 285, 109, 23);
		add(btnRegistrar);
		
		btnModificarProp = new JButton("Modificar");
		btnModificarProp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnModificarProp.setBounds(217, 285, 109, 23);
		add(btnModificarProp);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnLimpiar.setBounds(496, 285, 109, 23);
		add(btnLimpiar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(70, 319, 535, 113);
		add(scrollPane);
		
		tablePropietarios = new JTable();
		tablePropietarios.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		scrollPane.setViewportView(tablePropietarios);
		
		JLabel lblEmpresa = new JLabel("EMPRESA");
		lblEmpresa.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpresa.setForeground(Color.BLUE);
		lblEmpresa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblEmpresa.setBounds(10, 443, 659, 32);
		add(lblEmpresa);
		
		JLabel lblReservarCabaa_1_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1_1.setForeground(Color.BLUE);
		lblReservarCabaa_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1_1.setBounds(10, 453, 659, 32);
		add(lblReservarCabaa_1_1);
		
		textNombreEmpresa = new JTextField();
		textNombreEmpresa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textNombreEmpresa.setColumns(10);
		textNombreEmpresa.setBounds(279, 514, 326, 24);
		add(textNombreEmpresa);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nombre:");
		lblNewLabel_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(70, 509, 135, 32);
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Direccion:");
		lblNewLabel_1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(70, 551, 135, 32);
		add(lblNewLabel_1_2_1);
		
		textDireccionEmpresa = new JTextField();
		textDireccionEmpresa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textDireccionEmpresa.setColumns(10);
		textDireccionEmpresa.setBounds(279, 556, 326, 24);
		add(textDireccionEmpresa);
		
		btnModificarEmpresa = new JButton("Modificar");
		btnModificarEmpresa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnModificarEmpresa.setBounds(264, 601, 153, 23);
		add(btnModificarEmpresa);
		
		JLabel lblNewLabel_1_3 = new JLabel("Porcentaje Obtenido:");
		lblNewLabel_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(70, 182, 188, 32);
		add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Quitar Porcentaje de:");
		lblNewLabel_1_3_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_3_1.setBounds(70, 225, 277, 32);
		add(lblNewLabel_1_3_1);
		
		textIden2 = new JTextField();
		textIden2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textIden2.setColumns(10);
		textIden2.setBounds(292, 230, 127, 24);
		add(textIden2);
		
		textProcentaje = new JTextField();
		textProcentaje.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textProcentaje.setColumns(10);
		textProcentaje.setBounds(479, 230, 54, 24);
		add(textProcentaje);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("%");
		lblNewLabel_1_3_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_3_1_1.setBounds(535, 225, 21, 32);
		add(lblNewLabel_1_3_1_1);
		
		btnMas = new JButton("+");
		btnMas.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnMas.setBounds(533, 188, 72, 23);
		add(btnMas);
		
		lblPorcentaje = new JLabel("0%");
		lblPorcentaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorcentaje.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblPorcentaje.setBounds(343, 182, 135, 32);
		add(lblPorcentaje);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnEliminar.setBounds(355, 285, 109, 23);
		add(btnEliminar);

	}
}
