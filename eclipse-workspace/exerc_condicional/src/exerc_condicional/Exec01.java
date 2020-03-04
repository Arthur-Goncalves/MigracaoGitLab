package exerc_condicional;

import java.util.Scanner;

public class Exec01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numero = sc.nextDouble();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NÃO NEGATIVO");
		}			
		sc.close();
		

	}

}
