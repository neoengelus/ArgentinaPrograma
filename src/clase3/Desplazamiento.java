package clase3;
import java.util.Scanner;

public class Desplazamiento {
	public static void main(String args[]) {
		
		String texto, texto2 = "", abc = "abcdefghijklmnñopqrstuvwxyz";
		char textoVector[] = {};
		int des;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el desplazamiento:");
		des = teclado.nextInt();
		System.out.println("Ingrese la frase a codificar:");
		teclado.nextLine();
		texto = teclado.nextLine();
		textoVector = texto.toLowerCase().replace(" ", ",").toCharArray();
		for (char letra : textoVector) {
			switch (letra) {
				case ',' :
					texto2 += abc.charAt(des - 1);
					break;
				case 'z' :
					texto2 += '!';
					break;
				default :
					int i = abc.indexOf(letra);
					texto2 += abc.charAt(i + des);
			}
		}
		System.out.println("El texto codificado es : " + texto2);
	}		
}