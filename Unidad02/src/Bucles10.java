import java.util.Scanner;

public class Bucles10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean sw = false; 
		int nota; 
		
		System.out.println("Introduce una nota: ");
		nota = sc.nextInt();
		
		while(nota != -1) {
			
			if(nota == 10){
				sw = true; 
			}
			
			System.out.println("Introduce una nota: ");
			nota = sc.nextInt();
		}
		if(sw == true ) {
			System.out.println("Hay al menos una nota de 10 ");
		}else {
			System.out.println("No hay notas de 10");
		}
		sc.close();
	}

}
