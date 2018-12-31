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
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class contabilidad extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			contabilidad dialog = new contabilidad();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public contabilidad() {
		setTitle("UNDC");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Andr\u00E9s\\Pictures\\universidad-nacional-de-ca\u00F1ete2.png"));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblIngDeSistemas = new JLabel("CONTABILIDAD");
			lblIngDeSistemas.setBackground(new Color(102, 204, 204));
			lblIngDeSistemas.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblIngDeSistemas.setBounds(20, 27, 148, 21);
			contentPanel.add(lblIngDeSistemas);
		}
		{
			JEditorPane dtrpnLaUniversidadNacional = new JEditorPane();
			dtrpnLaUniversidadNacional.setBackground(new Color(102, 204, 204));
			dtrpnLaUniversidadNacional.setText("La Universidad Nacional de Ca\u00F1ete a trav\u00E9s de la Carrera Profesional de Contabilidad tiene como misi\u00F3n formar profesionales que tengan la capacidad de desenvolverse en entornos econ\u00F3micos globales, proponer soluciones de negocios a partir del entendimiento e interpretaci\u00F3n de hechos econ\u00F3micos y financieros de una empresa.");
			dtrpnLaUniversidadNacional.setBounds(20, 65, 375, 106);
			contentPanel.add(dtrpnLaUniversidadNacional);
		}
		{
			JButton btnAtras = new JButton("atras");
			btnAtras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnAtras.setBackground(new Color(204, 204, 204));
			btnAtras.setBounds(306, 227, 89, 23);
			contentPanel.add(btnAtras);
		}
		{
			JLabel label = new JLabel("");
			label.setHorizontalAlignment(SwingConstants.TRAILING);
			label.setVerticalAlignment(SwingConstants.TOP);
			label.setIcon(new ImageIcon("C:\\Users\\Andr\u00E9s\\Desktop\\la-contabilidad-en-un-negocio.jpg"));
			label.setBounds(0, 0, 424, 261);
			contentPanel.add(label);
		}
	}

}
