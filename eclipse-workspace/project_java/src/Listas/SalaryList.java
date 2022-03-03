package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class SalaryList {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("How many employees will be regisered ?");
		int regis = sc.nextInt();

		for (int j = 0; j < regis; j++) {
			System.out.println("Emplyoee #" + (j + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();

			var emp = new Employee(name, id, salary);

			list.add(emp);

		}

		System.out.println("Enter the employee id that will have salary increase: ");

		int idSalary = sc.nextInt();
		Integer cont = containId(list, idSalary);

		if (cont == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(cont).increaseSalary(percentage);

		}

		System.out.println();
		for (Employee employee : list) {
			if (cont != null) {
				System.out.println("List of employees: ");
				System.out.println(employee);
			}

		}

		sc.close();

	}

	public static Integer containId(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;

	}

}
