package EntregableU04;
import java.util.Scanner;

public class EstructuraDeDatosEstáticas {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        int opcion;

        do {
            System.out.println("1.- Longitud de una cadena");
            System.out.println("2.- Comparación de dos cadenas");
            System.out.println("3.- Concatenación de dos cadenas");
            System.out.println("4.- Obtener subcadenas");
            System.out.println("5.- Invertir cadenas");
            System.out.println("6.- Es palíndromo");
            System.out.println("9.- Salir");
            System.out.println("Introduce una opción:");
            opcion = sc.nextInt();
            sc.nextLine();  // Consume el carácter de nueva línea

            switch (opcion) {
                case 1:
                    System.out.println("La longitud de la cadena es: " + obtenerLongitudCadena());
                    break;
                case 2:
                    comparacionDosCadenas();
                    break;
                case 3:
                    System.out.println("La cadena concatenada es: " + concatenarCadenas());
                    break;
                case 4:
                    System.out.println("La subcadena es: " + obtenerSubCadena());
                    break;
                case 5:
                    System.out.println("La cadena invertida es: " + invertirCadenas());
                    break;
                case 6:
                    System.out.println(esPalindromo());
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, introduce una opción válida.");
            }
        } while (opcion != 9);
    }

    public static int obtenerLongitudCadena() {
        System.out.println("Introduce una Cadena de texto");
        String respuesta = sc.nextLine();
        return respuesta.length();
    }

    public static void comparacionDosCadenas() {
        System.out.println("Introduce una Cadena de texto");
        String cad1 = sc.nextLine();
        System.out.println("Introduce otra Cadena de texto");
        String cad2 = sc.nextLine();
        int res = cad1.compareTo(cad2);

        if(res > 0) {
            System.out.println("La 1 cadena es mayor alfabeticamente que la segunda");
        } else if (res < 0) {
            System.out.println("La 2 cadena es mayor que la 1");
        } else {
            System.out.println("Son iguales");
        }
    }

    public static String concatenarCadenas() {
        System.out.println("Introduce una Cadena de texto");
        String cad1 = sc.nextLine();
        System.out.println("Introduce otra Cadena de texto");
        String cad2 = sc.nextLine();
        return cad1.concat(cad2);
    }

    public static String obtenerSubCadena() {
        System.out.println("Introduce una cadena de texto: ");
        String cad1 = sc.nextLine();
        System.out.println("Introduce un numero: ");
        int pos1 = sc.nextInt();
        sc.nextLine();  // Consume el carácter de nueva línea
        System.out.println("Introduce otro numero: ");
        int pos2 = sc.nextInt();
        sc.nextLine();  // Consume el carácter de nueva línea
        return cad1.substring(pos1, pos2);
    }

    public static String invertirCadenas() {
        System.out.println("Introduce una Cadena de texto");
        String cad1 = sc.nextLine();
        String invertida = "";
        for(int i = cad1.length() - 1; i >= 0; i--) {
            invertida += cad1.charAt(i);
        }
        return invertida;
    }

    public static String esPalindromo() {
        String res1 ="Los caracteres no coinciden, no es un palindromo";
        String res2 = "Los caracteres coinciden, es un palindromo";
        System.out.println("Introduce una Cadena de texto");
        String cad1 = sc.nextLine();
        // Eliminar espacios en blanco y convertir a minúsculas para comparar de manera insensible a mayúsculas
        cad1 = cad1.replaceAll(" ", "").toLowerCase();
        int longitud = cad1.length();
        // al verificar un palíndromo, solo necesitas comparar la primera mitad de la cadena con la segunda mitad, 
        // ya que los caracteres de la segunda mitad son simétricos a los de la primera mitad en un palíndromo. 
        // de ahi a que la condicion sea i < long / 2
        for (int i = 0; i < longitud / 2; i++) {
            if (cad1.charAt(i) != cad1.charAt(longitud - i - 1)) {
                return res1; // Si los caracteres no coinciden, no es un palíndromo
            }
        }
        return res2; 
    }
}
