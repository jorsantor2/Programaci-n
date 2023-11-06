package EjerciciosObligatorios;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número de votos para Podemos: ");
        int votosPodemos = sc.nextInt();

        System.out.print("Ingresa el número de votos para PSOE: ");
        int votosPsoe = sc.nextInt();

        System.out.print("Ingresa el número de votos para PP: ");
        int votosPP = sc.nextInt();

        System.out.print("Ingresa el número de votos para Ciudadanos: ");
        int votosCiudadanos = sc.nextInt();

        System.out.print("Ingresa el número de votos para Vox: ");
        int votosVox = sc.nextInt();

        // Calcular el total de votos para la izquierda y la derecha
        int grupoIzquierda = votosPodemos + votosPsoe;
        int grupoDerecha = votosPP + votosCiudadanos + votosVox;

        // Calcular el porcentaje de votos para la izquierda y la derecha
        double totalVotos = votosPodemos + votosPsoe + votosPP + votosCiudadanos + votosVox;
        double porcentajeIzquierda = ((double)grupoIzquierda / totalVotos) * 100;
        double porcentajeDerecha = ((double)grupoDerecha / totalVotos) * 100;

        System.out.printf("Los votos de la izquierda son %d que constituyen el %.2f%% del total, y los votos de la derecha son %d que constituyen el %.2f%% del total.%n", grupoIzquierda, porcentajeIzquierda, grupoDerecha, porcentajeDerecha);
    
        sc.close();
	}
	
}
