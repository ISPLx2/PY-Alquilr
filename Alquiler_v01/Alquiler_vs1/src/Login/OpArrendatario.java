package Login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class OpArrendatario extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpArrendatario frame = new OpArrendatario();
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
	public OpArrendatario() {
		setTitle("INGRESO DE DATOS - ARRENDADOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 528);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("INGRESE DATOS");
		label.setBounds(10, 11, 146, 24);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Times New Roman", Font.BOLD, 17));
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 46, 610, 227);
		panel.setBackground(SystemColor.controlHighlight);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblId = new JLabel("ID: ");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblId.setForeground(new Color(0, 128, 128));
		lblId.setBounds(10, 11, 74, 14);
		panel.add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setForeground(new Color(0, 128, 128));
		lblNombre.setBounds(10, 36, 74, 14);
		panel.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblApellido.setForeground(new Color(0, 128, 128));
		lblApellido.setBounds(10, 61, 74, 14);
		panel.add(lblApellido);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsuario.setForeground(new Color(0, 128, 128));
		lblUsuario.setBounds(10, 86, 74, 14);
		panel.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContrasea.setForeground(new Color(0, 128, 128));
		lblContrasea.setBounds(10, 111, 86, 14);
		panel.add(lblContrasea);
		
		JLabel lblTipo = new JLabel("Tipo: ");
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTipo.setForeground(new Color(0, 128, 128));
		lblTipo.setBounds(10, 138, 74, 14);
		panel.add(lblTipo);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha nacimiento:");
		lblFechaNacimiento.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFechaNacimiento.setForeground(new Color(0, 128, 128));
		lblFechaNacimiento.setBounds(279, 11, 126, 14);
		panel.add(lblFechaNacimiento);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSexo.setForeground(new Color(0, 128, 128));
		lblSexo.setBounds(279, 36, 44, 14);
		panel.add(lblSexo);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDireccin.setForeground(new Color(0, 128, 128));
		lblDireccin.setBounds(279, 61, 74, 14);
		panel.add(lblDireccin);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTelefono.setForeground(new Color(0, 128, 128));
		lblTelefono.setBounds(279, 86, 60, 14);
		panel.add(lblTelefono);
		
		JLabel lblDni = new JLabel("DNI: ");
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDni.setForeground(new Color(0, 128, 128));
		lblDni.setBounds(279, 111, 31, 14);
		panel.add(lblDni);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmail.setForeground(new Color(0, 128, 128));
		lblEmail.setBounds(279, 138, 44, 14);
		panel.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(81, 9, 163, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(81, 34, 163, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(81, 59, 163, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(81, 84, 163, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(101, 109, 143, 20);
		panel.add(passwordField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ADMIN", "RESGISTRADOR :V"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox.setBounds(81, 136, 163, 20);
		panel.add(comboBox);
		
		textField_4 = new JTextField();
		textField_4.setBounds(403, 9, 171, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"FEMENINO", "MASCULINO"}));
		comboBox_1.setBounds(338, 34, 115, 20);
		panel.add(comboBox_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(348, 59, 226, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(348, 84, 226, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(348, 109, 226, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(348, 136, 226, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JButton button = new JButton("INGRESAR");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Arial", Font.BOLD, 13));
		button.setBackground(new Color(102, 205, 170));
		button.setBounds(10, 193, 106, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("EDITAR");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Arial", Font.BOLD, 13));
		button_1.setBackground(new Color(0, 191, 255));
		button_1.setBounds(128, 193, 93, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("ELIMINAR");
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Arial", Font.BOLD, 13));
		button_2.setBackground(new Color(250, 128, 114));
		button_2.setBounds(231, 193, 100, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("SALIR");
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Arial", Font.BOLD, 13));
		button_3.setBackground(new Color(169, 169, 169));
		button_3.setBounds(404, 193, 89, 23);
		panel.add(button_3);
		
		table = new JTable();
		table.setBounds(10, 322, 610, 159);
		table.setBackground(Color.WHITE);
		contentPane.add(table);
	}
}
