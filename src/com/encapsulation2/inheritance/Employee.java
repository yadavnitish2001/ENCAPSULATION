package com.encapsulation2.inheritance;

public class Employee {
	private int id;

	private String name;

	private double salary;

	private String teamName;

	public Employee(int id, String name, double salary) {

		this.id = id;

		this.name = name;

		this.salary = salary;

		this.setTeamName(id);

	}

	public int getId() {

		return id;

	}

	public String getName() {

		return name;

	}

	public double getSalary() {

		return salary;

	}

	public String getTeamName() {

		return teamName;

	}

	private void setTeamName(int id) {

		if (id >= 1 && id <= 50) {

			teamName = "Team-A";

		} else if (id >= 51 && id <= 100) {

			teamName = "Team-B";

		}

		else {

			teamName = "Unknown";

		}

	}

	public void displayEmployeeInfo() {

		System.out.println("Employee Information:");

		System.out.println("ID: " + id);

		System.out.println("Name: " + name);

		System.out.println("Salary: "+ salary);

		System.out.println("Team Name: " + teamName);

	}
}
