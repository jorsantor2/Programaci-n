import java.util.Scanner;

/*
  * Escribe un programa que muestre los números enteros de A a B (valores que se le
	piden al usuario) en orden inverso. Es decir, debe empezar por B (el mayor) y
	terminar por A (el menor).
 */
public class Ejer04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

        // Solicitar al usuario los valores de A y B
        System.out.print("Ingrese el valor de A: ");
        int A = sc.nextInt();

        System.out.print("Ingrese el valor de B: ");
        int B = sc.nextInt();

        // Asegurarse de que B sea mayor o igual que A
        if (B < A) {
            int temp = B;
            B = A;
            A = temp;
        }

        // Imprimir los números en orden inverso desde B hasta A
        System.out.println("Números en orden inverso desde " + B + " hasta " + A + ":");

        for (int i = B; i >= A; i--) {
            System.out.println(i);
        }

        sc.close();
		
	}

}
