import java.util.Scanner;

public class Bucles04 {
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Hasta que numero listamos");
		int max = sc1.nextInt();
		
		for(int i = 1; i <= max; i++) {
			
			System.out.println(i);
	
		}
		sc1.close();
	}		
}