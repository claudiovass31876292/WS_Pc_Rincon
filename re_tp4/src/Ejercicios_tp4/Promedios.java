package Ejercicios_tp4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Promedios extends JFrame{

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPanel panelInferior;
	private Container panelSuperior;
	private JComboBox<String>  cbTps;
	private JLabel lblNota1;
	private JLabel lblNota2;
	private JLabel lblNota3;
	private JLabel lblTps;
	

	
	public Promedios() {
		setTitle("Promedios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelInferior = new JPanel();
		panelInferior.setBackground(Color.WHITE);
		panelInferior.setBounds(22, 208, 268, 155);
		contentPane.add(panelInferior);
		
		panelSuperior = new JPanel();
		panelSuperior.setBounds(22, 60, 268, 137);
		contentPane.add(panelSuperior);
		panelSuperior.setLayout(null);
		//panelSuperior.add( creaBorde( new TitledBorder("Notas del alumno") ) );
		
		
		
		textField = new JTextField();
		textField.setBounds(109, 20, 103, 20);
		panelSuperior.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 45, 103, 20);
		panelSuperior.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(109, 70, 103, 20);
		panelSuperior.add(textField_2);
		textField_2.setColumns(10);
		
		cbTps = new JComboBox<String>();
		cbTps.setBounds(109, 98, 103, 20);
		panelSuperior.add(cbTps);
		
		JButton btnCalcular = new JButton("CALCULAR ");
		btnCalcular.addActionListener(new eventoCalcular());
		btnCalcular.setBounds(319, 60, 123, 35);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setBounds(319, 99, 123, 35);
		contentPane.add(btnNuevo);
		
		JButton btnNewButton_2 = new JButton("SALIR");
		btnNewButton_2.setBounds(319, 141, 123, 35);
		contentPane.add(btnNewButton_2);
		cbTps.addItem("tp1");
		cbTps.addItem("tp2");
		cbTps.addItem("tp3");
		
		creacionLabel();
	}
	
	/*static JPanel creaBorde( javax.swing.border.Border b ) {
	    JPanel panel = new JPanel();
	    String str = b.getClass().toString();
	    
	    str = str.substring( str.lastIndexOf('.') + 1 );
	    panel.setLayout( new BorderLayout() );
	    panel.add(new JLabel( str,JLabel.CENTER ),BorderLayout.CENTER );
	    panel.setBorder( b );
	    
	    return( panel );
	  }
	*/
      public class eventoCalcular implements ActionListener
	{
	
			public void actionPerformed(ActionEvent arg0) {
		    
				// aca tiene desplegar los resultados en el panelInferior
				System.out.println("aca tiene desplegar los resultados en el panelInferior");
				
				
			}
		
	}
	
	public void creacionLabel()
	{
		lblNota1 = new JLabel("Nota 1 :");
		lblNota1.setBounds(10, 26, 46, 14);
		panelSuperior.add(lblNota1);
		
		lblNota2 = new JLabel("Nota 2 : ");
		lblNota2.setBounds(10, 51, 46, 14);
		panelSuperior.add(lblNota2);
		
		lblNota3 = new JLabel("Nota 3 : ");
		lblNota3.setBounds(10, 76, 46, 14);
		panelSuperior.add(lblNota3);
		
		lblTps = new JLabel("TPS");
		lblTps.setBounds(10, 101, 46, 14);
		panelSuperior.add(lblTps);	
	}
}
