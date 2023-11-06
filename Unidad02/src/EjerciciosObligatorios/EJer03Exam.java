package EjerciciosObligatorios;
import java.util.Scanner;
/*
  * En una tienda online tienen una oferta en la que al comprar 5 productos se
	obtiene un descuento del 10%. Los precios están indicados sin IVA por lo
	que tras el descuento hay que aplicar el IVA (21%). Escribe un programa
	que pida al usuario el precio de 5 productos y luego muestre la siguiente
	linea:
	1. La suma total de los cinco precios introducidos.
	2. El valor en € del descuento a aplicar.
	3. La suma total tras el descuento.
	4. El valor en € del IVA a aplicar.
	5. El precio final tras aplicar el IVA.
 */
public class EJer03Exam {

	public static void main(String[] args) {
		
		double producto1, producto2, producto3, producto4, producto5;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor del producto1: ");
	    producto1 = sc.nextDouble();
	    
	    System.out.println("Introduce el valor del producto2: ");
	    producto2 = sc.nextDouble();
	    
	    System.out.println("Introduce el valor del producto3: ");
	    producto3 = sc.nextDouble();
	    
	    System.out.println("Introduce el valor del producto4: ");
	    producto4 = sc.nextDouble();
	    
	    System.out.println("Introduce el valor del producto5: ");
	    producto5 = sc.nextDouble();
		
		double sumaTotal = producto1 + producto2 + producto3 + producto4 + producto5;
	    double valorDelDescuento = sumaTotal * 0.1;
	    double descuentoSinIva = sumaTotal - valorDelDescuento;
	    double valorDelIva = descuentoSinIva * 0.21;
	    double precioConIva = descuentoSinIva + valorDelIva;
	    
	    System.out.println("La suma total de los cinco precios introducidos es: " + sumaTotal);
	    System.out.println("El valor en € del descuento a aplicar es: " + valorDelDescuento);
	    System.out.println("La suma total tras el descuento es: " + descuentoSinIva);
	    System.out.println("El valor en € del IVA a aplicar es: " + valorDelIva );
	    System.out.println("El precio final tras aplicar el IVA es: " + precioConIva);
	    
	    sc.close();
	}

}
