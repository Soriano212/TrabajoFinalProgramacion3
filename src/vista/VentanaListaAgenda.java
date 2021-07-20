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

public class VentanaListaAgenda extends JFrame {

	private JPanel contentPane;
	public JTable tableDias;
	public JTable tableHoras;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaListaAgenda frame = new VentanaListaAgenda();
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
	public VentanaListaAgenda() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 689, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Lista Agenda");
		setResizable(false);
		
		JLabel lblListaDeClientes = new JLabel("LISTA AGENDA");
		lblListaDeClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeClientes.setForeground(Color.BLUE);
		lblListaDeClientes.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblListaDeClientes.setBounds(20, 11, 656, 32);
		contentPane.add(lblListaDeClientes);
		
		JLabel lblReservarCabaa_1 = new JLabel("___________________________________________");
		lblReservarCabaa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1.setForeground(Color.BLUE);
		lblReservarCabaa_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1.setBounds(10, 24, 666, 32);
		contentPane.add(lblReservarCabaa_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 95, 346, 344);
		contentPane.add(scrollPane);
		
		tableDias = new JTable();
		tableDias.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane.setViewportView(tableDias);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(345, 95, 341, 344);
		contentPane.add(scrollPane_1);
		
		tableHoras = new JTable();
		tableHoras.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane_1.setViewportView(tableHoras);
		
		JLabel lblAfiliados = new JLabel("Dias");
		lblAfiliados.setHorizontalAlignment(SwingConstants.CENTER);
		lblAfiliados.setForeground(Color.BLUE);
		lblAfiliados.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblAfiliados.setBounds(0, 63, 346, 32);
		contentPane.add(lblAfiliados);
		
		JLabel lblListaDeClientes_1_1 = new JLabel("Horas");
		lblListaDeClientes_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeClientes_1_1.setForeground(Color.BLUE);
		lblListaDeClientes_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblListaDeClientes_1_1.setBounds(345, 63, 341, 32);
		contentPane.add(lblListaDeClientes_1_1);
	}
}
