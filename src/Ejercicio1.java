import java.util.Scanner;

public class Ejercicio1 {
	
	public final static double PI = Math.PI;
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		// introduzco variables,		
		String figura;						
		String [] menuFiguras = {
				"\nElige una figura:", "1 : circulo",
				"2 : cuadrado", "3 : triangulo"
		};
				
		//pedimos elegir una figura,
		showMenu(menuFiguras);
		
		figura = teclado.next();
		
		//según la opción elegida calculamos y mostramos area,
		if (figura.equalsIgnoreCase("1")) {
			showAreaCirculo();
		}
		else if(figura.equalsIgnoreCase("2")) {
			showAreaCuadrado();
		}
		else if(figura.equalsIgnoreCase("3")) {
			showAreaTriangulo();
		}
		//o mensaje de error,
		else {
			System.out.println("No existe la figura introducida. Adiós");
		}
						
		teclado.close();
	}
	
	//método para mostrar menu de figuras,
	public static void showMenu(String [] menu) {
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
	}
	
	//método que pide datos para area de un circulo y muestra resultado,
	public static void showAreaCirculo() {
		double radio;
		
		System.out.println("Introduce el radio de circulo");
		radio = Double.parseDouble(teclado.next());
		System.out.println("Area del circulo con radio = " + radio + " es: " + areaCirculo(radio));
	}
	
	//método que calcula y devuelve area de un circulo,
	public static double areaCirculo(double radio) {

		return Math.pow(radio, 2) * PI;
	}
	
	//método que pide datos para area de un cuadrado y muestra resultado,
	
	public static void showAreaCuadrado() {
		int lado;
		
		System.out.println("Introduce un lado de cuadrado");
		lado = Integer.parseInt(teclado.next());
		System.out.println("Area del cuadrado con lado = " + lado + " es: " + areaCuadrado(lado));
	}
	
	//método que calcula y devuelve area de un cuadrado,
	public static int areaCuadrado(int lado) {
		return (lado * lado);
	}
	
	//método que pide datos para area de un triangulo y muestra resultado,
	
	public static void showAreaTriangulo() {
		int base;
		int altura;
		
		System.out.println("Introduce la base de triangulo");
		base = Integer.parseInt(teclado.next());
		
		System.out.println("Introduce la altura de triangulo");
		altura = Integer.parseInt(teclado.next());
		
		System.out.println("Area del triangulo con la base = " + base + " y altura = " + altura + " es: " + areaTriangulo(base, altura));
	}

	//método que calcula y devuelve area de un triangulo,
	public static int areaTriangulo(int base, int altura) {
		return (base * altura) / 2;
	}		
}
