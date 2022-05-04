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
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JComboBox;

public class VentanaDonet {

	private JFrame frame;
	private JTextField textFieldCantidad1;
	private JTextField textFieldCantidad2;
	private JTextField textFieldCantidad3;
	private JTextField textFieldCantidad4;
	private JTextField textFieldCantidad5;
	private JTextField textFieldTotalCalorias;
	private JTextField textFieldTotalGrasas;
	private JTextField textFieldTotalAzucar;
	private JTextField textFieldTotalSal;
	private JTextField textFieldNombreAñadir;
	private JTextField textFieldGrasasAñadir;
	private JTextField textFieldGrasasSaturadasAñadir;
	private JTextField textFieldHidratosAñadir;
	private JTextField textFieldAzucarAñadir;
	private JTextField textFieldProteinasAñadir;
	private JTextField textFieldSalAñadir;
	private JTextField textFieldCaloriasAñadir;
	private JTextField textFieldEdad;
	private JTextField txtFieldPeso;
	private JTextField textFieldAltura;

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
		arrayAlimentos.add(new Alimentos("Pollo",1.2,0.4,0.6,0.6,23.4,1.8,120,100));
		arrayAlimentos.add(new Alimentos("Arroz",0.9,0.2,77.07,0.1,8.51,0.36,360,100));
		arrayAlimentos.add(new Alimentos("Nueces",65.21,6.1,13.71,2.6,15.23,0,654,100));
		arrayAlimentos.add(new Alimentos("Plátano",0.33,0.112,22.84,12.33,1.09,0,89,100));
		arrayAlimentos.add(new Alimentos("Huevo",6.76,1.88,0.43,0.38,6.24,0.6,89,100));
	
		
		JLabel lblPeso = new JLabel("Peso(kg)");
		lblPeso.setBounds(271, 56, 60, 17);
		frame.getContentPane().add(lblPeso);
		
		txtFieldPeso = new JTextField();
		txtFieldPeso.setBounds(271, 88, 60, 21);
		frame.getContentPane().add(txtFieldPeso);
		txtFieldPeso.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(79, 56, 60, 17);
		frame.getContentPane().add(lblSexo);
		
		JComboBox comboBoxSexo = new JComboBox();
		comboBoxSexo.setBounds(69, 85, 87, 27);
		frame.getContentPane().add(comboBoxSexo);
		comboBoxSexo.addItem("Hombre");
		comboBoxSexo.addItem("Mujer");
				
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(376, 56, 60, 17);
		frame.getContentPane().add(lblEdad);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setBounds(180, 88, 50, 21);
		frame.getContentPane().add(textFieldAltura);
		textFieldAltura.setColumns(10);
		
		textFieldEdad = new JTextField();
		textFieldEdad.setBounds(372, 88, 50, 21);
		frame.getContentPane().add(textFieldEdad);
		textFieldEdad.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura(m)");
		lblAltura.setBounds(168, 56, 77, 17);
		frame.getContentPane().add(lblAltura);
		
		
		JLabel lblImc = new JLabel("IMC");
		lblImc.setBounds(890, 56, 60, 17);
		frame.getContentPane().add(lblImc);
		
		JLabel lblImctotal = new JLabel("");
		lblImctotal.setBounds(875, 90, 60, 17);
		frame.getContentPane().add(lblImctotal);
		
		JLabel lblEjercicio = new JLabel("Ejercicio");
		lblEjercicio.setBounds(514, 56, 60, 17);
		frame.getContentPane().add(lblEjercicio);
		
		JComboBox comboBoxEjercicio = new JComboBox();
		comboBoxEjercicio.setBounds(457, 85, 208, 26);
		frame.getContentPane().add(comboBoxEjercicio);
		comboBoxEjercicio.addItem("Sedentario");
		comboBoxEjercicio.addItem("Actividad ligera");
		comboBoxEjercicio.addItem("Actividad moderada");
		comboBoxEjercicio.addItem("Actividad intensa");
		comboBoxEjercicio.addItem("Actividad muy intensa");
				
		
		JLabel lblCalorasRecomendadas = new JLabel("Calorías recomendadas");
		lblCalorasRecomendadas.setBounds(690, 56, 141, 17);
		frame.getContentPane().add(lblCalorasRecomendadas);
		
		JLabel lblNumerocaloriasrecomendadas = new JLabel("");
		lblNumerocaloriasrecomendadas.setBounds(730, 90, 60, 17);
		frame.getContentPane().add(lblNumerocaloriasrecomendadas);

		
		JLabel lblNombreNombre = new JLabel("Nombre");
		lblNombreNombre.setBounds(185, 154, 60, 17);
		frame.getContentPane().add(lblNombreNombre);
		
