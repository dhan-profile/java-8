import java.util.*;
public class Add{
public static void main(String[] x){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a binary string s1: ");
	String s1 = sc.nextLine();
	System.out.println("Enter a binary string s2: ");
	String s2 = sc.nextLine();
	binaryAddition(s1,s2);
	//System.out.println("Addition of 2 binary strings : " + add);
}

public static void binaryAddition(String s1, String s2){
	//char[] ch1 = s1.toCharArray();
	int[] n1 = new int[s1.length()];
	int[] n2 = new int[s2.length()];
	System.out.println("Integer array[]: ");
	for(int i=0; i<s1.length(); i++){
		n1[i] = s1.charAt(i) - '0';
	}
	for(int res1 : n1){
		System.out.print(res1);
	}
	System.out.println();
	for(int i=0; i<s2.length(); i++){
		n2[i] = s2.charAt(i) - '0';
	}
	for(int res2 : n2){
		System.out.print(res2);
	}
	//  int[] array to int
	System.out.println();
	int res1=0;
    for(int i=0; i<n1.length; i++) {
         res1 = res1*10 + n1[i];
    }
	int res2=0;
    for(int i=0; i<n2.length; i++) {
         res2 = res2*10 + n2[i];
    }
	System.out.println("Integer/long value: " + res1);
	System.out.println("Integer/long value: " + res2);
	System.out.println("Addition value: " + (res2+res1));
	
//	System.out.println("Addition of two binary strings: ");
	    // Use as radix 2 because it's binary    
//    long number0 = Long.parseLong(s1, 2);
//    long number1 = Long.parseLong(s2, 2);

//    long sum = number0 + number1;
//	System.out.println("Integer value of String s1: " + number0);
//	System.out.println("Integer value of String s2: " + number1);
    //System.out.println(Integer.toBinaryString(sum));
	//int addition = s1 + s2;
	//return addition;
	//110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011
	//10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101
}
}
