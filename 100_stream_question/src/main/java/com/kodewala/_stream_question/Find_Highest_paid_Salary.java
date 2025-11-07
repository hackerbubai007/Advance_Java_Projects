package com.kodewala._stream_question;

import java.util.*;
import java.util.concurrent.*;
import java.util.Map.Entry;

class Employee {

	// This method finds the highest-paid employee from a given map
	public String find_Highest_paid_Salary(Map<String, Integer> emps) {

		Entry<String, Integer> highest = emps.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);

		if (highest != null) {
			System.out.println("Highest Paid Employee: " + highest.getKey() + " = " + highest.getValue());
			return highest.getKey();
		} else {
			System.out.println("No employees found!");
			return null;
		}
	}
}

class EmployeeThread implements Callable<String> {

	private Map<String, Integer> emps;

	public EmployeeThread(Map<String, Integer> emps) {
		this.emps = emps;
	}

	@Override
	public String call() {
		Employee emp = new Employee();
		return emp.find_Highest_paid_Salary(emps);
	}
}

public class Find_Highest_paid_Salary {

	public static void main(String[] args) throws Exception {

		Map<String, Integer> empMap = new HashMap<>();
		empMap.put("Dipankar", 11110);
		empMap.put("Dipankar1", 1155110);
		empMap.put("Dipankar2", 1111540);
		empMap.put("Dipankar3", 1111043);

		ExecutorService service = Executors.newSingleThreadExecutor();

		Future<String> result = service.submit(new EmployeeThread(empMap));

		System.out.println("Result: " + result.get());

		service.shutdown();
	}
}
