package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Bienvenido extends JPanel {

	/**
	 * Create the panel.
	 */
	public Bienvenido() {
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("BIENVENIDO");
		lblNewLabel_2.setBounds(198, 259, 278, 58);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 48));
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("RECREACIONES CIA. LTDA.");
		lblNewLabel_2_1.setBounds(42, 322, 589, 58);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 48));
		add(lblNewLabel_2_1);

	}

}
