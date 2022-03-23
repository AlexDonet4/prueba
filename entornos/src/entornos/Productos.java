package entornos;

public class Productos {
	private String nombre;
	private double grasas;
	private double grasasSaturadas;
	private double hidratos;
	private double azucar;
	private double proteinas;
	private double sal;
	private int calorias;

	public Productos() {
	};
	public Productos(String nombre, double grasas, double grasasSaturadas,
			double hidratos, double azucar, double proteinas, double sal,
			int calorias) {
		this.nombre = nombre;
		this.grasas = grasas;
		this.grasasSaturadas = grasasSaturadas;
		this.hidratos = hidratos;
		this.azucar = azucar;
		this.proteinas = proteinas;
		this.sal = sal;
		this.calorias = calorias;
	}

}
