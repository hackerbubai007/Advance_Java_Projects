package com.kodewala._stream_question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class AcendingOrder1 {

	public static void main(String[] args) {
		
	List<Integer> num= Arrays.asList(1,4,3,7,5,6,9,8,2);
	
	List<Integer> ordered=num.stream().sorted(Comparator.naturalOrder()).toList();
	System.out.println(ordered);

	}

}
