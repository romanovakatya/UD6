import java.util.Scanner;

public class Ejercicio8 {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// introduzco variables,		
		int [] arrayNumbers = new int [10];
		
		//relleno array de lo número que introduce usuario por teclado,
		fillArray(arrayNumbers);
		
		//muestro indices de array y que valor corresponde a cada uno,
		showArray(arrayNumbers);
		
		teclado.close();
	}

	//método para rellenar array,
	public static void fillArray(int [] arrayNumbers) {
	
		for (int i = 0; i < arrayNumbers.length; i++) {
			System.out.println("Escribe un número");
			arrayNumbers[i] = teclado.nextInt();
		}		
	}
	
	//método para mostrar un array,
	public static void showArray(int [] arrayNumbers) {
		for (int i = 0; i < arrayNumbers.length; i++) {
			System.out.println("El indice " + i + ": valor " + arrayNumbers[i]);
		}
	}
}
