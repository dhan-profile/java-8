package Topics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class MethodReferences {

	public static void main(String[] args) throws IOException {
//		Write a method reference to replace a lambda expression that converts a string to uppercase.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string: ");
		String str = br.readLine();
//		Using Lambda Expression:
//		------------------------
		Function<String, String> fn = s -> s.toUpperCase();
		System.out.println(fn.apply(str));
//		----------------------------------------------------------------------------------
//		Using method reference:
//		-----------------------
		Function<String, String> fn1 = String::toUpperCase;
		System.out.println(fn1.apply(str));
//		----------------------------------------------------------------------------------
		
	}
}
