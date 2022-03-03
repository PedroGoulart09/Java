package For;

import java.util.Scanner;

public class LaçosRepetição {
	public static void main(String[] args) {

		Scanner stn = new Scanner(System.in);

		int N = stn.nextInt();
		int soma = 0;
		for (int i = 0; i < N; i++) {
			int x = stn.nextInt();
			soma = soma + x;

		}
		System.out.println(soma);
		stn.close();

	}
}
