package flujodecontrol;

import java.util.Scanner;

public class EstructuraDeControlSwitch {
	//Estructuras de control nos sirve para controlar el flujo de comportamiento de un programa.
	
		/*
		 * switch(condicion_a_evaluar) {
		 * 	case "valor":
		 *		//c�digo a ejecutar
		 *		//break;
		 *	case "n":
		 *		//codigo a ejecutar
		 *		//break;
		 *
		 *	default:
		 *		//c�digo a ejecutar  
		 */
		
		public static void main(String[] args) {
			//Solicitarle al usuario un d�a de la semana y mostrarle un mensaje
			
			System.out.println("�Qu� d�a de la semana es?");
			Scanner sc = new Scanner(System.in);
			String dia = sc.nextLine();
			
			
			switch(dia.toLowerCase()) {
				case "lunes":
					System.out.println("Odio los lunes...");
					break;
				case "martes":
					System.out.println("Otro lunes? No gracias");
					break;
				case "miercoles":
					System.out.println("What a week, huh? Captain it's wednseday");
					break;
				case "jueves":
					System.out.println("Ya m�s para all� que para ac�");
					break;
				case "viernes":
					System.out.println("Lo lograste");
					break;
				case "sabado":
					System.out.println("Disfr�talo, se pasa r�pido");
					break;
				case "domingo":
					System.out.println("Domingo con sabor a lunes :(");
					break;
			}
		}
}
