import java.util.Scanner; 

public class Bucles06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numMax = 10;
		boolean sw = false;
	
		for(int i = 1; i <= numMax; i++) {
			System.out.println("Introduce el numero  " + i + "/" + numMax + ": ");
			int num = sc.nextInt();
				
			if(num < 0) {
				sw = true; 
			}
		}
	
		if(sw == false) {
			System.out.println("NO");
		}
		
		System.out.println("Se han introducido numeros negativos");
		sc.close();
		
	}

}
