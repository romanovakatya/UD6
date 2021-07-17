import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		// introduzco variables,
		Scanner teclado = new Scanner(System.in);
		int arraySize;
		int[] arrayNumbers1;
		int[] arrayNumbers2;
		int[] arrayNumbers3;

		
		// pedimos el tamaño de array,
		System.out.println("Diga el tamaño de array");
		arraySize = teclado.nextInt();

		
		// inicializamos los arrays del tamaño elegido por usuario,
		arrayNumbers1 = new int[arraySize];
		arrayNumbers2 = new int[arraySize];
		arrayNumbers3 = new int[arraySize];

		
		// rellenamos primer array con números aleatorios,
		fillArray(arrayNumbers1, 2, 15);
		System.out.println("Array 1:");
		showArray(arrayNumbers1);
		
		
		// array2 apunta al array1,
		arrayNumbers2 = arrayNumbers1;
		System.out.println("Array 2:");
		showArray(arrayNumbers2);

		
		// reasignamos los valores del segundo array con valores aleatorios,
		fillArray(arrayNumbers2, 3, 29);

		System.out.println("Array 2:");
		showArray(arrayNumbers2);
		
		System.out.println("Array 1:");
		showArray(arrayNumbers1);
		
		arrayNumbers3 = arrayMultiplicado(arrayNumbers1, arrayNumbers2);
		System.out.println("Array 3:");
		showArray(arrayNumbers3);

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
	
	
	//método que devuelva un array que contiene los valores,
	//de otros dos arrays multiplicados entre si sucesivamente,
	
	public static int[] arrayMultiplicado(int[] arrayNumbers1, int[] arrayNumbers2) {
		int[] arrayNewNumbers = new int [arrayNumbers1.length];
		
		for (int i = 0; i < arrayNumbers1.length; i++) {

			arrayNewNumbers[i] = (arrayNumbers1[i] * arrayNumbers2[i]);
						
		}
		
		return arrayNewNumbers;
	}

}
