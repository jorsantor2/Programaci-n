package EjerciciosObligatorios;
import java.util.Scanner;
public class Ejer16 {

	public static void main(String[] args) {
		// Crea dos variables para almacenar los números introducidos por el usuario
        int x, y;

        // Pide al usuario que introduzca los números
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce x:");
        x = scanner.nextInt();
        System.out.println("Introduce y:");
        y = scanner.nextInt();

        // Realiza las operaciones
        int s = x + y;
        int r = x - y;
        int p = x * y;
        double c = (double)(x / y);

        // Muestra los resultados
        System.out.printf("\t\tSUMAR \tRESTAR \tPRODUCTO \tCOCIENTE \n");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("x=%d y=%d \t%d \t%d \t%d \t\t%f \n", x, y, s, r, p, c);
        System.out.println("---------------------------------------------------------------");
        
	}

}
