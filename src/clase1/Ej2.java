package clase1;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		int ingresos = 489083;
		int Inmuebles = 3;
		int Autos = 5;
		System.out.println("ingrese el valor total de haberes sin centavos");
		Scanner haberes=new Scanner (System.in);
		
		ingresos=haberes.nextInt();
		if ( (ingresos <= 489083) && ( Inmuebles <= 3) && (Autos <= 5) ){
				System.out.println("Categoría A");
				} else if ((ingresos <= 1112459.83) && (Inmuebles <= 3) && (Autos <= 5) ) {
				System.out.println("Categoría B");
				}
	}
}
