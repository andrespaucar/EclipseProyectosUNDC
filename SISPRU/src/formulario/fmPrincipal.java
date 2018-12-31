package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class fmPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fmPrincipal frame = new fmPrincipal();
					//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
	public fmPrincipal() {
		setBackground(new Color(255, 255, 255));
		setForeground(Color.WHITE);
		setTitle("Sistema de Ventas ");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Andr\u00E9s\\Pictures\\universidad-nacional-de-ca\u00F1ete2.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(255, 255, 255));
		menuBar.setBackground(new Color(102, 102, 102));
		setJMenuBar(menuBar);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		JMenuItem mntmUsuario = new JMenuItem("Usuario");
		mntmUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frnUsuario dc;
				dc=new frnUsuario();
				dc.setLocation(getLocationOnScreen());
				dc.setVisible(true);
			}
		});
		mnMantenimiento.add(mntmUsuario);
		
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mntmClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frnCliente dc;
				dc=new frnCliente();
				dc.setLocation(getLocation());
				dc.setVisible(true);
				
			}
		});
		mnMantenimiento.add(mntmClientes);
		
		JMenuItem mntmProductos = new JMenuItem("Productos");
		mntmProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frnProducto dc;
				dc=new frnProducto();
				dc.setLocation(getLocation());
				dc.setVisible(true);
			}
		});
		mnMantenimiento.add(mntmProductos);
		
		JMenuItem mntmSalirDelSistema = new JMenuItem("Salir del Sistema");
		mntmSalirDelSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnMantenimiento.add(mntmSalirDelSistema);
		
		JMenu mnVentas = new JMenu("Ventas");
		mnVentas.setBackground(new Color(255, 255, 255));
		menuBar.add(mnVentas);
		
		JMenuItem mntmRegistro = new JMenuItem("Registro");
		mnVentas.add(mntmRegistro);
		
		JMenuItem mntmConsultas = new JMenuItem("Consultas");
		mnVentas.add(mntmConsultas);
		
		JMenu mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
