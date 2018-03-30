package frm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setTitle("INICIO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 280);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSeleccioneUnaOpcin = new JLabel("SELECCIONE UNA OPCI\u00D3N");
		lblSeleccioneUnaOpcin.setForeground(new Color(255, 255, 255));
		lblSeleccioneUnaOpcin.setFont(new Font("Sitka Text", Font.BOLD, 17));
		lblSeleccioneUnaOpcin.setBounds(169, 11, 241, 26);
		contentPane.add(lblSeleccioneUnaOpcin);
		
		JButton btnContrato = new JButton("");
		btnContrato.setBackground(new Color(128, 0, 0));
		btnContrato.setIcon(new ImageIcon("C:\\Users\\casa\\Pictures\\Camera Roll\\contoo.png"));
		btnContrato.setBounds(130, 63, 89, 83);
		contentPane.add(btnContrato);
		
		JLabel lblContrato = new JLabel("CONTRATO");
		lblContrato.setBackground(new Color(255, 255, 255));
		lblContrato.setForeground(new Color(245, 245, 245));
		lblContrato.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblContrato.setBounds(129, 157, 79, 14);
		contentPane.add(lblContrato);
		
		JButton btnAlquiler = new JButton("");
		btnAlquiler.setIcon(new ImageIcon("C:\\Users\\casa\\Pictures\\Camera Roll\\alq.png"));
		btnAlquiler.setBounds(20, 63, 89, 83);
		contentPane.add(btnAlquiler);
		
		JLabel lblAlquiler = new JLabel("ALQUILER");
		lblAlquiler.setBackground(new Color(255, 255, 255));
		lblAlquiler.setForeground(new Color(245, 245, 245));
		lblAlquiler.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblAlquiler.setBounds(30, 157, 79, 14);
		contentPane.add(lblAlquiler);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 48, 570, 132);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblArrendador = new JLabel("ARRENDADOR");
		lblArrendador.setBounds(345, 107, 84, 14);
		panel.add(lblArrendador);
		lblArrendador.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblArrendador.setForeground(new Color(245, 245, 245));
		lblArrendador.setBackground(new Color(245, 245, 245));
		
		JButton btnArrendador = new JButton("");
		btnArrendador.setIcon(new ImageIcon("C:\\Users\\casa\\Pictures\\Camera Roll\\Arre.png"));
		btnArrendador.setBounds(335, 13, 107, 85);
		panel.add(btnArrendador);
		
		JButton btnPagos = new JButton("");
		btnPagos.setBounds(461, 13, 99, 83);
		panel.add(btnPagos);
		btnPagos.setBackground(new Color(128, 0, 0));
		btnPagos.setIcon(new ImageIcon("C:\\Users\\casa\\Pictures\\Camera Roll\\pg.png"));
		
		JLabel lblPagos = new JLabel("PAGOS");
		lblPagos.setBounds(488, 107, 46, 14);
		panel.add(lblPagos);
		lblPagos.setBackground(new Color(255, 255, 255));
		lblPagos.setForeground(new Color(245, 245, 245));
		lblPagos.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		JButton btnNewButton = new JButton("HABITACIONES");
		btnNewButton.setBounds(218, 14, 107, 83);
		panel.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\casa\\Pictures\\Camera Roll\\hab.png"));
		
		JLabel lblHabitaciones = new JLabel("HABITACIONES");
		lblHabitaciones.setBounds(228, 107, 107, 14);
		panel.add(lblHabitaciones);
		lblHabitaciones.setBackground(new Color(255, 255, 255));
		lblHabitaciones.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblHabitaciones.setForeground(new Color(245, 245, 245));
	}
}
