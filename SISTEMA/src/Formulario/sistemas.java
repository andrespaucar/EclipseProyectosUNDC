package Formulario;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class sistemas extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			sistemas dialog = new sistemas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public sistemas() {
		setTitle("UNDC");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Andr\u00E9s\\Pictures\\universidad-nacional-de-ca\u00F1ete2.png"));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblIngDeSistemas = new JLabel("ING. DE SISTEMAS");
			lblIngDeSistemas.setForeground(new Color(255, 255, 255));
			lblIngDeSistemas.setBackground(new Color(51, 51, 255));
			lblIngDeSistemas.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblIngDeSistemas.setBounds(31, 0, 126, 36);
			contentPanel.add(lblIngDeSistemas);
		}
		{
			JEditorPane dtrpnLaCarreraProfesional = new JEditorPane();
			dtrpnLaCarreraProfesional.setBackground(new Color(153, 153, 153));
			dtrpnLaCarreraProfesional.setText("La carrera profesional de Administraci\u00F3n proporciona al estudiante las herramientas necesarias para que profesionalmente se desarrolle como gerente de una organizaci\u00F3n, como trabajadores o propietarios y de esta manera sean los responsables para que los colaboradores contribuyan al logro de los objetivos del grupo y la empresa.");
			dtrpnLaCarreraProfesional.setBounds(31, 60, 369, 119);
			contentPanel.add(dtrpnLaCarreraProfesional);
		}
		{
			JButton btnAtras = new JButton("atras");
			btnAtras.setBackground(new Color(0, 51, 255));
			btnAtras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnAtras.setBounds(335, 227, 89, 23);
			contentPanel.add(btnAtras);
		}
		{
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon("C:\\Users\\Andr\u00E9s\\Desktop\\PROD_Licenciatura-Ing-IndustrialSistemas.jpg"));
			label.setBounds(0, 0, 658, 318);
			contentPanel.add(label);
		}
	}

}
