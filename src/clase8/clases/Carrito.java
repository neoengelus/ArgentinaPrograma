package clase8.clases;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Carrito {
	private Persona persona;
	private List <Producto> producto = new ArrayList<Producto>();
	private LocalDateTime fechaCompra;
	private Descuento desc;

	public Descuento getDesc() {
		return desc;
	}
	public void setDesc(Descuento desc) {
		this.desc = desc;
	}
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
		this.producto.add(prod);
	}
	
	public List <Producto> listaProducto(){
		return this.producto;
	}
	
	public Carrito() {
		
	}
	
	public Carrito(Persona persona, LocalDateTime fechaCompra, List<Producto> listaProducto) {
		super();
		this.persona = persona;
		this.fechaCompra = fechaCompra;
		this.producto = listaProducto;
	}

	public float precio() {
		float precio = 0;
		
		for (Producto prod : this.producto) {
			precio += prod.getPrecio() * prod.getCantidad();
		}
		return precio;
	}
}
