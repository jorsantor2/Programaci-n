import java.util.Scanner;
public class Ejer15 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduce 3 numeros");
		int n1 = sc1.nextInt();
		int n2 = sc1.nextInt();
		int n3 = sc1.nextInt();
		if (n1>n2) {
			if(n1>n3) {
				System.out.println("El mayor es " + n1);
			}else {
				System.out.println("El mayor es " + n3);
			}
		}else {
			if(n2>n3) {
				System.out.println("El mayor es " + n2);
			}else {
				System.out.println("El mayor es " + n3);
			}
		}
	}

}
