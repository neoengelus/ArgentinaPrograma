package clase8.clases;

import java.util.List;

public class Descuento {
	private float porcentajeDesc;

	public float getPorcentajeDesc() {
		return porcentajeDesc;
	}

	public void setPorcentajeDesc(float porcentajeDesc) {
		this.porcentajeDesc = porcentajeDesc;
	}

	public Descuento() {
		
	}

	public Descuento(float porcentajeDesc) {
		super();
		this.porcentajeDesc = porcentajeDesc;
	}
	
	public float calcularDescuento(float precio) {
		return precio * this.porcentajeDesc;
	}
	
	public float calcularDescuentoCarrito(Carrito car)  throws DescuentosException {
		if (car.precio() == 0) {
			throw new DescuentosException(car.getDesc(), 1);
		} else if (car.precio() < 0) {
			throw new DescuentosException(car.getDesc(), 2);
		}
		List<Producto> lista = car.listaProducto();
		float desc = 0;
		for (Producto prod : lista) {
			desc += this.calcularDescuento(prod.getPrecio()) * prod.getCantidad();
		}
		return desc;
	}
}
