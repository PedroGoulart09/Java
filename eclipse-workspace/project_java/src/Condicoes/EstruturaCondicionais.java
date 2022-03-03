package Condicoes;

import java.util.Locale;
import java.util.Scanner;


public class EstruturaCondicionais {
	public static void main(String[] args) {

		Scanner str = new Scanner(System.in);

		int hora;
		System.out.println("Que horas são ?");
		hora = str.nextInt();

		if (hora < 12) {
			System.out.println("Boa Dia");
		} else if (hora >= 18) {
			System.out.println("Boa Noite");
		} else {

			System.out.println("Boa Tarde");
		}

		Locale.setDefault(Locale.US);
		
		Scanner count = new Scanner(System.in);
		
		System.out.println("Quantos minutos: ");
		
		
		int minutos = count.nextInt();
		double value = 50.0;
		
		
		double teste = 4000.00;
		
		System.out.printf("o valor de teste é %.2f%n", teste);
		
		if(minutos > 100) {
			value += (minutos - 100) * 2.0;
		}
		System.out.printf("O valor para pagar é R$ %.2f%n", value);
		
		count.close();

		
		str.close();

	}
}
