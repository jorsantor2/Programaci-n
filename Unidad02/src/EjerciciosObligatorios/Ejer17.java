package EjerciciosObligatorios;
import java.util.Scanner;
public class Ejer17 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		    System.out.print("Introduce un valor en MB: ");
		    double mb = sc.nextDouble();
		    
		    double kb = mb * 1024;
		    double by = kb * 1024;
		    double gb = kb / 1024;
		    double tb = gb / 1024;

		    System.out.printf("| BY \t\t| KB \t\t| MB \t\t| GB \t\t| TB\n");
		    System.out.printf("======================================================================\n");
		    System.out.printf("|%.2f \t| %.2f \t| %.2f \t| %.2f \t| %.2f\n", by, mb, kb, gb, tb);
		    
		    sc.close();
		  }
	}

