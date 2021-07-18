package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class Registro extends JPanel {
	
	private final ButtonGroup buttonGroupRegistro = new ButtonGroup();

	public JTextField textFieldIden;
	public JTextField textFieldNombres;
	public JTextField textFieldApellidos;
	public JTextField textFieldProf;
	public JTextField textFieldDiaCli;
	public JTextField textFieldCell;
	public JTextField textFieldFijo;
	public JTextField textFieldDirec;
	public JTextField textFieldMesCli;
	public JTextField textFieldAnioCli;
	public JTextField textFieldBanco;
	public JTextField textFieldMesBan;
	public JTextField textFieldAnioBan;
	public JTextField textFieldNumTar;

	public JRadioButton rdbtnSi;
	public JRadioButton rdbtnNo;
	
	public JCheckBox chckbxEstado;

	public JComboBox<String> comboBoxIden;

	public JButton btnRegistrar;
	public JButton btnLimpiar;
	public JButton btnVer;
	public JButton btnModificar;
	public JButton btnListar;
	
	public JLabel lblEstado;

	/**
	 * Create the panel.
	 */
	public Registro() {
		setLayout(null);

		JLabel lblNewLabel = new JLabel("NUEVO CLIENTE");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 659, 32);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Identificacion:");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(70, 54, 135, 32);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombres:");
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(70, 97, 135, 32);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Apellidos:");
		lblNewLabel_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(70, 139, 135, 32);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Profesion:");
		lblNewLabel_1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(70, 182, 135, 32);
		add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Fecha de Nacimiento:");
		lblNewLabel_1_2_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_2.setBounds(70, 221, 194, 32);
		add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Telefono Celular:");
		lblNewLabel_1_2_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_2_1.setBounds(70, 264, 194, 32);
		add(lblNewLabel_1_2_2_1);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("Telefono Fijo:");
		lblNewLabel_1_2_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_2_1_1.setBounds(70, 307, 194, 32);
		add(lblNewLabel_1_2_2_1_1);
		
		JLabel lblNewLabel_1_2_2_1_1_1 = new JLabel("Direccion:");
		lblNewLabel_1_2_2_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_2_1_1_1.setBounds(70, 350, 194, 32);
		add(lblNewLabel_1_2_2_1_1_1);
		
		JLabel lblNewLabel_1_2_2_1_1_1_1 = new JLabel("Afiliado:");
		lblNewLabel_1_2_2_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_2_1_1_1_1.setBounds(70, 393, 194, 32);
		add(lblNewLabel_1_2_2_1_1_1_1);
		
		rdbtnSi = new JRadioButton("Si");
		buttonGroupRegistro.add(rdbtnSi);
		rdbtnSi.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		rdbtnSi.setBounds(342, 398, 109, 23);
		add(rdbtnSi);
		
		rdbtnNo = new JRadioButton("No");
		rdbtnNo.setSelected(true);
		buttonGroupRegistro.add(rdbtnNo);
		rdbtnNo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		rdbtnNo.setBounds(462, 398, 75, 23);
		add(rdbtnNo);
		
		comboBoxIden = new JComboBox<String>();
		comboBoxIden.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxIden.setModel(new DefaultComboBoxModel<String>(new String[] {"Cedula", "Pasaporte"}));
		comboBoxIden.setBounds(279, 59, 115, 24);
		add(comboBoxIden);
		
		textFieldIden = new JTextField();
		textFieldIden.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textFieldIden.setBounds(404, 59, 109, 24);
		textFieldIden.setColumns(10);
		add(textFieldIden);
		
		textFieldNombres = new JTextField();
		textFieldNombres.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textFieldNombres.setColumns(10);
		textFieldNombres.setBounds(279, 102, 326, 24);
		add(textFieldNombres);
		
		textFieldApellidos = new JTextField();
		textFieldApellidos.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textFieldApellidos.setColumns(10);
		textFieldApellidos.setBounds(279, 144, 326, 24);
		add(textFieldApellidos);
		
		textFieldProf = new JTextField();
		textFieldProf.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textFieldProf.setColumns(10);
		textFieldProf.setBounds(279, 187, 326, 24);
		add(textFieldProf);
		
		textFieldDiaCli = new JTextField();
		textFieldDiaCli.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDiaCli.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textFieldDiaCli.setColumns(10);
		textFieldDiaCli.setBounds(325, 226, 50, 24);
		add(textFieldDiaCli);
		
		textFieldCell = new JTextField();
		textFieldCell.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textFieldCell.setColumns(10);
		textFieldCell.setBounds(279, 269, 326, 24);
		add(textFieldCell);
		
		textFieldFijo = new JTextField();
		textFieldFijo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textFieldFijo.setColumns(10);
		textFieldFijo.setBounds(279, 312, 326, 24);
		add(textFieldFijo);
		
		textFieldDirec = new JTextField();
		textFieldDirec.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textFieldDirec.setColumns(10);
		textFieldDirec.setBounds(279, 355, 326, 24);
		add(textFieldDirec);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Dia:");
		lblNewLabel_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(279, 222, 41, 32);
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Mes:");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(393, 222, 41, 32);
		add(lblNewLabel_1_1_1_1);
		
		textFieldMesCli = new JTextField();
		textFieldMesCli.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMesCli.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textFieldMesCli.setColumns(10);
		textFieldMesCli.setBounds(439, 226, 50, 24);
		add(textFieldMesCli);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("A\u00F1o:");
		lblNewLabel_1_1_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2.setBounds(510, 222, 41, 32);
		add(lblNewLabel_1_1_1_2);
		
		textFieldAnioCli = new JTextField();
		textFieldAnioCli.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAnioCli.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textFieldAnioCli.setColumns(10);
		textFieldAnioCli.setBounds(555, 226, 50, 24);
		add(textFieldAnioCli);
		
		JLabel lblDatosBancarios = new JLabel("DATOS BANCARIOS");
		lblDatosBancarios.setForeground(Color.BLUE);
		lblDatosBancarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosBancarios.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblDatosBancarios.setBounds(10, 432, 659, 32);
		add(lblDatosBancarios);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Banco Emisor:");
		lblNewLabel_1_2_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_3.setBounds(70, 475, 135, 32);
		add(lblNewLabel_1_2_3);
		
		textFieldBanco = new JTextField();
		textFieldBanco.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textFieldBanco.setColumns(10);
		textFieldBanco.setBounds(279, 480, 326, 24);
		add(textFieldBanco);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Numero de Tarjeta:");
		lblNewLabel_1_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_1_1.setBounds(70, 518, 194, 32);
		add(lblNewLabel_1_2_1_1);
		
		textFieldNumTar = new JTextField();
		textFieldNumTar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textFieldNumTar.setColumns(10);
		textFieldNumTar.setBounds(279, 523, 326, 24);
		add(textFieldNumTar);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("Fecha de Caducidad:");
		lblNewLabel_1_2_2_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_2_2.setBounds(70, 557, 194, 32);
		add(lblNewLabel_1_2_2_2);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Mes:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1.setBounds(325, 557, 41, 32);
		add(lblNewLabel_1_1_1_1_1);
		
		textFieldMesBan = new JTextField();
		textFieldMesBan.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMesBan.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textFieldMesBan.setColumns(10);
		textFieldMesBan.setBounds(367, 562, 50, 24);
		add(textFieldMesBan);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("A\u00F1o:");
		lblNewLabel_1_1_1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2_1.setBounds(439, 557, 41, 32);
		add(lblNewLabel_1_1_1_2_1);
		
		textFieldAnioBan = new JTextField();
		textFieldAnioBan.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAnioBan.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textFieldAnioBan.setColumns(10);
		textFieldAnioBan.setBounds(485, 561, 50, 24);
		add(textFieldAnioBan);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnRegistrar.setBounds(70, 611, 153, 23);
		add(btnRegistrar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnLimpiar.setBounds(452, 611, 153, 23);
		add(btnLimpiar);
		
		JLabel lblReservarCabaa_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1.setForeground(Color.BLUE);
		lblReservarCabaa_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1.setBounds(20, 16, 659, 32);
		add(lblReservarCabaa_1);
		
		JLabel lblReservarCabaa_1_1 = new JLabel("_______________________________________________________________");
		lblReservarCabaa_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1_1.setForeground(Color.BLUE);
		lblReservarCabaa_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1_1.setBounds(10, 437, 659, 32);
		add(lblReservarCabaa_1_1);
		
		btnVer = new JButton("Ver");
		btnVer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnVer.setBounds(523, 60, 82, 23);
		add(btnVer);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnModificar.setBounds(264, 613, 153, 23);
		add(btnModificar);
		
		btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnListar.setBounds(52, 11, 153, 23);
		add(btnListar);
		
		lblEstado = new JLabel("Cambiar Estado:");
		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstado.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblEstado.setBounds(550, 379, 119, 32);
		add(lblEstado);
		
		chckbxEstado = new JCheckBox("");
		chckbxEstado.setBounds(597, 407, 97, 23);
		add(chckbxEstado);
		
	}
}
