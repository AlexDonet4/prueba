package entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PruebaJunitProyecto {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Prueba finalizada");
	}

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetGrasas() {
		Alimento huevo= new Alimento("Huevo",6.76,1.88,0.43,0.38,6.24,0.6,89,100);
		System.out.println(huevo.getGrasas());
	}
	
	@Test
	void testSetGrasas() {
		Alimento huevo= new Alimento("Huevo",6.76,1.88,0.43,0.38,6.24,0.6,89,100);
		huevo.setGrasas("Alex");
	}

}
