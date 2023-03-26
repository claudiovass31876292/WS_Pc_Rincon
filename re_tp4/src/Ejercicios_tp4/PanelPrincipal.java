package Ejercicios_tp4;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PanelPrincipal extends JFrame {

	JButton	boton1 = new JButton();
	JButton	boton2 = new JButton();
	JButton	boton3 = new JButton();
	
	public PanelPrincipal()
	{
		
		//creo el panel principal
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(500,500);
	    setLocation(350,350);
	    setTitle("Panel principal");
	    setLayout(null);	 
	    
	    //creacion de los botones
	    boton1.setText("EJERCICIO 1");
	    boton1.setBounds(175,200,135,30);
	    
	    boton2.setText("EJERCICIO 2");
	    boton2.setBounds(175,300,135,30);
		
	    boton3.setText("EJERCICIO 1");
	    boton3.setBounds(175,400,135,30);
	    
	    getContentPane().add(boton1);
	    getContentPane().add(boton2);
	    getContentPane().add(boton3);
	}
	
	public void visibilidad(boolean estado)
	{
		setVisible(true);
	}
	
}
