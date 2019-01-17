package ethazi3;
import java.awt.EventQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow {
	
	static Bienvenida panelBienvenida = new Bienvenida();
	static Eleccion panelEleccion = new Eleccion();
	static Lineas  panelLineas = new Lineas();
	static Resumen panelResumen = new Resumen();
	static Login panelLogin = new Login();
	static Registro panelRegistro = new Registro();
	static Pago panelPago = new Pago();
	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 
	 */
	
	public static void mostarBienvenida() {
		panelBienvenida.setVisible(true);
	}
	public static void ocultarBienvenida() {
		panelBienvenida.setVisible(false);
	}
	public static void mostrarEleccion() {
		panelEleccion.setVisible(true);
	}
	public static void ocultarEleccion() {
		panelEleccion.setVisible(false);
	}
	public static void mostrarPago() {
		panelPago.setVisible(true);
		
	}
	public static void ocultarPago() {
		panelPago.setVisible(false);
	}
	public static void mostarLineas() {
		panelLineas.setVisible(true);
	}
	public static void ocultarLineas() {
		panelLineas.setVisible(false);
	}
	public static void mostarResumen() {
		panelResumen.setVisible(true);
	}
	public static void ocultarResumen() {
		panelResumen.setVisible(false);
	}
	public static void mostarLogin() {
		panelLogin.setVisible(true);
	}
	public static void ocultarLogin() {
		panelLogin.setVisible(false);
	}
	public static void mostarRegistro() {
		panelRegistro.setVisible(true);
	}
	public static void ocultarRegistro() {
		panelRegistro.setVisible(false);
	}
	
	
	
	
	
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Inserto panel de bienvenida y pongo false para que no salga
		panelBienvenida.setBounds(0,0,700,500);
		frame.getContentPane().add(panelBienvenida);
		panelBienvenida.setVisible(true);
		
		panelEleccion.setBounds(0,0,700,500);
		frame.getContentPane().add(panelEleccion);
		panelEleccion.setVisible(false);
		
		panelLineas.setBounds(0,0,700,500);
		frame.getContentPane().add(panelLineas);
		panelLineas.setVisible(false);
		
		panelResumen.setBounds(0,0,700,500);
		frame.getContentPane().add(panelResumen);
		panelResumen.setVisible(false);
		
		panelLogin.setBounds(0,0,700,500);
		frame.getContentPane().add(panelLogin);
		panelLogin.setVisible(false);
		
		panelRegistro.setBounds(0,0,700,500);
		frame.getContentPane().add(panelRegistro);
		panelRegistro.setVisible(false);
		
		panelPago.setBounds(0,0,700,500);
		frame.getContentPane().add(panelPago);
		panelPago.setVisible(false);
	}
	}


