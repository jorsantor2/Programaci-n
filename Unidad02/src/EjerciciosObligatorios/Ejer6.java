package EjerciciosObligatorios;

import java.math.*;
import java.util.Scanner; 

public class Ejer6 {
    
	public static void main(String[] args) {

        double a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce a: ");
        a = sc.nextDouble();

        System.out.println("Introduce b: ");
        b = sc.nextDouble();

        System.out.println("Introduce c: ");
        c = sc.nextDouble();

        double contenidoRaiz = (Math.pow(b, 2) - 4 * a * c);

        if (contenidoRaiz >= 0) {
            double Raiz1 = (-b + Math.sqrt(contenidoRaiz)) / (2 * a);
            double Raiz2 = (-b - Math.sqrt(contenidoRaiz)) / (2 * a);

            System.out.println("El valor de x1 siendo a= " + a + " b = " + b + " c = " + c + " es igual a " + Raiz1);
            System.out.println("El valor de x2 siendo a= " + a + " b = " + b + " c = " + c + " es igual a " + Raiz2);
        } else {
            System.out.println("Las raíces son complejas.");
        }

        sc.close();
    }
}
