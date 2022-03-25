package entornos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaDonet {

	private JFrame frame;
	private JTextField textFieldCantidad;
	private JTextField textFieldCantidad2;
	private JTextField textField_1;
	private JTextField textFieldCantidad3;
	private JTextField textFieldCantidad4;
	private JTextField textFieldCantidad5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaDonet window = new VentanaDonet();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaDonet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 997, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(182, 111, 60, 17);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblGrasas = new JLabel("Grasas");
		lblGrasas.setBounds(268, 112, 60, 17);
		frame.getContentPane().add(lblGrasas);
		
		JLabel lblSaturadas = new JLabel("Saturadas");
		lblSaturadas.setBounds(340, 111, 60, 17);
		frame.getContentPane().add(lblSaturadas);
		
		JLabel lblHidratos = new JLabel("Hidratos");
		lblHidratos.setBounds(439, 112, 60, 17);
		frame.getContentPane().add(lblHidratos);
		
		JLabel lblAzucar = new JLabel("Azucar");
		lblAzucar.setBounds(511, 111, 60, 17);
		frame.getContentPane().add(lblAzucar);
		
		JLabel lblProteinas = new JLabel("Proteinas");
		lblProteinas.setBounds(583, 111, 60, 17);
		frame.getContentPane().add(lblProteinas);
		
		JLabel lblSal = new JLabel("Sal");
		lblSal.setBounds(687, 111, 60, 17);
		frame.getContentPane().add(lblSal);
		
		JLabel lblCalorias = new JLabel("Calorias");
		lblCalorias.setBounds(761, 111, 60, 17);
		frame.getContentPane().add(lblCalorias);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(833, 111, 60, 17);
		frame.getContentPane().add(lblCantidad);
		
		JLabel lblCocacola = new JLabel("Cocacola");
		lblCocacola.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblCocacola.setBounds(182, 178, 60, 17);
		frame.getContentPane().add(lblCocacola);
		
		JLabel lblPollo = new JLabel("Pollo");
		lblPollo.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPollo.setBounds(182, 149, 60, 17);
		frame.getContentPane().add(lblPollo);
		
		JLabel lblArroz = new JLabel("Arroz");
		lblArroz.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblArroz.setBounds(182, 207, 60, 17);
		frame.getContentPane().add(lblArroz);
		
		JLabel lblNueces = new JLabel("Nueces");
		lblNueces.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNueces.setBounds(182, 236, 60, 17);
		frame.getContentPane().add(lblNueces);
		
		JLabel lblPltano = new JLabel("Plátano");
		lblPltano.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPltano.setBounds(182, 265, 60, 17);
		frame.getContentPane().add(lblPltano);
		
		JCheckBox checkbox1 = new JCheckBox("");
		checkbox1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldCantidad.setEditable(true);
				
			}
		});
		checkbox1.setBounds(155, 149, 21, 17);
		frame.getContentPane().add(checkbox1);
		
		JCheckBox checkbox2 = new JCheckBox("");
		checkbox2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldCantidad2.setEditable(true);
			}
		});
		checkbox2.setBounds(155, 178, 21, 17);
		frame.getContentPane().add(checkbox2);
		
		JCheckBox checkbox3 = new JCheckBox("");
		checkbox3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldCantidad3.setEditable(true);
			}
		});
		checkbox3.setBounds(155, 207, 21, 17);
		frame.getContentPane().add(checkbox3);
		
		JCheckBox checkbox4 = new JCheckBox("");
		checkbox4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldCantidad4.setEditable(true);
			}
		});
		checkbox4.setBounds(155, 236, 21, 17);
		frame.getContentPane().add(checkbox4);
		
		JCheckBox checkbox5 = new JCheckBox("");
		checkbox5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldCantidad5.setEditable(true);
			}
		});
		checkbox5.setBounds(155, 265, 21, 17);
		frame.getContentPane().add(checkbox5);
		
		JLabel lblNewLabel = new JLabel("1,2g");
		lblNewLabel.setBounds(278, 149, 60, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblg = new JLabel("0,4g");
		lblg.setBounds(363, 149, 60, 17);
		frame.getContentPane().add(lblg);
		
		JLabel lblg_1 = new JLabel("0,6g");
		lblg_1.setBounds(449, 149, 31, 17);
		frame.getContentPane().add(lblg_1);
		
		JLabel lblg_2 = new JLabel("0,6g");
		lblg_2.setBounds(521, 149, 31, 17);
		frame.getContentPane().add(lblg_2);
		
		JLabel lblg_2_1 = new JLabel("23,4g");
		lblg_2_1.setBounds(593, 149, 50, 17);
		frame.getContentPane().add(lblg_2_1);
		
		JLabel lblg_2_2 = new JLabel("1,8g");
		lblg_2_2.setBounds(687, 149, 31, 17);
		frame.getContentPane().add(lblg_2_2);
		
		JLabel lblg_2_3 = new JLabel("107");
		lblg_2_3.setBounds(771, 149, 31, 17);
		frame.getContentPane().add(lblg_2_3);
		
		textFieldCantidad = new JTextField();
		textFieldCantidad.setEditable(false);
		textFieldCantidad.setBounds(833, 147, 50, 21);
		frame.getContentPane().add(textFieldCantidad);
		textFieldCantidad.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("1,2g");
		lblNewLabel_1.setBounds(278, 178, 60, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblg_3 = new JLabel("0,4g");
		lblg_3.setBounds(363, 178, 60, 17);
		frame.getContentPane().add(lblg_3);
		
		JLabel lblg_1_1 = new JLabel("0,6g");
		lblg_1_1.setBounds(449, 207, 31, 17);
		frame.getContentPane().add(lblg_1_1);
		
		JLabel lblg_2_4 = new JLabel("0,6g");
		lblg_2_4.setBounds(521, 207, 31, 17);
		frame.getContentPane().add(lblg_2_4);
		
		JLabel lblg_2_1_1 = new JLabel("23,4g");
		lblg_2_1_1.setBounds(593, 207, 50, 17);
		frame.getContentPane().add(lblg_2_1_1);
		
		JLabel lblg_2_2_1 = new JLabel("1,8g");
		lblg_2_2_1.setBounds(687, 207, 31, 17);
		frame.getContentPane().add(lblg_2_2_1);
		
		JLabel lblg_2_3_1 = new JLabel("107");
		lblg_2_3_1.setBounds(771, 207, 31, 17);
		frame.getContentPane().add(lblg_2_3_1);
		
		JLabel lblg_1_2 = new JLabel("0,6g");
		lblg_1_2.setBounds(449, 178, 31, 17);
		frame.getContentPane().add(lblg_1_2);
		
		JLabel lblg_2_5 = new JLabel("0,6g");
		lblg_2_5.setBounds(521, 178, 31, 17);
		frame.getContentPane().add(lblg_2_5);
		
		JLabel lblg_2_1_2 = new JLabel("23,4g");
		lblg_2_1_2.setBounds(593, 178, 50, 17);
		frame.getContentPane().add(lblg_2_1_2);
		
		JLabel lblg_2_2_2 = new JLabel("1,8g");
		lblg_2_2_2.setBounds(687, 178, 31, 17);
		frame.getContentPane().add(lblg_2_2_2);
		
		JLabel lblg_2_3_2 = new JLabel("107");
		lblg_2_3_2.setBounds(771, 178, 31, 17);
		frame.getContentPane().add(lblg_2_3_2);
		
		textFieldCantidad2 = new JTextField();
		textFieldCantidad2.setEditable(false);
		textFieldCantidad2.setColumns(10);
		textFieldCantidad2.setBounds(833, 176, 50, 21);
		frame.getContentPane().add(textFieldCantidad2);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(833, 205, 50, 21);
		frame.getContentPane().add(textField_1);
		
		textFieldCantidad3 = new JTextField();
		textFieldCantidad3.setEditable(false);
		textFieldCantidad3.setColumns(10);
		textFieldCantidad3.setBounds(833, 205, 50, 21);
		frame.getContentPane().add(textFieldCantidad3);
		
		JLabel lblNewLabel_1_1 = new JLabel("1,2g");
		lblNewLabel_1_1.setBounds(278, 236, 60, 17);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblg_3_1 = new JLabel("0,4g");
		lblg_3_1.setBounds(363, 236, 60, 17);
		frame.getContentPane().add(lblg_3_1);
		
		JLabel lblg_1_2_1 = new JLabel("0,6g");
		lblg_1_2_1.setBounds(449, 236, 31, 17);
		frame.getContentPane().add(lblg_1_2_1);
		
		JLabel lblg_2_5_1 = new JLabel("0,6g");
		lblg_2_5_1.setBounds(521, 236, 31, 17);
		frame.getContentPane().add(lblg_2_5_1);
		
		JLabel lblg_2_1_2_1 = new JLabel("23,4g");
		lblg_2_1_2_1.setBounds(593, 236, 50, 17);
		frame.getContentPane().add(lblg_2_1_2_1);
		
		JLabel lblg_2_2_2_1 = new JLabel("1,8g");
		lblg_2_2_2_1.setBounds(687, 236, 31, 17);
		frame.getContentPane().add(lblg_2_2_2_1);
		
		JLabel lblg_2_3_2_1 = new JLabel("107");
		lblg_2_3_2_1.setBounds(771, 236, 31, 17);
		frame.getContentPane().add(lblg_2_3_2_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("1,2g");
		lblNewLabel_1_2.setBounds(278, 265, 60, 17);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblg_3_2 = new JLabel("0,4g");
		lblg_3_2.setBounds(363, 265, 60, 17);
		frame.getContentPane().add(lblg_3_2);
		
		JLabel lblg_1_2_2 = new JLabel("0,6g");
		lblg_1_2_2.setBounds(449, 265, 31, 17);
		frame.getContentPane().add(lblg_1_2_2);
		
		JLabel lblg_2_5_2 = new JLabel("0,6g");
		lblg_2_5_2.setBounds(521, 265, 31, 17);
		frame.getContentPane().add(lblg_2_5_2);
		
		JLabel lblg_2_1_2_2 = new JLabel("23,4g");
		lblg_2_1_2_2.setBounds(593, 265, 50, 17);
		frame.getContentPane().add(lblg_2_1_2_2);
		
		JLabel lblg_2_2_2_2 = new JLabel("1,8g");
		lblg_2_2_2_2.setBounds(687, 265, 31, 17);
		frame.getContentPane().add(lblg_2_2_2_2);
		
		JLabel lblg_2_3_2_2 = new JLabel("107");
		lblg_2_3_2_2.setBounds(771, 265, 31, 17);
		frame.getContentPane().add(lblg_2_3_2_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("1,2g");
		lblNewLabel_1_1_1.setBounds(278, 207, 60, 17);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblg_3_1_1 = new JLabel("0,4g");
		lblg_3_1_1.setBounds(363, 207, 60, 17);
		frame.getContentPane().add(lblg_3_1_1);
		
		textFieldCantidad4 = new JTextField();
		textFieldCantidad4.setEditable(false);
		textFieldCantidad4.setColumns(10);
		textFieldCantidad4.setBounds(833, 234, 50, 21);
		frame.getContentPane().add(textFieldCantidad4);
		
		textFieldCantidad5 = new JTextField();
		textFieldCantidad5.setEditable(false);
		textFieldCantidad5.setColumns(10);
		textFieldCantidad5.setBounds(833, 263, 50, 21);
		frame.getContentPane().add(textFieldCantidad5);
	}
}
