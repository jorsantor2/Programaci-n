import java.util.Scanner;

public class Bucles07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pos = 0; 
		int neg = 0; 
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println("Introduce el numero  " + i + "/10 : ");
			int num = sc.nextInt();
			
			if(num < 0) {
				neg += 1;
			}else {
				pos += 1;
			}
		}
		
		System.out.println("Se han introducido " + pos + " Números Positivos");
		System.out.println("Se han introducido " + neg + " Números negativos");
		sc.close();
	}

}
