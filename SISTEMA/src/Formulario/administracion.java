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
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class administracion extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			administracion dialog = new administracion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public administracion() {
		setTitle("UNDC");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Andr\u00E9s\\Pictures\\universidad-nacional-de-ca\u00F1ete2.png"));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(211, 211, 211));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnAtras = new JButton("atras");
			btnAtras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnAtras.setBackground(new Color(218, 165, 32));
			btnAtras.setBounds(335, 227, 89, 23);
			contentPanel.add(btnAtras);
		}
		{
			JEditorPane dtrpnLaCarreraProfesional = new JEditorPane();
			dtrpnLaCarreraProfesional.setBackground(new Color(211, 211, 211));
			dtrpnLaCarreraProfesional.setText("La carrera profesional de Administraci\u00F3n proporciona al estudiante las herramientas necesarias para que profesionalmente se desarrolle como gerente de una organizaci\u00F3n, como trabajadores o propietarios y de esta manera sean los responsables para que los colaboradores contribuyan al logro de los objetivos del grupo y la empresa.");
			dtrpnLaCarreraProfesional.setBounds(20, 56, 390, 105);
			contentPanel.add(dtrpnLaCarreraProfesional);
		}
		{
			JLabel lblAdministracin = new JLabel("ADMINISTRACI\u00D3N");
			lblAdministracin.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblAdministracin.setBounds(20, 11, 122, 29);
			contentPanel.add(lblAdministracin);
		}
		{
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon("C:\\Users\\Andr\u00E9s\\Desktop\\Administracion-de-proyectos-imagen.png"));
			label.setBounds(0, 0, 434, 261);
			contentPanel.add(label);
		}
	}

}
