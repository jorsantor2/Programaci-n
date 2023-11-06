package EjerciciosObligatorios;
import java.util.Scanner;

/*
  * Escribe un programa que lea 2 datos enteros por teclado (a y b) y calcule el área de un triángulo. Al
	final imprimirá el mensaje:
	“El triángulo de base <b> y altura <a> tiene un área de <area>”
	 */
public class Ejer19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresa el valor de a: ");
        int a = sc.nextInt();

        System.out.print("Ingresa el valor de b: ");
        int b = sc.nextInt();
        
        double areaTriangulo = (b * a) / 2.0;
        
        System.out.println("El triangulo de base " + b + " y altura " + a + " tiene un área de " + areaTriangulo);
	}

}
