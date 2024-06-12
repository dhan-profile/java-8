package Programs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		System.out.print("\nPeek: ");
		arr.stream().peek(System.out::print);
	}
}
