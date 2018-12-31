import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textF1;
	private JTextField textF2;
	private JTextField textFrespuesta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
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
	public calculadora() {
		setTitle("Calcu_Random");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 343, 229);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textF1 = new JTextField();
		textF1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textF1.setEditable(false);
		textF1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textF1.setBounds(130, 48, 63, 26);
		contentPane.add(textF1);
		textF1.setColumns(10);
		
		textF2 = new JTextField();
		textF2.setEditable(false);
		textF2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textF2.setColumns(10);
		textF2.setBounds(130, 11, 63, 26);
		contentPane.add(textF2);
		
		JLabel label = new JLabel("+");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(203, 36, 24, 26);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("-----------");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(130, 64, 82, 26);
		contentPane.add(label_1);
		
		textFrespuesta = new JTextField();
		textFrespuesta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		textFrespuesta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFrespuesta.setBounds(130, 85, 73, 26);
		contentPane.add(textFrespuesta);
		textFrespuesta.setColumns(10);
		
		JButton btnVerificar = new JButton("calcular");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random rd1=new Random();
				Random rd2=new Random();
				String a=String.valueOf(rd1.nextInt(20));
				String b=String.valueOf(rd2.nextInt(20));
			    textF1.setText(a);
			    textF2.setText(b);
			    //int respuesta=Integer.parseInt(textrespuesta.getText());
			   /* if(suma==respuesta){
			    	JOptionPane.showMessageDialog(null, "Respuesta Correcta :) ");
			    }else{
			    	JOptionPane.showMessageDialog(null, "Respuesta Incorrecta :(");
			    }*/
			}

		
		
		});
		btnVerificar.setBackground(Color.RED);
		btnVerificar.setBounds(21, 113, 73, 26);
		contentPane.add(btnVerificar);
		
		JButton btnVerificar_1 = new JButton("Verificar");
		btnVerificar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1=textF1.getText();
				String num2=textF2.getText();
				int x=Integer.parseInt(num1);
				int y=Integer.parseInt(num2);
				int suma=x+y;
				int respuesta=Integer.parseInt(textFrespuesta.getText());
				String respuesta2=textFrespuesta.getText();
				
				if(respuesta2==null || respuesta2=="" ){
					JOptionPane.showMessageDialog(null, "Falta llenar campo :(");
				}else{
					 if(suma==respuesta){
					JOptionPane.showMessageDialog(null,"Respuesta correcta :)"); 
					textFrespuesta.setText("");
					textF1.setText("");
					textF2.setText("");
				    
				    }else{
					JOptionPane.showMessageDialog(null, "Respuesta incorrecta :( ");
					textFrespuesta.setText("");
			       }
				}
			}
		});
		btnVerificar_1.setBackground(new Color(0, 0, 255));
		btnVerificar_1.setBounds(232, 110, 84, 33);
		contentPane.add(btnVerificar_1);
		
		JButton btnSalir = new JButton("salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(130, 156, 89, 23);
		contentPane.add(btnSalir);
	}
}
