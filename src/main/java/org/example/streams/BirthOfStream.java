package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BirthOfStream {

    public static void main(String[] args) {

        // 1. Strumień z kolekcji:
        List<String> food = List.of("pierogi", "kiełbasa", "zapiekanaka", "serniczek");
        Stream<String> foodStream = food.stream();

        // 2. Strumień z tablicy:
        String[] gems = {"diamond", "ruby", "sapphire", "onyx"};
        Stream<String> streamStream = Stream.of(gems);
        Stream<String> streamArrays = Arrays.stream(gems, 1, 3);
        //w ten sposób możemy również określić początek i koniec strumienia

        // 3. Pusty strumień
        Stream<String> emptyStream = Stream.empty();

        // 4. Predefiniowany strumień
        Stream<String> defaultStream = Stream.of("PierwszyElement", "Drugi", "Trzeci");

        // 5. Nieskończony strumień
        Stream<String> neverendingSupplier = Stream.generate(() -> "powtarzaj To"); //niekończący się strumień takich samych stringów
        Stream<Integer> diceSimulator = Stream.generate(() -> ThreadLocalRandom.current().nextInt(1,6)); //symulator rzutu kostką
        Stream<AtomicInteger> iterator = Stream.iterate(new AtomicInteger(1), value -> new AtomicInteger(value.incrementAndGet()));
        //tworzy nowe obiekty AtomicInteger oparte o coraz to wyższe wartości (zwiększane o 1)

        // 6. Strumienie typów prostych
        DoubleStream doubleStream = DoubleStream.of(0.3, 1.1, 1.89, 5.001);
        System.out.println(doubleStream.max().getAsDouble()); //wyświetla największą wartość w strumieniu
        IntStream intStream = IntStream.range(1,7); //tworzy strumień zaczynający się od 1, a kończący na 7
        intStream.forEach(System.out::println);

    }
}
