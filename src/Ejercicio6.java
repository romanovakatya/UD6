import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// introduzco variables,
		Scanner teclado = new Scanner(System.in);
		long number;
		
		
		//pedimos un número y hacemos su comprobación si es positivo,
		do {
			System.out.println("Introduce un número entero positivo");
			number = teclado.nextLong();
		} while (number <= 0);

		//mostramos el resultado,
		System.out.println("Número " + number + " tiene " + numeroDeCifras(number) + " dígitos");
		
		teclado.close();

	}

	//método que cuenta cuantos dígitos tiene un número,
	public static int numeroDeCifras(long number) {

		int contador = 0;
		
		while (number != 0) {
			number = number / 10;
			contador++;
		}
		return contador;
	}
}
