package ethazi3;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.awt.event.ActionEvent;

public class Bienvenida extends JPanel {

	/**
	 * Create the panel.
	 */
	public Bienvenida() {
		setLayout(null);
		
		JLabel lblBienvenida = new JLabel("BIENVENIDA");
		lblBienvenida.setBounds(173, 53, 101, 14);
		add(lblBienvenida);
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		
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
		btnComprar.setBounds(160, 159, 89, 23);
		add(btnComprar);
		

	}
}

