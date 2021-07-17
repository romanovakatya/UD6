
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// introduzco variables,
		Scanner teclado = new Scanner(System.in);
		int number;
		
		//pido un número,
		System.out.println("Escribe un número a comprobar");
		number = teclado.nextInt();
		
		//muestro el resultado si es primo o no,
		System.out.println(isPrimo(number));
		
		teclado.close();
	}
	
	//método que comprueba si el número es primo,
	//un número primo es aquel solo puede dividirse entre 1 y si mismo.
	public static boolean isPrimo(int number) {
		boolean isPrimo = true;
		
		if (number < 2) {
			isPrimo = false;
		}
		else {
			for (int i = 2; i*i <= number; i++) {
				
				if (number % i == 0) {
					
					isPrimo = false;					
				}
			}
		}
		
		return isPrimo;
	}

}
