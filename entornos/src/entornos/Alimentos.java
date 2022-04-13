package entornos;

public class Alimentos {

	private String nombre;
	private double grasas;
	private double grasasSaturadas;
	private double hidratos;
	private double azucar;
	private double proteinas;
	private double sal;
	private int calorias;
	private int cantidad;

	public Alimentos() {
	};

	public Alimentos(String nombre, double grasas, double grasasSaturadas,
			double hidratos, double azucar, double proteinas, double sal,
			int calorias,int cantidad) {
		this.nombre = nombre;
		this.grasas = grasas;
		this.grasasSaturadas = grasasSaturadas;
		this.hidratos = hidratos;
		this.azucar = azucar;
		this.proteinas = proteinas;
		this.sal = sal;
		this.calorias = calorias;
		this.cantidad=cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public double getGrasas() {
		return grasas;
	}

	public double getGrasasSaturadas() {
		return grasasSaturadas;
	}

	public double getHidratos() {
		return hidratos;
	}

	public double getAzucar() {
		return azucar;
	}

	public double getProteinas() {
		return proteinas;
	}

	public double getSal() {
		return sal;
	}

	public int getCalorias() {
		return calorias;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setGrasas(double grasas) {
		this.grasas = grasas;
	}

	public void setGrasasSaturadas(double grasasSaturadas) {
		this.grasasSaturadas = grasasSaturadas;
	}

	public void setHidratos(double hidratos) {
		this.hidratos = hidratos;
	}

	public void setAzucar(double azucar) {
		this.azucar = azucar;
	}

	public void setProteinas(double proteinas) {
		this.proteinas = proteinas;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Alimentos [nombre=" + nombre + ", grasas=" + grasas
				+ ", grasasSaturadas=" + grasasSaturadas + ", hidratos="
				+ hidratos + ", azucar=" + azucar + ", proteinas="
				+ proteinas + ", sal=" + sal + ", calorias=" + calorias
				+ ", cantidad=" + cantidad + "]";
	}



}
