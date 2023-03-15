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
		double unNumero = 150, otroNumero = 180;
		Calculadora calc = new Calculadora();
		calc.dividir(calc.sumar(unNumero, otroNumero),3);
	}

	@Test
	public void testRestar() {
		double unNumero = 90, otroNumero = 50;
		Calculadora calc = new Calculadora();
		calc.restar(calc.multiplicar(unNumero, otroNumero),15);
	}

	@Test
	public void testMultiplicar() {
		double unNumero = 80, otroNumero = 3;
		Calculadora calc = new Calculadora();
		calc.multiplicar(unNumero, otroNumero);
	}

	@Test
	public void testDividir() {
		fail("Not yet implemented");
	}

}
