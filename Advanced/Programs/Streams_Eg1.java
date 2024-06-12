package Programs;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.*;
public class Streams_Eg1 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(51);
		arr.add(32);
		arr.add(24);
		arr.add(48);
		arr.add(73);
		arr.add(48);
		arr.add(32);
		System.out.println("Available Collection: "+arr);
		
//		--------------------------------------
//		stream operation: (FILTER and COLLECT)
//		--------------------------------------
//		✅ converting/passing ArrayList elements to stream() method
//		✅ filtering even elements from List using filter() method and lambda expression
//		✅ use collect() method to collect and return in list form using toList() method

//		================ using filter(), collect() ======================
		List<Integer> s1 = arr.stream()
					.filter(i -> i % 2 == 0)
					.collect(Collectors.toList());
		System.out.println("ArrayList after performing Stream operations: "+s1);
		
//		================= using map() ======================
		List<Integer> modList = arr.stream()
								.map(i -> i + 5)
								.collect(Collectors.toList());
		System.out.println("Modified List(+5): "+modList);
		
//		================= using filter() and map() ===================
		List<String> greater = arr.stream()
								.filter(i -> (i > 30))
								.map(i -> i + " > 30")
								.collect(Collectors.toList());
		System.out.println("Greater than 30: "+ greater);
		
//		================== iterating in Stream - forEach(), limit(), filter() ====================
		Stream.iterate(2, i -> i+2)
		.filter(i -> i % 2 == 0)
		.limit(5)
		.forEach(System.out::print);																										System.out.println();

//		here .filter() and .limit() are Intermediate Operations (Performed in-between) 
//		.forEach() is a Terminal Operation (performed at End)
			
//		===================== filter() and iterate - forEach() ==================		
		arr.stream()
		.filter(f -> (f == 32))
		.forEach(filterate -> System.out.println(filterate));
		
//		==================== reduce() ===========================
		Integer total = arr.stream()
					.reduce(0,(sum, t) -> sum+t);
		System.out.println("Total(using reduce): "+total);
		
//		======================== min() and max() =======================
		Optional<Integer> m1 = arr.stream()
					.max((val1, val2) -> val1.compareTo(val2));
		Integer m2 = arr.stream()
					.min((val1, val2) -> val1.compareTo(val2))
					.get();
		System.out.println("Max: "+m1+", Min: "+m2);
		
//		------------------------- Pipeline ----------------------------
//		✅ A pipeline is a sequence of operations that can be concatenated.
//		Eg: .sorted().filter().map().forEach()...
		
//		======================== findFirst() ============================
		Optional<Integer> f1 = arr.stream()
							.findFirst();
		System.out.println("findFirst: "+f1);
		
//		======================= findAny() ==============================
		Optional<Integer> f2 = arr.stream()
							.findAny();
		System.out.println("findAny: "+f2);
		
//		======================= distinct(), skip() =============================
		System.out.print("distinct: ");
		arr.stream().distinct().skip(2).forEach(d -> System.out.print(d+" "));
		
//		======================
		
	}
}
