package Programs;
import java.util.ArrayList;
public class Remove_Duplciates {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(2);
		num.add(5);
		num.add(8);
		num.add(8);
		num.add(3);
		num.add(5);
		System.out.print("After removing duplicates: ");
		num.stream().distinct().forEach(n -> System.out.print(n+" "));
	}
}
