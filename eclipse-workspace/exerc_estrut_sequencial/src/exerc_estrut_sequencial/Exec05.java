package exerc_estrut_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exec05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qt1, qt2;		
		double preco1, preco2, vltotal;
		
		cod1 = sc.nextInt();
		qt1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qt2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		vltotal = preco1 * qt1 + preco2 * qt2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", vltotal);
			
		sc.close();
	}

}
