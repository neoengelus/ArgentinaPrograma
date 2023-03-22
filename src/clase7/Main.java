package clase7;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Archivo file = new Archivo("lista_productos.csv");
		List<String> lista = file.leerArchivo();
		int i = 0;
		Carrito miCarrito = new Carrito();
		miCarrito.setFechaCompra(LocalDateTime.now());
		Persona comprador = new Persona("Juan","Perez",null);
		miCarrito.setPersona(comprador);
		float fijo = 0.1f, max = 0.5f, op;
		Scanner teclado = new Scanner(System.in);
		DescuentoPorcentajeConTope desc = new DescuentoPorcentajeConTope(max);
		
		System.out.println("Ingrese si el descuento es fijo o porcentual\nEn el caso de fijo ingresar 0, caso contrario ingresar el %");
		op = teclado.nextFloat();
		if (op == 0.0) {
			desc.setPorcentajeDesc(fijo);
		} else if (desc.superaTope(op)) {
			desc.setPorcentajeDesc(max);
		} else {
			op /= 100; 
			desc.setPorcentajeDesc(op);
		}
		lista.remove(0);
		for (String linea : lista) {
				String[] vectorLinea = linea.split(";");
				float precioDescuento = Float.parseFloat(vectorLinea[1]) - desc.calcularDescuento(Float.parseFloat(vectorLinea[1]));
				Producto miProducto = new Producto(vectorLinea[2],"",Integer.parseInt(vectorLinea[0]), precioDescuento);
				miCarrito.asignarProducto(miProducto);
		}
		float total = miCarrito.precio();
		System.out.printf("+--------+---------------+--------------------+\n");
		System.out.printf("|%-3s|%-3s|%-20s|\n", "Cantidad", "Precio Unitario", "Producto");
		System.out.printf("+--------+---------------+--------------------+\n");
		for (String linea : lista) {
			String[] vectorLinea = linea.split(";");
			System.out.printf("|%-8s|%-15s|%-20s|\n", vectorLinea[0], vectorLinea[1], vectorLinea[2]);
		}
		System.out.printf("+--------+---------------+--------------------+\n");
		System.out.printf("|%-8s|%-15s|\n","Total",total);
		System.out.printf("+--------+---------------+\n");
		System.out.printf("|%-8s|%-15s|\n","% Desc.",desc.getPorcentajeDesc() * 100);
		System.out.printf("+--------+---------------+");
	}

}