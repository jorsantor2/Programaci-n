package EjerciciosObligatorios;
import java.util.Scanner;

public class Ejer10 {

    public static void main(String[] args) {
        int niños, niñas;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de niños: ");
        niños = sc.nextInt();

        System.out.print("Introduce el número de niñas: ");
        niñas = sc.nextInt();

        int total = niños + niñas;
        double porcentaje1 = (((double)niños / (double)total) * 100); // Convertir uno de los operandos a double
        double porcentaje2 = (((double)niñas / (double)total) * 100); // Convertir uno de los operandos a double

        System.out.printf("Tenemos matriculados %d niños y %d niñas. En total, tenemos matriculados %d alumnos, siendo un %.2f%% perteneciente a los niños y %.2f%% perteneciente a las niñas.", niños, niñas, total, porcentaje1, porcentaje2);

        sc.close();
    }
}
