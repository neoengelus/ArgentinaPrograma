package clase4;
import java.util.Scanner;

public class SumarVector {

	public static void main(String[] args) {
		int n,m,x,suma=0;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese la cantidad de elementos a ingresar");
		n = teclado.nextInt();
		int vector[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Ingrese un valor: ");
			m = teclado.nextInt();
			vector[i] = m;
		}
		System.out.println("Ingrese el número a evaluar: ");
		x = teclado.nextInt();
		for (int numero : vector) {
			if (numero > x) {
				suma += numero;
			}
		}
		System.out.println("La suma de todos los números > " + x + " es: " + suma);
	}	
}