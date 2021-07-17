package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTable;

public class VentanaListaPersonas extends JFrame {

	private JPanel contentPane;
	private JTable tableLista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaListaPersonas frame = new VentanaListaPersonas();
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
	public VentanaListaPersonas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaDeClientes = new JLabel("LISTA DE CLIENTES");
		lblListaDeClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeClientes.setForeground(Color.BLUE);
		lblListaDeClientes.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblListaDeClientes.setBounds(10, 11, 474, 32);
		contentPane.add(lblListaDeClientes);
		
		JLabel lblReservarCabaa_1 = new JLabel("___________________________________________");
		lblReservarCabaa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1.setForeground(Color.BLUE);
		lblReservarCabaa_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1.setBounds(0, 24, 484, 32);
		contentPane.add(lblReservarCabaa_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 67, 494, 454);
		contentPane.add(scrollPane);
		
		tableLista = new JTable();
		tableLista.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		scrollPane.setViewportView(tableLista);
	}
}
