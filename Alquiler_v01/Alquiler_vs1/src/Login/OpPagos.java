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
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class OpPagos extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpPagos frame = new OpPagos();
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
	public OpPagos() {
		setTitle("INGRESO DE DATOS - PAGOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 321);
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
		panel.setBounds(10, 46, 481, 109);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("ID :");
		label_1.setForeground(new Color(0, 128, 128));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(10, 11, 33, 14);
		panel.add(label_1);
		
		JLabel lblFecha = new JLabel("Fecha: ");
		lblFecha.setForeground(new Color(0, 128, 128));
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFecha.setBounds(10, 36, 51, 14);
		panel.add(lblFecha);
		
		JLabel lblMonto = new JLabel("Monto: ");
		lblMonto.setForeground(new Color(0, 128, 128));
		lblMonto.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMonto.setBounds(238, 8, 51, 14);
		panel.add(lblMonto);
		
		JLabel lblEstado = new JLabel("Estado: ");
		lblEstado.setForeground(new Color(0, 128, 128));
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEstado.setBounds(238, 33, 64, 14);
		panel.add(lblEstado);
		
		JButton button = new JButton("INGRESAR");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Arial", Font.BOLD, 13));
		button.setBackground(new Color(102, 205, 170));
		button.setBounds(10, 75, 108, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("EDITAR");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Arial", Font.BOLD, 13));
		button_1.setBackground(new Color(0, 191, 255));
		button_1.setBounds(128, 75, 90, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("ELIMINAR");
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Arial", Font.BOLD, 13));
		button_2.setBackground(new Color(250, 128, 114));
		button_2.setBounds(228, 75, 108, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("SALIR");
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Arial", Font.BOLD, 13));
		button_3.setBackground(new Color(169, 169, 169));
		button_3.setBounds(379, 75, 92, 23);
		panel.add(button_3);
		
		textField = new JTextField();
		textField.setBounds(59, 8, 130, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(59, 33, 130, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(299, 5, 125, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"PENDIENTE", "AL D\u00CDA"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setBounds(299, 30, 125, 20);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 175, 481, 97);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 0, 480, 97);
		panel_1.add(table);
	}
}
