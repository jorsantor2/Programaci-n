package EjerciciosObligatorios;

import java.math.*;
import java.util.Scanner; 

/*
  * Escribe un programa en Java que utilice el valor de una variable entera para almacenar la edad del
	usuario.
	-Luego, dividirá el año del descubrimiento de América por esa <edad>.
	-Al cociente se le restará el número de grand slams ganados por Nadal.
	-El resultado de la resta anterior es el cuadrado del número secreto. resta = numSecreto² numSecreto= Square(resta)
	-Imprimirá por pantalla “El número secreto es...” <resultado>.
 */
public class EJer9 {

	public static void main(String[] args) {
		
		int edad; 
		int america = 1492;
		int grandSlams = 22;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad" );
		edad = sc.nextInt();
		
		double div = america / edad;
		double resta = div - grandSlams;
		double numSecreto = Math.sqrt(resta);
		System.out.println("El número secreto es" + numSecreto);
		
		sc.close();
		
		
	}

}
