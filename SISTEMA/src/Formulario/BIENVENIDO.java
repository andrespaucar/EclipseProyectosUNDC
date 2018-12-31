package Formulario;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import java.awt.Toolkit;

public class BIENVENIDO extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textnombre;
	private JTextField textapellido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BIENVENIDO dialog = new BIENVENIDO();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BIENVENIDO() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Andr\u00E9s\\Pictures\\universidad-nacional-de-ca\u00F1ete2.png"));
		setTitle("UNDC");
		setBounds(100, 100, 481, 327);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(204, 204, 204));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		panel.setBounds(20, 53, 414, 165);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre ");
		lblNombre.setBounds(43, 11, 54, 22);
		panel.add(lblNombre);
		
		textnombre = new JTextField();
		textnombre.setBounds(107, 12, 86, 20);
		panel.add(textnombre);
		textnombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(43, 44, 54, 14);
		panel.add(lblApellido);
		
		textapellido = new JTextField();
		textapellido.setBounds(107, 44, 86, 20);
		textapellido.setColumns(10);
		panel.add(textapellido);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Andr\u00E9s\\Desktop\\logo_blanco.png"));
		label.setBounds(232, 15, 159, 150);
		panel.add(label);
		
		JEditorPane textconsultas = new JEditorPane();
		textconsultas.setBounds(10, 102, 212, 52);
		panel.add(textconsultas);
		
		JLabel lblEnviar = new JLabel("consultas ");
		lblEnviar.setBounds(10, 77, 68, 14);
		panel.add(lblEnviar);
		
		JLabel lblNewLabel = new JLabel("\"Universidad Nacional de Ca\u00F1ete\"");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(106, 11, 251, 31);
		contentPanel.add(lblNewLabel);
		
		JButton btnEnviar = new JButton("enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Mensaje enviado");
				textconsultas.setText("");
				textapellido.setText("");
				textnombre.setText("");
			
				
			}
		});
		btnEnviar.setBounds(345, 233, 89, 23);
		contentPanel.add(btnEnviar);
		
		JButton btnReset = new JButton("reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textconsultas.setText("");
				textapellido.setText("");
				textnombre.setText("");
			}
		});
		btnReset.setBounds(20, 229, 89, 23);
		contentPanel.add(btnReset);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(0, 153, 204));
		setJMenuBar(menuBar);
		
		JMenu mnInicio = new JMenu("inicio");
		menuBar.add(mnInicio);
		
		JMenuItem mntmHorario = new JMenuItem("Bienvenida");
		mntmHorario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bienvenido_uni bn;
				bn =new bienvenido_uni();
				bn.setLocation(getLocationOnScreen());
				bn.setVisible(true);
			}
		});
		mnInicio.add(mntmHorario);
		
		JMenuItem mntmMision = new JMenuItem("Misi\u00F3n y Visi\u00F3n");
		mntmMision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M_V mv;
				mv =new M_V();
				mv.setLocation(getLocationOnScreen());
				mv.setVisible(true);
			}
		});
		mnInicio.add(mntmMision);
		
		JMenu mnServicios = new JMenu("Carreras ");
		menuBar.add(mnServicios);
		
		JMenuItem mntmAdministracion = new JMenuItem("Administraci\u00F3n");
		mntmAdministracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				administracion a;
				a=new administracion();
				a.setLocation(getLocationOnScreen());
				a.setVisible(true);
			}
		});
		mnServicios.add(mntmAdministracion);
		
		JMenuItem mntmCarreras = new JMenuItem("Agronomia");
		mntmCarreras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agronomia ag;
				ag=new agronomia();
				ag.setLocation(getLocationOnScreen());
				ag.setVisible(true);
			}
		});
		mnServicios.add(mntmCarreras);
		
		JMenuItem mntmContabilidad = new JMenuItem("Contabilidad");
		mntmContabilidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contabilidad co;
				co=new contabilidad();
				co.setLocation(getLocationOnScreen());
				co.setVisible(true);
			}
		});
		mnServicios.add(mntmContabilidad);
		
		JMenuItem mntmAlumnos = new JMenuItem("Ing. de Sistemas");
		mntmAlumnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sistemas si;
				si=new sistemas();
				si.setLocation(getLocationOnScreen());;
				si.setVisible(true);
			}
		});
		mnServicios.add(mntmAlumnos);
		
		JMenuItem mntmTurismoYHoteleria = new JMenuItem("Turismo y Hoteleria");
		mntmTurismoYHoteleria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turismo tu;
				tu=new turismo();
				tu.setLocation(getLocationOnScreen());
				tu.setVisible(true);
			}
		});
		mnServicios.add(mntmTurismoYHoteleria);
	}
}
