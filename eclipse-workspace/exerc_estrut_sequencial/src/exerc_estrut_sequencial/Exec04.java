package exerc_estrut_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exec04 {

	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double N,V,S;
		
		N = sc.nextDouble();
		V = sc.nextDouble();
		S = sc.nextDouble();
		
		S = V * S;
		
		System.out.printf("NUMBER = %.0f%n", N);
		System.out.printf("SALARY = U$ %.2f%n", S);
				
		sc.close();
	}

}
