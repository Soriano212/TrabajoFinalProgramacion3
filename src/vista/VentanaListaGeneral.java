package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaListaGeneral extends JFrame {

	private JPanel contentPane;
	public JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaListaGeneral frame = new VentanaListaGeneral();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaListaGeneral() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 383, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Lista");
		setResizable(false);
		
		JLabel lblLista = new JLabel("LISTA");
		lblLista.setHorizontalAlignment(SwingConstants.CENTER);
		lblLista.setForeground(Color.BLUE);
		lblLista.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblLista.setBounds(-145, 11, 656, 32);
		contentPane.add(lblLista);
		
		JLabel lblReservarCabaa_1 = new JLabel("___________________________________________");
		lblReservarCabaa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1.setForeground(Color.BLUE);
		lblReservarCabaa_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1.setBounds(-155, 24, 666, 32);
		contentPane.add(lblReservarCabaa_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 67, 379, 371);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane_1.setViewportView(table);
	}
}
