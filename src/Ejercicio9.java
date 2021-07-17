import java.util.Scanner;

public class Ejercicio9 {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		// introduzco variables,
		int[] arrayNumbers;

		// rellenamoslo con número aleatorios de 0 a 9,
		arrayNumbers = fillArray(0, 9);

		// mostramos valores y suma de todos,
		showArray(arrayNumbers);

		teclado.close();
	}

	// método para rellenar array,
	public static int[] fillArray(int valorMin, int valorMax) {

		int arraySize;
		int[] arrayNumbers;

		// pedimos el tamaño de array,
		System.out.println("De que tamaño quieres array?");
		arraySize = teclado.nextInt();

		// inicializamos el array del tamaño elegido por usuario,
		arrayNumbers = new int[arraySize];

		for (int i = 0; i < arrayNumbers.length; i++) {
			arrayNumbers[i] = (int) Math.floor(Math.random() * ((valorMax - valorMin) + 1) + valorMin);
		}
		return arrayNumbers;
	}

	// método para mostrar un array y suma de sus valores,
	public static void showArray(int[] arrayNumbers) {
		int sum = 0;
		for (int i = 0; i < arrayNumbers.length; i++) {
			System.out.println(arrayNumbers[i]);
			sum += arrayNumbers[i];
		}

		System.out.println("Suma de los todos valores: " + sum);
	}

}
