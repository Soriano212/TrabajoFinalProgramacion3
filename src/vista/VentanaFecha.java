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
import javax.swing.JButton;

public class VentanaFecha extends JFrame {

	private JPanel contentPane;
	
	public JButton btnMin;
	public JButton btnHora;
	public JButton btnDia;
	
	public JLabel lblFecha;
	public JLabel lblHora;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFecha frame = new VentanaFecha();
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
	public VentanaFecha() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 404, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Fecha y Hora");
		setResizable(false);
		
		JLabel lblListaDeClientes = new JLabel("FECHA Y HORA");
		lblListaDeClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeClientes.setForeground(Color.BLUE);
		lblListaDeClientes.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblListaDeClientes.setBounds(-126, 11, 656, 32);
		contentPane.add(lblListaDeClientes);
		
		JLabel lblReservarCabaa_1 = new JLabel("___________________________________________");
		lblReservarCabaa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarCabaa_1.setForeground(Color.BLUE);
		lblReservarCabaa_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblReservarCabaa_1.setBounds(-136, 24, 666, 32);
		contentPane.add(lblReservarCabaa_1);
		
		lblFecha = new JLabel(".....");
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		lblFecha.setForeground(Color.BLACK);
		lblFecha.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblFecha.setBounds(10, 67, 378, 32);
		contentPane.add(lblFecha);
		
		lblHora = new JLabel(".....");
		lblHora.setHorizontalAlignment(SwingConstants.CENTER);
		lblHora.setForeground(Color.BLACK);
		lblHora.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblHora.setBounds(10, 110, 378, 32);
		contentPane.add(lblHora);
		
		btnMin = new JButton("+ 10 Min");
		btnMin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnMin.setBounds(126, 163, 153, 23);
		contentPane.add(btnMin);
		
		btnHora = new JButton("+ 1 Hora");
		btnHora.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnHora.setBounds(126, 197, 153, 23);
		contentPane.add(btnHora);
		
		btnDia = new JButton("Sig. Dia");
		btnDia.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnDia.setBounds(126, 234, 153, 23);
		contentPane.add(btnDia);
	}
}
