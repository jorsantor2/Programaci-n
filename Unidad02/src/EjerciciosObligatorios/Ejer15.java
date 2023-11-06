package EjerciciosObligatorios;
import java.util.Scanner;
/*
  * 
	EJERCICIO 15 – ejer15.java
	Escribe un programa en Java que utilice el valor de una variable numérica real <x> que representará el
	importe en euros de un producto. También utilizará 3 constantes de IVA General (21%), IVA Reducido
	(10%) e IVA Superreducido (4%).
	Luego imprimirá lo siguiente:
	“El importe de tu producto es de “ <x> “euros”.
	“Si tu producto tuviera un IVA General, su importe descontando el IVA sería : “ <resultado>”.
	“Si tu producto tuviera un IVA Reducido, su importe descontando el IVA sería: “ <resultado>”.
	“Si tu producto tuviera un IVA Superreducido, su importe descontando el IVA sería: “<resultado>”
 */
public class Ejer15 {

	public static void main(String[] args) {
		final double ivaGeneral = 0.21;
		final double ivaReducido = 0.1;
		final double ivaSuperreducido = 0.04;
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa x: ");
        double x = sc.nextDouble();
        
        double respuesta1 = (x - (x * ivaGeneral));
        double respuesta2 = (x - (x * ivaReducido));
        double respuesta3 = (x - (x * ivaSuperreducido));
        
        System.out.println("El importe de tu producto es de " + x + " euros");
		System.out.println("Si tu producto tuviera un IVA General, su importe descontando el IVA sería : " + respuesta1);
		System.out.println("Si tu producto tuviera un IVA Reducido, su importe descontando el IVA sería: " + respuesta2);
		System.out.println("Si tu producto tuviera un IVA Superreducido, su importe descontando el IVA sería: " + respuesta3);
		
		sc.close();
	}

}
