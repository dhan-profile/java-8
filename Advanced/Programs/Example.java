package Programs;

import java.util.Optional;

public class Example {
	public static void main(String[] args) {
		String[] str = new String[10];        
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";  // Setting value for 5th index  
//  It returns an empty instance of Optional class   
	    Optional<String> value = Optional.of(str[5]);  

//  If value is present, it returns an Optional otherwise returns an empty Optional  
	    System.out.println("Filtered value: "+value.filter((s)->s.equals("Abc")));  
	    System.out.println("Filtered value: "+value.filter((s)->s.equals("JAVA OPTIONAL CLASS EXAMPLE")));
	    
        Optional<String> empty = Optional.empty();  
        System.out.println(empty);
        // It returns value if available, otherwise returns specified value,  
        System.out.println("orElse: "+value.orElse("Value is not present"));  
        System.out.println("orElse: "+empty.orElse("Value is not present"));  
	}
}
