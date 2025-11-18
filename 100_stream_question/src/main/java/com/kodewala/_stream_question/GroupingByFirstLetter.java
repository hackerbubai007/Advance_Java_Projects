package com.kodewala._stream_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByFirstLetter {

	public static void main(String[] args) {
		//Given a list of strings, return a map of first letter → list of words starting with it.
		
		List<String> words=Arrays.asList("Dip","Dmou","Aswini","Nikhil","ASruti","Nchinky");
		
//		Map<Character, List<String>> map= new HashMap<>();
//		
//		
//		for(String list: words) {
//			
//			char first =list.charAt(0);
//			
//			if(!map.containsKey(first)) {
//				
//				map.put(first, new ArrayList<>());
//			}
//			
//			map.get(first).add(list);
//			
//		}
//		
//		System.out.println(map);

		 Map<Object, List<String>> ddd = words.stream().collect(Collectors.groupingBy(w->w.charAt(0)));
		 
		 System.out.println(ddd);
		
	}

	
}
