package desin;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRepaso {

	private JFrame frame;
	private JTextField tf_texto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRepaso window = new VentanaRepaso();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaRepaso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Desin");
		
		tf_texto = new JTextField();
		tf_texto.setText("Elige color y pulsa el botón.");
		tf_texto.setBounds(34, 23, 361, 20);
		frame.getContentPane().add(tf_texto);
		tf_texto.setColumns(10);
		
		JComboBox cbox_colores = new JComboBox();
		cbox_colores.setModel(new DefaultComboBoxModel(new String[] {"Azul", "Rojo", "Verde"}));
		cbox_colores.setBounds(34, 92, 94, 22);
		frame.getContentPane().add(cbox_colores);
		
		JButton btn_cambiarColor = new JButton("Cambiar color");
		btn_cambiarColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String colorSelec = (String) cbox_colores.getSelectedItem();
				Color colorTexto = new Color(0);
				
				switch (colorSelec) {
				case "Azul":
					colorTexto = Color.blue;
					break;
					
				case "Verde":
					colorTexto = Color.green;
					break;
					
				case "Rojo":
					colorTexto = Color.red;
					break;
				}
				
				tf_texto.setForeground(colorTexto);
				tf_texto.setText("Ahora mi color es " + colorSelec);
			}
		});
		
		btn_cambiarColor.setBounds(269, 92, 126, 23);
		frame.getContentPane().add(btn_cambiarColor);
	}

}
