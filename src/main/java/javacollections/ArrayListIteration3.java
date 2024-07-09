package javacollections;

import java.util.ArrayList;
import java.util.Iterator;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ArrayListIteration3 {

	public static void main(String[] args) {
		ArrayList<String>studentsList = new ArrayList<String>();
		
		studentsList.add("Binka");
		studentsList.add("Sujaka");
		studentsList.add("Shauka");
		studentsList.add("Kalka");
		
		//1.typical for loop:
		for(int i=0;i<studentsList.size();i++) {
			System.out.println(studentsList.get(i));
		}
       System.out.println("--------------");
       
       //2.using for each loop:
       for(String ele:studentsList) {
    	   System.out.println(ele);
       }
       System.out.println("--------------");
       //3.JDK 8:using lambda-for each:
       studentsList.stream().forEach(ele->System.out.println(ele));
       System.out.println("--------------");
       //4.using iterator: is an interface used to iterate eles from a collection
       Iterator<String> it = studentsList.iterator();
       
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }
       
	}

}
