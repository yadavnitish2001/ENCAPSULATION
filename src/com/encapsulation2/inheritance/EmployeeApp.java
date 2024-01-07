package com.encapsulation2.inheritance;

import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int id = scanner.nextInt();

		String name = scanner.next();

		double salary = scanner.nextDouble();

		Employee employee = new Employee(id, name, salary);

		System.out.println();

		employee.displayEmployeeInfo();

		scanner.close();

	}

}







