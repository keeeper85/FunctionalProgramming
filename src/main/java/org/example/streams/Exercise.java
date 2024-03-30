package org.example.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Andrzej", 37, List.of("pierogi", "karkówka", "mielone"), User.Gender.M, true));
        users.add(new User("Jola", 18, List.of("pizza", "kebab", "sushi"), User.Gender.F, false));
        users.add(new User("Weronika", 18, List.of("pizza", "arbuz", "nuggetsy"), User.Gender.F, false));
        users.add(new User("Krzysiek", 22, List.of("orzechy", "rodzynki", "banany"), User.Gender.M, false));
        users.add(new User("Bożena", 42, List.of("rosół", "pierogi", "grzybowa"), User.Gender.F, true));
        users.add(new User("Staszek", 42, List.of("knedle", "gołąbki", "kiełbasa"), User.Gender.M, true));
        users.add(new User("Michałek", 6, List.of("żelki", "mentosy", "ptasie mleczko"), User.Gender.M, false));
        users.add(new User("Halina", 66, List.of("chipsy", "spaghetti", "sushi"), User.Gender.F, true));
        users.add(new User("Bożydar", 31, List.of("frytki", "pizza", "orzechy"), User.Gender.M, false));

        List<String> items = new ArrayList<>();

        Stream<User> userStream = users.stream();

//                .map(User::getFavouriteFoods)
//                .flatMap(ttt -> ttt.getFavouriteFoods().stream())
//                .filter(user -> user.getName().length() > 5)
//                .filter(user -> user.getAge() % 2 == 0)
//                .filter(user -> user.getFavouriteFoods().contains("pizza"))
//                .filter(user -> user.getGender().equals(User.Gender.F))
//                .sorted(Comparator.reverseOrder())
//                .sorted((u1,u2) -> u1.getAge() - u2.getAge())
//                .sorted((u1,u2) -> u1.getName().length() - u2.getName().length())
//                .peek(System.err::println)
//                .sorted((u1,u2) -> u1.getName().compareTo(u2.getName()))
//                .distinct()
//                .skip(1)
//                .limit(10)
//                .forEach(lll -> items.add(lll))
//                .peek(System.out::println)


        boolean  arePineappleLovers = userStream
                .noneMatch(u -> u.getFavouriteFoods().contains("pizza z ananasem"));

        System.out.println(arePineappleLovers);




        String user = users.stream()
                .filter(u -> u.getAge() > 80)
                .map(User::getName)
                .findAny()
                .orElse("Nie ma takiego użytkownika");

//        System.out.println(user);


    }

    public static String separateWords() {
        List<String> names = List.of("John", "Anna", "Michael", "Judy");
        System.out.println(names);
        Stream<String> nameStream = names.stream();
        String n = nameStream
                .filter(t -> t.contains("n"))
                .min((t1, t2) -> t1.length() - t2.length()).get();

//        System.out.println(nameStream.count());


        return n;
    }
}
