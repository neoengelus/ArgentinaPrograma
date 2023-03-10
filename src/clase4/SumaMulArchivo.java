package clase4;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class SumaMulArchivo {

	public static void main(String[] args) {
		 Path ruta = Paths.get("numeros.txt").toAbsolutePath();
		 int opcion = 0, resultado = 0;
		 Scanner teclado = new Scanner(System.in);
		 
		 System.out.println("Elija si desea sumar o multiplicar los números:\n1.-Sumar\n2.-Multiplicar");
		 opcion = teclado.nextInt();
		 resultado = sumaMult(opcion, ruta);
		 if (opcion == 1) {
			 System.out.println("Suma:");
			 System.out.println("El resultado es: "+ resultado);
		 }else if (opcion == 2) {
			 System.out.println("Multiplicacion:");
			 System.out.println("El resultado es: "+ resultado);
		 }else {
 			System.out.println("Opción incorrecta");
 		}
	}
	
	public static boolean validarNro(String numero) {
	    int parse_numero = 0;
	    boolean resultado = false;
	    
	    try {
	        parse_numero = Integer.parseInt(numero);
	        resultado = true;
	    } catch (Exception e) {
	        resultado = false;
	    }
	    return resultado;
	}
	
	public static int sumaMult(int opcion, Path ruta) {
		int suma = 0;
		
		 try {
	         List<String> lineas = Files.readAllLines(ruta);
	         if (opcion == 2) {
	        	 suma = 1;
	         }
	         for (String linea : lineas) {
	        	if (validarNro(linea)) {
	        		if (opcion == 1) {
	        			suma += Integer.parseInt(linea);
	        		} else if (opcion == 2) {
	        			suma *= Integer.parseInt(linea);
	        		}
	        	}
	         }
	      } 
	      catch (IOException e) {
	         System.out.println(e);
	      }
		return suma;
	}
}