package Topics;

import java.util.function.Predicate;
import java.util.function.Function;

public class PredicateFunction {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;

        // Convert Predicate to Function
        Function<Integer, Boolean> predicateAsFunction = predicateToFunction(isEven);

        // Test the function
        System.out.println(predicateAsFunction.apply(4)); // true
        System.out.println(predicateAsFunction.apply(5)); // false
    }

    public static <T> Function<T, Boolean> predicateToFunction(Predicate<T> predicate) {
        return predicate::test;
    }
}

