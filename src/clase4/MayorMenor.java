package clase4;
import java.util.*;
public class MayorMenor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x,y,z,op = 1, vector[] = new int[3];
		
		System.out.print("Introduzca primer número: ");
        x = teclado.nextInt();
        System.out.print("Introduzca segundo número: ");
        y = teclado.nextInt();
        System.out.print("Introduzca tercer número: ");
        z = teclado.nextInt();
        System.out.println("Cómo desea ordenarlos?\n1.-Ascendente\n2.-Descendente");
        op = teclado.nextInt();
        vector[0] = x;
        vector[1] = y;
        vector[2] = z;
//        if (op == 1) {
//        	 for (int i = 0; i < vector.length; i++) {
//        		 for (int j = 0; j < vector.length - 1; j++) {
//        			 int elementoActual = vector[j],elementoSiguiente = vector[j + 1];
//        	         if (elementoActual > elementoSiguiente) {
//        	                vector[j] = elementoSiguiente;
//        	                vector[j + 1] = elementoActual;
//        	            }
//        	        }
//        	    }
//        	 System.out.println("Los elementos ordenados en forma ascendente son: ");
//        	 for (int numero : vector) {
//             	System.out.println(numero);
//             }
//        } else if (op == 2) {
//        	for (int i = 0; i < vector.length; i++) {
//       		 for (int j = 0; j < vector.length - 1; j++) {
//       			 int elementoActual = vector[j],elementoSiguiente = vector[j + 1];
//       	         if (elementoActual < elementoSiguiente) {
//       	                vector[j] = elementoSiguiente;
//       	                vector[j + 1] = elementoActual;
//       	            }
//       	        }
//        	}
//        	System.out.println("Los elementos ordenados en forma ascendente son: ");
//       	 	for (int numero : vector) {
//            	System.out.println(numero);
//            }
//        } else {
//    		System.out.println("Ingreso una opción inválida");
//    	}
        ordenamiento(vector,op);
	}
	
	public static void ordenamiento(int[] vector, int orden) {
		if (orden == 1) {
			for (int i = 0; i < vector.length; i++) {
       		 for (int j = 0; j < vector.length - 1; j++) {
       			 int elementoActual = vector[j],elementoSiguiente = vector[j + 1];
       	         if (elementoActual > elementoSiguiente) {
       	                vector[j] = elementoSiguiente;
       	                vector[j + 1] = elementoActual;
       	            }
       	        }
			}
			System.out.println("Los elementos ordenados en forma ascendente son: ");
       	 	for (int numero : vector) {
            	System.out.println(numero);
       	 	}
		} else if (orden == 2) {
			for (int i = 0; i < vector.length; i++) {
	       		 for (int j = 0; j < vector.length - 1; j++) {
	       			 int elementoActual = vector[j],elementoSiguiente = vector[j + 1];
	       	         if (elementoActual < elementoSiguiente) {
	       	                vector[j] = elementoSiguiente;
	       	                vector[j + 1] = elementoActual;
	       	            }
	       	        }
	        	}
	        	System.out.println("Los elementos ordenados en forma ascendente son: ");
	       	 	for (int numero : vector) {
	            	System.out.println(numero);
	            }
		} else {
			System.out.println("Ingreso una opción inválida");
		}
	}
}
