package com.juanpabloprado.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Sally");
        students.add("Polly");
        students.add("Molly");
        students.add("Tony");

        // Consumer
        Consumer<String> consumer = System.out::println;
        students.forEach(consumer);

        // Function
        Function<Integer, Integer> doubly = x -> x * 2;
        System.out.println(doubly.apply(8));

        // Predicate
        IntPredicate isDivByThree = n -> n % 3 == 0;
        System.out.println(isDivByThree.test(3));
        System.out.println(isDivByThree.test(2));

        // Supplier
        Supplier<Double> randomNumUnder100 = () -> Math.random() * 100;
        System.out.println(randomNumUnder100.get());
    }
}