		JLabel lblNombreGrasas = new JLabel("Grasas (g)");
		lblNombreGrasas.setBounds(271, 155, 60, 17);
		frame.getContentPane().add(lblNombreGrasas);
		
		JLabel lblNombreSaturadas = new JLabel("Saturadas");
		lblNombreSaturadas.setBounds(343, 154, 60, 17);
		frame.getContentPane().add(lblNombreSaturadas);
		
		JLabel lblNombreHidratos = new JLabel("Hidratos");
		lblNombreHidratos.setBounds(442, 155, 60, 17);
		frame.getContentPane().add(lblNombreHidratos);
		
		JLabel lblNombreAzucar = new JLabel("Azucar");
		lblNombreAzucar.setBounds(514, 154, 60, 17);
		frame.getContentPane().add(lblNombreAzucar);
		
		JLabel lblNombreProteinas = new JLabel("Proteinas");
		lblNombreProteinas.setForeground(Color.BLACK);
		lblNombreProteinas.setBounds(586, 154, 60, 17);
		frame.getContentPane().add(lblNombreProteinas);
		
		JLabel lblNombreSal = new JLabel("Sal");
		lblNombreSal.setBounds(690, 154, 60, 17);
		frame.getContentPane().add(lblNombreSal);
		
		JLabel lblNombreCalorias = new JLabel("Calorias");
		lblNombreCalorias.setBounds(764, 154, 60, 17);
		frame.getContentPane().add(lblNombreCalorias);
		
		JLabel lblNombreCantidad = new JLabel("Cantidad");
		lblNombreCantidad.setBounds(836, 154, 60, 17);
		frame.getContentPane().add(lblNombreCantidad);
		

		JLabel lblNombrePrimerAlimento = new JLabel(arrayAlimentos.get(0).getNombre());
		lblNombrePrimerAlimento.setName(arrayAlimentos.get(0).getNombre());
		lblNombrePrimerAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNombrePrimerAlimento.setBounds(185, 192, 60, 17);
		frame.getContentPane().add(lblNombrePrimerAlimento);
		
		JLabel lblNombreSegundoAlimento = new JLabel(arrayAlimentos.get(1).getNombre());
		lblNombreSegundoAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNombreSegundoAlimento.setBounds(185, 221, 60, 17);
		frame.getContentPane().add(lblNombreSegundoAlimento);
		
		JLabel lblNombreTercerAlimento = new JLabel(arrayAlimentos.get(2).getNombre());
		lblNombreTercerAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNombreTercerAlimento.setBounds(185, 250, 60, 17);
		frame.getContentPane().add(lblNombreTercerAlimento);
		
		JLabel lblNombreCuartoAlimento = new JLabel(arrayAlimentos.get(3).getNombre());
		lblNombreCuartoAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNombreCuartoAlimento.setBounds(185, 279, 60, 17);
		frame.getContentPane().add(lblNombreCuartoAlimento);
		
		JLabel lblNombrQuintoAlimento = new JLabel(arrayAlimentos.get(4).getNombre());
		lblNombrQuintoAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNombrQuintoAlimento.setBounds(185, 308, 60, 17);
		frame.getContentPane().add(lblNombrQuintoAlimento);

		textFieldCantidad1 = new JTextField();
		textFieldCantidad1.setEditable(false);
		textFieldCantidad1.setBounds(836, 190, 50, 21);
		frame.getContentPane().add(textFieldCantidad1);
		textFieldCantidad1.setColumns(10);
		
		textFieldCantidad2 = new JTextField();
		textFieldCantidad2.setEditable(false);
		textFieldCantidad2.setColumns(10);
		textFieldCantidad2.setBounds(836, 219, 50, 21);
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
		checkboxPrimerAlimento.setBounds(158, 192, 21, 17);
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
		checkboxSegundoAlimento.setBounds(158, 221, 21, 17);
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
		checkboxTercerAlimento.setBounds(158, 250, 21, 17);
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
		checkboxCuartoAlimento.setBounds(158, 279, 21, 17);
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
		checkboxQuintoAlimento.setBounds(158, 308, 21, 17);
		frame.getContentPane().add(checkboxQuintoAlimento);
		
