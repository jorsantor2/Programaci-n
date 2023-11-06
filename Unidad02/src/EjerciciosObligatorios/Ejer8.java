package EjerciciosObligatorios;

import java.math.*;
import java.util.Scanner; 

/*
  * Escribe un programa en Java que utilice 2 variables enteras, de modo que imprimirá:
	“Bienvenido a mi calculadora”.
	“El valor de a es : “ <a>
	“El valor de b es : “<b>
	“a + b = “ <a + b>
	“a – b = “ <a – b>
	“a x b = “ <a x b>
	“a / b = “ <a / b>
	“a % b = “ <a % b>
 */
public class Ejer8 {

	public static void main(String[] args) {
		
		final int a, b;
		
		System.out.println("Bienvenido a mi calculadora");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor de a" );
		a = sc.nextInt();
		System.out.println("El valor de a es : " + a );
        
		System.out.println("Introduce el valor de b" );
        b = sc.nextInt();
        System.out.println("El valor de b es : " + b);
        
        int res1 = a + b;
        int res2 = a - b;
        int res3 = a * b;
        float res4 = a / b;
        float res5 = a % b;
        
        System.out.println("a + b = " + res1);
        System.out.println("a – b = " + res2);
        System.out.println("a x b = " + res3);
        System.out.println("a / b = " + res4);
        System.out.println("a % b = " + res5);
        
        sc.close();
        
	}

}
