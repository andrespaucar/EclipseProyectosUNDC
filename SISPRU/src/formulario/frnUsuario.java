package formulario;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frnUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			frnUsuario dialog = new frnUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public frnUsuario() {
		setTitle("USUARIO");
		setBounds(100, 100, 450, 284);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(23, 11, 275, 228);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Codigo Usuario");
				lblNewLabel.setBounds(39, 26, 82, 14);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Nombre");
				lblNewLabel_1.setBounds(39, 51, 46, 14);
				panel.add(lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("Apellido");
				lblNewLabel_2.setBounds(39, 76, 46, 14);
				panel.add(lblNewLabel_2);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("DNI");
				lblNewLabel_3.setBounds(39, 104, 46, 14);
				panel.add(lblNewLabel_3);
			}
			{
				JLabel lblNewLabel_4 = new JLabel("Usuario");
				lblNewLabel_4.setBounds(39, 129, 46, 14);
				panel.add(lblNewLabel_4);
			}
			{
				JLabel lblNewLabel_5 = new JLabel("Clave");
				lblNewLabel_5.setBounds(39, 154, 46, 14);
				panel.add(lblNewLabel_5);
			}
			{
				textField = new JTextField();
				textField.setBounds(150, 23, 112, 20);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				textField_1 = new JTextField();
				textField_1.setBounds(150, 48, 112, 20);
				panel.add(textField_1);
				textField_1.setColumns(10);
			}
			{
				textField_2 = new JTextField();
				textField_2.setBounds(150, 73, 112, 20);
				panel.add(textField_2);
				textField_2.setColumns(10);
			}
			{
				textField_3 = new JTextField();
				textField_3.setBounds(150, 101, 112, 20);
				panel.add(textField_3);
				textField_3.setColumns(10);
			}
			{
				JLabel lblCorreo = new JLabel("Correo");
				lblCorreo.setBounds(39, 179, 46, 14);
				panel.add(lblCorreo);
			}
			{
				textField_4 = new JTextField();
				textField_4.setBounds(150, 126, 112, 20);
				panel.add(textField_4);
				textField_4.setColumns(10);
			}
			{
				textField_5 = new JTextField();
				textField_5.setBounds(150, 151, 112, 20);
				panel.add(textField_5);
				textField_5.setColumns(10);
			}
			{
				textField_6 = new JTextField();
				textField_6.setBounds(150, 176, 112, 20);
				panel.add(textField_6);
				textField_6.setColumns(10);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "OPCIONES", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(309, 31, 115, 164);
			contentPanel.add(panel);
			{
				JButton btnModificar = new JButton("Modificar");
				panel.add(btnModificar);
			}
			{
				JButton btnRegistrar = new JButton("Registrar");
				panel.add(btnRegistrar);
			}
			{
				JButton btnEliminar = new JButton("Eliminar");
				panel.add(btnEliminar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				panel.add(btnCancelar);
			}
		}
	}

}