		JLabel lblGrasasPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getGrasas()));
		lblGrasasPrimerAlimento.setBounds(281, 192, 60, 17);
		frame.getContentPane().add(lblGrasasPrimerAlimento);
		
		JLabel lblSaturadasPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getGrasasSaturadas()));
		lblSaturadasPrimerAlimento.setBounds(366, 192, 60, 17);
		frame.getContentPane().add(lblSaturadasPrimerAlimento);
		
		JLabel lblHidratosPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getHidratos()));
		lblHidratosPrimerAlimento.setBounds(452, 192, 31, 17);
		frame.getContentPane().add(lblHidratosPrimerAlimento);
		
		JLabel lblAzucarPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getAzucar()));
		lblAzucarPrimerAlimento.setBounds(524, 192, 31, 17);
		frame.getContentPane().add(lblAzucarPrimerAlimento);
		
		JLabel lblProteinasPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getProteinas()));
		lblProteinasPrimerAlimento.setBounds(596, 192, 50, 17);
		frame.getContentPane().add(lblProteinasPrimerAlimento);
		
		JLabel lblSalPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getSal()));
		lblSalPrimerAlimento.setBounds(690, 192, 31, 17);
		frame.getContentPane().add(lblSalPrimerAlimento);
		
		JLabel lblCaloriasPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getCalorias()));
		lblCaloriasPrimerAlimento.setBounds(774, 192, 31, 17);
		frame.getContentPane().add(lblCaloriasPrimerAlimento);
		
		
		JLabel lblGrasasSegundoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(1).getGrasas()));
		lblGrasasSegundoAlimento.setBounds(281, 221, 60, 17);
		frame.getContentPane().add(lblGrasasSegundoAlimento);
		
		JLabel lblSaturadasSegundoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(1).getGrasasSaturadas()));
		lblSaturadasSegundoAlimento.setBounds(366, 221, 60, 17);
		frame.getContentPane().add(lblSaturadasSegundoAlimento);
		
		JLabel lblHidratosSegundoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(1).getHidratos()));
		lblHidratosSegundoAlimento.setBounds(452, 221, 31, 17);
		frame.getContentPane().add(lblHidratosSegundoAlimento);
		
		JLabel lblAzucarSegundoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(1).getAzucar()));
		lblAzucarSegundoAlimento.setBounds(524, 221, 31, 17);
		frame.getContentPane().add(lblAzucarSegundoAlimento);
		
		JLabel lblProteinasSegundoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(1).getProteinas()));
		lblProteinasSegundoAlimento.setBounds(596, 221, 50, 17);
		frame.getContentPane().add(lblProteinasSegundoAlimento);
		
		JLabel lblSalSegundoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(1).getSal()));
		lblSalSegundoAlimento.setBounds(690, 221, 31, 17);
		frame.getContentPane().add(lblSalSegundoAlimento);
		
		JLabel lblCaloriasSegundoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(1).getCalorias()));
		lblCaloriasSegundoAlimento.setBounds(774, 221, 31, 17);
		frame.getContentPane().add(lblCaloriasSegundoAlimento);
		
		JLabel lblGrasasTercerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(2).getGrasas()));
		lblGrasasTercerAlimento.setBounds(281, 250, 60, 17);
		frame.getContentPane().add(lblGrasasTercerAlimento);
		
		JLabel lblSaturadasTercerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(2).getGrasasSaturadas()));
		lblSaturadasTercerAlimento.setBounds(366, 250, 60, 17);
		frame.getContentPane().add(lblSaturadasTercerAlimento);
		
		JLabel lblHidratosTercerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(2).getHidratos()));
		lblHidratosTercerAlimento.setBounds(452, 250, 31, 17);
		frame.getContentPane().add(lblHidratosTercerAlimento);
		
		JLabel lblAzucarTercerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(2).getAzucar()));
		lblAzucarTercerAlimento.setBounds(524, 250, 31, 17);
		frame.getContentPane().add(lblAzucarTercerAlimento);
		
		JLabel lblProteinasTercerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(2).getProteinas()));
		lblProteinasTercerAlimento.setBounds(596, 250, 50, 17);
		frame.getContentPane().add(lblProteinasTercerAlimento);
		
		JLabel lblSalTercerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(2).getSal()));
		lblSalTercerAlimento.setBounds(690, 250, 31, 17);
		frame.getContentPane().add(lblSalTercerAlimento);
		
		JLabel lblCaloriasTercerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(2).getCalorias()));
		lblCaloriasTercerAlimento.setBounds(774, 250, 31, 17);
		frame.getContentPane().add(lblCaloriasTercerAlimento);
		
		textFieldCantidad3 = new JTextField();
		textFieldCantidad3.setEditable(false);
		textFieldCantidad3.setColumns(10);
		textFieldCantidad3.setBounds(836, 248, 50, 21);
		frame.getContentPane().add(textFieldCantidad3);
		
		JLabel lblGrasasCuartoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(3).getGrasas()));
		lblGrasasCuartoAlimento.setBounds(281, 279, 60, 17);
		frame.getContentPane().add(lblGrasasCuartoAlimento);
		
		JLabel lblSaturadasCuartoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(3).getGrasasSaturadas()));
		lblSaturadasCuartoAlimento.setBounds(366, 279, 60, 17);
		frame.getContentPane().add(lblSaturadasCuartoAlimento);
		
		JLabel lblHidratosCuartoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(3).getHidratos()));
		lblHidratosCuartoAlimento.setBounds(452, 279, 31, 17);
		frame.getContentPane().add(lblHidratosCuartoAlimento);
		
		JLabel lblAzucarCuartoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(3).getAzucar()));
		lblAzucarCuartoAlimento.setBounds(524, 279, 31, 17);
		frame.getContentPane().add(lblAzucarCuartoAlimento);
		
		JLabel lblProteinasCuartoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(3).getProteinas()));
		lblProteinasCuartoAlimento.setBounds(596, 279, 50, 17);
		frame.getContentPane().add(lblProteinasCuartoAlimento);
		
		JLabel lblSalCuartoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(3).getSal()));
		lblSalCuartoAlimento.setBounds(690, 279, 31, 17);
		frame.getContentPane().add(lblSalCuartoAlimento);
		
		JLabel lblCaloriasCuartoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(3).getCalorias()));
		lblCaloriasCuartoAlimento.setBounds(774, 279, 31, 17);
		frame.getContentPane().add(lblCaloriasCuartoAlimento);
		
		JLabel lblGrasasQuintoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(4).getGrasas()));
		lblGrasasQuintoAlimento.setBounds(281, 308, 60, 17);
		frame.getContentPane().add(lblGrasasQuintoAlimento);
		
		JLabel lblSaturadasQuintoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(4).getGrasasSaturadas()));
		lblSaturadasQuintoAlimento.setBounds(366, 308, 60, 17);
		frame.getContentPane().add(lblSaturadasQuintoAlimento);
		
		JLabel lblHidratosQuintoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(4).getHidratos()));
		lblHidratosQuintoAlimento.setBounds(452, 308, 31, 17);
		frame.getContentPane().add(lblHidratosQuintoAlimento);
		
		JLabel lblAzucarQuintoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(4).getAzucar()));
		lblAzucarQuintoAlimento.setBounds(524, 308, 31, 17);
		frame.getContentPane().add(lblAzucarQuintoAlimento);
		
		JLabel lblProteinasQuintoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(4).getProteinas()));
		lblProteinasQuintoAlimento.setBounds(596, 308, 50, 17);
		frame.getContentPane().add(lblProteinasQuintoAlimento);
		
		JLabel lblSalQuintoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(4).getSal()));
		lblSalQuintoAlimento.setBounds(690, 308, 31, 17);
		frame.getContentPane().add(lblSalQuintoAlimento);
		
		JLabel lblCaloriasQuintoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(4).getCalorias()));
		lblCaloriasQuintoAlimento.setBounds(774, 308, 31, 17);
		frame.getContentPane().add(lblCaloriasQuintoAlimento);
		
		
		textFieldCantidad4 = new JTextField();
		textFieldCantidad4.setEditable(false);
		textFieldCantidad4.setColumns(10);
		textFieldCantidad4.setBounds(836, 277, 50, 21);
		frame.getContentPane().add(textFieldCantidad4);
		
		textFieldCantidad5 = new JTextField();
		textFieldCantidad5.setEditable(false);
		textFieldCantidad5.setColumns(10);
		textFieldCantidad5.setBounds(836, 306, 50, 21);
		frame.getContentPane().add(textFieldCantidad5);
		
		JLabel lblTotalCalorias = new JLabel("Total calorías:");
		lblTotalCalorias.setBounds(185, 462, 82, 17);
		frame.getContentPane().add(lblTotalCalorias);
		
		JLabel lblTotalGrasas = new JLabel("Total grasas:");
		lblTotalGrasas.setBounds(366, 462, 82, 17);
		frame.getContentPane().add(lblTotalGrasas);
		
		JLabel lblTotalAzucar = new JLabel("Total azúcar:");
		lblTotalAzucar.setBounds(564, 460, 82, 17);
		frame.getContentPane().add(lblTotalAzucar);
		
		JLabel lblTotalSal = new JLabel("Total sal:");
		lblTotalSal.setBounds(764, 460, 60, 17);
		frame.getContentPane().add(lblTotalSal);
		
		textFieldTotalCalorias = new JTextField();
		textFieldTotalCalorias.setEditable(false);
		textFieldTotalCalorias.setBounds(271, 460, 72, 21);
		frame.getContentPane().add(textFieldTotalCalorias);
		textFieldTotalCalorias.setColumns(10);
		
		textFieldTotalGrasas = new JTextField();
		textFieldTotalGrasas.setEditable(false);
		textFieldTotalGrasas.setColumns(10);
		textFieldTotalGrasas.setBounds(452, 460, 72, 21);
		frame.getContentPane().add(textFieldTotalGrasas);
		
		textFieldTotalAzucar = new JTextField();
		textFieldTotalAzucar.setEditable(false);
		textFieldTotalAzucar.setColumns(10);
		textFieldTotalAzucar.setBounds(649, 458, 72, 21);
		frame.getContentPane().add(textFieldTotalAzucar);
		
		textFieldTotalSal = new JTextField();
		textFieldTotalSal.setEditable(false);
		textFieldTotalSal.setColumns(10);
		textFieldTotalSal.setBounds(824, 458, 72, 21);
		frame.getContentPane().add(textFieldTotalSal);
		
		
		
		
		
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				double totalgrasas=0,totalazucar=0,totalsal=0,totalcalorias=0,caloriasrecomendadas=0,totalcaloriasrecomendadas=0,totalimc=0;
				
				if (comboBoxSexo.getSelectedItem().equals("Hombre")) {
					caloriasrecomendadas=24*1*Double.valueOf(txtFieldPeso.getText());
				}
				else {
					caloriasrecomendadas=24*0.9*Double.valueOf(txtFieldPeso.getText());
				}
				
				
				if(comboBoxEjercicio.getSelectedItem().equals("Sedentario")) {
					totalcaloriasrecomendadas=caloriasrecomendadas*1.2;
				}
				else if(comboBoxEjercicio.getSelectedItem().equals("Actividad ligera")) {
					totalcaloriasrecomendadas=caloriasrecomendadas*1.375;
				}
				else if(comboBoxEjercicio.getSelectedItem().equals("Actividad moderada")) {
					totalcaloriasrecomendadas=caloriasrecomendadas*1.55;}
				else if(comboBoxEjercicio.getSelectedItem().equals("Actividad intensa")) {
					totalcaloriasrecomendadas=caloriasrecomendadas*1.725;}
				else {
					totalcaloriasrecomendadas=caloriasrecomendadas*1.9;
				}
				
				lblNumerocaloriasrecomendadas.setText(String.valueOf(totalcaloriasrecomendadas));
				
				totalimc=Double.valueOf(txtFieldPeso.getText())/(Double.valueOf(textFieldAltura.getText())*Double.valueOf(textFieldAltura.getText()));
				lblImctotal.setText(String.valueOf(totalimc));
				
				
				
				
			for (int i=0;i<arrayAlimentos.size();i++) {
				totalgrasas=totalgrasas+arrayAlimentos.get(i).getGrasas();
				totalazucar=totalazucar+arrayAlimentos.get(i).getAzucar();
				totalsal=totalsal+arrayAlimentos.get(i).getSal();
				totalcalorias=totalcalorias+arrayAlimentos.get(i).getCalorias();}
			
			textFieldTotalGrasas.setText(String.valueOf(totalgrasas));
			textFieldTotalAzucar.setText(String.valueOf(totalazucar));
			textFieldTotalSal.setText(String.valueOf(totalsal));
			textFieldTotalCalorias.setText(String.valueOf(totalcalorias));
			
				
				if (totalgrasas>=totalcalorias*30/100) {
					
					lblTotalGrasas.setForeground(Color.red);
				}
				
				if (totalazucar>=totalcalorias*10/100) {
					
					lblTotalAzucar.setForeground(Color.red);
				}
				
				if (totalsal>=5) {
					
					lblTotalSal.setForeground(Color.red);
				}
				
				if (totalcaloriasrecomendadas>totalcalorias) {
					lblTotalCalorias.setForeground(Color.red);
				}
				
			}
		});
		btnCalcular.setBounds(485, 519, 105, 27);
		frame.getContentPane().add(btnCalcular);
		
		JLabel lblNombrSextoAlimento = new JLabel("");
		lblNombrSextoAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNombrSextoAlimento.setBounds(185, 337, 60, 17);
		frame.getContentPane().add(lblNombrSextoAlimento);
		
		JLabel lblGrasasSextoAlimento = new JLabel("");
		lblGrasasSextoAlimento.setBounds(281, 337, 60, 17);
		frame.getContentPane().add(lblGrasasSextoAlimento);
		
		JLabel lblSaturadasSextoAlimento = new JLabel("");
		lblSaturadasSextoAlimento.setBounds(366, 337, 60, 17);
		frame.getContentPane().add(lblSaturadasSextoAlimento);
		
		JLabel lblHidratosSextoAlimento = new JLabel("");
		lblHidratosSextoAlimento.setBounds(452, 337, 60, 17);
		frame.getContentPane().add(lblHidratosSextoAlimento);
		
		JLabel lblAzucarSextoAlimento = new JLabel("");
		lblAzucarSextoAlimento.setBounds(524, 337, 60, 17);
		frame.getContentPane().add(lblAzucarSextoAlimento);
		
		JLabel lblProteinasSextoAlimento = new JLabel("");
		lblProteinasSextoAlimento.setBounds(596, 337, 60, 17);
		frame.getContentPane().add(lblProteinasSextoAlimento);
		
		JLabel lblSalSextoAlimento = new JLabel("");
		lblSalSextoAlimento.setBounds(690, 337, 60, 17);
		frame.getContentPane().add(lblSalSextoAlimento);
		
		JLabel lblCaloriasSextoAlimento = new JLabel("");
		lblCaloriasSextoAlimento.setBounds(774, 337, 60, 17);
		frame.getContentPane().add(lblCaloriasSextoAlimento);
			
		JLabel lblNombrSeptimoAlimento = new JLabel("");
		lblNombrSeptimoAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNombrSeptimoAlimento.setBounds(185, 366, 60, 17);
		frame.getContentPane().add(lblNombrSeptimoAlimento);
		
		JLabel lblGrasasSeptimoAlimento = new JLabel("");
		lblGrasasSeptimoAlimento.setBounds(281, 366, 60, 17);
		frame.getContentPane().add(lblGrasasSeptimoAlimento);
		
		JLabel lblSaturadasSeptimoAlimento = new JLabel("");
		lblSaturadasSeptimoAlimento.setBounds(366, 366, 60, 17);
		frame.getContentPane().add(lblSaturadasSeptimoAlimento);
		
		JLabel lblHidratosSeptimoAlimento = new JLabel("");
		lblHidratosSeptimoAlimento.setBounds(452, 366, 60, 17);
		frame.getContentPane().add(lblHidratosSeptimoAlimento);
		
		JLabel lblAzucarSeptimoAlimento = new JLabel("");
		lblAzucarSeptimoAlimento.setBounds(524, 366, 60, 17);
		frame.getContentPane().add(lblAzucarSeptimoAlimento);
		
		JLabel lblProteinasSeptimoAlimento = new JLabel("");
		lblProteinasSeptimoAlimento.setBounds(596, 366, 60, 17);
		frame.getContentPane().add(lblProteinasSeptimoAlimento);
		
		JLabel lblSalSeptimoAlimento = new JLabel("");
		lblSalSeptimoAlimento.setBounds(690, 366, 60, 17);
		frame.getContentPane().add(lblSalSeptimoAlimento);
		
		JLabel lblCaloriasSeptimoAlimento = new JLabel("");
		lblCaloriasSeptimoAlimento.setBounds(774, 366, 60, 17);
		frame.getContentPane().add(lblCaloriasSeptimoAlimento);
		
		JLabel lblNombrOctavoAlimento = new JLabel("");
		lblNombrOctavoAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNombrOctavoAlimento.setBounds(185, 395, 60, 17);
		frame.getContentPane().add(lblNombrOctavoAlimento);
		
		JLabel lblGrasasOctavoAlimento = new JLabel("");
		lblGrasasOctavoAlimento.setBounds(281, 395, 60, 17);
		frame.getContentPane().add(lblGrasasOctavoAlimento);
		
		JLabel lblSaturadasOctavoAlimento = new JLabel("");
		lblSaturadasOctavoAlimento.setBounds(366, 395, 60, 17);
		frame.getContentPane().add(lblSaturadasOctavoAlimento);
		
		JLabel lblHidratosOctavoAlimento = new JLabel("");
		lblHidratosOctavoAlimento.setBounds(452, 395, 60, 17);
		frame.getContentPane().add(lblHidratosOctavoAlimento);
		
		JLabel lblAzucarOctavoAlimento = new JLabel("");
		lblAzucarOctavoAlimento.setBounds(524, 395, 60, 17);
		frame.getContentPane().add(lblAzucarOctavoAlimento);
		
		JLabel lblProteinasOctavoAlimento = new JLabel("");
		lblProteinasOctavoAlimento.setBounds(596, 395, 60, 17);
		frame.getContentPane().add(lblProteinasOctavoAlimento);
		
		JLabel lblSalOctavoAlimento = new JLabel("");
		lblSalOctavoAlimento.setBounds(690, 395, 60, 17);
		frame.getContentPane().add(lblSalOctavoAlimento);
		
		JLabel lblCaloriasOctavoAlimento = new JLabel("");
		lblCaloriasOctavoAlimento.setBounds(774, 395, 60, 17);
		frame.getContentPane().add(lblCaloriasOctavoAlimento);
		
		JLabel lblTextoAñadirAlimentos = new JLabel("Añade más alimentos si es necesario:");
		lblTextoAñadirAlimentos.setBounds(69, 623, 262, 17);
		frame.getContentPane().add(lblTextoAñadirAlimentos);
		
		JLabel lblNombreAñadir = new JLabel("Nombre");
		lblNombreAñadir.setBounds(185, 666, 60, 17);
		frame.getContentPane().add(lblNombreAñadir);
		
		JLabel lblGrasasAñadir = new JLabel("Grasas");
		lblGrasasAñadir.setBounds(271, 667, 60, 17);
		frame.getContentPane().add(lblGrasasAñadir);
		
		JLabel lblSaturadasAñadir = new JLabel("Saturadas");
		lblSaturadasAñadir.setBounds(343, 666, 60, 17);
		frame.getContentPane().add(lblSaturadasAñadir);
		
		JLabel lblHidratosAñadir = new JLabel("Hidratos");
		lblHidratosAñadir.setBounds(430, 666, 60, 17);
		frame.getContentPane().add(lblHidratosAñadir);
		
		JLabel lblAzucarAñadir = new JLabel("Azucar");
		lblAzucarAñadir.setBounds(514, 666, 60, 17);
		frame.getContentPane().add(lblAzucarAñadir);
		
		JLabel lblProteinasAñadir = new JLabel("Proteinas");
		lblProteinasAñadir.setForeground(Color.BLACK);
		lblProteinasAñadir.setBounds(586, 666, 60, 17);
		frame.getContentPane().add(lblProteinasAñadir);
		
		JLabel lblSalAñadir = new JLabel("Sal");
		lblSalAñadir.setBounds(690, 666, 60, 17);
		frame.getContentPane().add(lblSalAñadir);
		
		JLabel lblCaloriasAñadir = new JLabel("Calorias");
		lblCaloriasAñadir.setBounds(774, 666, 60, 17);
		frame.getContentPane().add(lblCaloriasAñadir);
	
		
		textFieldNombreAñadir = new JTextField();
		textFieldNombreAñadir.setBounds(185, 704, 60, 21);
		frame.getContentPane().add(textFieldNombreAñadir);
		textFieldNombreAñadir.setColumns(10);
		
		textFieldGrasasAñadir = new JTextField();
		textFieldGrasasAñadir.setBounds(271, 704, 50, 21);
		frame.getContentPane().add(textFieldGrasasAñadir);
		textFieldGrasasAñadir.setColumns(10);
		
		textFieldGrasasSaturadasAñadir = new JTextField();
		textFieldGrasasSaturadasAñadir.setBounds(343, 704, 60, 21);
		frame.getContentPane().add(textFieldGrasasSaturadasAñadir);
		textFieldGrasasSaturadasAñadir.setColumns(10);
		
		textFieldHidratosAñadir = new JTextField();
		textFieldHidratosAñadir.setBounds(430, 704, 60, 21);
		frame.getContentPane().add(textFieldHidratosAñadir);
		textFieldHidratosAñadir.setColumns(10);
		
		textFieldAzucarAñadir = new JTextField();
		textFieldAzucarAñadir.setBounds(514, 704, 41, 21);
		frame.getContentPane().add(textFieldAzucarAñadir);
		textFieldAzucarAñadir.setColumns(10);
		
		textFieldProteinasAñadir = new JTextField();
		textFieldProteinasAñadir.setBounds(586, 704, 50, 21);
		frame.getContentPane().add(textFieldProteinasAñadir);
		textFieldProteinasAñadir.setColumns(10);
		
		textFieldSalAñadir = new JTextField();
		textFieldSalAñadir.setBounds(690, 704, 50, 21);
		frame.getContentPane().add(textFieldSalAñadir);
		textFieldSalAñadir.setColumns(10);
		
		textFieldCaloriasAñadir = new JTextField();
		textFieldCaloriasAñadir.setBounds(774, 704, 50, 21);
		frame.getContentPane().add(textFieldCaloriasAñadir);
		textFieldCaloriasAñadir.setColumns(10);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldNombreAñadir.setText("");
				textFieldGrasasAñadir.setText("");
				textFieldGrasasSaturadasAñadir.setText("");
				textFieldHidratosAñadir.setText("");
				textFieldAzucarAñadir.setText("");
				textFieldProteinasAñadir.setText("");
				textFieldSalAñadir.setText("");
				textFieldCaloriasAñadir.setText("");
			}
		});
		btnReset.setBounds(845, 701, 105, 27);
		frame.getContentPane().add(btnReset);
		
		JButton btnAnadir = new JButton("Añadir");
		btnAnadir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (arrayAlimentos.size()<8) {
					arrayAlimentos.add(new Alimentos(textFieldNombreAñadir.getText(),Double.valueOf(textFieldGrasasAñadir.getText()),Double.valueOf(textFieldGrasasSaturadasAñadir.getText()),Double.valueOf(textFieldHidratosAñadir.getText()),Double.valueOf(textFieldAzucarAñadir.getText()),Double.valueOf(textFieldProteinasAñadir.getText()),Double.valueOf(textFieldSalAñadir.getText()),Integer.valueOf(textFieldCaloriasAñadir.getText()),100));
				}
				
					
				if (lblNombrSextoAlimento.getText().equals("")) {
				lblNombrSextoAlimento.setText((String.valueOf(arrayAlimentos.get(5).getNombre())));
				lblGrasasSextoAlimento.setText((String.valueOf(arrayAlimentos.get(5).getGrasas())));
				lblSaturadasSextoAlimento.setText((String.valueOf(arrayAlimentos.get(5).getGrasasSaturadas())));
				lblHidratosSextoAlimento.setText((String.valueOf(arrayAlimentos.get(5).getHidratos())));
				lblAzucarSextoAlimento.setText((String.valueOf(arrayAlimentos.get(5).getAzucar())));
				lblProteinasSextoAlimento.setText((String.valueOf(arrayAlimentos.get(5).getProteinas())));
				lblSalSextoAlimento.setText((String.valueOf(arrayAlimentos.get(5).getSal())));
				lblCaloriasSextoAlimento.setText((String.valueOf(arrayAlimentos.get(5).getCalorias())));
				}
				
				else if (lblNombrSextoAlimento.getText().equals((String.valueOf(arrayAlimentos.get(5).getNombre())))&& lblNombrSeptimoAlimento.getText().equals("")) {
					lblNombrSeptimoAlimento.setText((String.valueOf(arrayAlimentos.get(6).getNombre())));
					lblGrasasSeptimoAlimento.setText((String.valueOf(arrayAlimentos.get(6).getGrasas())));
					lblSaturadasSeptimoAlimento.setText((String.valueOf(arrayAlimentos.get(6).getGrasasSaturadas())));
					lblHidratosSeptimoAlimento.setText((String.valueOf(arrayAlimentos.get(6).getHidratos())));
					lblAzucarSeptimoAlimento.setText((String.valueOf(arrayAlimentos.get(6).getAzucar())));
					lblProteinasSeptimoAlimento.setText((String.valueOf(arrayAlimentos.get(6).getProteinas())));
					lblSalSeptimoAlimento.setText((String.valueOf(arrayAlimentos.get(6).getSal())));
					lblCaloriasSeptimoAlimento.setText((String.valueOf(arrayAlimentos.get(6).getCalorias())));
					
				}
				else {
					lblNombrOctavoAlimento.setText((String.valueOf(arrayAlimentos.get(7).getNombre())));
					lblGrasasOctavoAlimento.setText((String.valueOf(arrayAlimentos.get(7).getGrasas())));
					lblSaturadasOctavoAlimento.setText((String.valueOf(arrayAlimentos.get(7).getGrasasSaturadas())));
					lblHidratosOctavoAlimento.setText((String.valueOf(arrayAlimentos.get(7).getHidratos())));
					lblAzucarOctavoAlimento.setText((String.valueOf(arrayAlimentos.get(7).getAzucar())));
					lblProteinasOctavoAlimento.setText((String.valueOf(arrayAlimentos.get(7).getProteinas())));
					lblSalOctavoAlimento.setText((String.valueOf(arrayAlimentos.get(7).getSal())));
					lblCaloriasOctavoAlimento.setText((String.valueOf(arrayAlimentos.get(7).getCalorias())));
					
					
				}
				
			}
		});
		btnAnadir.setBounds(485, 771, 105, 27);
		frame.getContentPane().add(btnAnadir);
		
						
	}
}
