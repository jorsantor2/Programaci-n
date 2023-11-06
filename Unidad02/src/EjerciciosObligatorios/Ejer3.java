package EjerciciosObligatorios; // Declaración del paquete Java

import java.util.Scanner; // Importación de la clase Scanner para entrada de datos

public class Ejer3 { // Declaración de la clase Ejer3

	public static void main(String[] args) { // Método principal
		
		// Declaración de variables para almacenar información personal
		String nif, nombre, fechaNacimiento, dirección, población;
		int cp, teléfonoFijo, teléfonoMóvil; 
		
		// Creación de objetos Scanner para la entrada de datos
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu NIF: ");
		nif = sc.nextLine();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		nombre = sc.nextLine();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Introduce tu fecha de nacimiento: ");
		fechaNacimiento = sc.nextLine();
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Introduce tu dirección: ");
		dirección = sc.nextLine();
		
		Scanner sc5 = new Scanner(System.in);
		System.out.println("Introduce tu población: ");
		población = sc.nextLine();
		
		Scanner sc6 = new Scanner(System.in);
		System.out.println("Introduce tu código postal: ");
		cp = sc.nextInt();
		
		Scanner sc7 = new Scanner(System.in);
		System.out.println("Introduce tu teléfono fijo: ");
		teléfonoFijo= sc.nextInt();
		
		Scanner sc8 = new Scanner(System.in);
		System.out.println("Introduce tu teléfono móvil ");
		teléfonoMóvil = sc.nextInt();

		// Impresión de datos personales recopilados
		System.out.println("El alumno " + nombre + "de NIF " + nif + ", nació el " + fechaNacimiento + " y reside actualmente en " + dirección + ", " + cp + ", " + población + ". Sus teléfonos de contacto son: " + teléfonoFijo + " y " + teléfonoMóvil + ".");
		
		// Cierre de los objetos Scanner
		sc.close();
		sc2.close();
		sc3.close();
		sc4.close();
		sc5.close();
		sc6.close();
		sc7.close();
		sc8.close();

	}
}
