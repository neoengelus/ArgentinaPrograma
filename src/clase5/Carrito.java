package clase5;

import java.time.LocalDateTime;

public class Carrito {
	private Persona persona;
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	private LocalDateTime fechaCompra;
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	public void asignarProducto(Producto prod) {
		if (this.producto1 == null) {
			this.producto1 = prod;
		} else if (this.producto2 == null) {
			this.producto2 = prod;
		} else if (this.producto3 == null) {
			this.producto3 = prod;
		} else {
			System.out.println("El carrito está lleno!");
		}
	}
	
	public Carrito() {
		
	}
	
	public Carrito(Persona persona, Producto producto1, Producto producto2, Producto producto3, LocalDateTime fechaCompra) {
		super();
		this.persona = persona;
		this.producto1 = producto1;
		this.producto2 = producto2;
		this.producto3 = producto3;
		this.fechaCompra = fechaCompra;
	}

	public float precio() {
		float precio = 0;
		if (this.producto1 != null) {
			if (this.producto2 != null) {
				if (this.producto3 != null) {
					precio += (this.producto1.getPrecio() * this.producto1.getCantidad()) + (this.producto2.getPrecio() * this.producto2.getCantidad()) +
							  (this.producto3.getPrecio() * this.producto3.getCantidad()) ;
				} else {
					precio += (this.producto1.getPrecio() * this.producto1.getCantidad()) + (this.producto2.getPrecio() * this.producto2.getCantidad());
				}
			} else {
				precio += (this.producto1.getPrecio() * this.producto1.getCantidad());
			}
		}
		return precio;
	}
}
