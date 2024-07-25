package Topics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class LambdaExpression {

	public static void main(String[] args) throws IOException {
//		1) Write a Java program that uses a Lambda Expression to sort a list of integers in ascending order.
		List<Integer> arr = Arrays.asList(21,12,43,34,75,56);
		System.out.println("Before sorting: "+arr);
//		Using Comparator:
//		----------------
		Comparator<Integer> asc = (n1, n2) -> {return Integer.compare(n1, n2);};
		Collections.sort(arr, asc);
		System.out.println("After sorting: "+arr);
//		------------------------------------------------------------------------------
//		Concise way:
//		-----------
		arr.sort((n1, n2) -> Integer.compare(n1, n2));
		System.out.println("Concise way: "+arr);
//		-------------------------------------------------------------------------------
//		More Concise way:
//		----------------
		arr.sort(Integer::compare);
		System.out.println("More Concise way: "+arr);
//		=================================================================================
//		2) Create a Lambda Expression that takes a string as input and returns its length.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string: ");
		String s = br.readLine();
//		Using Function interface and Lambda Expression:
//		----------------------------------------------
		Function<String, Integer> fn = str -> str.length();
		int lengthOfString = fn.apply(s);
		System.out.println("Length of String: "+lengthOfString);
//		--------------------------------------------------------------------------------
//		Alternate approach - Using Function interface and method reference:
//		-------------------------------------------------------------------
		Function<String, Integer> fn1 = String::length;
		lengthOfString = fn1.apply(s);
		System.out.println("Using method reference: "+lengthOfString);
//		--------------------------------------------------------------------------------
		
	}
}
