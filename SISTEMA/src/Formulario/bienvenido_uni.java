package Formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JEditorPane;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bienvenido_uni extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bienvenido_uni frame = new bienvenido_uni();
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
	public bienvenido_uni() {
		setTitle("UNDC");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Andr\u00E9s\\Pictures\\universidad-nacional-de-ca\u00F1ete2.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 298);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Es una instituci\u00F3n p\u00FAblica de educaci\u00F3n superior.\r\n\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBounds(-18, 158, 297, 26);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setToolTipText("\r\n");
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("La Universidad Nacional de Ca\u00F1ete, fue creada mediante Ley N\u00B0 29488.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(9, 132, 435, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblLaVidaUniversitaria = new JLabel("La vida universitaria es una etapa fundamental en la formaci\u00F3n en la formaci\u00F3n ");
		lblLaVidaUniversitaria.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLaVidaUniversitaria.setBounds(10, 182, 452, 27);
		contentPane.add(lblLaVidaUniversitaria);
		
		JLabel lblDeHombresY = new JLabel("de hombres y mujeres de bien.");
		lblDeHombresY.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblDeHombresY.setBounds(12, 207, 307, 22);
		contentPane.add(lblDeHombresY);
		
		JButton btnAtras = new JButton("atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnAtras.setBackground(new Color(119, 136, 153));
		btnAtras.setBounds(355, 220, 89, 23);
		contentPane.add(btnAtras);
		
		JLabel label = new JLabel("");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setIcon(new ImageIcon("C:\\Users\\Andr\u00E9s\\Desktop\\ca\u00F1ete_00004.jpg"));
		label.setBounds(-3, 0, 451, 259);
		contentPane.add(label);
	}
}
