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
import javax.swing.JButton;
import java.awt.Color;

public class VentanaDonet {

	private JFrame frame;
	private JTextField textFieldCantidad;
	private JTextField textFieldCantidad2;
	private JTextField textField_1;
	private JTextField textFieldCantidad3;
	private JTextField textFieldCantidad4;
	private JTextField textFieldCantidad5;
	private JTextField textFieldTotalCalorias;
	private JTextField textFieldTotalGrasas;
	private JTextField textFieldTotalAzucar;
	private JTextField textFieldTotalSal;

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
		
		JLabel lblNombreNombre = new JLabel("Nombre");
		lblNombreNombre.setBounds(182, 111, 60, 17);
		frame.getContentPane().add(lblNombreNombre);
		
		JLabel lblNombreGrasas = new JLabel("Grasas");
		lblNombreGrasas.setBounds(268, 112, 60, 17);
		frame.getContentPane().add(lblNombreGrasas);
		
		JLabel lblNombreSaturadas = new JLabel("Saturadas");
		lblNombreSaturadas.setBounds(340, 111, 60, 17);
		frame.getContentPane().add(lblNombreSaturadas);
		
		JLabel lblNombreHidratos = new JLabel("Hidratos");
		lblNombreHidratos.setBounds(439, 112, 60, 17);
		frame.getContentPane().add(lblNombreHidratos);
		
		JLabel lblNombreAzucar = new JLabel("Azucar");
		lblNombreAzucar.setBounds(511, 111, 60, 17);
		frame.getContentPane().add(lblNombreAzucar);
		
		JLabel lblNombreProteinas = new JLabel("Proteinas");
		lblNombreProteinas.setForeground(Color.BLACK);
		lblNombreProteinas.setBounds(583, 111, 60, 17);
		frame.getContentPane().add(lblNombreProteinas);
		
		JLabel lblNombreSal = new JLabel("Sal");
		lblNombreSal.setBounds(687, 111, 60, 17);
		frame.getContentPane().add(lblNombreSal);
		
		JLabel lblNombreCalorias = new JLabel("Calorias");
		lblNombreCalorias.setBounds(761, 111, 60, 17);
		frame.getContentPane().add(lblNombreCalorias);
		
		JLabel lblNombreCantidad = new JLabel("Cantidad");
		lblNombreCantidad.setBounds(833, 111, 60, 17);
		frame.getContentPane().add(lblNombreCantidad);
		
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

	
		JCheckBox checkboxPrimerElemento = new JCheckBox("");
		checkboxPrimerElemento.setBounds(155, 149, 21, 17);
		frame.getContentPane().add(checkboxPrimerElemento);
		if (checkboxPrimerElemento.isSelected()) {
			textFieldCantidad.setEditable(true);
		}
		
		
		JCheckBox checkboxSegundoElemento = new JCheckBox("");
		checkboxSegundoElemento.setBounds(155, 178, 21, 17);
		frame.getContentPane().add(checkboxSegundoElemento);
		
		JCheckBox checkboxTercerElemento = new JCheckBox("");
		checkboxTercerElemento.setBounds(155, 207, 21, 17);
		frame.getContentPane().add(checkboxTercerElemento);
		
		JCheckBox checkboxCuartoElemento = new JCheckBox("");
		checkboxCuartoElemento.setBounds(155, 236, 21, 17);
		frame.getContentPane().add(checkboxCuartoElemento);
		
		JCheckBox checkboxQuintoElemento = new JCheckBox("");
		checkboxQuintoElemento.setBounds(155, 265, 21, 17);
		frame.getContentPane().add(checkboxQuintoElemento);
		
		JLabel lblGrasas1 = new JLabel("1.2");
		lblGrasas1.setBounds(278, 149, 60, 17);
		frame.getContentPane().add(lblGrasas1);
		
		JLabel lblg = new JLabel("0.4");
		lblg.setBounds(363, 149, 60, 17);
		frame.getContentPane().add(lblg);
		
		JLabel lblHidratos1 = new JLabel("0.6");
		lblHidratos1.setBounds(449, 149, 31, 17);
		frame.getContentPane().add(lblHidratos1);
		
		JLabel lblAzucar1 = new JLabel("0.6");
		lblAzucar1.setBounds(521, 149, 31, 17);
		frame.getContentPane().add(lblAzucar1);
		
		JLabel lblg_2_1 = new JLabel("23.4");
		lblg_2_1.setBounds(593, 149, 50, 17);
		frame.getContentPane().add(lblg_2_1);
		
		JLabel lblSal1 = new JLabel("1.8");
		lblSal1.setBounds(687, 149, 31, 17);
		frame.getContentPane().add(lblSal1);
		
		JLabel lblCalorias1 = new JLabel("107");
		lblCalorias1.setBounds(771, 149, 31, 17);
		frame.getContentPane().add(lblCalorias1);
		
