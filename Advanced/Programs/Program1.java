package Programs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Program1 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(3);
		arr.add(2);
		arr.add(4);
		arr.add(5);
		arr.add(10);
		Comparator<Integer> val1 = (n1, n2) -> { return Integer.compare(n1, n2); };
		Comparator<Integer> val2 = (n1, n2) -> { return Integer.compare(n2, n1); };
		Collections.sort(arr, val1);
		System.out.println("Ascending: "+arr);
		Collections.sort(arr, val2);
		System.out.println("Descending: "+arr);
		
		System.out.print("Values greater than 3: ");
		arr.stream().filter(n -> (n>3)).forEach(v -> System.out.print(v+" "));
		
//		=============================
		System.out.print("\nPeek: ");
//		=============================
//		Peek operation dependents upon the terminal operation. 
//		The peek operation without terminal operation will do nothing.
		arr.stream().peek(t -> System.out.print(t+" ")).collect(Collectors.toList());
		
//		===============================
		System.out.print("\nlimit(3): ");
//		================================
		arr.stream().limit(3).peek(t -> System.out.print(t+" ")).collect(Collectors.toList());
		
//		===============================
		System.out.print("\nskip(3): ");
//		================================		
		arr.stream().skip(3).peek(t -> System.out.print(t+" ")).collect(Collectors.toList());
		
//		===============================
		System.out.print("\ncount(long): ");
//		================================
		System.out.println(arr.stream().count());
		long c = arr.stream().count();
		System.out.println("count() using long var: "+c);
		
//		======================================
		System.out.print("forEachOrdered(): ");
//		======================================
		arr.stream().filter(t -> t % 2 == 0).forEachOrdered(t -> System.out.print(t+" "));
		
		double mod = 10e9+7;
		final int MOD = 1000000007;
		System.out.println(mod);
		System.out.println(MOD);
		
	}
}
