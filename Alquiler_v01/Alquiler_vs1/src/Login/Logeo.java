package Login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Font;

public class Logeo extends JFrame {
// :v prueba alv
	private JPanel contentPane;
	public static JTextField txtUsuario;
	public static JPasswordField pssContrasena;
 private JButton btnIngresar;
 private JButton btnSalir;
 
 public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logeo frame = new Logeo();
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
	public Logeo() {
		setBackground(new Color(0, 128, 0));
		setTitle("INICIO SESI\u00D3N");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 259);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(189, 183, 107));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAlquier = new JLabel("ALQUIER \".-.-.-.-.-\"");
		lblAlquier.setBounds(92, 11, 203, 14);
		contentPane.add(lblAlquier);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(145, 36, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblUsuario = new JLabel("USUARIO: ");
		lblUsuario.setBounds(10, 78, 84, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A:");
		lblContrasea.setBounds(10, 117, 84, 14);
		contentPane.add(lblContrasea);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(92, 75, 132, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\casa\\Pictures\\Camera Roll\\HOMRR.png"));
		lblNewLabel.setBounds(249, 59, 105, 133);
		contentPane.add(lblNewLabel);
		
		btnIngresar = new JButton("INGRESAR");
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnIngresar.setForeground(new Color(0, 0, 0));
		btnIngresar.setBackground(new Color(64, 224, 208));
		btnIngresar.setBounds(10, 169, 115, 23);
		contentPane.add(btnIngresar);
		
		btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalir.setBackground(new Color(211, 211, 211));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(135, 169, 104, 23);
		contentPane.add(btnSalir);
		
		pssContrasena = new JPasswordField();
		pssContrasena.setBounds(92, 114, 132, 20);
		contentPane.add(pssContrasena);
	}
}
