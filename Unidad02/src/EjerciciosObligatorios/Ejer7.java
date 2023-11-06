package EjerciciosObligatorios;

import java.util.Scanner;

/*
  * EJERCICIO 7 – ejer7.java
	Escribe un programa en Java que utilice 2 variables numéricas de modo que imprimirá:
	“Al principio del programa, el valor de a es “<a>” y el valor de b es “<b>.
	Luego, intercambiará las 2 variables e imprimirá:
	“Después del intercambio, el valor de a es “<a>” y el valor de b es “<b>.
 */
public class Ejer7 {

	public static void main(String[] args) {
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Introduce a: ");
        a = sc.nextInt();

        System.out.println("Introduce b: ");
        b = sc.nextInt();
        
        System.out.println("Al principio del programa, el valor de a es " + a + " y el valor de b es "+ b );
       
        c = a;
        a = b;
        b = c;
        
        System.out.println("Después del intercambio, el valor de a es " + a + " y el valor de b es "+ b );
        sc.close();

	}

}
