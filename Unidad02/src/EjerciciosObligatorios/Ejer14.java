package EjerciciosObligatorios;

import java.util.Scanner;

/*
 * Escribe un programa en Java que utilice el valor de 2 variables numéricas <a> y <b> e imprima
mensajes del siguiente modo:
“Vamos a utilizar las variables <a> y <b>”
“Si <a> fuera la altura y <b> la base de un triángulo, el área de ese triángulo sería <resultado>”.
“Si <a> fuera un lado de un cuadrado, su área sería <resultado>”.
“Si <a> fuera un radio de un círculo, su área sería <resultado>”.
 */
public class Ejer14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa a ");
        double a = sc.nextDouble();

        System.out.print("Ingresa b ");
        double b = sc.nextDouble();
        
        double areaTriangulo = (a * b) / 2;
        double areaCuadrado = a * a;
        double areaCirculo = Math.PI * Math.pow(a, 2);
        
        System.out.println("Vamos a utilizar las variables " + a + " y " + b);
		System.out.println("Si " + a + " fuera la altura y " + b + " la base de un triángulo, el área de ese triángulo sería " + areaTriangulo);
		System.out.println("Si " + a + " fuera un lado de un cuadrado, su área sería " + areaCuadrado);
		System.out.println("SI " + a + " fuera un radio de un círculo, su área sería " + areaCirculo);
		
		sc.close();
	}

}
