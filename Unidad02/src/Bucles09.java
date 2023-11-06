
public class Bucles09 {

	public static void main(String[] args) {
		
		int suma = 0;
		int prod = 1; 
		
		for(int i = 1; i <= 10; i++) {
			suma += i;
			prod *= i;
		}
		System.out.println("La suma es: " + suma + " El producto es: " + prod);
	}

}
