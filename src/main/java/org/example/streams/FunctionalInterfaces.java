package org.example.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;

public class FunctionalInterfaces {

    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add("Albert");
        list.add("Zenek");
        list.add("Mirosław");
        AtomicInteger test = new AtomicInteger(10);
        Comparator<String> compareStringLength = (t1, t2) -> t1.length() - t2.length();
        Consumer<AtomicInteger> increment = t -> t.incrementAndGet();
        Supplier<String> obtain = () -> "prezent";
        Predicate<Integer> question = number -> number > 7;
        Function<String, Integer> function = String::length;
        UnaryOperator<String> unaryOperator = t -> t + " " + t;
        BinaryOperator<String> binaryOperator = String::concat;
        Runnable runnable = () -> System.err.println("Runnable nic nie bierze i nic nie daje");

        Collections.sort(list, compareStringLength);
        list.forEach(System.out::println);

        increment.andThen(AtomicInteger::decrementAndGet).andThen(AtomicInteger::decrementAndGet).accept(test);
        System.out.println(test);
        System.out.println(obtain.get());
        System.out.println(question.or(number -> number > 3).test(5));
        System.out.println(function.andThen(Integer::toBinaryString).apply("Jakub"));
        System.out.println(unaryOperator.apply("Podwojony ciąg"));
        System.out.println(binaryOperator.apply("To łączymy", " z tym."));
        runnable.run();

    }

}
