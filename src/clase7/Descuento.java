package clase7;

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
}
