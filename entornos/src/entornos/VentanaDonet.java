package entornos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Font;

public class VentanaDonet {

	private JFrame frame;

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
		lblCocacola.setBounds(182, 149, 60, 17);
		frame.getContentPane().add(lblCocacola);
		
		JLabel lblPollo = new JLabel("Pollo");
		lblPollo.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPollo.setBounds(182, 178, 60, 17);
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
		checkbox1.setBounds(155, 149, 21, 17);
		frame.getContentPane().add(checkbox1);
		
		JCheckBox checkbox2 = new JCheckBox("");
		checkbox2.setBounds(155, 178, 21, 17);
		frame.getContentPane().add(checkbox2);
		
		JCheckBox checkbox3 = new JCheckBox("");
		checkbox3.setBounds(155, 207, 21, 17);
		frame.getContentPane().add(checkbox3);
		
		JCheckBox checkbox4 = new JCheckBox("");
		checkbox4.setBounds(155, 236, 21, 17);
		frame.getContentPane().add(checkbox4);
		
		JCheckBox checkbox5 = new JCheckBox("");
		checkbox5.setBounds(155, 265, 21, 17);
		frame.getContentPane().add(checkbox5);
	}
}
