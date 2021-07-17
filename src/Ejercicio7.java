import java.util.Scanner;

public class Ejercicio7 {

	public final static double DOLAR = 1.28611;
	public final static double YENE = 129.852;
	public final static double LIBRA = 0.86;
	
	public static void main(String[] args) {
		
		// introduzco variables,
		Scanner teclado = new Scanner(System.in);
		String [] menuConvert = {"Eliga la moneda: ", "\n1. Dolar", "2. Yene", "3. Libra"};
		int value;
		String coin;
		
		//pido cantidad de euros,
		System.out.println("Cuantos euros vas a convertir?");
		value = teclado.nextInt();
		
		//pido eligir moneda,
		showMenu(menuConvert);		
		coin = teclado.next();
		
		//muestro resultado,
		convertEuro(value, coin);

		teclado.close();
	}

	//método que convierte euros a moneda elegida,
	public static void convertEuro(int value, String coin) {
		
		switch (coin) {
		case "1":
			System.out.println(value + " euros son " + (value * DOLAR) + " dolares");
			break;
		case "2":
			System.out.println(value + " euros son " + (value * YENE) + coin + " yenes");
			break;
		case "3":
			System.out.println(value + " euros son " + (value * LIBRA) + coin + " libras");
			break;

		default:
			System.out.println("Moneda introducida no está disponible para realizar convertación");
			break;
		}		
	}
	
	//para mostrar menu de monedas,
	public static void showMenu(String [] menuConvert) {
		for (int i = 0; i < menuConvert.length; i++) {
			System.out.println(menuConvert[i]);
		}
	}
}
