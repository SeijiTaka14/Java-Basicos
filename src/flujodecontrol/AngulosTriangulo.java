package flujodecontrol;

import java.util.Scanner;

public class AngulosTriangulo {
	public static void main(String[] args) {
        /*Pedirle 3 �ngulos a un usuario y 		decirle si es 		un triangulo v�lido*/
		
		System.out.println("Introduce 3 �ngulos: ");
		
		//Pedir primer �ngulo
		Scanner sc1 = new Scanner(System.in);
		int ang1 = sc1.nextInt();
		
		//Pedir segundo �ngulo
		Scanner sc2 = new Scanner(System.in);
		int ang2 = sc2.nextInt();
		
		//Pedir tercer �ngulo
		Scanner sc3 = new Scanner(System.in);
		int ang3 = sc2.nextInt();
		
		int suma = ang1 + ang2 + ang3;
		
		if(suma == 180) {
			System.out.println("La suma de los �ngulos " + ang1 + " + " + ang2 + " + " + ang3 + " es: " + suma + ". �Es un tri�ngulo!");
		} else if (suma != 180) {
			System.out.println("No es un tri�ngulo v�lido");
		}
}
}
