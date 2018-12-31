package Formulario;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JEditorPane;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class M_V extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			M_V dialog = new M_V();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public M_V() {
		setBackground(new Color(0, 0, 255));
		setTitle("UNDC");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Andr\u00E9s\\Pictures\\universidad-nacional-de-ca\u00F1ete2.png"));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(119, 136, 153));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JEditorPane dtrpnFsdfasfasFasfasfassafasfasfasfasfasfAsfasfsafsafasfascs = new JEditorPane();
		dtrpnFsdfasfasFasfasfassafasfasfasfasfasfAsfasfsafsafasfascs.setEditable(false);
		dtrpnFsdfasfasFasfasfassafasfasfasfasfasfAsfasfsafsafasfascs.setBackground(new Color(112, 128, 144));
		dtrpnFsdfasfasFasfasfassafasfasfasfasfasfAsfasfsafsafasfascs.setText("Somos una instituci\u00F3n acad\u00E9mica dedicada a la formaci\u00F3n y consolidaci\u00F3n de profesionales l\u00EDderes, competitivos, creativos e innovadores, promoviendo la creaci\u00F3n, difusi\u00F3n y transmisi\u00F3n de conocimiento, valores y cultura para el desarrollo sostenible de la regi\u00F3n sur y del pa\u00EDs.\r\n");
		dtrpnFsdfasfasFasfasfassafasfasfasfasfasfAsfasfsafsafasfascs.setBounds(10, 48, 401, 67);
		contentPanel.add(dtrpnFsdfasfasFasfasfassafasfasfasfasfasfAsfasfsafsafasfascs);
		
		JLabel lblVisin = new JLabel("VISI\u00D3N");
		lblVisin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVisin.setBounds(22, 23, 46, 14);
		contentPanel.add(lblVisin);
		
		JLabel lblMision = new JLabel("MISION");
		lblMision.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMision.setBounds(22, 140, 46, 14);
		contentPanel.add(lblMision);
		
		JEditorPane dtrpnSerUnaInstitucin = new JEditorPane();
		dtrpnSerUnaInstitucin.setBackground(new Color(119, 136, 153));
		dtrpnSerUnaInstitucin.setText("Ser una instituci\u00F3n l\u00EDder con est\u00E1ndares internacionales de calidad en la formaci\u00F3n de profesionales y la investigaci\u00F3n acad\u00E9mica, inspirada y difusora de valores para la consolidaci\u00F3n de una sociedad pluricultural, democr\u00E1tica, inclusiva y equitativa.");
		dtrpnSerUnaInstitucin.setBounds(10, 154, 401, 67);
		contentPanel.add(dtrpnSerUnaInstitucin);
		
		JButton btnAtras = new JButton("atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnAtras.setBackground(new Color(0, 128, 128));
		btnAtras.setBounds(322, 227, 89, 23);
		contentPanel.add(btnAtras);
	}
}
