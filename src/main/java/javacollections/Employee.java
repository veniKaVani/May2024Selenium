package javacollections;

public class Employee {
	/*
	 * inside the ArrayList can store user defined objects as well: like employees, students
	 * ....etc
	 * 
	 */
	String name;
	int age;
	String dept;
	
	//creating the parameterized constructor of this class: and initializing the class vars using 'this'
	Employee(String name, int age, String dept){
		this.name = name;
		this.age = age;
		this.dept=dept;
	}

}
