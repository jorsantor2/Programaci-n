import java.util.Scanner;

public class Bucles05 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("FACTORIAL DE : ");
		
		int num = sc1.nextInt();
		int fact = 1;
		
		for( int i = 1; i <= num; i++) {
			fact *= i;
			
		}
		System.out.println("El factorial es = " + fact);
		
		sc1.close();
	}
	
}
