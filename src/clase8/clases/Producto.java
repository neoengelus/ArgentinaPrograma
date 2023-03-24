package clase8.clases;

public class Producto {
	private String nombre;
	private String codigo;
	private int cantidad;
	private float precio;
	
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public String getCodigo() {
		
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto() {
	
	}

	public Producto(String nombre, String codigo,int cantidad, float precio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public float costoTotal(int cantCuotas) {
		float interes = (float) 0.3 * this.precio, precioTotal = (this.precio * cantCuotas) + interes;
		return precioTotal;
	}
	
}
