package EjerciciosObligatorios;
import java.math.*;
import java.util.Scanner;

/*
  * Utilizando la clase Math, escribe un programa que pida al usuario dos
	números decimales (A y B) y muestre por pantalla:
	1. A redondeado al entero más próximo.
	2. B redondeado al entero más próximo.
	3. El menor de ambos (su valor).
	4. Un número aleatorio entre A y B (Una vez redondeados)
 */

public class Ejer02Exam {

	public static void main(String[] args) {
		double a,b; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor de a: ");
	    a = sc.nextDouble();
	    
	    System.out.println("Introduce el valor de b: ");
	    b = sc.nextDouble();
	    
	    double aRedondeado = Math.round(a); 
	    double bRedondeado = Math.round(b);
	    double menorDeAmbos = Math.min(a, b);
	    
	    //Esto funciona siempre que A sea mayor a B:
	    //double aleatorio = menorDeAmbos + Math.random()*(aRedondeado - bRedondeado);
	   
	    double mayorDeAmbos = Math.max(a, b);
	    double aleatorio = Math.random()*(mayorDeAmbos - menorDeAmbos) + menorDeAmbos;
	    
	    System.out.println("A redondeado al entero más próximo es: " + aRedondeado);
	    System.out.println("B redondeado al entero más próximo es: " + bRedondeado);
	    System.out.println("El menor de ambos (su valor) es: " + menorDeAmbos);
	    System.out.println("Un número aleatorio entre " + a + " y " + b + " es: " + aleatorio );
	    
	    sc.close();
	}

}
