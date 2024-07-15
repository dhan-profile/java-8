package Topics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
//		Stream API
//	    🔺 Write a stream pipeline to filter out strings that contain a specific substring from a list of strings.
//	    🔵 Implement a method that takes a list of integers and returns the sum of the squares of all numbers in the list, using the Stream API.
//	    🟥 Create a stream pipeline to group a list of objects by a specific attribute and calculate the average value of another attribute.
		
//		TASK ANSWERS
//		🔺 Filtering Strings containing the word "berry"
//		================================================
		List<String> arr = Arrays.asList("apple","banana","cherry","pineapple","blueberry","blackberry");
		String substr = "berry";
		List<String> res =  arr.stream().filter(s -> s.contains(substr)).collect(Collectors.toList());
		System.out.println(res);
		
		
	}

}
