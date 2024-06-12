package Programs;
import java.time.LocalDate;

public class Program3 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		String str = date.toString();
		System.out.println("Date: "+ str);
	}
}
