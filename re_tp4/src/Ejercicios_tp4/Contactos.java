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
import javax.swing.JButton;

public class Contactos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFechaNac;

	// instancias 
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblTelefono;
	private JLabel lblFechaNac;
	private JLabel lblMensaje;
 	private JButton btnMostrar;
	
	public Contactos() {
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		creacionLabel();
		creacionTextField();
		creacionBoton();
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
		txtNombre = new JTextField();
		txtNombre.setBounds(127, 50, 200, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(126, 77, 201, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(127, 105, 200, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtFechaNac = new JTextField();
		txtFechaNac.setBounds(127, 130, 200, 20);
		contentPane.add(txtFechaNac);
		txtFechaNac.setColumns(10);
		
		

	}
	
	public void creacionBoton()
	{
		btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(174, 177, 89, 23);
		contentPane.add(btnMostrar);	/* dessarrollar */
	}
}
