package entornos;
import java.util.*;
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
	private JTextField textFieldCantidad1;
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
		frame.setBounds(100, 100, 997, 843);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ArrayList<Alimentos> arrayAlimentos=new ArrayList<Alimentos>();
		arrayAlimentos.add(new Alimentos("Pollo",1.2,0.4,0.6,0.6,23.4,1.8,107,100));
		
	

		
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
		

		JLabel lblNombrePrimerAlimento = new JLabel(arrayAlimentos.get(0).getNombre());
		lblNombrePrimerAlimento.setName(arrayAlimentos.get(0).getNombre());
		lblNombrePrimerAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNombrePrimerAlimento.setBounds(182, 149, 60, 17);
		frame.getContentPane().add(lblNombrePrimerAlimento);
		
		JLabel lblNombreSegundoAlimento = new JLabel("");
		lblNombreSegundoAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNombreSegundoAlimento.setBounds(182, 178, 60, 17);
		frame.getContentPane().add(lblNombreSegundoAlimento);
		
		JLabel lblNombreTercerAlimento = new JLabel("");
		lblNombreTercerAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNombreTercerAlimento.setBounds(182, 207, 60, 17);
		frame.getContentPane().add(lblNombreTercerAlimento);
		
		JLabel lblNombreCuartoAlimento = new JLabel("");
		lblNombreCuartoAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNombreCuartoAlimento.setBounds(182, 236, 60, 17);
		frame.getContentPane().add(lblNombreCuartoAlimento);
		
		JLabel lblNombrQuintoAlimento = new JLabel("");
		lblNombrQuintoAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNombrQuintoAlimento.setBounds(182, 265, 60, 17);
		frame.getContentPane().add(lblNombrQuintoAlimento);

		textFieldCantidad1 = new JTextField();
		textFieldCantidad1.setEditable(false);
		textFieldCantidad1.setBounds(833, 147, 50, 21);
		frame.getContentPane().add(textFieldCantidad1);
		textFieldCantidad1.setColumns(10);
		
		textFieldCantidad2 = new JTextField();
		textFieldCantidad2.setEditable(false);
		textFieldCantidad2.setColumns(10);
		textFieldCantidad2.setBounds(833, 176, 50, 21);
		frame.getContentPane().add(textFieldCantidad2);

		JCheckBox checkboxPrimerAlimento = new JCheckBox("");
		checkboxPrimerAlimento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (checkboxPrimerAlimento.isSelected()) {
					textFieldCantidad1.setEditable(true);
				}
				else {
					textFieldCantidad1.setEditable(false);
				}
			}
		});
		checkboxPrimerAlimento.setBounds(155, 149, 21, 17);
		frame.getContentPane().add(checkboxPrimerAlimento);
		
		
		
		JCheckBox checkboxSegundoAlimento = new JCheckBox("");
		checkboxSegundoAlimento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (checkboxSegundoAlimento.isSelected()) {
					textFieldCantidad2.setEditable(true);
				}
				else {
					textFieldCantidad2.setEditable(false);
				}
			}
		});
		checkboxSegundoAlimento.setBounds(155, 178, 21, 17);
		frame.getContentPane().add(checkboxSegundoAlimento);
		
		JCheckBox checkboxTercerAlimento = new JCheckBox("");
		checkboxTercerAlimento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (checkboxTercerAlimento.isSelected()) {
					textFieldCantidad3.setEditable(true);
				}
				else {
					textFieldCantidad3.setEditable(false);
				}
			}
		});
		checkboxTercerAlimento.setBounds(155, 207, 21, 17);
		frame.getContentPane().add(checkboxTercerAlimento);
		
		JCheckBox checkboxCuartoAlimento = new JCheckBox("");
		checkboxCuartoAlimento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (checkboxCuartoAlimento.isSelected()) {
					textFieldCantidad4.setEditable(true);
				}
				else {
					textFieldCantidad4.setEditable(false);
				}
			}
		});
		checkboxCuartoAlimento.setBounds(155, 236, 21, 17);
		frame.getContentPane().add(checkboxCuartoAlimento);
		
		JCheckBox checkboxQuintoAlimento = new JCheckBox("");
		checkboxQuintoAlimento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (checkboxQuintoAlimento.isSelected()) {
					textFieldCantidad5.setEditable(true);
				}
				else {
					textFieldCantidad5.setEditable(false);
				}
			}
		});
		checkboxQuintoAlimento.setBounds(155, 265, 21, 17);
		frame.getContentPane().add(checkboxQuintoAlimento);
		
		JLabel lblGrasasPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getGrasas()));
		lblGrasasPrimerAlimento.setBounds(278, 149, 60, 17);
		frame.getContentPane().add(lblGrasasPrimerAlimento);
		
		JLabel lblSaturadasPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getGrasasSaturadas()));
		lblSaturadasPrimerAlimento.setBounds(363, 149, 60, 17);
		frame.getContentPane().add(lblSaturadasPrimerAlimento);
		
		JLabel lblHidratosPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getHidratos()));
		lblHidratosPrimerAlimento.setBounds(449, 149, 31, 17);
		frame.getContentPane().add(lblHidratosPrimerAlimento);
		
		JLabel lblAzucarPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getAzucar()));
		lblAzucarPrimerAlimento.setBounds(521, 149, 31, 17);
		frame.getContentPane().add(lblAzucarPrimerAlimento);
		
		JLabel lblProteinasPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getProteinas()));
		lblProteinasPrimerAlimento.setBounds(593, 149, 50, 17);
		frame.getContentPane().add(lblProteinasPrimerAlimento);
		
		JLabel lblSalPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getSal()));
		lblSalPrimerAlimento.setBounds(687, 149, 31, 17);
		frame.getContentPane().add(lblSalPrimerAlimento);
		
		JLabel lblCaloriasPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getCalorias()));
		lblCaloriasPrimerAlimento.setBounds(771, 149, 31, 17);
		frame.getContentPane().add(lblCaloriasPrimerAlimento);
		
		
		JLabel lblGrasasSegundoAlimento = new JLabel("");
		lblGrasasSegundoAlimento.setBounds(278, 178, 60, 17);
		frame.getContentPane().add(lblGrasasSegundoAlimento);
		
		JLabel lblSaturadasSegundoAlimento = new JLabel("");
		lblSaturadasSegundoAlimento.setBounds(363, 178, 60, 17);
		frame.getContentPane().add(lblSaturadasSegundoAlimento);
		
		JLabel lblHidratosTercerAlimento = new JLabel("");
		lblHidratosTercerAlimento.setBounds(449, 207, 31, 17);
		frame.getContentPane().add(lblHidratosTercerAlimento);
		
		JLabel lblAzucarTercerAlimento = new JLabel("");
		lblAzucarTercerAlimento.setBounds(521, 207, 31, 17);
		frame.getContentPane().add(lblAzucarTercerAlimento);
		
		JLabel lblProteinasTercerAlimento = new JLabel("");
		lblProteinasTercerAlimento.setBounds(593, 207, 50, 17);
		frame.getContentPane().add(lblProteinasTercerAlimento);
		
		JLabel lblSalTercerAlimento = new JLabel("");
		lblSalTercerAlimento.setBounds(687, 207, 31, 17);
		frame.getContentPane().add(lblSalTercerAlimento);
		
		JLabel lblCaloriasTercerAlimento = new JLabel("");
		lblCaloriasTercerAlimento.setBounds(771, 207, 31, 17);
		frame.getContentPane().add(lblCaloriasTercerAlimento);
		
		JLabel lblHidratosSegundoAlimento = new JLabel("");
		lblHidratosSegundoAlimento.setBounds(449, 178, 31, 17);
		frame.getContentPane().add(lblHidratosSegundoAlimento);
		
		JLabel lblAzucarSegundoAlimento = new JLabel("");
		lblAzucarSegundoAlimento.setBounds(521, 178, 31, 17);
		frame.getContentPane().add(lblAzucarSegundoAlimento);
		
		JLabel lblProteinasSegundoAlimento = new JLabel("");
		lblProteinasSegundoAlimento.setBounds(593, 178, 50, 17);
		frame.getContentPane().add(lblProteinasSegundoAlimento);
		
		JLabel lblSalSegundoAlimento = new JLabel("");
		lblSalSegundoAlimento.setBounds(687, 178, 31, 17);
		frame.getContentPane().add(lblSalSegundoAlimento);
		
		JLabel lblCaloriasSegundoAlimento = new JLabel("");
		lblCaloriasSegundoAlimento.setBounds(771, 178, 31, 17);
		frame.getContentPane().add(lblCaloriasSegundoAlimento);
		
		
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
		
		JLabel lblGrasasCuartoAlimento = new JLabel("");
		lblGrasasCuartoAlimento.setBounds(278, 236, 60, 17);
		frame.getContentPane().add(lblGrasasCuartoAlimento);
		
		JLabel lblSaturadasCuartoAlimento = new JLabel("");
		lblSaturadasCuartoAlimento.setBounds(363, 236, 60, 17);
		frame.getContentPane().add(lblSaturadasCuartoAlimento);
		
		JLabel lblHidratosCuartoAlimento = new JLabel("");
		lblHidratosCuartoAlimento.setBounds(449, 236, 31, 17);
		frame.getContentPane().add(lblHidratosCuartoAlimento);
		
		JLabel lblAzucarCuartoAlimento = new JLabel("");
		lblAzucarCuartoAlimento.setBounds(521, 236, 31, 17);
		frame.getContentPane().add(lblAzucarCuartoAlimento);
		
		JLabel lblProteinasCuartoAlimento = new JLabel("");
		lblProteinasCuartoAlimento.setBounds(593, 236, 50, 17);
		frame.getContentPane().add(lblProteinasCuartoAlimento);
		
		JLabel lblSalCuartoAlimento = new JLabel("");
		lblSalCuartoAlimento.setBounds(687, 236, 31, 17);
		frame.getContentPane().add(lblSalCuartoAlimento);
		
		JLabel lblCaloriasCuartoAlimento = new JLabel("");
		lblCaloriasCuartoAlimento.setBounds(771, 236, 31, 17);
		frame.getContentPane().add(lblCaloriasCuartoAlimento);
		
		JLabel lblGrasasQuintoAlimento = new JLabel("");
		lblGrasasQuintoAlimento.setBounds(278, 265, 60, 17);
		frame.getContentPane().add(lblGrasasQuintoAlimento);
		
		JLabel lblSaturadasQuintoAlimento = new JLabel("");
		lblSaturadasQuintoAlimento.setBounds(363, 265, 60, 17);
		frame.getContentPane().add(lblSaturadasQuintoAlimento);
		
		JLabel lblHidratosQuintoAlimento = new JLabel("");
		lblHidratosQuintoAlimento.setBounds(449, 265, 31, 17);
		frame.getContentPane().add(lblHidratosQuintoAlimento);
		
		JLabel lblAzucarQuintoAlimento = new JLabel("");
		lblAzucarQuintoAlimento.setBounds(521, 265, 31, 17);
		frame.getContentPane().add(lblAzucarQuintoAlimento);
		
		JLabel lblProteinasQuintoAlimento = new JLabel("");
		lblProteinasQuintoAlimento.setBounds(593, 265, 50, 17);
		frame.getContentPane().add(lblProteinasQuintoAlimento);
		
		JLabel lblSalQuintoAlimento = new JLabel("");
		lblSalQuintoAlimento.setBounds(687, 265, 31, 17);
		frame.getContentPane().add(lblSalQuintoAlimento);
		
		JLabel lblCaloriasQuintoAlimento = new JLabel("");
		lblCaloriasQuintoAlimento.setBounds(771, 265, 31, 17);
		frame.getContentPane().add(lblCaloriasQuintoAlimento);
		
		JLabel lblGrasasTercerAlimento = new JLabel("");
		lblGrasasTercerAlimento.setBounds(278, 207, 60, 17);
		frame.getContentPane().add(lblGrasasTercerAlimento);
		
		JLabel lblSaturadasTercerAlimento = new JLabel("");
		lblSaturadasTercerAlimento.setBounds(363, 207, 60, 17);
		frame.getContentPane().add(lblSaturadasTercerAlimento);
		
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
		lblTotalCalorias.setBounds(182, 419, 82, 17);
		frame.getContentPane().add(lblTotalCalorias);
		
		JLabel lblTotalGrasas = new JLabel("Total grasas:");
		lblTotalGrasas.setBounds(363, 419, 82, 17);
		frame.getContentPane().add(lblTotalGrasas);
		
		JLabel lblTotalAzucar = new JLabel("Total azúcar:");
		lblTotalAzucar.setBounds(561, 417, 82, 17);
		frame.getContentPane().add(lblTotalAzucar);
		
		JLabel lblTotalSal = new JLabel("Total sal:");
		lblTotalSal.setBounds(761, 417, 60, 17);
		frame.getContentPane().add(lblTotalSal);
		
		textFieldTotalCalorias = new JTextField();
		textFieldTotalCalorias.setEditable(false);
		textFieldTotalCalorias.setBounds(268, 417, 72, 21);
		frame.getContentPane().add(textFieldTotalCalorias);
		textFieldTotalCalorias.setColumns(10);
		
		textFieldTotalGrasas = new JTextField();
		textFieldTotalGrasas.setEditable(false);
		textFieldTotalGrasas.setColumns(10);
		textFieldTotalGrasas.setBounds(449, 417, 72, 21);
		frame.getContentPane().add(textFieldTotalGrasas);
		
		textFieldTotalAzucar = new JTextField();
		textFieldTotalAzucar.setEditable(false);
		textFieldTotalAzucar.setColumns(10);
		textFieldTotalAzucar.setBounds(646, 415, 72, 21);
		frame.getContentPane().add(textFieldTotalAzucar);
		
		textFieldTotalSal = new JTextField();
		textFieldTotalSal.setEditable(false);
		textFieldTotalSal.setColumns(10);
		textFieldTotalSal.setBounds(821, 415, 72, 21);
		frame.getContentPane().add(textFieldTotalSal);
		
		
		
		
		
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String cadenagrasas,cadenaazucares,cadenasal,cadenacalorias;
				String cadenagrasas2,cadenaazucares2,cadenasal2,cadenacalorias2;
				String cadenatotalgrasas,cadenatotalazucares,cadenatotalsal,cadenatotalcalorias;
				double totalgrasas,totalazucares,totalsal,totalcalorias;
				
				cadenagrasas=lblGrasasPrimerAlimento.getText();
				cadenagrasas2=lblGrasasSegundoAlimento.getText();
				totalgrasas=Double.valueOf(cadenagrasas)+Double.valueOf(cadenagrasas2);
				cadenatotalgrasas=String.valueOf(totalgrasas);
				
				cadenaazucares=lblAzucarPrimerAlimento.getText();
				cadenaazucares2=lblAzucarSegundoAlimento.getText();
				totalazucares=Double.valueOf(cadenaazucares)+Double.valueOf(cadenaazucares2);
				cadenatotalazucares=String.valueOf(totalazucares);
				
				cadenasal=lblSalPrimerAlimento.getText();
				cadenasal2=lblSalSegundoAlimento.getText();
				totalsal=Double.valueOf(cadenasal)+Double.valueOf(cadenasal2);
				cadenatotalsal=String.valueOf(totalsal);
				
				cadenacalorias=lblCaloriasPrimerAlimento.getText();
				cadenacalorias2=lblCaloriasSegundoAlimento.getText();
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
		btnCalcular.setBounds(466, 538, 105, 27);
		frame.getContentPane().add(btnCalcular);
	}
}
