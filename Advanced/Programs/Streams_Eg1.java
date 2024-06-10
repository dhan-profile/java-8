package Programs;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class Streams_Eg1 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(51);
		arr.add(32);
		arr.add(24);
		arr.add(73);
		arr.add(48);
		System.out.println("Available Collection: "+arr);
		
//		--------------------------------------
//		stream operation: (FILTER and COLLECT)
//		--------------------------------------
//		✅ converting/passing ArrayList elements to stream() method
//		✅ filtering even elements from List using filter() method and lambda expression
//		✅ use collect() method to collect and return in list form using toList() method

//		=============using FILTER======================
		List<Integer> s1 = arr.stream()
					.filter(i -> i % 2 == 0)
					.collect(Collectors.toList());
		System.out.println("ArrayList after performing Stream operations: "+s1);
		
//		==============using MAP======================
		List<Integer> modList = arr.stream()
								.map(i -> i + 5)
								.collect(Collectors.toList());
		System.out.println("Modified List(+5): "+modList);
		
//		===============using FILTER and MAP===================
		List<Integer> greater = arr.stream()
								.filter(i -> (i > 30))
								.map(i -> i)
								.collect(Collectors.toList());
		System.out.println("Greater than 30: "+ greater);
		
	}
}
