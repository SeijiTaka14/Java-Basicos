package flujodecontrol;

import java.util.Scanner;

public class EstructuraDeControl {
		//Estructuras de control de flujo nos sirve para la toma de decisiones.
	    //Estructuras de control de flujo nos sirven para cambiar el flujo de nuestro programa evaluando una condici�n y a partir de la evalucaci�n se realiza una acci�n u otra.

	    public static void main(String[] args) {
	        
	        /* if(condicion) {
	            codigo
	        } else {
	            codigo
	        }*/

	        System.out.println("Introduce tu edad: ");
	        Scanner sc = new Scanner(System.in);
	        int edad = sc.nextInt();

	        if(edad >= 18) {
	            System.out.println("Eres mayor de edad");
	        } else {
	            System.out.println("Eres menor de edad");

	        }
	}
}
