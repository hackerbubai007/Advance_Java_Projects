package com.kodewala._stream_question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AscendingOrder {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(12,34,23,32,31,98,79);
		
  List<Integer> ascendingOrdervalues	=	nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
  
  
  System.out.println(ascendingOrdervalues);
  System.out.println("I love you");
		
		

	}

}
