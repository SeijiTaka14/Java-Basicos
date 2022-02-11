package ciclos;

import java.util.Scanner;

public class Tabla {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Ingresa cualquier número positivo: ");
        num = console.nextInt();
                
        System.out.println("Tabla de multiplicar del:  " + num);
        
        int control = 0;
        while(control <=10) {
        	System.out.println(num + " x " + control + " = " + (num * control));
        	control++;
        }
	}
}
