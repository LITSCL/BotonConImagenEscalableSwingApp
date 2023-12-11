package cl.inacap.botonconimagenescalableswingapp;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class StartFrame extends JFrame {
	private JPanel contentPane;
	private JButton btnBoton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame frame = new StartFrame();
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
	public StartFrame() {
		this.setTitle("BotonConImagenEscalableSwingApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnBoton = new JButton(); //Se crea el botón.
		btnBoton.setBounds(374, 198, 50, 52); //Se le añaden dimensiones al botón.
		ImageIcon imagen = new ImageIcon(StartFrame.class.getResource("/cl/inacap/botonconimagenescalableswingapp/image/save.png")); //Se almacena la imagen en una variable.
		ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(btnBoton.getWidth(), btnBoton.getHeight(), Image.SCALE_DEFAULT)); //Se redimensiona la imagen basandose en las dimensiones del botón.
		btnBoton.setIcon(icono); //Se le añade el icono al botón.
		contentPane.add(btnBoton);
	}
}