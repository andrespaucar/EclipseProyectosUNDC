import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_sueldo;
	private JTextField textrespuesta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio2 frame = new ejercicio2();
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
	public ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSueldoBruto = new JLabel("Sueldo Bruto:");
		lblSueldoBruto.setBounds(45, 21, 73, 22);
		contentPane.add(lblSueldoBruto);
		
		txt_sueldo = new JTextField();
		txt_sueldo.setBounds(138, 22, 86, 20);
		contentPane.add(txt_sueldo);
		txt_sueldo.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double sueldo,incremento,descuento1=0, descuento2=0,descunto3=0;
				sueldo=Double.parseDouble(txt_sueldo.getText());
				// textrespuesta.append("Sueldo bruto: "+sueldo+"\n");
				
				
			}
		});
		btnAceptar.setBounds(293, 21, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_sueldo.setText("");
				
				textrespuesta.setText("");
				
			}
		});
		btnNuevo.setBounds(293, 65, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(293, 108, 89, 23);
		contentPane.add(btnCerrar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(293, 161, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblCondicionCivil = new JLabel("Condicion Civil:");
		lblCondicionCivil.setBounds(45, 87, 86, 14);
		contentPane.add(lblCondicionCivil);
		
		JRadioButton rdbSoltero = new JRadioButton("Soltero");
		rdbSoltero.setBounds(135, 87, 109, 23);
		contentPane.add(rdbSoltero);
		
		JRadioButton rdbCasado = new JRadioButton("Casado");
		rdbCasado.setBounds(135, 113, 109, 23);
		contentPane.add(rdbCasado);
		
		JRadioButton rdbViduo = new JRadioButton("Viduo");
		rdbViduo.setBounds(135, 139, 109, 23);
		contentPane.add(rdbViduo);
		
		JLabel lblAgrupaciones = new JLabel("Agrupaciones");
		lblAgrupaciones.setBounds(45, 184, 73, 14);
		contentPane.add(lblAgrupaciones);
		
		JCheckBox bxSindicato = new JCheckBox("Sindicato");
		bxSindicato.setBounds(138, 199, 97, 23);
		contentPane.add(bxSindicato);
		
		JCheckBox bxCooperativa = new JCheckBox("Cooperativa");
		bxCooperativa.setBounds(138, 225, 97, 23);
		contentPane.add(bxCooperativa);
		
		JCheckBox bxSeguro = new JCheckBox("Seguro");
		bxSeguro.setBounds(138, 251, 97, 23);
		contentPane.add(bxSeguro);
		
		textrespuesta = new JTextField();
		textrespuesta.setBounds(263, 225, 185, 61);
		contentPane.add(textrespuesta);
		textrespuesta.setColumns(10);
	}
}
