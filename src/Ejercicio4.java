import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// introduzco variables,
		Scanner teclado = new Scanner(System.in);
		int number;

		//pido un número,
		System.out.println("Introduce un número");
		number = teclado.nextInt();

		//muestro su factorial,
		System.out.println("Factorial del número " + number + " es :" + calcularFactorial(number));

		teclado.close();
	}

	//método que calcula factorial de un número,
	//factorial es 5*4*3*2*1
	public static int calcularFactorial(int number) {

		int factorial = number;

		for (int i = number; i > 1; i--) {
						
			factorial = factorial * (i-1);			
		}
		return factorial;
	}
}
