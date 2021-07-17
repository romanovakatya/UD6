import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		// introduzco variables,
		Scanner teclado = new Scanner(System.in);
		int valorMin;
		int valorMax;
		int arraySize;
		int[] arrayNumbers;

		// pedimos el tamaño de array,
		System.out.println("De que tamaño crear array?");
		arraySize = teclado.nextInt();

		// inicializamos el array del tamaño elegido por usuario,
		arrayNumbers = new int[arraySize];
		
		//pedimos número máximo y mínimo para crear aleatorios,
		System.out.println("Que valor mínimo?");
		valorMin = teclado.nextInt();
		
		//pedimos número máximo,
		System.out.println("Que valor máximo?");
		valorMax = teclado.nextInt();
		
		//rellenamos el array de números aleatorios primos,
		fillArray(arrayNumbers, valorMin, valorMax);
		//fillArray(arrayNumbers, 0, 20);
					
		//mostramos contenido de array,
		showArray(arrayNumbers);
		
		//mostramos el máximo,
		System.out.println("El número máximo es: " + maxNumber(arrayNumbers) );

		teclado.close();
	}
	

	// método para rellenar array,
	public static void fillArray(int[] arrayNumbers,int valorMin, int valorMax) {

		for (int i = 0; i < arrayNumbers.length; i++) {

			arrayNumbers[i] = generateRandomPrimeNumber(valorMin, valorMax);
		}		
	}

	
	// método que genera número aleatorio y lo comprueba si es primo,
	public static int generateRandomPrimeNumber(int valorMin, int valorMax) {
		int randomNumber;

		do {			
			randomNumber = (int) Math.floor(Math.random() * ((valorMax - valorMin) + 1) + valorMin);
			
		} while (!isPrimo(randomNumber));

		return randomNumber;		
	}
	

	// método que comprueba si el número es primo,
	// un número primo es aquel solo puede dividirse entre 1 y si mismo.
	public static boolean isPrimo(int number) {
		boolean isPrimo = true;

		if (number < 2) {
			isPrimo = false;
		} 
		else {
			for (int i = 2; i * i <= number; i++) {

				if (number % i == 0) {

					isPrimo = false;
				}
			}
		}

		return isPrimo;
	}

	
	// método para mostrar un array,
	public static void showArray(int[] arrayNumbers) {
		for (int i = 0; i < arrayNumbers.length; i++) {
			System.out.println(arrayNumbers[i]);
		}
	}
	
	
	// método que busca el número máximo en un array,
	public static int maxNumber(int[] arrayNumbers) {
		
		int max = arrayNumbers[0];
		
		for (int i = 0; i < arrayNumbers.length; i++) {
			if (arrayNumbers[i] > max) {
				max = arrayNumbers[i];
			}
		}						
		return max;
	}
}
