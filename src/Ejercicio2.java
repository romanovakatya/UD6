import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// introduzco variables,
		Scanner teclado = new Scanner(System.in);
		int numeroNumeros;
		int valorMin;
		int valorMax;
		
		//pedimos cuantas números hay que generar,
		System.out.println("Cuantos números quieres generar?");
		numeroNumeros = teclado.nextInt();
		
		//pedimos número mínimo,
		System.out.println("Que valor mínimo?");
		valorMin = teclado.nextInt();
		
		//pedimos número máximo,
		System.out.println("Que valor máximo?");
		valorMax = teclado.nextInt();
		
		//generamos y mostramos numeros aleatorios tantas veces cuantas,
		//ha dicho usuario,
		for (int i = 0; i < numeroNumeros; i++) {
			System.out.println(generarNumeros (valorMin, valorMax));
		}
				
		teclado.close();		
	}
	
	//método que genera y devuelve un número aleatorio,
	//generado entre dos números introducidos como parametros,
	public static int generarNumeros (int valorMin, int valorMax) {
				
		return (int) Math.floor(Math.random() * (valorMax - valorMin + 1) + valorMin);
		
	}
}
