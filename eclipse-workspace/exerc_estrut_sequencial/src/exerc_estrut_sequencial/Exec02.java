package exerc_estrut_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exec02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double pi = 3.14159;
        double A;
		double R;
		
		R = sc.nextDouble();
		
		A = pi * R * R;
		
		System.out.printf("A = %.4f%n", A);
		
		sc.close();		
	}

}


