package Topics;

public class FunctionalInterface {

	interface StringFunction {
	    String running(String str);
	}

	public static void main(String[] args) {
	    StringFunction exclaim = (s) -> s + "!";
	    StringFunction ask = (s) -> s + "?";
	    printFormatted("Hello", exclaim);
	    printFormatted("Hello", ask);
	}

	public static void printFormatted(String str, StringFunction format) {
	    String result = format.running(str);
	    System.out.println(result);
	}

}
