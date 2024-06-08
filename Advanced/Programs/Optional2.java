package Programs;

import java.util.ArrayList;
import java.util.Optional;

class NullPointerExceptionDuplicate extends Exception{
	NullPointerExceptionDuplicate(String stri){
		super(stri);
	}
}

public class Optional2 {

	public static void main(String[] args){
		Optional<String> opt = Optional.empty();
		System.out.println(opt);
		
		try {
			String a = null;
			System.out.println(Optional.of(a));
		} catch (NullPointerException e) {
			System.out.println("NULL detected");
		}
		
		String s = "Dhanush";
		System.out.println(Optional.ofNullable(s));
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Hello");
		arr.add("Java");
		arr.add("Programming");
		Optional opt1 = Optional.of(arr);
		System.out.println(opt1);
		
		if(opt1.isPresent()) {
			System.out.println("True");
		}
		
//		filter(<Predicate>)
		String t = "Progrmming";
		Optional<String> opt2 = Optional.of(t);
		System.out.println("Filter : "+opt2.filter(str -> str.contains("m")));
		
//		orElse
		Integer r = 128, u=0;
		Optional<Integer> opt3 = Optional.of(r);
		System.out.println(opt3.orElse(0));
		
//		orElseGet
		Optional<Integer> opt4 = Optional.of(u);
		System.out.println(opt4.orElseGet(() -> 0000));
		
//		Integer v = null;
//		Optional<Integer> opt5 = Optional.of(v);
//		System.out.println(opt5.orElseThrow(() -> new NullPointerException("NULL")));
		
		Integer v = null;
		Optional<Integer> opt5 = Optional.ofNullable(v);
		try {
			System.out.println(opt5.orElseThrow(() -> new NullPointerExceptionDuplicate("Value is null")));
		} catch (NullPointerExceptionDuplicate e) {
			System.out.println("NULL Exception Caught !!");
		}

	}
}
