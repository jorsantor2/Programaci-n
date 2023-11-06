package EjerciciosObligatorios;
import java.util.Scanner;

/*
  * Escribe un programa que calcule el total de una factura que tendrá siempre 5 conceptos distintos y que
	tendrá un descuento.
	Para ello, el programa pedirá por teclado:
	- El nombre del cliente.
	- El NIF.
	- El domicilio.
	- 5 líneas con los datos:
	- Cantidad
	- Concepto
	- Precio
	- Importe
	- Porcentaje del descuento
 */

public class Ejer20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce tu NIF: ");
		String nif = sc.nextLine();
		
		System.out.println("Introduce tu domicilio: ");
		String domicilio = sc.nextLine();
		
		System.out.println("Introduce la cantidad: ");
		double cantidad = sc.nextDouble();
		
		System.out.println("Introduce el precio: ");
		double precio = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Introduce el concepto: ");
		String concepto = sc.nextLine();
		
		System.out.println("Introduce el importe: ");
		double importe = sc.nextDouble();
		
		System.out.println("Introduce el  descuento: ");
		double descuento = sc.nextDouble();
		
		double total = (importe + (importe * (descuento/100.0)));
		
		System.out.println("=====================================================================================");

		System.out.printf("CLIENTE: %s \t\t\t\t N.I.F: %s \n", nombre, nif);

		System.out.printf("DOMICILIO: %s \n", domicilio);

		System.out.println("=====================================================================================");

		System.out.printf("CANTIDAD \t CONCEPTO \t\t PRECIO \t\t IMPORTE \n");

		System.out.printf("%f \t %s \t\t\t %f \t\t %f \n", cantidad, concepto, precio, importe);

		System.out.println("=====================================================================================");

		System.out.printf("\t\t\t\t TOTAL BRUTO \t DESCUENTO \t TOTAL \n");

		System.out.printf("\t\t\t\t %f \t %f%% \t %f", importe, descuento, total);
	}

}
