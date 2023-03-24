package clase8.test;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase8.clases.Carrito;
import clase8.clases.Descuento;
import clase8.clases.DescuentosException;
import clase8.clases.Persona;
import clase8.clases.Producto;

public class TestDescuento {
	
	List<Producto> listaProd = new ArrayList<Producto>();
	Persona comprador = new Persona("Juan","Perez",null);
	Descuento miDescuento = new Descuento(0.15f);
	Carrito car = new Carrito(comprador,LocalDateTime.now(),listaProd);
		
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
	public void testDescuentoCero() {
		Producto miProducto = new Producto("papel","",0,12);
		listaProd.add(miProducto);
		try {
			miDescuento.calcularDescuentoCarrito(car);
		} catch (DescuentosException e) {
			fail("La excepcion funciona");
		}
	}
	@Test
	public void testDescuentoNegativo() {
		Producto miProducto = new Producto("papel","",-12,12);
		listaProd.add(miProducto);
		try {
			miDescuento.calcularDescuentoCarrito(car);
		} catch (DescuentosException e) {
			fail("La excepcion funciona");
		}
	}
	@Test
	public void testDescuento() {
		Producto miProducto = new Producto("papel","",20,12);
		listaProd.add(miProducto);
		try {
			miDescuento.calcularDescuentoCarrito(car);
		} catch (DescuentosException e) {
			fail("La excepcion funciona");
		}
	}
}
