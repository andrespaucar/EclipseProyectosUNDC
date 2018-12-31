package formulario;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frnProducto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			frnProducto dialog = new frnProducto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public frnProducto() {
		setBounds(100, 100, 450, 261);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 11, 274, 160);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Codigo Producto");
				lblNewLabel.setBounds(20, 22, 89, 14);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Nombre Producto");
				lblNewLabel_1.setBounds(20, 47, 111, 14);
				panel.add(lblNewLabel_1);
			}
			{
				JLabel lblCantidadDeProducto = new JLabel("Cantidad de Producto");
				lblCantidadDeProducto.setBounds(20, 72, 111, 14);
				panel.add(lblCantidadDeProducto);
			}
			{
				JLabel lblPrecioDeProducto = new JLabel("Precio de  Producto");
				lblPrecioDeProducto.setBounds(20, 97, 111, 14);
				panel.add(lblPrecioDeProducto);
			}
			{
				textField = new JTextField();
				textField.setBounds(165, 19, 86, 20);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				textField_1 = new JTextField();
				textField_1.setBounds(165, 44, 86, 20);
				panel.add(textField_1);
				textField_1.setColumns(10);
			}
			{
				textField_2 = new JTextField();
				textField_2.setBounds(165, 69, 86, 20);
				panel.add(textField_2);
				textField_2.setColumns(10);
			}
			{
				textField_3 = new JTextField();
				textField_3.setBounds(165, 94, 86, 20);
				panel.add(textField_3);
				textField_3.setColumns(10);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBounds(294, 11, 130, 167);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JButton btnRegistrar = new JButton("Registrar");
				btnRegistrar.setBounds(20, 24, 89, 23);
				panel.add(btnRegistrar);
			}
			{
				JButton btnModificar = new JButton("Modificar");
				btnModificar.setBounds(20, 58, 89, 23);
				panel.add(btnModificar);
			}
			{
				JButton btnEliminar = new JButton("Eliminar");
				btnEliminar.setBounds(20, 92, 89, 23);
				panel.add(btnEliminar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setBounds(20, 133, 89, 23);
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
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
