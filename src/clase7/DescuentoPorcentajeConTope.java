package clase7;

public class DescuentoPorcentajeConTope extends Descuento{
	private float tope;
	
	public DescuentoPorcentajeConTope() {
		super();
	}
	
	public DescuentoPorcentajeConTope(float tope) {
		super();
		this.tope = tope;
	}
	
	public boolean superaTope(float desc) {
		boolean resultado = false;
		
		if (desc > this.tope) {
			resultado = true;
		}
		return resultado;
	}
}
