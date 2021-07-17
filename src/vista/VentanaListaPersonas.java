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
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaListaPersonas extends JFrame {

	private JPanel contentPane;
	public JTable tableAfiliados;
	public JTable tableNoAfiliados;
	public JTextField textDia;
	public JTextField textMes;
	public JTextField textAnio;
	public JButton btnCambiar;

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
		setBounds(100, 100, 702, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaDeClientes = new JLabel("LISTA DE CLIENTES");
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
		
		tableAfiliados = new JTable();
		tableAfiliados.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		scrollPane.setViewportView(tableAfiliados);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(345, 95, 341, 344);
		contentPane.add(scrollPane_1);
		
		tableNoAfiliados = new JTable();
		scrollPane_1.setViewportView(tableNoAfiliados);
		
		JLabel lblAfiliados = new JLabel("Afiliados");
		lblAfiliados.setHorizontalAlignment(SwingConstants.CENTER);
		lblAfiliados.setForeground(Color.BLUE);
		lblAfiliados.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblAfiliados.setBounds(0, 63, 346, 32);
		contentPane.add(lblAfiliados);
		
		JLabel lblListaDeClientes_1_1 = new JLabel("No Afiliados");
		lblListaDeClientes_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeClientes_1_1.setForeground(Color.BLUE);
		lblListaDeClientes_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblListaDeClientes_1_1.setBounds(345, 63, 341, 32);
		contentPane.add(lblListaDeClientes_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Fecha de Afiliacion:");
		lblNewLabel_1_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel_1_2_1_1.setBounds(73, 450, 200, 32);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Dia:");
		lblNewLabel_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(274, 451, 41, 32);
		contentPane.add(lblNewLabel_1_1_1);
		
		textDia = new JTextField();
		textDia.setHorizontalAlignment(SwingConstants.CENTER);
		textDia.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textDia.setColumns(10);
		textDia.setBounds(320, 455, 50, 24);
		contentPane.add(textDia);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Mes:");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(388, 451, 41, 32);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textMes = new JTextField();
		textMes.setHorizontalAlignment(SwingConstants.CENTER);
		textMes.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textMes.setColumns(10);
		textMes.setBounds(434, 455, 50, 24);
		contentPane.add(textMes);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("A\u00F1o:");
		lblNewLabel_1_1_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2.setBounds(505, 451, 41, 32);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		textAnio = new JTextField();
		textAnio.setHorizontalAlignment(SwingConstants.CENTER);
		textAnio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textAnio.setColumns(10);
		textAnio.setBounds(550, 455, 50, 24);
		contentPane.add(textAnio);
		
		btnCambiar = new JButton("Cambiar");
		btnCambiar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnCambiar.setBounds(276, 493, 153, 23);
		contentPane.add(btnCambiar);
	}
}
