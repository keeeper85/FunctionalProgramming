package org.example.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Albert");
        list.add("Zenek");
        list.add("Mirosław");

        Comparator<String> compareStringLength = (t1, t2) -> t1.length() - t2.length();
        Collections.sort(list, compareStringLength);
        list.forEach(System.out::println);

        AtomicInteger integer = new AtomicInteger(10);
        Consumer<AtomicInteger> increment = t -> t.incrementAndGet();
        increment.andThen(AtomicInteger::decrementAndGet).andThen(AtomicInteger::decrementAndGet).accept(integer);
        System.out.println("Startujemy od 10, potem +1, następnie -1 i znowu -1, razem: " + integer);
        Supplier<String> obtain = () -> "prezent";
        System.out.println("Właście dostałeś: " + obtain.get());
        Predicate<Integer> question = number -> number > 7;
        System.out.println("Czy 5 jest większe od 7? --> " + question.test(5));
        System.out.println("Czy 5 jest większe od 7 albo chociaż od 3? --> "
                + question.or(number -> number > 3).test(5));
        Function<String, Integer> function = String::length;
        System.out.println(function.apply("Hello")); //liczy ilość znaków, wychodzi: 5
        System.out.println(function.andThen(Integer::toBinaryString).apply("Hello"));
        //5 w zapisie binarnym to: 101
        UnaryOperator<String> unaryOperator = t -> t + " " + t;
        BinaryOperator<String> binaryOperator = String::concat;
        System.out.println(unaryOperator.apply("Podwojony ciąg"));
        System.out.println(binaryOperator.apply("To łączymy", " z tym."));

        Runnable runnable = () -> System.err.println("Runnable nic nie bierze i nic nie zwraca");
        runnable.run();

        Collections.sort(list, compareStringLength);
        list.forEach(System.out::println);

    }

}
