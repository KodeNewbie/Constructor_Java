package com.pack1;

public class Employee 
{
	String name;
	int age;
	String role;
	long salary;
	
	Employee(String name, int age, String role, long salary)
	{
		this.name = name;
		this.age = age;
		this.role = role;
		this.salary = salary;
	}
	
	void empDetails()
	{
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
		System.out.println("Role : " + this.role);
		System.out.println("Salary : " + this.salary);
	}
	
}
