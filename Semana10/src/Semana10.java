import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.SpringLayout;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.nio.channels.SelectableChannel;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;

public class Semana10 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_tarifa;
	private JTextField txt_horas;
	private JTextField textsueldo;
	private JTextField textdescuento;
	private JTextField textsueldoNeto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semana10 frame = new Semana10();
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
	public Semana10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCategorias = new JLabel("Categorias:");
		lblCategorias.setBounds(27, 27, 68, 22);
		contentPane.add(lblCategorias);
		
		JComboBox cbxcategoria = new JComboBox();
		cbxcategoria.setBounds(119, 28, 101, 20);
		cbxcategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarTarifa();
			}

			private void mostrarTarifa() {
				char cat;
				cat=cbxcategoria.getSelectedItem().toString().charAt(0);
				switch (cat){
				case 'A': txt_tarifa.setText("30.00"); break;
				case 'B': txt_tarifa.setText("25.00"); break;
				case 'C': txt_tarifa.setText("20.00"); break;

				}
			
			}
		});
		cbxcategoria.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C"}));
		contentPane.add(cbxcategoria);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(289, 42, 89, 23);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularSueldo();
				
			}

			private void calcularSueldo() {
              double tarifa,sueldo,descuento;
              int horas;
              tarifa=Double.parseDouble(txt_tarifa.getText());
              horas=Integer.parseInt(txt_horas.getText());
              sueldo=tarifa*horas;
			
			
          //   textresultado.append("El sueldo bruto es: "+sueldo+"\n");
              textsueldo.setText(sueldo+"\n");

              descuento=0.7*sueldo;
              sueldo=sueldo-descuento;
              
          //    textresultado.append("El descueno es: "+descuento+ "\n");
           //   textresultado.append("El sueldo neto es: "+sueldo+"\n");
              
              textdescuento.setText(descuento+ "\n");
              textsueldoNeto.setText(sueldo+"\n");



			}
		});
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(289, 87, 89, 23);
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_horas.setText("");
				txt_tarifa.setText("");
			//	JLabel textresultado=null;
               textdescuento.setText("");
               textsueldo.setText("");
               textsueldoNeto.setText("");
			    
				
			}
		});
		contentPane.add(btnNuevo);
		
		JLabel lblTarifa = new JLabel("Tarifa:");
		lblTarifa.setBounds(29, 91, 54, 19);
		contentPane.add(lblTarifa);
		
		JLabel lblHoras = new JLabel("Horas:");
		lblHoras.setBounds(37, 142, 46, 14);
		contentPane.add(lblHoras);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(289, 138, 89, 23);
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnCerrar);
		
		txt_tarifa = new JTextField();
		txt_tarifa.setBounds(93, 88, 86, 20);
		contentPane.add(txt_tarifa);
		txt_tarifa.setColumns(10);
		
		txt_horas = new JTextField();
		txt_horas.setBounds(93, 139, 86, 20);
		contentPane.add(txt_horas);
		txt_horas.setColumns(10);
		
		textsueldo = new JTextField();
		textsueldo.setBounds(39, 216, 115, 34);
		contentPane.add(textsueldo);
		textsueldo.setColumns(10);
		
		textdescuento = new JTextField();
		textdescuento.setBounds(164, 216, 120, 34);
		contentPane.add(textdescuento);
		textdescuento.setColumns(10);
		
		textsueldoNeto = new JTextField();
		textsueldoNeto.setBounds(292, 213, 132, 37);
		contentPane.add(textsueldoNeto);
		textsueldoNeto.setColumns(10);
		
		JLabel lblSueldo = new JLabel("Sueldo");
		lblSueldo.setBounds(66, 191, 46, 14);
		contentPane.add(lblSueldo);
		
		JLabel lblDescuento = new JLabel("Descuento");
		lblDescuento.setBounds(190, 191, 68, 14);
		contentPane.add(lblDescuento);
		
		JLabel lblSueldoNeto = new JLabel("Sueldo Neto");
		lblSueldoNeto.setBounds(318, 191, 89, 14);
		contentPane.add(lblSueldoNeto);
	}
}
