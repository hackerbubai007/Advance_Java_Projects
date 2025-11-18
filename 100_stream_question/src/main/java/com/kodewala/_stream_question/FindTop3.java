package com.kodewala._stream_question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindTop3 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(12, 32, 45, 65, 98);

		List<Integer> top3 = nums.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());

		System.out.println(top3);

	}

}
