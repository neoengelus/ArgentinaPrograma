package clase6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSumar() {
		Calculadora calc = new Calculadora();
		assertEquals(110,calc.dividir(calc.sumar(150, 180), 3),0.0f);
		//assertEquals(2700,calc.multiplicar(calc.sumar(70, 40), 25),0.0f);
	}

	@Test
	public void testRestar() {
		Calculadora calc = new Calculadora();
		assertEquals(605,calc.multiplicar(calc.restar(90, 50), 15), 0.0f);
	}

	@Test
	public void testMultiplicar() {
		Calculadora calc = new Calculadora();
		assertEquals(240,calc.multiplicar(80, 3),0.0f);
		
	}

	@Test
	public void testDividir() {
		//fail("Not yet implemented");
	}

}
