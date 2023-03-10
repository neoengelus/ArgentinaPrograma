package clase1;
public class Ej1 {

	public static void main(String[] args) {
		int numeroInicio = 5;
		int numeroFin = 14;

		while (numeroInicio <= numeroFin) {
			System.out.println(numeroInicio);
			if (numeroInicio % 2 == 0) {
				System.out.println("El número " + numeroInicio + " es par");
			} else {
				System.out.println("El número " + numeroInicio + " es impar");
			}
			numeroInicio += 1;
			}
		numeroFin = 5;
		System.out.println("Ciclo for");
		for (numeroInicio = 14; numeroInicio >= numeroFin; numeroInicio--) {
			System.out.println(numeroInicio);
		}
	}
}