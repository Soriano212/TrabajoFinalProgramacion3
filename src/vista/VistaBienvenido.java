package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class VistaBienvenido extends JPanel {

	public JLabel lblNombre;
	public JLabel lblDireccion;

	/**
	 * Create the panel.
	 */
	public VistaBienvenido() {
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("BIENVENIDO");
		lblNewLabel_2.setBounds(198, 259, 278, 58);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 48));
		add(lblNewLabel_2);
		
		lblNombre = new JLabel("RECREACIONES CIA. LTDA.");
		lblNombre.setBounds(42, 322, 589, 58);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 48));
		add(lblNombre);
		
		lblDireccion = new JLabel("RECREACIONES CIA. LTDA.");
		lblDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDireccion.setBounds(42, 552, 589, 58);
		add(lblDireccion);

	}
}
