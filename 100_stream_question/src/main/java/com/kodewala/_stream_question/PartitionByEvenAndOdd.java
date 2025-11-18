package com.kodewala._stream_question;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByEvenAndOdd {

	public static void main(String[] args) {
		List<Integer> nums= Arrays.asList(12,33,43,34,56,6578,88);
		
	Map<Boolean,List<Integer>>	num=nums.stream().collect(Collectors.partitioningBy(n->n%2==0));
System.out.println(num);
	}

}
