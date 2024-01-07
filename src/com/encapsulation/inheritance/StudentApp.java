package com.encapsulation.inheritance;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Student student1 = new Student(scan.next(), scan.nextInt(), scan.next(), scan.nextInt());

		Student student2 = new Student(scan.next(), scan.nextInt(), scan.next(), scan.nextInt());

		System.out.println("Student 1:");

		student1.displayStudentInfo();

		System.out.println();

		System.out.println("Student 2:");

		student2.displayStudentInfo();

	}

}


