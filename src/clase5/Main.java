package clase5;

import java.time.LocalDateTime;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Archivo file = new Archivo("lista_productos.csv");
		List<String> lista = file.leerArchivo();
		int i = 0;
		Carrito miCarrito = new Carrito();
		miCarrito.setFechaCompra(LocalDateTime.now());
		Persona comprador = new Persona("Juan","Perez",null);
		miCarrito.setPersona(comprador);
		
		lista.remove(0);
		for (String linea : lista) {
				String[] vectorLinea = linea.split(";");
				Producto miProducto = new Producto(vectorLinea[2],"",Integer.parseInt(vectorLinea[0]),Float.parseFloat(vectorLinea[1]));
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
		System.out.printf("+--------+---------------+");
	}

}