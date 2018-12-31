package formulario;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frnCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtcliente;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txtdni;
	private JTextField txtdireccion;
	private JTextField txttelefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			frnCliente dialog = new frnCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public frnCliente() {
		setTitle("CLIENTE");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 11, 247, 217);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Codigo Cliente");
				lblNewLabel.setBounds(32, 38, 79, 14);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Nombre");
				lblNewLabel_1.setBounds(35, 63, 46, 14);
				panel.add(lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("Apellido");
				lblNewLabel_2.setBounds(35, 88, 46, 14);
				panel.add(lblNewLabel_2);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("DNI");
				lblNewLabel_3.setBounds(35, 113, 46, 14);
				panel.add(lblNewLabel_3);
			}
			{
				txtcliente = new JTextField();
				txtcliente.setBounds(136, 35, 86, 20);
				panel.add(txtcliente);
				txtcliente.setColumns(10);
			}
			{
				JLabel lblDireccion = new JLabel("Direccion");
				lblDireccion.setBounds(35, 138, 46, 14);
				panel.add(lblDireccion);
			}
			{
				JLabel lblNewLabel_4 = new JLabel("Telefono");
				lblNewLabel_4.setBounds(35, 163, 46, 14);
				panel.add(lblNewLabel_4);
			}
			{
				txtnombre = new JTextField();
				txtnombre.setBounds(136, 60, 86, 20);
				panel.add(txtnombre);
				txtnombre.setColumns(10);
			}
			{
				txtapellido = new JTextField();
				txtapellido.setBounds(136, 85, 86, 20);
				panel.add(txtapellido);
				txtapellido.setColumns(10);
			}
			{
				txtdni = new JTextField();
				txtdni.setBounds(136, 110, 86, 20);
				panel.add(txtdni);
				txtdni.setColumns(10);
			}
			{
				txtdireccion = new JTextField();
				txtdireccion.setBounds(136, 135, 86, 20);
				panel.add(txtdireccion);
				txtdireccion.setColumns(10);
			}
			{
				txttelefono = new JTextField();
				txttelefono.setBounds(136, 160, 86, 20);
				panel.add(txttelefono);
				txttelefono.setColumns(10);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "OPCIONES", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(270, 11, 154, 190);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JButton btnNewButton = new JButton("Modificar");
				btnNewButton.setBounds(32, 21, 89, 23);
				panel.add(btnNewButton);
			}
			{
				JButton btnNewButton_1 = new JButton("Registrar");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//txtcliente.getText();
						String cliente= txtcliente.getText();
						System.out.println(cliente);
						txtnombre.setText(cliente);
						
					}
				});
				btnNewButton_1.setBounds(32, 55, 89, 23);
				panel.add(btnNewButton_1);
			}
			{
				JButton btnEliminar = new JButton("Eliminar");
				btnEliminar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						txtcliente.setText("");
						txtapellido.setText("");
						txtdireccion.setText("");
						txtdni.setText("");
						txtnombre.setText("");
						txttelefono.setText("");
					}
				});
				btnEliminar.setBounds(32, 89, 89, 23);
				panel.add(btnEliminar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setBounds(32, 121, 89, 23);
				panel.add(btnCancelar);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						System.exit(0);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
