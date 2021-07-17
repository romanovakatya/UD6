import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// introduzco variables,
		Scanner teclado = new Scanner(System.in);
		int numeroDecimal;

		// pido un número que convertirá a binario,
		System.out.println("Diga un número");
		numeroDecimal = teclado.nextInt();

		// muestro resultado,
		System.out.println(
				"El número " + numeroDecimal + " es " + reverse(convertToBinary(numeroDecimal)) + " en sistema binario");

		teclado.close();
	}

	//recursion que convierte un número decimal a binario,
	public static String convertToBinary(int numeroDecimal) {

		if (numeroDecimal == 0) {
			return "0";
		} 
		else if (numeroDecimal == 1) {
			return "1";
		} 
		else {
			return (numeroDecimal % 2) + convertToBinary(numeroDecimal / 2);
		}
	}

	//método para hacer el String reversal,
	public static String reverse(String binario) {
		if (binario.isEmpty()) {
			return "";
		} 
		else {
			return reverse(binario.substring(1)) + binario.charAt(0);
		}
	}
}
