package EjerciciosObligatorios;

import java.math.*;
import java.util.Scanner;

public class Ejer11 {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su altura en centímetros: ");
        double alturaCm = sc.nextDouble();
        
        System.out.println("Ingrese su peso en gramos: ");
        double pesoGramos = sc.nextDouble();
        
        // Convertir altura de centímetros a metros y peso de gramos a kilogramos
        double alturaMetros = alturaCm / 100.0;
        double pesoKilogramos = pesoGramos / 1000.0;
        
        // Calcular el IMC utilizando Math.pow
        double imc = pesoKilogramos / Math.pow(alturaMetros, 2);
        
        System.out.println("El IMC calculado es " + imc);
        
        sc.close();
    }
}

