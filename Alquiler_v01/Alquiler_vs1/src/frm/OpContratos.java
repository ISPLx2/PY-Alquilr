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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class OpContratos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpContratos frame = new OpContratos();
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
	public OpContratos() {
		setTitle("INGRESO DE DATOS - CONTRATOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 367);
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
		panel.setBounds(10, 35, 521, 238);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("ID :");
		label_1.setForeground(new Color(0, 128, 128));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(10, 11, 33, 14);
		panel.add(label_1);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setForeground(new Color(0, 128, 128));
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDni.setBounds(10, 36, 33, 14);
		panel.add(lblDni);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n: ");
		lblDescripcin.setForeground(new Color(0, 128, 128));
		lblDescripcin.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDescripcin.setBounds(10, 61, 83, 14);
		panel.add(lblDescripcin);
		
		JLabel lblMensualidad = new JLabel("Mensualidad:");
		lblMensualidad.setForeground(new Color(0, 128, 128));
		lblMensualidad.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMensualidad.setBounds(10, 86, 95, 14);
		panel.add(lblMensualidad);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setForeground(new Color(0, 128, 128));
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFecha.setBounds(10, 111, 56, 14);
		panel.add(lblFecha);
		
		JLabel lblMonto = new JLabel("Monto:");
		lblMonto.setForeground(new Color(0, 128, 128));
		lblMonto.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMonto.setBounds(10, 136, 56, 14);
		panel.add(lblMonto);
		
		JLabel lblDocumentos = new JLabel("Documentos: ");
		lblDocumentos.setForeground(new Color(0, 128, 128));
		lblDocumentos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDocumentos.setBounds(299, 11, 95, 14);
		panel.add(lblDocumentos);
		
		JLabel lblEstado = new JLabel("Estado: ");
		lblEstado.setForeground(new Color(0, 128, 128));
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEstado.setBounds(299, 36, 69, 14);
		panel.add(lblEstado);
		
		JLabel lblGarantia = new JLabel("Garantia:");
		lblGarantia.setForeground(new Color(0, 128, 128));
		lblGarantia.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGarantia.setBounds(299, 61, 69, 14);
		panel.add(lblGarantia);
		
		JLabel label_2 = new JLabel("ID :");
		label_2.setForeground(new Color(0, 128, 128));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_2.setBounds(299, 114, 33, 14);
		panel.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(348, 111, 130, 20);
		panel.add(textField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"HABITACION", "-----------------", "H. 101", "H. 102", "H. 103", "H. 104", "M.D. 201", "M.D. 202", "M.D. 203", "D. 301"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setBounds(363, 86, 116, 20);
		panel.add(comboBox);
		
		JLabel label_3 = new JLabel("Nombre:");
		label_3.setForeground(new Color(0, 128, 128));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBounds(299, 88, 59, 14);
		panel.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(53, 9, 163, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(53, 34, 163, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(97, 59, 179, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(97, 84, 179, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(63, 111, 163, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(63, 134, 163, 20);
		panel.add(textField_6);
		
		JButton button = new JButton("INGRESAR");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Arial", Font.BOLD, 13));
		button.setBackground(new Color(102, 205, 170));
		button.setBounds(10, 180, 108, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("EDITAR");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Arial", Font.BOLD, 13));
		button_1.setBackground(new Color(0, 191, 255));
		button_1.setBounds(128, 180, 90, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("ELIMINAR");
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Arial", Font.BOLD, 13));
		button_2.setBackground(new Color(250, 128, 114));
		button_2.setBounds(228, 180, 108, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("SALIR");
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Arial", Font.BOLD, 13));
		button_3.setBackground(new Color(169, 169, 169));
		button_3.setBounds(379, 180, 92, 23);
		panel.add(button_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PENDIENTES", "COMPLETO"}));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_1.setBounds(395, 9, 116, 20);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"PENDIENTES", "COMPLETO"}));
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_2.setBounds(362, 34, 116, 20);
		panel.add(comboBox_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(363, 59, 148, 20);
		panel.add(textField_7);
	}

}
