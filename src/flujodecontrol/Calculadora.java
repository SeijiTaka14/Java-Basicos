package flujodecontrol;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		/*
		   * Pedir al usuario 2 n�meros por consola y preguntarle que desea realizar
		   * 1) Suma
		   * 2) Resta
		   * 3) Divisi�n
		   * 4) Multiplicaci�n
		   * 
		   * y despues imprimir el resultado
		   */

      System.out.println("Selecciona una operaci�n a realizar: 1. Suma    2. Resta    3. Divisi�n     4. Multiplicaci�n   (Introduce s�lo el n�mero");

      //Pedir la operaci�n a realizar
      Scanner scOp = new Scanner(System.in);
      int op = scOp.nextInt();

      //Pedir el primer n�mero
      System.out.println("Introduce el primer n�mero: ");
      Scanner scNum = new Scanner(System.in);
      double num1 = scNum.nextDouble();
      
      //Pedir el segundo n�mero
      System.out.println("Introduce el segundo n�mero: ");
      double num2 = scNum.nextDouble();

      //Switch

      switch(op) {
          case 1:
              System.out.println("El resultado de la suma de " + num1 + " + " + num2 + " es: " + (num1 + num2));
              break;
          
          case 2:
              System.out.println("El resultado de la resta de " + num1 + " - " + num2 + " es: " + (num1 - num2));
              break;
          
          case 3:
              System.out.println("El resultado de la divisi�n de " + num1 + " / " + num2 + " es: " + (num1 / num2));
              break;

          case 4:
              System.out.println("El resultado de la multiplicaci�n de " + num1 + " * " + num2 + " es: " + (num1 * num2));
              break;

          default:
              System.out.println("Operaci�n no v�lida por el momento");
      }
	}
}
