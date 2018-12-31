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
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;
import javax.swing.DropMode;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class agronomia extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			agronomia dialog = new agronomia();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public agronomia() {
		setTitle("UNDC");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Andr\u00E9s\\Pictures\\universidad-nacional-de-ca\u00F1ete2.png"));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblAgronomia = new JLabel("AGRONOMIA");
			lblAgronomia.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblAgronomia.setBounds(10, 23, 91, 26);
			contentPanel.add(lblAgronomia);
		}
		{
			JEditorPane dtrpnLaAgronomaEs = new JEditorPane();
			dtrpnLaAgronomaEs.setBackground(new Color(204, 204, 255));
			dtrpnLaAgronomaEs.setText("La Agronom\u00EDa, es la ciencia de la agricultura y es tambi\u00E9n una ingenier\u00EDa.\r\n La agricultura es la actividad econ\u00F3mica que tiene por objeto obtener los vegetales \u00FAtiles al hombre, en particular, aquellos destinados a su alimentaci\u00F3n.\r\nLas principales materias o cursos que conforman la ciencia agron\u00F3mica son Fitotecnia, Frutales y Hortalizas, Suelos y Riego, Sanidad Vegetal, Postcosecha y Mejoramiento Gen\u00E9tico de Plantas.");
			dtrpnLaAgronomaEs.setBounds(10, 62, 385, 134);
			contentPanel.add(dtrpnLaAgronomaEs);
		}
		{
			JButton btnAtras = new JButton("atras");
			btnAtras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnAtras.setBackground(new Color(51, 102, 0));
			btnAtras.setBounds(335, 227, 89, 23);
			contentPanel.add(btnAtras);
		}
		{
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon("C:\\Users\\Andr\u00E9s\\Desktop\\ust-agronomia-716x400 (1).jpg"));
			label.setBounds(0, 0, 434, 261);
			contentPanel.add(label);
		}
	}

}
