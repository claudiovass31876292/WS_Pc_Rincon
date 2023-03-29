package Ejercicios_tp4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;

public class Contactos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	// instancias 
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblTelefono;
	private JLabel lblFechaNac;
	private JLabel lblMensaje;
	
	public Contactos() {
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		creacionLabel();
		creacionTextField();
		
			}
	
	public void creacionLabel()
	{

		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(41, 53, 75, 14);
		contentPane.add(lblNombre);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(41, 78, 75, 19);
		contentPane.add(lblApellido);
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(41, 108, 75, 14);
		contentPane.add(lblTelefono);
		
		lblFechaNac = new JLabel("Fecha Nac.");
		lblFechaNac.setBounds(41, 133, 75, 14);
		contentPane.add(lblFechaNac);
		
		lblMensaje = new JLabel("Los datos ingresados fueron: ");
		lblMensaje.setBounds(41, 219, 245, 14);
		contentPane.add(lblMensaje);
		
	}
	
	public void creacionTextField()
	{
		textField = new JTextField();
		textField.setBounds(127, 50, 200, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 77, 201, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(127, 105, 200, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(127, 130, 200, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

	}
}
