package Formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class PRINCIPAL_LOGIN extends JFrame {

	private JPanel contentPane;
	private JTextField textuser;
	private JPanel panel;
	private JPasswordField textpass;
	private JLabel lblLogin;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PRINCIPAL_LOGIN frame = new PRINCIPAL_LOGIN();
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
	public PRINCIPAL_LOGIN() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Andr\u00E9s\\Pictures\\universidad-nacional-de-ca\u00F1ete2.png"));
		setTitle("UNDC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 238);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 51, 102));
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(32, 39, 317, 138);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
		});
		btnCancelar.setBackground(new Color(0, 51, 153));
		btnCancelar.setBounds(36, 104, 89, 23);
		panel.add(btnCancelar);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(new Color(51, 153, 0));
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// LOGIN	
				String user=textuser.getText();
				String pass=textpass.getText();
				
				if (user.equals("admin") && pass.equals("123")){
					BIENVENIDO b;
					b=new BIENVENIDO();
					b.setLocation(getLocationOnScreen());
					b.setVisible(true);
					setVisible(false);
					
				   
				}
				else 
					JOptionPane.showMessageDialog(null, "Buelva a intentarlo :(");
			}
		});
		btnEnviar.setBounds(181, 104, 89, 23);
		panel.add(btnEnviar);
		
		textpass = new JPasswordField();
		textpass.setBounds(162, 53, 89, 20);
		panel.add(textpass);
		
		textuser = new JTextField();
		textuser.setBounds(162, 22, 86, 20);
		panel.add(textuser);
		textuser.setColumns(10);
		
		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
		lblContrasea.setBounds(49, 56, 89, 14);
		panel.add(lblContrasea);
		
		JLabel lblUsuario_1 = new JLabel("USUARIO");
		lblUsuario_1.setBounds(73, 25, 65, 14);
		panel.add(lblUsuario_1);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLogin.setBounds(150, 11, 46, 21);
		contentPane.add(lblLogin);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBackground(SystemColor.activeCaptionBorder);
		lblNewLabel.setBounds(0, 0, 389, 199);
		contentPane.add(lblNewLabel);
	}
}
