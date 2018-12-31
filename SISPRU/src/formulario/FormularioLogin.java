package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textusuario;
	private JPasswordField textclave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioLogin frame = new FormularioLogin();
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
	public FormularioLogin() {
		setTitle("Sistema Acceso");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Andr\u00E9s\\Pictures\\3.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 184);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Datos de Acceso", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 397, 134);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textusuario = new JTextField();
		textusuario.setBounds(127, 25, 86, 20);
		panel.add(textusuario);
		textusuario.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("USUARIO:");
		lblNewLabel.setBounds(37, 28, 56, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CLAVE:");
		lblNewLabel_1.setBounds(47, 59, 46, 14);
		panel.add(lblNewLabel_1);
		
		JButton acceso = new JButton("Acceso");
		acceso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user, clave;
				user=textusuario.getText();//getText() captura el texto
				clave=textclave.getText();
				
				if(user.equals("andres")&&clave.equals("123")){
					JOptionPane.showMessageDialog(null, "Bienvenido al sistema de Ventas " + user);
					fmPrincipal dc;
					dc=new fmPrincipal();
					
					dc.setLocation(getLocationOnScreen());
					dc.setVisible(true);
					setVisible(false);
				}
				else{
					JOptionPane.showMessageDialog(null, "Error :( de Acceso");
				}
				
			}
		});
		acceso.setBounds(245, 24, 89, 23);
		panel.add(acceso);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setBounds(245, 55, 89, 23);
		panel.add(cancelar);
		
		textclave = new JPasswordField();
		textclave.setBounds(127, 56, 86, 20);
		panel.add(textclave);
	}
}
