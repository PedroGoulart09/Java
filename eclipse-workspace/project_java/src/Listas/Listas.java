package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<>();

		list.add("maria");
		list.add("marcos");
		list.add("joao");
		list.add("pedro");
		list.add("alfredo");
		list.add(2, "le");

		list.remove("alfredo");

		List<String> resultList = list.stream().filter(x -> x.charAt(0) == 'm').collect(Collectors.toList());

		for (String string : resultList) {
			System.out.println(string);
		}
		System.out.println("===================");

		System.out.println("===================");

		String resultList2 = list.stream().filter(x -> x.charAt(0) == 'm').findFirst().orElse(null);
		System.out.println(resultList2);

		for (String string : list) {
			System.out.println(string);
		}

		System.out.println("===================");
		list.removeIf(x -> x.charAt(0) == 'm');

		for (String string : list) {
			System.out.println(string);
		}

		sc.close();

	}

}