package Formulario;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class turismo extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			turismo dialog = new turismo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public turismo() {
		setTitle("UNDC");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Andr\u00E9s\\Pictures\\universidad-nacional-de-ca\u00F1ete2.png"));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblTurismoYHoteleria = new JLabel("TURISMO Y HOTELERIA");
			lblTurismoYHoteleria.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblTurismoYHoteleria.setBounds(116, 11, 163, 33);
			contentPanel.add(lblTurismoYHoteleria);
		}
		{
			JEditorPane dtrpnLaCarreraProfesional = new JEditorPane();
			dtrpnLaCarreraProfesional.setToolTipText("");
			dtrpnLaCarreraProfesional.setBackground(new Color(204, 204, 204));
			dtrpnLaCarreraProfesional.setText("La Carrera Profesional de Administraci\u00F3n de Turismo y Hoteler\u00EDa ha de brindar la preparaci\u00F3n profesional a los alumnos que, atra\u00EDdos por la actividad tur\u00EDstica, han optado por esta carrera que ha de convertirse en uno de los instrumentos de desarrollo de las diversas Regiones, en m\u00E9rito a sus potencialidades en atractivos culturales y de naturaleza.");
			dtrpnLaCarreraProfesional.setBounds(10, 76, 311, 118);
			contentPanel.add(dtrpnLaCarreraProfesional);
		}
		{
			JButton btnAtras = new JButton("atras");
			btnAtras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnAtras.setBackground(new Color(204, 204, 204));
			btnAtras.setBounds(330, 227, 80, 23);
			contentPanel.add(btnAtras);
		}
		{
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon("C:\\Users\\Andr\u00E9s\\Desktop\\maestra_y_alumnos-_turismo_y_hoteleria-porque.jpg"));
			label.setBounds(0, 0, 434, 261);
			contentPanel.add(label);
		}
	}
}
