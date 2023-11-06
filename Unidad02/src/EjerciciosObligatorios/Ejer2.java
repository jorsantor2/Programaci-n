package EjerciciosObligatorios;  // Declaración del paquete al que pertenece la clase Ejer2

import java.util.Scanner;  // Importación de la clase Scanner desde el paquete java.util

public class Ejer2 {  // Declaración de la clase llamada Ejer2

    public static void main(String[] args) {  // Método principal que se ejecuta cuando se inicia el programa
        String nombre;  // Declaración de una variable de tipo String llamada "nombre" para almacenar el nombre del usuario
        int edad;       // Declaración de una variable de tipo entero llamada "edad" para almacenar la edad del usuario
        float altura;   // Declaración de una variable de tipo float llamada "altura" para almacenar la altura del usuario

        Scanner sc = new Scanner(System.in);  // Creación de un objeto Scanner para leer la entrada del usuario desde la consola
        System.out.println("Introduce tu nombre: ");  // Impresión de un mensaje para solicitar el nombre del usuario
        nombre = sc.nextLine();  // Lectura del nombre introducido por el usuario y asignación a la variable "nombre"

        Scanner sc2 = new Scanner(System.in);  // Creación de un nuevo objeto Scanner para leer la entrada del usuario
        System.out.println("Introduce tu edad: ");  // Impresión de un mensaje para solicitar la edad del usuario
        edad = sc2.nextInt();  // Lectura de la edad introducida por el usuario y asignación a la variable "edad"

        Scanner sc3 = new Scanner(System.in);  // Creación de otro objeto Scanner para leer la entrada del usuario
        System.out.println("Introduce tu altura: ");  // Impresión de un mensaje para solicitar la altura del usuario
        altura = sc3.nextFloat();  // Lectura de la altura introducida por el usuario y asignación a la variable "altura"

        // Impresión de un mensaje que incluye los datos ingresados por el usuario
        System.out.println("Te llamas " + nombre + " ,tienes " + edad + " años y mides " + altura + " metros. Soy adivino!");

        // Cierre de los objetos Scanner para liberar los recursos utilizados
        sc.close();
        sc2.close();
        sc3.close();
    }
}

