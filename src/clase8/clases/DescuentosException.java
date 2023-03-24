package clase8.clases;

public class DescuentosException extends Exception {
	private final Descuento descuento;
	private final int tipoError;
	
	public DescuentosException(Descuento descuento, int tipoError) {
		this.descuento = descuento;
		this.tipoError = tipoError;
	}
	
	@Override
	public String toString() {
		String mensaje = "";
		switch (this.tipoError) {
			case 1:
				mensaje = "Carrito con precio 0";
				break;
			case 2:
				mensaje = "Carrito con descuento negativo";
				break;
		}
		return "Ocurrió un error " + mensaje;
	}
}