package com.wipro.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employ {

	private int id;
	private String name;
	private String project;
	private double salary;

	public Employ(int id, String name, String project, double salary) {
		this.id = id;
		this.name = name;
		this.project = project;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + ", project=" + project + ", salary=" + salary + "]";
	}

}

public class AppEight {

	public static void main(String[] args) {
		List<Employ> empList = new ArrayList<>();
		empList.add(new Employ(1001, "Mani", "Java-Project", 4500.25));
		empList.add(new Employ(1002, "Vani", "Testing-Project", 5500.25));
		empList.add(new Employ(1003, "Rani", "Python-Project", 6500.25));
		empList.add(new Employ(1004, "Bani", "Web-Project", 7500.25));
		empList.add(new Employ(1005, "Kani", "Python-Project", 3500.25));
		empList.add(new Employ(1006, "Pani", "Web-Project", 8500.25));
		empList.add(new Employ(1007, "Lani", "Web-Project", 6700.25));

		empList.forEach(emp -> System.out.println(emp.getId() + " " + emp.getName()));

		empList.forEach(emp -> {
			if (emp.getProject().endsWith("Web-Project"))
				System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getProject());
		});

		double salarySum = empList.stream().filter(emp -> emp.getProject().equals("Web-Project"))
				.collect(Collectors.summingDouble(Employ::getSalary));

		System.out.println("Web employees salary is " + salarySum);

		empList.stream().sorted((e1, e2) -> {
			if (e1.getSalary() > e2.getSalary())
				return 1;
			else if (e1.getSalary() < e2.getSalary())
				return -1;
			return 0;
		}).forEach(emp -> System.out.println(emp));

	}

}
