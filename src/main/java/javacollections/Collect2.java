package javacollections;

import java.util.ArrayList;
import java.util.Iterator;

public class Collect2 {
     /*
      * int a[] = new int[3];
      * ==>size of array is 3 and type of data is int
      * limitation of Array:1. is static --so fixed no. of elements=>size
      *                     2. contains the same type of elements =>homogenous
      * These limitations are resolved with the usage of dynamic Array: ArrayList
      * 
      * ArrayList Properties: 1. can contain duplicate values/eles
      *                       2. maintains insertion order
      *                       3. not synchronized => not thread safe so slow as compared to others
      *                       4. it allows random access to fetch eles-since stores values on the
      *                       basis of indices==>fetching the values is easy
      *                       5.in Generics we can store primitive, non-primitive, user defined objects
      * 
      */
	public static <E> void main(String[] args) {
		
//		int a[]=new int[3];
		
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(50);
		ar.add(50);//duplicate allowed
		ar.add(12.33);
		ar.add("Test");
		ar.add('a');
		ar.add(true);
		System.out.println(ar.size());//size of array list
		
		System.out.println(ar.get(3));//to get the value from an index
		
		//to print all the values from array list: for loop OR iterator
		//1. for loop:
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//generic vs non-generic:
		ArrayList <Integer>ar1 = new ArrayList<Integer>();
		ar1.add(100);
//		ar1.add("selenium"); //errs as string data type not allowed since generics were defined
		
		ArrayList<String>ar2 = new ArrayList<String>();
		ar2.add("test");
		ar2.add("selenium");
		
		//if not sure what type of data we are going to store: then E could be passed
		ArrayList<E>ar3 = new ArrayList<E>();
		
		//creating Employeee class objects here in the main method:
		Employee e1 = new Employee("Naveen", 27, "QA");
		Employee e2 = new Employee("Tom", 28, "Dev");
		Employee e3 = new Employee("Peter",29,"Admin");
		
		//create new array List to store the above Employee objects:
		ArrayList<Employee>ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		////2.using iterator: to traverse thru the values:
		Iterator<Employee> it = ar4.iterator();
		//iterator is not based on idex so have to use while loop and for cannot be used
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			System.out.println("--------");
		}
		
		System.out.println("**********ADD ALL**************");
		
		ArrayList<String>ar5 = new ArrayList<String>();
		ar5.add("test");
		ar5.add("selenium");
		ar5.add("QTP");
		//adding duplicate entries into ArrayList ar5
		ar5.add("dev");
		
		ArrayList<String>ar6 = new ArrayList<String>();
		ar6.add("dev");
		ar6.add("Java");
		ar6.add("JavaScript");
		
		ar5.addAll(ar6);
		//2.using iterator to traverse thru ArrList
		System.out.println("******using iterator*******");
		Iterator<String> itr = ar5.iterator();
		
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
		
		System.out.println("******using for loop*******");
		//1. using for loop: to traverse thru ArrList
		for(int j=0;j<ar5.size();j++) {
			System.out.println(ar5.get(j));
		}
		
		//to remove some entries all ar6 eles from ar5
		ar5.removeAll(ar6);
		
		Iterator<String> it2 = ar5.iterator();
		System.out.println("printing only ar5 since ar6 eles removed");
		System.out.println("-------------it2=ar5----------");
		while(it2.hasNext()) {
			String s = it2.next();
			System.out.println(s);
		}
		//adding new duplicates of ar6 into ar5
		ar5.add("dev");
		ar5.add("Java");
		
		Iterator<String> it3 = ar5.iterator();
		System.out.println("printing the new list it3");
		System.out.println("------------it3---------------");
		while(it3.hasNext()) {
			String s4 = it3.next();
			System.out.println(s4);
		}
		//retaining only the common eles of ar5 and ar6 using retainAll()
		ar5.retainAll(ar6);
		
		Iterator<String> it4 = ar5.iterator();
		System.out.println("----it4=commonElesFromar5&ar6--");
		while(it4.hasNext()) {
			System.out.println(it4.next());
		}
		
		
	}

}