		textFieldCantidad = new JTextField();
		textFieldCantidad.setEditable(false);
		textFieldCantidad.setBounds(833, 147, 50, 21);
		frame.getContentPane().add(textFieldCantidad);
		textFieldCantidad.setColumns(10);
		
		JLabel lblGrasas2 = new JLabel("1.2");
		lblGrasas2.setBounds(278, 178, 60, 17);
		frame.getContentPane().add(lblGrasas2);
		
		JLabel lblg_3 = new JLabel("0.4");
		lblg_3.setBounds(363, 178, 60, 17);
		frame.getContentPane().add(lblg_3);
		
		JLabel lblHidratos3 = new JLabel("0.6");
		lblHidratos3.setBounds(449, 207, 31, 17);
		frame.getContentPane().add(lblHidratos3);
		
		JLabel lblAzucar3 = new JLabel("0.6");
		lblAzucar3.setBounds(521, 207, 31, 17);
		frame.getContentPane().add(lblAzucar3);
		
		JLabel lblg_2_1_1 = new JLabel("23.4");
		lblg_2_1_1.setBounds(593, 207, 50, 17);
		frame.getContentPane().add(lblg_2_1_1);
		
		JLabel lblSal3 = new JLabel("1.8");
		lblSal3.setBounds(687, 207, 31, 17);
		frame.getContentPane().add(lblSal3);
		
		JLabel lblCalorias3 = new JLabel("107");
		lblCalorias3.setBounds(771, 207, 31, 17);
		frame.getContentPane().add(lblCalorias3);
		
		JLabel lblHidratos2 = new JLabel("0.6");
		lblHidratos2.setBounds(449, 178, 31, 17);
		frame.getContentPane().add(lblHidratos2);
		
		JLabel lblAzucar2 = new JLabel("0.6");
		lblAzucar2.setBounds(521, 178, 31, 17);
		frame.getContentPane().add(lblAzucar2);
		
		JLabel lblg_2_1_2 = new JLabel("23.4");
		lblg_2_1_2.setBounds(593, 178, 50, 17);
		frame.getContentPane().add(lblg_2_1_2);
		
		JLabel lblSal2 = new JLabel("4.8");
		lblSal2.setBounds(687, 178, 31, 17);
		frame.getContentPane().add(lblSal2);
		
		JLabel lblCalorias2 = new JLabel("107");
		lblCalorias2.setBounds(771, 178, 31, 17);
		frame.getContentPane().add(lblCalorias2);
		
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
		
		JLabel lblGrasas4 = new JLabel("1.2");
		lblGrasas4.setBounds(278, 236, 60, 17);
		frame.getContentPane().add(lblGrasas4);
		
		JLabel lblg_3_1 = new JLabel("0.4");
		lblg_3_1.setBounds(363, 236, 60, 17);
		frame.getContentPane().add(lblg_3_1);
		
		JLabel lblHidratos4 = new JLabel("0.6");
		lblHidratos4.setBounds(449, 236, 31, 17);
		frame.getContentPane().add(lblHidratos4);
		
		JLabel lblAzucar4 = new JLabel("0.6");
		lblAzucar4.setBounds(521, 236, 31, 17);
		frame.getContentPane().add(lblAzucar4);
		
		JLabel lblg_2_1_2_1 = new JLabel("23.4");
		lblg_2_1_2_1.setBounds(593, 236, 50, 17);
		frame.getContentPane().add(lblg_2_1_2_1);
		
		JLabel lblSal4 = new JLabel("1.8");
		lblSal4.setBounds(687, 236, 31, 17);
		frame.getContentPane().add(lblSal4);
		
		JLabel lblCalorias4 = new JLabel("107");
		lblCalorias4.setBounds(771, 236, 31, 17);
		frame.getContentPane().add(lblCalorias4);
		
		JLabel lblGrasas5 = new JLabel("1.2");
		lblGrasas5.setBounds(278, 265, 60, 17);
		frame.getContentPane().add(lblGrasas5);
		
		JLabel lblg_3_2 = new JLabel("0.4");
		lblg_3_2.setBounds(363, 265, 60, 17);
		frame.getContentPane().add(lblg_3_2);
		
		JLabel lblHidratos5 = new JLabel("0.6");
		lblHidratos5.setBounds(449, 265, 31, 17);
		frame.getContentPane().add(lblHidratos5);
		
		JLabel lblAzucar5 = new JLabel("0.6");
		lblAzucar5.setBounds(521, 265, 31, 17);
		frame.getContentPane().add(lblAzucar5);
		
		JLabel lblg_2_1_2_2 = new JLabel("23.4");
		lblg_2_1_2_2.setBounds(593, 265, 50, 17);
		frame.getContentPane().add(lblg_2_1_2_2);
		
		JLabel lblSal5 = new JLabel("1.8");
		lblSal5.setBounds(687, 265, 31, 17);
		frame.getContentPane().add(lblSal5);
		
