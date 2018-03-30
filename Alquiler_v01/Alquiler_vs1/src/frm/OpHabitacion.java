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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class OpHabitacion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpHabitacion frame = new OpHabitacion();
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
	public OpHabitacion() {
		setTitle("INGRESO DE DATOS - HABITACI\u00D3N");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 225);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("INGRESE DATOS");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Times New Roman", Font.BOLD, 17));
		label.setBounds(10, 11, 146, 24);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 36, 501, 145);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("INGRESAR");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Arial", Font.BOLD, 13));
		button.setBackground(new Color(102, 205, 170));
		button.setBounds(10, 105, 106, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("EDITAR");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Arial", Font.BOLD, 13));
		button_1.setBackground(new Color(0, 191, 255));
		button_1.setBounds(128, 105, 93, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("ELIMINAR");
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Arial", Font.BOLD, 13));
		button_2.setBackground(new Color(250, 128, 114));
		button_2.setBounds(231, 105, 100, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("SALIR");
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Arial", Font.BOLD, 13));
		button_3.setBackground(new Color(169, 169, 169));
		button_3.setBounds(402, 105, 89, 23);
		panel.add(button_3);
		
		JLabel label_1 = new JLabel("Nombre:");
		label_1.setForeground(new Color(0, 128, 128));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(10, 11, 59, 14);
		panel.add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Habitaciones", "-----------------", "H. 101", "H. 102", "H. 103", "H. 104", "M.D. 201", "M.D. 202", "M.D. 203", "D. 301"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setBounds(74, 9, 116, 20);
		panel.add(comboBox);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n:");
		lblDescripcin.setForeground(new Color(0, 128, 128));
		lblDescripcin.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDescripcin.setBounds(10, 38, 89, 14);
		panel.add(lblDescripcin);
		
		textField = new JTextField();
		textField.setBounds(104, 33, 200, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setForeground(new Color(0, 128, 128));
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrecio.setBounds(10, 62, 59, 14);
		panel.add(lblPrecio);
		
		textField_1 = new JTextField();
		textField_1.setBounds(104, 60, 200, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo: ");
		lblTipo.setForeground(new Color(0, 128, 128));
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTipo.setBounds(308, 12, 59, 14);
		panel.add(lblTipo);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setForeground(new Color(0, 128, 128));
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEstado.setBounds(308, 39, 59, 14);
		panel.add(lblEstado);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"HABITACION", "M. DEPARTAMENTO", "DEPARTAMENTO"}));
		comboBox_1.setBounds(357, 9, 134, 20);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"DISPONIBLE", "OCUPADO"}));
		comboBox_2.setBounds(357, 36, 134, 20);
		panel.add(comboBox_2);
	}
}
