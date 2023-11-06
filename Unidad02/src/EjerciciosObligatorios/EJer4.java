package EjerciciosObligatorios; // Declaración del paquete Java

import java.util.Scanner; // Importación de la clase Scanner para entrada de datos

public class EJer4 { // Declaración de la clase EJer4

	public static void main(String[] args) { // Método principal
		
		int var; // Declaración de una variable para almacenar el número ingresado
		Scanner sc = new Scanner(System.in); // Creación de un objeto Scanner para la entrada de datos
		System.out.println("Introduce el número del que deseas obtener la tabla de multiplicar:  ");
		var = sc.nextInt(); // Lectura de un número entero ingresado por el usuario
		
		// Bucle for que itera desde 1 hasta 10
		for(int i = 1; i <= 10; i++) {
			// Se calcula y se imprime la multiplicación y el resultado
			System.out.println(var + " x " + i + " = " + (var * i));
		}
		
		sc.close(); // Cierre del objeto Scanner para liberar recursos

	}

}