		JLabel lblCalorias5 = new JLabel("107");
		lblCalorias5.setBounds(771, 265, 31, 17);
		frame.getContentPane().add(lblCalorias5);
		
		JLabel lblGrasas3 = new JLabel("1.2");
		lblGrasas3.setBounds(278, 207, 60, 17);
		frame.getContentPane().add(lblGrasas3);
		
		JLabel lblg_3_1_1 = new JLabel("0.4");
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
		
		JLabel lblTotalCalorias = new JLabel("Total calorías:");
		lblTotalCalorias.setBounds(182, 366, 82, 17);
		frame.getContentPane().add(lblTotalCalorias);
		
		JLabel lblTotalGrasas = new JLabel("Total grasas:");
		lblTotalGrasas.setBounds(363, 366, 82, 17);
		frame.getContentPane().add(lblTotalGrasas);
		
		JLabel lblTotalAzucar = new JLabel("Total azúcar:");
		lblTotalAzucar.setBounds(561, 366, 82, 17);
		frame.getContentPane().add(lblTotalAzucar);
		
		JLabel lblTotalSal = new JLabel("Total sal:");
		lblTotalSal.setBounds(761, 366, 60, 17);
		frame.getContentPane().add(lblTotalSal);
		
		textFieldTotalCalorias = new JTextField();
		textFieldTotalCalorias.setEditable(false);
		textFieldTotalCalorias.setBounds(268, 364, 72, 21);
		frame.getContentPane().add(textFieldTotalCalorias);
		textFieldTotalCalorias.setColumns(10);
		
		textFieldTotalGrasas = new JTextField();
		textFieldTotalGrasas.setEditable(false);
		textFieldTotalGrasas.setColumns(10);
		textFieldTotalGrasas.setBounds(449, 364, 72, 21);
		frame.getContentPane().add(textFieldTotalGrasas);
		
		textFieldTotalAzucar = new JTextField();
		textFieldTotalAzucar.setEditable(false);
		textFieldTotalAzucar.setColumns(10);
		textFieldTotalAzucar.setBounds(646, 364, 72, 21);
		frame.getContentPane().add(textFieldTotalAzucar);
		
		textFieldTotalSal = new JTextField();
		textFieldTotalSal.setEditable(false);
		textFieldTotalSal.setColumns(10);
		textFieldTotalSal.setBounds(821, 364, 72, 21);
		frame.getContentPane().add(textFieldTotalSal);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String cadenagrasas,cadenaazucares,cadenasal,cadenacalorias;
				String cadenagrasas2,cadenaazucares2,cadenasal2,cadenacalorias2;
				String cadenatotalgrasas,cadenatotalazucares,cadenatotalsal,cadenatotalcalorias;
				double totalgrasas,totalazucares,totalsal,totalcalorias;
				
				cadenagrasas=lblGrasas1.getText();
				cadenagrasas2=lblGrasas2.getText();
				totalgrasas=Double.valueOf(cadenagrasas)+Double.valueOf(cadenagrasas2);
				cadenatotalgrasas=String.valueOf(totalgrasas);
				
				cadenaazucares=lblAzucar1.getText();
				cadenaazucares2=lblAzucar2.getText();
				totalazucares=Double.valueOf(cadenaazucares)+Double.valueOf(cadenaazucares2);
				cadenatotalazucares=String.valueOf(totalazucares);
				
				cadenasal=lblSal1.getText();
				cadenasal2=lblSal2.getText();
				totalsal=Double.valueOf(cadenasal)+Double.valueOf(cadenasal2);
				cadenatotalsal=String.valueOf(totalsal);
				
				cadenacalorias=lblCalorias1.getText();
				cadenacalorias2=lblCalorias2.getText();
				totalcalorias=Double.valueOf(cadenacalorias)+Double.valueOf(cadenacalorias2);
				cadenatotalcalorias=String.valueOf(totalcalorias);
				
				textFieldTotalGrasas.setText(cadenatotalgrasas);
				textFieldTotalAzucar.setText(cadenatotalazucares);
				textFieldTotalSal.setText(cadenatotalsal);
				textFieldTotalCalorias.setText(cadenatotalcalorias);
				
				if (totalgrasas>=totalcalorias*30/100) {
					
					lblNombreGrasas.setForeground(Color.red);
					lblTotalGrasas.setForeground(Color.red);
				}
				
				if (totalazucares>=totalcalorias*10/100) {
					
					lblNombreAzucar.setForeground(Color.red);
					lblTotalAzucar.setForeground(Color.red);
				}
				
				if (totalsal>=5) {
					
					lblNombreSal.setForeground(Color.red);
					lblTotalSal.setForeground(Color.red);
				}
				
			}
		});
		btnCalcular.setBounds(471, 450, 105, 27);
		frame.getContentPane().add(btnCalcular);
	}
}
