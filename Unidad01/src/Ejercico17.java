import java.util.Scanner;
public class Ejercico17 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in); // Declaro mi variable sc1 de tipo Scanner
		
		System.out.println("Introduce una hora menor a 24"); //Muestro al usuario lo que debe introducir
		short hora = sc1.nextShort(); // Declaro la hora que introducira el usuario
		
		System.out.println("Introduce unos minutos minutos menor a 60"); //Muestro al usuario lo que debe introducir
		short minutos = sc1.nextShort(); // Declaro  los minutos que introducira el usuario
		
		System.out.println("Introduce unos segundos menor a 60"); //Muestro al usuario lo que debe introducir
		short segundos = sc1.nextShort(); // Declaro los segundos que introducira el usuario 
		
		sc1.close();
		
		if (segundos == 59 ) {
			segundos = 0;
			if (minutos == 59) {
				minutos = 0;
				if(hora == 23) {
					hora = 0;
				}else {
					hora++;
				}
			}else {
				minutos++;
			}
		}else {
			segundos++;
		} 
		System.out.println("La hora es: " + hora + " los minutos son: " + minutos + " los segundos son: "+ segundos);
	}

}
