import java.util.Scanner;

public class Ejercicio12 {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		// introduzco variables,

		int arraySize;
		int[] arrayNumbers;
		int[] arrayNumbersWithDigit;
		int digit;

		// pedimos el tamaño de array,
		System.out.println("De que tamaño crear array?");
		arraySize = teclado.nextInt();

		
		// inicializamos el array del tamaño elegido por usuario,
		arrayNumbers = new int[arraySize];

		
		// rellenamos array con números aleatorios de 1 a 300,
		// y mostramoslo,
		fillArray(arrayNumbers, 1, 300);
		showArray(arrayNumbers);

		
		// hacemos comprobación si dígito está entre 0 y 9,
		digit = correctDigit();

		
		// rellenamos un array de número que tienen el dígito introducido,
		// como el último dígito,
		arrayNumbersWithDigit = arrayNumbersWithLastDigit(arrayNumbers, digit);

		
		// comprobamos si array no está vacio y,
		// mostramos su contenido,
		if (arrayNumbersWithDigit.length > 0) {
			showArray(arrayNumbersWithDigit);
		}
		// o mostramos el error,
		else {
			System.out.println("En array no existen números que acaban en " + digit);
		}

		teclado.close();
	}

	
	
	// método para rellenar array de números aleatorios,
	public static void fillArray(int[] arrayNumbers, int valorMin, int valorMax) {

		for (int i = 0; i < arrayNumbers.length; i++) {

			arrayNumbers[i] = (int) Math.floor(Math.random() * ((valorMax - valorMin) + 1) + valorMin);
		}
	}

	// método para mostrar un array,
	public static void showArray(int[] arrayNumbers) {
		for (int i = 0; i < arrayNumbers.length; i++) {
			System.out.println(arrayNumbers[i]);
		}
		System.out.println("");
	}

	
	// método que devuelve un array de numeros que acaban en un dígito especificado,
	
	public static int[] arrayNumbersWithLastDigit(int[] arrayNumbers, int digit) {

		int[] arrayNumbersAdequate;
		int contador = 0;

		//contamos números que acaban en un dígito especificado,
		//para inicializar un array,
		for (int i = 0; i < arrayNumbers.length; i++) {

			if ((arrayNumbers[i] % 10) == digit) {

				contador++;
			}
		}

		arrayNumbersAdequate = new int[contador];

		//rellenamos y devolvemos un array con números que contienen el dígito especificado,
		//como último dígito,
		for (int i = 0; i < arrayNumbers.length; i++) {

			if ((arrayNumbers[i] % 10) == digit) {
				arrayNumbersAdequate[arrayNumbersAdequate.length - contador] = arrayNumbers[i];
				contador--;
			}
		}

		return arrayNumbersAdequate;
	}

	
	//método que comprueba y devuelve un dígito correcto
	//entre 0 y 9,
	public static int correctDigit() {

		int digit;
		// pedimos un dígito,
		System.out.println("Introduce un dígito");
		digit = teclado.nextInt();

		while (digit < 0 || digit > 9) {
			System.out.println("Valor del dígito es incorrecto.");
			System.out.println("Introduce un dígito nuevo.");
			digit = teclado.nextInt();
		}

		return digit;
	}

}
