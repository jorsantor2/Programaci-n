import java.util.Scanner;

public class Bucles08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pos = 0; 
		int neg = 0; 
		int num; 
		
		System.out.println("Introduce el numero  ");
		num = sc.nextInt();
		
		while(num != 0) {
			if(num < 0) {
				neg += 1;
			}else {
				pos += 1;
			}
			System.out.println("Introduce el numero  ");
			num = sc.nextInt();
		}
		
		System.out.println("Se han introducido " + pos + " Números Positivos");
		System.out.println("Se han introducido " + neg + " Números negativos");
		sc.close();
	}

}
