package Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEg2 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(12);
		arr.add(51);
		arr.add(24);
		arr.add(23);
		arr.add(34);
		arr.add(34);
		List<Integer> s = arr.stream()
				.filter(no -> no%2 == 0)
				.collect(Collectors.toList());
		System.out.println(s);
		
		List<String> s1 = arr.stream()
				.map(no -> no+"").filter(no -> no.startsWith("2"))
				.collect(Collectors.toList());
		System.out.println(s1);
		
		Optional<Integer> s3= arr.stream()
				.findFirst();
		System.out.println(s3);
		
		HashSet<Integer> set = new HashSet<Integer>(); 
				arr.stream()
				.filter(t -> !(set.add(t))).forEach(t -> System.out.print(t));
	}
}
