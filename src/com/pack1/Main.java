package com.pack1;

public class Main {

	public static void main(String[] args) 
	{
		Employee employee1 = new Employee("Ram", 24, "Developer", 20000);
		Employee employee2 = new Employee("Mohan", 34, "Manager", 320000);
		
		System.out.println(employee1.name);
		System.out.println(employee2.name);
		
		employee1.empDetails();
		employee2.empDetails();
	}

}
