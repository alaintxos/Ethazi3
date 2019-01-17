package ethazi3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ethazi3.MainWindow;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

public class Bienvenida extends JFrame {

	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	public Bienvenida() {
		setLayout(null);
		
	
		
		JLabel lblBienvenidoALa = new JLabel("BIENVENIDO A LA MAQUINA DE BILLETES DE TERMIBUS");
		lblBienvenidoALa.setBounds(80, 43, 279, 14);
		contentPane.add(lblBienvenidoALa);
		
		JButton btnComprar = new JButton("COMPRAR");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//click boton de bienvenida
				//Ocultar bienvenida
				//Mostrar productos
				MainWindow.ocultarBienvenida();
				MainWindow.mostrarEleccion();
				
			}
		});
		btnComprar.setBounds(162, 112, 89, 23);
		contentPane.add(btnComprar);
		
		
	}
}
