import java.util.Scanner;

/*
  * Escribe un programa en el que el usuario intenta adivinar el valor que saldrá al “tirar”
	un dado de 6 caras. Se le pedirá el valor al usuario, y luego se mostrará un número
	aleatorio entre 1 y 6. Por ultimo, se mostrará un mensaje indicando si el usuario
	acertó o no. (Para esto puedes usar el método math.random)
 */
public class Ejer01 {
	public static void main(String[] args) { 
		final int caras = 6;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el numero del dado que crees que va salir: ");
		int num1 = sc.nextInt();

		int dado = (int)(Math.random()*caras) + 1;

		if(num1 == dado) {
			System.out.println("Has adivinado el numero del dado!");
		}else {
			System.out.println("El numero introducido es incorrecto :(");		
		}

	}
}
