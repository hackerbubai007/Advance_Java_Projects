package com.kodewala._stream_question;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Employee3 {

	String name;
	double salary;

	public Employee3(String name, double salary) {
		// super();
		this.name = name;
		this.salary = salary;
	}

}

public class reversrBySalary {

	public static void main(String[] args) {
		// Reverse sort a list of custom objects by a field (e.g., salary)
		
		Map<Integer, Map<String, Double>> emps= new HashMap<>();
		
		Employee3 e1= new Employee3("Dip", 300000);
		Employee3 e2= new Employee3("Dip2", 3000040);
		Employee3 e3= new Employee3("Dip3", 3000004);
		Employee3 e4= new Employee3("Dip4", 3000003);
		
		
		
		HashMap<String, Double> emp1 =new HashMap<>();
		
		emp1.put(e1.name, e1.salary);
		emp1.put(e2.name, e2.salary);
		emp1.put(e3.name, e3.salary);
		emp1.put(e4.name, e4.salary);
		
		
		emps.put(1, emp1);
		
		List<Double> re=emps.values().stream().flatMap(n->n.values().stream()).sorted(Comparator.reverseOrder()).toList();
		System.out.println(re);
		
		
		
		
		
		
		
		

	}

}
