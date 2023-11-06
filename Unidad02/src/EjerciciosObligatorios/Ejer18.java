package EjerciciosObligatorios;

public class Ejer18 {

	public static void main(String[] args) {
		String [] palabras_ingles = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
		String [] palabras_español = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
		
		System.out.printf("Ingles \tEspañol \n");
		for(int i = 0; i < 10; i++) {
			System.out.printf("%s, \t%s \n", palabras_ingles[i], palabras_español[i]);
		}
	}

}
