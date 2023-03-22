package clase7;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarritoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Carrito car = new Carrito(null, null, null, null, null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void precio() {
		Producto prod = new Producto("jamon","queso", 10, 50f);
		Carrito car = new Carrito(null, prod, null, null, null);
		assertEquals(500,car.precio(),0.0f);
	}
	
	@Test
	public void precio2() {
		Producto prod = new Producto("jamon","queso", 10, 50f);
		Carrito car = new Carrito(null, null, null, prod, null);
		assertEquals(500,car.precio(),0.0f);
	}
	@Test
	public void precio3() {
		Producto prod = new Producto("jamon","queso", 10, 50f);
		Carrito car = new Carrito(null, prod, prod, prod, null);
		assertEquals(1500,car.precio(),0.0f);
	}

}
