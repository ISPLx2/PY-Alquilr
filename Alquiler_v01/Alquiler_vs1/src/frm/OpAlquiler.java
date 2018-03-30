package frm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class OpAlquiler extends JFrame {

	private JPanel contentPane;
	private JTextField txtId_alq;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpAlquiler frame = new OpAlquiler();
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
	public OpAlquiler() {
		setTitle("INGRESO DE DATOS - ALQUILER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 399);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setForeground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 46, 526, 146);
		panel.setBackground(new Color(220, 220, 220));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setForeground(new Color(0, 128, 128));
		lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblId.setBounds(10, 11, 93, 14);
		panel.add(lblId);
		
		txtId_alq = new JTextField();
		txtId_alq.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtId_alq.setBounds(85, 9, 130, 20);
		panel.add(txtId_alq);
		txtId_alq.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Fecha: ");
		lblNewLabel.setForeground(new Color(0, 128, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 36, 93, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Estado: ");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(238, 13, 93, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField.setBounds(85, 34, 130, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"PENDIENTE", "COMPLETO"}));
		comboBox.setBounds(313, 11, 116, 20);
		panel.add(comboBox);
		
		JLabel lblNombreHab = new JLabel("Nombre:");
		lblNombreHab.setForeground(new Color(0, 128, 128));
		lblNombreHab.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombreHab.setBounds(238, 38, 93, 14);
		panel.add(lblNombreHab);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"HABITACION", "-----------------", "H. 101", "H. 102", "H. 103", "H. 104", "M.D. 201", "M.D. 202", "M.D. 203", "D. 301"}));
		comboBox_1.setBounds(313, 36, 116, 20);
		panel.add(comboBox_1);
		
		JLabel lblPago = new JLabel("Pago:");
		lblPago.setForeground(new Color(0, 128, 128));
		lblPago.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPago.setBounds(10, 62, 67, 18);
		panel.add(lblPago);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_1.setBounds(85, 61, 130, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblContrato = new JLabel("Contrato: ");
		lblContrato.setForeground(new Color(0, 128, 128));
		lblContrato.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContrato.setBounds(238, 65, 93, 14);
		panel.add(lblContrato);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"PENDIENTE", "COMPLETO"}));
		comboBox_2.setBounds(313, 63, 116, 20);
		panel.add(comboBox_2);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.setFont(new Font("Arial", Font.BOLD, 13));
		btnIngresar.setForeground(new Color(255, 255, 255));
		btnIngresar.setBackground(new Color(102, 205, 170));
		btnIngresar.setBounds(20, 113, 106, 23);
		panel.add(btnIngresar);
		
		JButton btnEditar = new JButton("EDITAR");
		btnEditar.setFont(new Font("Arial", Font.BOLD, 13));
		btnEditar.setForeground(new Color(255, 255, 255));
		btnEditar.setBackground(new Color(0, 191, 255));
		btnEditar.setBounds(138, 113, 93, 23);
		panel.add(btnEditar);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Arial", Font.BOLD, 13));
		btnEliminar.setForeground(new Color(255, 255, 255));
		btnEliminar.setBackground(new Color(250, 128, 114));
		btnEliminar.setBounds(241, 113, 100, 23);
		panel.add(btnEliminar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Arial", Font.BOLD, 13));
		btnSalir.setForeground(new Color(255, 255, 255));
		btnSalir.setBackground(new Color(169, 169, 169));
		btnSalir.setBounds(414, 113, 89, 23);
		panel.add(btnSalir);
		
		JLabel lblIngreseDatos = new JLabel("INGRESE DATOS");
		lblIngreseDatos.setBounds(10, 11, 146, 24);
		lblIngreseDatos.setForeground(new Color(255, 255, 255));
		lblIngreseDatos.setFont(new Font("Times New Roman", Font.BOLD, 17));
		contentPane.add(lblIngreseDatos);
		
		table = new JTable();
		table.setBounds(10, 203, 526, 140);
		table.setBackground(Color.WHITE);
		table.setBorder(new LineBorder(new Color(0, 128, 128)));
		contentPane.add(table);
	}
}
