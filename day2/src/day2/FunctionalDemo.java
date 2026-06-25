package day2;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalDemo {

    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {

        
        Consumer<String> c = (s) -> System.out.println(s);
        c.accept("Adios");

        Consumer<String> c1 = System.out::println;
        c1.accept("Hello");
        c1.accept("Hola");

        Consumer<String> c2 = FunctionalDemo::print;
        c2.accept("Aloha");

        
        Supplier<String> s1 = () -> "John";
        System.out.println(s1.get());

        Supplier<Double> s2 = () -> Math.random();
        System.out.println(s2.get());

        // ================= Predicate =================
        Predicate<Integer> nonNegative = (x) -> x >= 0;
        System.out.println(nonNegative.test(3));

        Predicate<Integer> nonPositive = (x) -> x <= 0;
        System.out.println(nonPositive.test(-2));

        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        System.out.println(isEven.test(2));

        
        BiPredicate<Integer, Integer> isEqual = (a, b) -> a.equals(b);
        System.out.println(isEqual.test(10, 10));
        System.out.println(isEqual.test(10, 20));

        BiPredicate<Integer, Integer> greaterThan = (a, b) -> a > b;
        System.out.println(greaterThan.test(20, 10));

        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        Function<String, Integer> length = str -> str.length();
        System.out.println(length.apply("Functional"));

    
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(10, 20));

        BiFunction<String, String, String> combine =
                (a, b) -> a + " " + b;
        System.out.println(combine.apply("Hello", "World"));
    }
}