package entornos;

/**
 * Este programa simula una calculadora de "macros" alimenticios y te permite controlar tu dieta
 * @author Alejandro Donet Montesinos
 *  */
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
import java.text.DecimalFormat;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

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
	private JTextField textFieldNombreAÒadir;
	private JTextField textFieldGrasasAÒadir;
	private JTextField textFieldGrasasSaturadasAÒadir;
	private JTextField textFieldHidratosAÒadir;
	private JTextField textFieldAzucarAÒadir;
	private JTextField textFieldProteinasAÒadir;
	private JTextField textFieldSalAÒadir;
	private JTextField textFieldCaloriasAÒadir;
	private JTextField textFieldEdad;
	private JTextField txtFieldPeso;
	private JTextField textFieldAltura;
	private JTextField textFieldCantidadAÒadir;

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
		frame.getContentPane().setForeground(Color.RED);
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 997, 843);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/**
		 * Se inicializa el Array y le aÒadimos los objetos con sus respectivos datos
		 */
		
		ArrayList<Alimento> arrayAlimentos=new ArrayList<Alimento>();
		arrayAlimentos.add(new Alimento("Pollo",1.2,0.4,0.6,0.6,23.4,1.8,120,100));
		arrayAlimentos.add(new Alimento("Arroz",0.9,0.2,77.07,0.1,8.51,0.36,360,100));
		arrayAlimentos.add(new Alimento("Nueces",65.21,6.1,13.71,2.6,15.23,0,654,100));
		arrayAlimentos.add(new Alimento("Pl√°tano",0.33,0.112,22.84,12.33,1.09,0,89,100));
		arrayAlimentos.add(new Alimento("Huevo",6.76,1.88,0.43,0.38,6.24,0.6,89,100));
	
		
		JLabel lblPeso = new JLabel("Peso(kg)");
		lblPeso.setForeground(Color.BLACK);
		
		txtFieldPeso = new JTextField();
		txtFieldPeso.setForeground(Color.BLACK);
		txtFieldPeso.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setForeground(Color.BLACK);
		
		JComboBox comboBoxSexo = new JComboBox();
		comboBoxSexo.setForeground(Color.BLACK);
		comboBoxSexo.addItem("Hombre");
		comboBoxSexo.addItem("Mujer");
				
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setForeground(Color.BLACK);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setForeground(Color.BLACK);
		textFieldAltura.setColumns(10);
		
		textFieldEdad = new JTextField();
		textFieldEdad.setForeground(Color.BLACK);
		textFieldEdad.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura(m)");
		lblAltura.setForeground(Color.BLACK);
		
		
		JLabel lblImc = new JLabel("IMC");
		lblImc.setForeground(Color.BLACK);
		
		JLabel lblImctotal = new JLabel("");
		
		JLabel lblEjercicio = new JLabel("Ejercicio");
		lblEjercicio.setForeground(Color.BLACK);
		
		JComboBox comboBoxEjercicio = new JComboBox();
		comboBoxEjercicio.setForeground(Color.BLACK);
		comboBoxEjercicio.addItem("Sedentario");
		comboBoxEjercicio.addItem("Actividad ligera");
		comboBoxEjercicio.addItem("Actividad moderada");
		comboBoxEjercicio.addItem("Actividad intensa");
		comboBoxEjercicio.addItem("Actividad muy intensa");
				
		
		JLabel lblCalorasRecomendadas = new JLabel("Calor√≠as recomendadas");
		lblCalorasRecomendadas.setForeground(Color.BLACK);
		
		JLabel lblNumerocaloriasrecomendadas = new JLabel("");

		
		JLabel lblNombreNombre = new JLabel("Nombre");
		
		JLabel lblNombreGrasas = new JLabel("Grasas (g)");
		
		JLabel lblNombreSaturadas = new JLabel("Saturadas(g)");
		lblNombreSaturadas.setBackground(Color.CYAN);
		
		JLabel lblNombreHidratos = new JLabel("Hidratos(g)");
		
		JLabel lblNombreAzucar = new JLabel("Azucar(g)");
		
		JLabel lblNombreProteinas = new JLabel("Proteinas(g)");
		lblNombreProteinas.setForeground(Color.BLACK);
		
		JLabel lblNombreSal = new JLabel("Sal(g)");
		
		JLabel lblNombreCalorias = new JLabel("Calorias(g)");
		
		JLabel lblNombreCantidad = new JLabel("Cantidad(g)");
		

		JLabel lblNombrePrimerAlimento = new JLabel(arrayAlimentos.get(0).getNombre());
		lblNombrePrimerAlimento.setName(arrayAlimentos.get(0).getNombre());
		lblNombrePrimerAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		
		JLabel lblNombreSegundoAlimento = new JLabel(arrayAlimentos.get(1).getNombre());
		lblNombreSegundoAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		
		JLabel lblNombreTercerAlimento = new JLabel(arrayAlimentos.get(2).getNombre());
		lblNombreTercerAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		
		JLabel lblNombreCuartoAlimento = new JLabel(arrayAlimentos.get(3).getNombre());
		lblNombreCuartoAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		
		JLabel lblNombrQuintoAlimento = new JLabel(arrayAlimentos.get(4).getNombre());
		lblNombrQuintoAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));

		textFieldCantidad1 = new JTextField();
		textFieldCantidad1.setEditable(false);
		textFieldCantidad1.setColumns(10);
		
		textFieldCantidad2 = new JTextField();
		textFieldCantidad2.setEditable(false);
		textFieldCantidad2.setColumns(10);
		
		
		textFieldCantidad3 = new JTextField();
		textFieldCantidad3.setEditable(false);
		textFieldCantidad3.setColumns(10);
		
		textFieldCantidad4 = new JTextField();
		textFieldCantidad4.setEditable(false);
		textFieldCantidad4.setColumns(10);
		
		textFieldCantidad5 = new JTextField();
		textFieldCantidad5.setEditable(false);
		textFieldCantidad5.setColumns(10);
		
		/**
		 * Se comprueban todos los checkbox para ver si est√°n seleccionados. En caso de ser as√≠, se permite editar su contenido
		 */

		JCheckBox checkboxPrimerAlimento = new JCheckBox("");
		checkboxPrimerAlimento.setBackground(Color.PINK);
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
		
		
		
		JCheckBox checkboxSegundoAlimento = new JCheckBox("");
		checkboxSegundoAlimento.setBackground(Color.PINK);
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
		
		JCheckBox checkboxTercerAlimento = new JCheckBox("");
		checkboxTercerAlimento.setBackground(Color.PINK);
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
		
		JCheckBox checkboxCuartoAlimento = new JCheckBox("");
		checkboxCuartoAlimento.setBackground(Color.PINK);
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
		
		JCheckBox checkboxQuintoAlimento = new JCheckBox("");
		checkboxQuintoAlimento.setBackground(Color.PINK);
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
		/**
		 * Se utilizan los m√©todos "getters" de la clase Alimento para recibir los datos de cada elemento y ponerlo en su respectivo "label"
		 */
		JLabel lblGrasasPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getGrasas()));
		
		JLabel lblSaturadasPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getGrasasSaturadas()));
		
		JLabel lblHidratosPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getHidratos()));
		
		JLabel lblAzucarPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getAzucar()));
		
		JLabel lblProteinasPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getProteinas()));
		
		JLabel lblSalPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getSal()));
		
		JLabel lblCaloriasPrimerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(0).getCalorias()));
		
		
		JLabel lblGrasasSegundoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(1).getGrasas()));
		
		JLabel lblSaturadasSegundoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(1).getGrasasSaturadas()));
		
		JLabel lblHidratosSegundoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(1).getHidratos()));
		
		JLabel lblAzucarSegundoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(1).getAzucar()));
		
		JLabel lblProteinasSegundoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(1).getProteinas()));
		
		JLabel lblSalSegundoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(1).getSal()));
		
		JLabel lblCaloriasSegundoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(1).getCalorias()));
		
		
		JLabel lblGrasasTercerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(2).getGrasas()));
		
		JLabel lblSaturadasTercerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(2).getGrasasSaturadas()));
		
		JLabel lblHidratosTercerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(2).getHidratos()));
		
		JLabel lblAzucarTercerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(2).getAzucar()));
		
		JLabel lblProteinasTercerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(2).getProteinas()));
		
		JLabel lblSalTercerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(2).getSal()));
		
		JLabel lblCaloriasTercerAlimento = new JLabel(String.valueOf(arrayAlimentos.get(2).getCalorias()));
		
		
		JLabel lblGrasasCuartoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(3).getGrasas()));
		
		JLabel lblSaturadasCuartoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(3).getGrasasSaturadas()));
		
		JLabel lblHidratosCuartoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(3).getHidratos()));
		
		JLabel lblAzucarCuartoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(3).getAzucar()));
		
		JLabel lblProteinasCuartoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(3).getProteinas()));
		
		JLabel lblSalCuartoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(3).getSal()));
		
		JLabel lblCaloriasCuartoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(3).getCalorias()));
		
		
		
		JLabel lblGrasasQuintoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(4).getGrasas()));
		
		JLabel lblSaturadasQuintoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(4).getGrasasSaturadas()));
		
		JLabel lblHidratosQuintoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(4).getHidratos()));
		
		JLabel lblAzucarQuintoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(4).getAzucar()));
		
		JLabel lblProteinasQuintoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(4).getProteinas()));
		
		JLabel lblSalQuintoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(4).getSal()));
		
		JLabel lblCaloriasQuintoAlimento = new JLabel(String.valueOf(arrayAlimentos.get(4).getCalorias()));
		
		
		JLabel lblTotalCalorias = new JLabel("Total calor√≠as:");
		lblTotalCalorias.setBackground(Color.CYAN);
		
		JLabel lblTotalGrasas = new JLabel("Total grasas:");
		
		JLabel lblTotalAzucar = new JLabel("Total az√∫car:");
		
		JLabel lblTotalSal = new JLabel("Total sal:");
		
		JLabel lblCantidadaadir = new JLabel("");
		
		JLabel lblCantidadaadir2 = new JLabel("");
		
		JLabel lblCantidadaadir3 = new JLabel("");
		
		textFieldTotalCalorias = new JTextField();
		textFieldTotalCalorias.setEditable(false);
		textFieldTotalCalorias.setColumns(10);
		
		textFieldTotalGrasas = new JTextField();
		textFieldTotalGrasas.setEditable(false);
		textFieldTotalGrasas.setColumns(10);
		
		textFieldTotalAzucar = new JTextField();
		textFieldTotalAzucar.setEditable(false);
		textFieldTotalAzucar.setColumns(10);
		
		textFieldTotalSal = new JTextField();
		textFieldTotalSal.setEditable(false);
		textFieldTotalSal.setColumns(10);
		
		
		/**
		 * Este bot√≥n nos permite calcular el IMC, las calor√≠as recomendadas y el total de calor√≠as,grasas,az√∫car y sal de nuestra dieta
		 */
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addMouseListener(new MouseAdapter() {
			
			/**
			 * Este m√©todo calcula el IMC
			 * @author Alejandro Donet Montesinos
			 * @return El imc calculado
			 */
			public double calcularimc() {
				double imc=Double.valueOf(txtFieldPeso.getText())/(Double.valueOf(textFieldAltura.getText())*Double.valueOf(textFieldAltura.getText()));
				return imc;	
			}

			DecimalFormat formato1 = new DecimalFormat("#.00");
			
			
			
			@Override
		
			public void mouseClicked(MouseEvent e) {
				
				
			
				double totalgrasas=0,totalazucar=0,totalsal=0,totalcalorias=0,caloriasrecomendadas=0,totalcaloriasrecomendadas=0,totalimc=0;
				
				
				if (comboBoxSexo.getSelectedItem().equals("Hombre")) {
					caloriasrecomendadas=24*1*Double.valueOf(txtFieldPeso.getText());
				}
				else {
					caloriasrecomendadas=24*0.9*Double.valueOf(txtFieldPeso.getText());
				}
				
				switch(String.valueOf(comboBoxEjercicio.getSelectedItem())) {
					case "Sedentario":
						totalcaloriasrecomendadas=caloriasrecomendadas*1.2;
						break;
					case "Actividad ligera":
						totalcaloriasrecomendadas=caloriasrecomendadas*1.375;
						break;
					case "Actividad moderada":
						totalcaloriasrecomendadas=caloriasrecomendadas*1.55;
						break;
					case "Actividad intensa":
						totalcaloriasrecomendadas=caloriasrecomendadas*1.725;
						break;
					case "Actividad muy intensa":
						totalcaloriasrecomendadas=caloriasrecomendadas*1.9;
						break;
									
				}
				
				
				
				lblNumerocaloriasrecomendadas.setText(String.valueOf(formato1.format(totalcaloriasrecomendadas)));
				totalimc=this.calcularimc();
				lblImctotal.setText(String.valueOf(formato1.format(totalimc)));
				
				
				
				
			for (int i=0;i<arrayAlimentos.size();i++) {
				switch (i) {
					case 0:
						if (checkboxPrimerAlimento.isSelected()) {
							double cantidadPorcentaje1=Double.valueOf(textFieldCantidad1.getText())/100;
							totalgrasas=totalgrasas+arrayAlimentos.get(i).getGrasas()*cantidadPorcentaje1;
							totalazucar=totalazucar+arrayAlimentos.get(i).getAzucar()*cantidadPorcentaje1;
							totalsal=totalsal+arrayAlimentos.get(i).getSal()*cantidadPorcentaje1;
							totalcalorias=totalcalorias+arrayAlimentos.get(i).getCalorias()*cantidadPorcentaje1;
							break;
						}
						else {
							break;
						}
					case 1:
						if (checkboxSegundoAlimento.isSelected()) {
						double cantidadPorcentaje2=Double.valueOf(textFieldCantidad2.getText())/100;
						totalgrasas=totalgrasas+arrayAlimentos.get(i).getGrasas()*cantidadPorcentaje2;
						totalazucar=totalazucar+arrayAlimentos.get(i).getAzucar()*cantidadPorcentaje2;
						totalsal=totalsal+arrayAlimentos.get(i).getSal()*cantidadPorcentaje2;
						totalcalorias=totalcalorias+arrayAlimentos.get(i).getCalorias()*cantidadPorcentaje2;
						break;
						}
						else {
							break;
						}
					case 2:
						if (checkboxTercerAlimento.isSelected()) {
						double cantidadPorcentaje3=Double.valueOf(textFieldCantidad3.getText())/100;
						totalgrasas=totalgrasas+arrayAlimentos.get(i).getGrasas()*cantidadPorcentaje3;
						totalazucar=totalazucar+arrayAlimentos.get(i).getAzucar()*cantidadPorcentaje3;
						totalsal=totalsal+arrayAlimentos.get(i).getSal()*cantidadPorcentaje3;
						totalcalorias=totalcalorias+arrayAlimentos.get(i).getCalorias()*cantidadPorcentaje3;
						break;}
						else {
							break;
						}
					case 3:
						if (checkboxCuartoAlimento.isSelected()) {
						double cantidadPorcentaje4=Double.valueOf(textFieldCantidad4.getText())/100;
						totalgrasas=totalgrasas+arrayAlimentos.get(i).getGrasas()*cantidadPorcentaje4;
						totalazucar=totalazucar+arrayAlimentos.get(i).getAzucar()*cantidadPorcentaje4;
						totalsal=totalsal+arrayAlimentos.get(i).getSal()*cantidadPorcentaje4;
						totalcalorias=totalcalorias+arrayAlimentos.get(i).getCalorias()*cantidadPorcentaje4;
						break;}
						else {
							break;
						}
					case 4:
						if (checkboxQuintoAlimento.isSelected()) {
						double cantidadPorcentaje5=Double.valueOf(textFieldCantidad5.getText())/100;
						totalgrasas=totalgrasas+arrayAlimentos.get(i).getGrasas()*cantidadPorcentaje5;
						totalazucar=totalazucar+arrayAlimentos.get(i).getAzucar()*cantidadPorcentaje5;
						totalsal=totalsal+arrayAlimentos.get(i).getSal()*cantidadPorcentaje5;
						totalcalorias=totalcalorias+arrayAlimentos.get(i).getCalorias()*cantidadPorcentaje5;
						break;}
						else {
							break;
						}
						
					case 5:
						double cantidadPorcentaje6=Double.valueOf(lblCantidadaadir.getText())/100;
						totalgrasas=totalgrasas+arrayAlimentos.get(i).getGrasas()*cantidadPorcentaje6;
						totalazucar=totalazucar+arrayAlimentos.get(i).getAzucar()*cantidadPorcentaje6;
						totalsal=totalsal+arrayAlimentos.get(i).getSal()*cantidadPorcentaje6;
						totalcalorias=totalcalorias+arrayAlimentos.get(i).getCalorias()*cantidadPorcentaje6;
						break;
					case 6:
						double cantidadPorcentaje7=Double.valueOf(lblCantidadaadir2.getText())/100;
						totalgrasas=totalgrasas+arrayAlimentos.get(i).getGrasas()*cantidadPorcentaje7;
						totalazucar=totalazucar+arrayAlimentos.get(i).getAzucar()*cantidadPorcentaje7;
						totalsal=totalsal+arrayAlimentos.get(i).getSal()*cantidadPorcentaje7;
						totalcalorias=totalcalorias+arrayAlimentos.get(i).getCalorias()*cantidadPorcentaje7;
						break;
					case 7:
						double cantidadPorcentaje8=Double.valueOf(lblCantidadaadir.getText())/100;
						totalgrasas=totalgrasas+arrayAlimentos.get(i).getGrasas()*cantidadPorcentaje8;
						totalazucar=totalazucar+arrayAlimentos.get(i).getAzucar()*cantidadPorcentaje8;
						totalsal=totalsal+arrayAlimentos.get(i).getSal()*cantidadPorcentaje8;
						totalcalorias=totalcalorias+arrayAlimentos.get(i).getCalorias()*cantidadPorcentaje8;
						break;
						}
				
						
				}
				
			textFieldTotalGrasas.setText(String.valueOf(formato1.format(totalgrasas)));
			textFieldTotalAzucar.setText(String.valueOf(formato1.format(totalazucar)));
			textFieldTotalSal.setText(String.valueOf(formato1.format(totalsal)));
			textFieldTotalCalorias.setText(String.valueOf(formato1.format(totalcalorias)));
			
				
				if (totalgrasas>=totalcalorias*30/100) {
					
					lblTotalGrasas.setForeground(Color.red);
				}
				else {
					lblTotalGrasas.setForeground(Color.black);
				}
				
				if (totalazucar>=totalcalorias*10/100) {
					
					lblTotalAzucar.setForeground(Color.red);
				}
				else {
					lblTotalAzucar.setForeground(Color.black);
				}
				
				if (totalsal>=5) {
					
					lblTotalSal.setForeground(Color.red);
				}
				else {
					lblTotalSal.setForeground(Color.black);
				}
				
				if (totalcaloriasrecomendadas>totalcalorias) {
					lblTotalCalorias.setForeground(Color.red);
				}
				else {
					lblTotalCalorias.setForeground(Color.black);
				}
				
			}
		});
		
		JLabel lblNombrSextoAlimento = new JLabel("");
		lblNombrSextoAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		
		JLabel lblGrasasSextoAlimento = new JLabel("");
		
		JLabel lblSaturadasSextoAlimento = new JLabel("");
		
		JLabel lblHidratosSextoAlimento = new JLabel("");
		
		JLabel lblAzucarSextoAlimento = new JLabel("");
		
		JLabel lblProteinasSextoAlimento = new JLabel("");
		
		JLabel lblSalSextoAlimento = new JLabel("");
		
		JLabel lblCaloriasSextoAlimento = new JLabel("");
			
		JLabel lblNombrSeptimoAlimento = new JLabel("");
		lblNombrSeptimoAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		
		JLabel lblGrasasSeptimoAlimento = new JLabel("");
		
		JLabel lblSaturadasSeptimoAlimento = new JLabel("");
		
		JLabel lblHidratosSeptimoAlimento = new JLabel("");
		
		JLabel lblAzucarSeptimoAlimento = new JLabel("");
		
		JLabel lblProteinasSeptimoAlimento = new JLabel("");
		
		JLabel lblSalSeptimoAlimento = new JLabel("");
		
		JLabel lblCaloriasSeptimoAlimento = new JLabel("");
		
		JLabel lblNombrOctavoAlimento = new JLabel("");
		lblNombrOctavoAlimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		
		JLabel lblGrasasOctavoAlimento = new JLabel("");
		
		JLabel lblSaturadasOctavoAlimento = new JLabel("");
		
		JLabel lblHidratosOctavoAlimento = new JLabel("");
		
		JLabel lblAzucarOctavoAlimento = new JLabel("");
		
		JLabel lblProteinasOctavoAlimento = new JLabel("");
	
		
		JLabel lblSalOctavoAlimento = new JLabel("");
		
		JLabel lblCaloriasOctavoAlimento = new JLabel("");
		
		JLabel lblTextoAÒadirAlimentos = new JLabel("A√±ade m√°s alimentos si es necesario:");
		
		JLabel lblNombreAÒadir = new JLabel("Nombre");
		
		JLabel lblGrasasAÒadir = new JLabel("Grasas");
		
		JLabel lblSaturadasAÒadir = new JLabel("Saturadas");
		
		JLabel lblHidratosAÒadir = new JLabel("Hidratos");
		
		JLabel lblAzucarAÒadir = new JLabel("Azucar");
		
		JLabel lblProteinasAÒadir = new JLabel("Proteinas");
		lblProteinasAÒadir.setForeground(Color.BLACK);
		
		JLabel lblSalAÒadir = new JLabel("Sal");
		
		JLabel lblCaloriasAÒadir = new JLabel("Calorias");
		

		JLabel lblCantidadAÒadir = new JLabel("Cantidad");
		
		JLabel lblErrorAÒadir = new JLabel("");
		lblErrorAÒadir.setForeground(Color.RED);
		
		textFieldCantidadAÒadir = new JTextField();
		textFieldCantidadAÒadir.setColumns(10);
		
		textFieldNombreAÒadir = new JTextField();
		textFieldNombreAÒadir.setColumns(10);
		
		textFieldGrasasAÒadir = new JTextField();
		textFieldGrasasAÒadir.setColumns(10);
		
		textFieldGrasasSaturadasAÒadir = new JTextField();
		textFieldGrasasSaturadasAÒadir.setColumns(10);
		
		textFieldHidratosAÒadir = new JTextField();
		textFieldHidratosAÒadir.setColumns(10);
		
		textFieldAzucarAÒadir = new JTextField();
		textFieldAzucarAÒadir.setColumns(10);
		
		textFieldProteinasAÒadir = new JTextField();
		textFieldProteinasAÒadir.setColumns(10);
		
		textFieldSalAÒadir = new JTextField();
		textFieldSalAÒadir.setColumns(10);
		
		textFieldCaloriasAÒadir = new JTextField();
		textFieldCaloriasAÒadir.setColumns(10);
		/**
		 * Este bot√≥n borra todos los elementos escritos en los textArea de la zona aÒadir para que el usuario pueda volver a escribir nuevos datos en dichos textArea
		 */
		JButton btnReset = new JButton("Reset");
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldNombreAÒadir.setText("");
				textFieldGrasasAÒadir.setText("");
				textFieldGrasasSaturadasAÒadir.setText("");
				textFieldHidratosAÒadir.setText("");
				textFieldAzucarAÒadir.setText("");
				textFieldProteinasAÒadir.setText("");
				textFieldSalAÒadir.setText("");
				textFieldCaloriasAÒadir.setText("");
			}
		});
		
		/**
		 * Este bot√≥n permite a√±adir un objeto al array y a la lista para tenerlo en cuenta a la hora de calcular. No se pueden a√±adir m√°s de 3 objetos
		 */
		JButton btnAnadir = new JButton("A√±adir");
		btnAnadir.addMouseListener(new MouseAdapter() {
			
			/**
			 * Este m√©todo crea un alimento en caso de que las grasas saturadas sean menores que las grasas normales. En caso de no ser as√≠, muestra un mensaje de error
			 * @author Alejandro Donet Montesinos
			 */
			public void crearAlimento() {
				if (Double.valueOf(textFieldGrasasAÒadir.getText())<Double.valueOf(textFieldGrasasSaturadasAÒadir.getText())){
					lblErrorAÒadir.setText("ERROR: Las grasas saturadas no pueden ser mayores que las grasas normales.");;
				}
				else {
					arrayAlimentos.add(new Alimento(textFieldNombreAÒadir.getText(),Double.valueOf(textFieldGrasasAÒadir.getText()),Double.valueOf(textFieldGrasasSaturadasAÒadir.getText()),Double.valueOf(textFieldHidratosAÒadir.getText()),Double.valueOf(textFieldAzucarAÒadir.getText()),Double.valueOf(textFieldProteinasAÒadir.getText()),Double.valueOf(textFieldSalAÒadir.getText()),Integer.valueOf(textFieldCaloriasAÒadir.getText()),Integer.valueOf(textFieldCantidadAÒadir.getText())));
					lblErrorAÒadir.setText("");;
				}
				
				
			}
			
			/**
			 * Este m√©todo sirve para recoger los datos del alimento de la posici√≥n del array que le pases como par√°metro y pone dichos datos en sus respectivas "label"
			 * @author Alejandro Donet Montesinos
			 */
			public void recogerDatosNuevoAlimento(int i) {
				lblNombrSextoAlimento.setText((String.valueOf(arrayAlimentos.get(i).getNombre())));
				lblGrasasSextoAlimento.setText((String.valueOf(arrayAlimentos.get(i).getGrasas())));
				lblSaturadasSextoAlimento.setText((String.valueOf(arrayAlimentos.get(i).getGrasasSaturadas())));
				lblHidratosSextoAlimento.setText((String.valueOf(arrayAlimentos.get(i).getHidratos())));
				lblAzucarSextoAlimento.setText((String.valueOf(arrayAlimentos.get(i).getAzucar())));
				lblProteinasSextoAlimento.setText((String.valueOf(arrayAlimentos.get(i).getProteinas())));
				lblSalSextoAlimento.setText((String.valueOf(arrayAlimentos.get(i).getSal())));
				lblCaloriasSextoAlimento.setText((String.valueOf(arrayAlimentos.get(i).getCalorias())));
				lblCantidadaadir.setText(String.valueOf(arrayAlimentos.get(i).getCantidad()));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (arrayAlimentos.size()<8) {
				this.crearAlimento();
				}
				
					
				if (lblNombrSextoAlimento.getText().equals("")) {
				this.recogerDatosNuevoAlimento(5);
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
					lblCantidadaadir2.setText(String.valueOf(arrayAlimentos.get(6).getCantidad()));
					
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
					lblCantidadaadir3.setText(String.valueOf(arrayAlimentos.get(7).getCantidad()));
					
					
				}
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(79)
							.addComponent(lblSexo, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(lblAltura, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblPeso, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(45)
							.addComponent(lblEdad, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(78)
							.addComponent(lblEjercicio, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(116)
							.addComponent(lblCalorasRecomendadas, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
							.addGap(59)
							.addComponent(lblImc, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(69)
							.addComponent(comboBoxSexo, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addGap(24)
							.addComponent(textFieldAltura, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(txtFieldPeso, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(textFieldEdad, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(35)
							.addComponent(comboBoxEjercicio, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
							.addGap(65)
							.addComponent(lblNumerocaloriasrecomendadas, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(85)
							.addComponent(lblImctotal, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(158)
							.addComponent(checkboxSegundoAlimento)
							.addGap(6)
							.addComponent(lblNombreSegundoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(lblGrasasSegundoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addComponent(lblSaturadasSegundoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblHidratosSegundoAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(lblAzucarSegundoAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(lblProteinasSegundoAlimento, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(44)
							.addComponent(lblSalSegundoAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(53)
							.addComponent(lblCaloriasSegundoAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(textFieldCantidad2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(158)
							.addComponent(checkboxTercerAlimento)
							.addGap(6)
							.addComponent(lblNombreTercerAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(lblGrasasTercerAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addComponent(lblSaturadasTercerAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblHidratosTercerAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(lblAzucarTercerAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(lblProteinasTercerAlimento, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(44)
							.addComponent(lblSalTercerAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(53)
							.addComponent(lblCaloriasTercerAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(textFieldCantidad3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(158)
							.addComponent(checkboxCuartoAlimento)
							.addGap(6)
							.addComponent(lblNombreCuartoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(lblGrasasCuartoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addComponent(lblSaturadasCuartoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblHidratosCuartoAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(lblAzucarCuartoAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(lblProteinasCuartoAlimento, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(44)
							.addComponent(lblSalCuartoAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(53)
							.addComponent(lblCaloriasCuartoAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(textFieldCantidad4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(158)
							.addComponent(checkboxQuintoAlimento)
							.addGap(6)
							.addComponent(lblNombrQuintoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(lblGrasasQuintoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addComponent(lblSaturadasQuintoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblHidratosQuintoAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(lblAzucarQuintoAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(lblProteinasQuintoAlimento, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(44)
							.addComponent(lblSalQuintoAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(53)
							.addComponent(lblCaloriasQuintoAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(textFieldCantidad5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(185)
							.addComponent(lblNombrSextoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(lblGrasasSextoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addComponent(lblSaturadasSextoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblHidratosSextoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(lblAzucarSextoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(lblProteinasSextoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(34)
							.addComponent(lblSalSextoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(24)
							.addComponent(lblCaloriasSextoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(lblCantidadaadir, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(185)
							.addComponent(lblNombrSeptimoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(lblGrasasSeptimoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addComponent(lblSaturadasSeptimoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblHidratosSeptimoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(lblAzucarSeptimoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(lblProteinasSeptimoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(34)
							.addComponent(lblSalSeptimoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(24)
							.addComponent(lblCaloriasSeptimoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(lblCantidadaadir2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(185)
							.addComponent(lblNombrOctavoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(lblGrasasOctavoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addComponent(lblSaturadasOctavoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblHidratosOctavoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(lblAzucarOctavoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(lblProteinasOctavoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addComponent(lblSalOctavoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(24)
							.addComponent(lblCaloriasOctavoAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(lblCantidadaadir3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(185)
							.addComponent(lblTotalCalorias)
							.addGap(4)
							.addComponent(textFieldTotalCalorias, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(23)
							.addComponent(lblTotalGrasas, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(textFieldTotalGrasas, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(40)
							.addComponent(lblTotalAzucar, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addGap(3)
							.addComponent(textFieldTotalAzucar, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(43)
							.addComponent(lblTotalSal, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addComponent(textFieldTotalSal, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(432)
							.addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(69)
							.addComponent(lblTextoAÒadirAlimentos, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(79)
							.addComponent(lblNombreAÒadir, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblGrasasAÒadir, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(lblSaturadasAÒadir)
							.addGap(27)
							.addComponent(lblHidratosAÒadir, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(24)
							.addComponent(lblAzucarAÒadir, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(lblProteinasAÒadir, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(44)
							.addComponent(lblSalAÒadir, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(lblCaloriasAÒadir, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(lblCantidadAÒadir, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(79)
							.addComponent(textFieldNombreAÒadir, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(textFieldGrasasAÒadir, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(22)
							.addComponent(textFieldGrasasSaturadasAÒadir, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addComponent(textFieldHidratosAÒadir, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(24)
							.addComponent(textFieldAzucarAÒadir, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(textFieldProteinasAÒadir, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(54)
							.addComponent(textFieldSalAÒadir, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(15)
							.addComponent(textFieldCaloriasAÒadir, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(textFieldCantidadAÒadir, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(55)
							.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(485)
							.addComponent(btnAnadir, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(26)
							.addComponent(lblErrorAÒadir, GroupLayout.PREFERRED_SIZE, 564, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(158)
									.addComponent(checkboxPrimerAlimento)
									.addGap(6)
									.addComponent(lblNombrePrimerAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addGap(36)
									.addComponent(lblGrasasPrimerAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addGap(25)
									.addComponent(lblSaturadasPrimerAlimento, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addGap(26)
									.addComponent(lblHidratosPrimerAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
									.addGap(41)
									.addComponent(lblAzucarPrimerAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
									.addGap(41)
									.addComponent(lblProteinasPrimerAlimento, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(185)
									.addComponent(lblNombreNombre, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addGap(26)
									.addComponent(lblNombreGrasas, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(lblNombreSaturadas)
									.addGap(18)
									.addComponent(lblNombreHidratos)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblNombreAzucar, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(lblNombreProteinas)))
							.addGap(29)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblSalPrimerAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
									.addGap(53)
									.addComponent(lblCaloriasPrimerAlimento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNombreSal, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNombreCalorias, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)))
							.addGap(2)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNombreCantidad, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldCantidad1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))))
					.addGap(39))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(56)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSexo)
						.addComponent(lblAltura)
						.addComponent(lblPeso)
						.addComponent(lblEdad)
						.addComponent(lblEjercicio)
						.addComponent(lblCalorasRecomendadas)
						.addComponent(lblImc))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBoxSexo, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(textFieldAltura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(txtFieldPeso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(textFieldEdad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBoxEjercicio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblNumerocaloriasrecomendadas, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblImctotal, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
					.addGap(42)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNombreNombre)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(lblNombreGrasas))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNombreSaturadas)
							.addComponent(lblNombreHidratos)
							.addComponent(lblNombreProteinas)
							.addComponent(lblNombreAzucar))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNombreSal)
							.addComponent(lblNombreCalorias)
							.addComponent(lblNombreCantidad)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(checkboxPrimerAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNombrePrimerAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblGrasasPrimerAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblSaturadasPrimerAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblHidratosPrimerAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblAzucarPrimerAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblProteinasPrimerAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblSalPrimerAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblCaloriasPrimerAlimento))
						.addComponent(textFieldCantidad1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(checkboxSegundoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNombreSegundoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblGrasasSegundoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblSaturadasSegundoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblHidratosSegundoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblAzucarSegundoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblProteinasSegundoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblSalSegundoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblCaloriasSegundoAlimento))
						.addComponent(textFieldCantidad2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(checkboxTercerAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNombreTercerAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblGrasasTercerAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblSaturadasTercerAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblHidratosTercerAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblAzucarTercerAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblProteinasTercerAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblSalTercerAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblCaloriasTercerAlimento))
						.addComponent(textFieldCantidad3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(checkboxCuartoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNombreCuartoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblGrasasCuartoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblSaturadasCuartoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblHidratosCuartoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblAzucarCuartoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblProteinasCuartoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblSalCuartoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblCaloriasCuartoAlimento))
						.addComponent(textFieldCantidad4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(checkboxQuintoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNombrQuintoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblGrasasQuintoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblSaturadasQuintoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblHidratosQuintoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblAzucarQuintoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblProteinasQuintoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblSalQuintoAlimento))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblCaloriasQuintoAlimento))
						.addComponent(textFieldCantidad5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNombrSextoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGrasasSextoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSaturadasSextoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblHidratosSextoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAzucarSextoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProteinasSextoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSalSextoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCaloriasSextoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblCantidadaadir, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNombrSeptimoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGrasasSeptimoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSaturadasSeptimoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblHidratosSeptimoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAzucarSeptimoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProteinasSeptimoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSalSeptimoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCaloriasSeptimoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCantidadaadir2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNombrOctavoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGrasasOctavoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSaturadasOctavoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblHidratosOctavoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAzucarOctavoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProteinasOctavoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSalOctavoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCaloriasOctavoAlimento, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCantidadaadir3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(46)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(lblTotalCalorias))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(textFieldTotalCalorias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(lblTotalGrasas))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(textFieldTotalGrasas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblTotalAzucar))
						.addComponent(textFieldTotalAzucar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblTotalSal))
						.addComponent(textFieldTotalSal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addComponent(btnCalcular)
					.addGap(77)
					.addComponent(lblTextoAÒadirAlimentos)
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNombreAÒadir)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(lblGrasasAÒadir))
						.addComponent(lblSaturadasAÒadir)
						.addComponent(lblHidratosAÒadir)
						.addComponent(lblAzucarAÒadir)
						.addComponent(lblProteinasAÒadir)
						.addComponent(lblSalAÒadir)
						.addComponent(lblCaloriasAÒadir)
						.addComponent(lblCantidadAÒadir))
					.addGap(17)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(textFieldNombreAÒadir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(textFieldGrasasAÒadir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(textFieldGrasasSaturadasAÒadir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(textFieldHidratosAÒadir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(textFieldAzucarAÒadir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(textFieldProteinasAÒadir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(textFieldSalAÒadir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(textFieldCaloriasAÒadir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(textFieldCantidadAÒadir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnReset))
					.addGap(18)
					.addComponent(btnAnadir)
					.addGap(3)
					.addComponent(lblErrorAÒadir, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
		);
		frame.getContentPane().setLayout(groupLayout);
								
	}
}
