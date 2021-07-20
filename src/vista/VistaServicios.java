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
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VistaServicios extends JPanel {
	private JTable tableSeleccion;

	/**
	 * Create the panel.
	 */
	public VistaServicios() {
		setLayout(null);
		
		JLabel lblSolicitarServicios = new JLabel("MANEJO SERVICIOS");
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
		
		JLabel lblNewLabel_1 = new JLabel("Seleccion:");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(96, 77, 135, 32);
		add(lblNewLabel_1);
		
		JComboBox<String> comboBoxSeleccion = new JComboBox<String>();
		comboBoxSeleccion.setModel(new DefaultComboBoxModel(new String[] {"Parasol", "Toalla", "Spa", "Traslado"}));
		comboBoxSeleccion.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxSeleccion.setBounds(354, 82, 217, 24);
		add(comboBoxSeleccion);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnAgregar.setBounds(127, 217, 125, 23);
		add(btnAgregar);
		
		JButton btnQuitar = new JButton("Quitar");
		btnQuitar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnQuitar.setBounds(281, 217, 125, 23);
		add(btnQuitar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnLimpiar.setBounds(428, 217, 125, 23);
		add(btnLimpiar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(63, 251, 535, 204);
		add(scrollPane);
		
		tableSeleccion = new JTable();
		scrollPane.setViewportView(tableSeleccion);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ID:");
		lblNewLabel_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(96, 163, 135, 32);
		add(lblNewLabel_1_1_1);
		
		JLabel lblID = new JLabel(".....");
		lblID.setHorizontalAlignment(SwingConstants.CENTER);
		lblID.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblID.setBounds(354, 163, 217, 32);
		add(lblID);
		
		JLabel lblNewLabel_1_2 = new JLabel("Capacidad:");
		lblNewLabel_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(96, 120, 135, 32);
		add(lblNewLabel_1_2);
		
		JComboBox<String> comboBoxCapacidad = new JComboBox<String>();
		comboBoxCapacidad.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		comboBoxCapacidad.setBounds(354, 125, 217, 24);
		add(comboBoxCapacidad);

	}
}
