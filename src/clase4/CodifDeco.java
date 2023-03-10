package clase4;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CodifDeco {

	public static void main(String[] args) {
		Path rutaEntrada = Paths.get("entrada.txt").toAbsolutePath(), rutaSalida = Paths.get("salida.txt").toAbsolutePath();
		Scanner teclado = new Scanner(System.in);
		int opcion = 0, des = 0;
		
		System.out.println("Que desea hacer?\n1.-Codificar\n2.-Decodificar");
		opcion = teclado.nextInt();
		System.out.println("Ingrese el desplazamiento:");
		des = teclado.nextInt();
		if (opcion == 1) {
			codificar(des,rutaEntrada,rutaSalida);
		} else if (opcion == 2) {
			decodificar(des,rutaEntrada,rutaSalida);
		} else {
			System.out.println("Se ingresó una opción inválida");
		}
	}
	
	public static void codificar(int desp, Path rutaE, Path rutaS ) {
		try {
	         List<String> lineas = Files.readAllLines(rutaE);
	         char textoVector[] = {};
	         String texto2 = "", abc = "abcdefghijklmnñopqrstuvwxyz";
	        
	         textoVector = lineas.toString().toLowerCase().replace(" ", ",").toCharArray();
	 		 for (char letra : textoVector) {
	 			switch (letra) {
	 				case ',' :
	 					texto2 += abc.charAt(desp - 1);
	 					break;
	 				case 'z' :
	 					texto2 += '!';
	 					break;
	 				case '[':
	 					break;
	 				case ']':
	 					break;
	 				default :
	 					int i = abc.indexOf(letra);
						texto2 += abc.charAt(i + desp);
	 			}
	 		 }
	 		 Files.writeString(rutaS,texto2);
	 		 System.out.println("La codificación se realizó con éxito!");
	      } 
	      catch (IOException e) {
	         System.out.println("Ocurrió un eror: " +e);
	      }
	}
	public static void decodificar(int desp, Path rutaE, Path rutaS) {
		try {
	         List<String> lineas = Files.readAllLines(rutaE);
	         String texto2 = "", abc = "abcdefghijklmnñopqrstuvwxyz";
	         char textoVector[] = {}, espacio = abc.charAt(desp - 1);
	        
	         textoVector = lineas.toString().toCharArray();
	         for (int i = 0; i < textoVector.length; i++) {
	        	 if (textoVector[i] == espacio) {
	        		 textoVector[i] = ' ';
	        	 }
	         }
	         for (char letra : textoVector) {
	 			switch (letra) {
	 				case '!' :
	 					texto2 += 'z';
	 					break;
	 				case '[':
	 					break;
	 				case ']':
	 					break;
	 				case ' ':
	 					texto2 += ' ';
	 					break;
	 				default :
	 					int i = abc.indexOf(letra);
	 					texto2 += abc.charAt(i - desp);
	 			}
	 		 }
	 		 Files.writeString(rutaS,texto2);
	         System.out.println("La decodificación se realizó con éxito!");
	      } 
	      catch (IOException e) {
	    	  System.out.println("Ocurrió un eror: " +e);
	      }
	}
}
