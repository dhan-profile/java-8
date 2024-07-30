package Topics;

//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;

import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
public @interface HelloWorld {
	String message() default "This annotation prints Hello World!";
}


//public String message = "This annotation prints Hello World!";