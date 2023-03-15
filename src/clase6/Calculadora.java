package clase6;

public class Calculadora {
	
	public double sumar(double unNumero, double otroNumero) {
		return (unNumero + otroNumero);
	}
	
	public double restar(double unNumero, double otroNumero) {
		return (unNumero - otroNumero);
	}
	
	public double multiplicar(double unNumero, double otroNumero) {
		return (unNumero + otroNumero);
	}
	
	public double dividir(double unNumero, double otroNumero) {
		double division = 0;
		if (otroNumero != 0) {
			division = (unNumero / otroNumero);
		} else {
			System.out.println("Error división por cero");
		}
		return division;
	}
}
