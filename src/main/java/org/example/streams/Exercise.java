package org.example.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise {

    public static void main(String[] args) {
        separateWords().forEach(System.out::println);

    }

    public static List<String> separateWords() {
        List<String> names = List.of("John", "Anna", "Michael", "Judy");
        return names.stream()
                .filter(t -> t.contains("n"))
                .collect(Collectors.toList());
    }
}
