package EjerciciosObligatorios;
import java.util.Scanner;

/*
  * Escribe un programa que pida al usuario la nota final de 3 evaluaciones del
	módulo de Programación (números enteros) y muestre por pantalla la nota
	media (con 2 decimales).
 */

public class Ejer01Exam {

	public static void main(String[] args) {
		//Declaramos variables y abrimos Scanner
		int nota1, nota2, nota3;
		Scanner sc = new Scanner(System.in);
		
		//Pedimos datos por teclado y leemos
	    System.out.println("Introduce la nota final de la evaluacion 1: ");
	    nota1 = sc.nextInt();
	    
	    System.out.println("Introduce la nota final de la evaluacion 2: ");
	    nota2 = sc.nextInt();
	    
	    System.out.println("Introduce la nota final de la evaluacion 3: ");
	    nota3 = sc.nextInt();
	    
	    double media = (((double)nota1 + nota2 + nota3) / 3); 
	    
	    System.out.printf("La nota media es: %.2f ", media);
	    
	    sc.close();
	    
	}

}
