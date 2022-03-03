package For;

import java.util.Scanner;

public class ForEachJava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] names = new String[] { "pedro", "joao", "alfredo" };

		for (String string : names) {
			System.out.println(string);
		}

		sc.close();

	}

}
