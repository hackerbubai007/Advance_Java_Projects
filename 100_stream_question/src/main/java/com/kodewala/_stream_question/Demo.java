package com.kodewala._stream_question;

import java.util.Arrays;
import java.util.List;

class Student {

	int id;

	String add;

	List<String> details;

	public Student(int id, String add, List<String> details) {
		// super();
		this.id = id;
		this.add = add;
		this.details = details;
	}

	void doSomething(Student s1) {

		System.out.println(id + " " + add + " " + details);

	}

}

class StudentThread extends Thread {

	Student s1;

	public StudentThread(Student s1) {
		// super();
		this.s1 = s1;
	}

	public void run() {
		s1.doSomething(s1);
	}

}

public class Demo {

	public static void main(String[] args) {

		Student std = new Student(1, "Debra", Arrays.asList("Dipankar", "Mou Sarker"));

		StudentThread t1 = new StudentThread(std);
		t1.start();

	}

}
