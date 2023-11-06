package EjerciciosObligatorios;
import java.math.*;
import java.util.Scanner;

/*
  * Escribe un programa en Java que encuentre la solución al siguiente problema:
	Patricia, Elena y Oscar van al cine, cuya entrada cuesta 9 € en Kinépolis.
	-Patricia compra palomitas, que le cuestan 6 €, un refresco por valor de la mitad de lo que le cuestan las
	palomitas y dulces por el cubo de lo que cuesta el refresco.
	-Elena pide lo mismo que Patricia.
	-Oscar solo compra el mismo refresco que ha comprado Patricia.
	El programa imprimirá un mensaje con el total gastado por los 3 amigos del siguiente modo:
	“Patricia ha gastado <dinero_Patricia> euros”
	“Elena ha gastado <dinero_Elena> euros”
	“Oscar ha gastado <dinero_Oscar> euros”
	“En total la broma les ha salido por <dinero_Patricia> + <dinero_Elena> + <dinero_Oscar> euros”.
 */
public class Ejer13 {

	public static void main(String[] args) {
		double dineroElena, dineroPatricia, dineroOscar;
		double entrada = 9;
		double palomitas = 6;
		double refresco = palomitas/2;
		double dulces = Math.pow(refresco, 3);
		
		dineroPatricia = (entrada + palomitas + refresco + dulces);
		dineroElena = dineroPatricia; 
		dineroOscar = (entrada + refresco); 
		double dineroTotal = dineroPatricia + dineroElena + dineroOscar;
		
		System.out.println("Patricia ha gastado " + dineroPatricia + " euros");
		System.out.println("Elena ha gastado " + dineroElena + " euros");
		System.out.println("Oscar ha gastado " + dineroOscar + " euros");
		System.out.println("En total la broma les ha salido por " + dineroTotal + " euros");
	}

}
