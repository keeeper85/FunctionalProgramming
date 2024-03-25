package org.example.references;

public class BirthOfReference {

    interface SomeInterface{
        String toUpperCase(String text);
    }

    public static void main(String[] args) {

        SomeInterface makingReferenceStep_0 = new SomeInterface() {
            @Override
            public String toUpperCase(String text) {
                return text.toUpperCase();
            }
        };

        SomeInterface makingReferenceStep_1 = (String text) -> {return text.toUpperCase();};
        SomeInterface makingReferenceStep_2 = (String text)-> text.toUpperCase();
        SomeInterface makingReferenceStep_3a = text -> text.toUpperCase();
        SomeInterface makingReferenceStep_3b = String::toUpperCase;

        System.out.println(makingReferenceStep_0.toUpperCase("krok 0: tworzymy klasę anonimową"));
        System.out.println(makingReferenceStep_1.toUpperCase("krok 1: zamieniamy klasę na lambdę"));
        System.out.println(makingReferenceStep_2.toUpperCase("krok 2: usuwamy zbędne klamry i polecenie 'return'"));
        System.out.println(makingReferenceStep_3a.toUpperCase("krok 3-a: teraz albo usuwamy typowanie parametru i mamy klasyczną lambdę..."));
        System.out.println(makingReferenceStep_3b.toUpperCase("krok 3-b: ...albo zostawiamy sam typ, dajemy '::' i wybieramy którą z jego metod użyć"));

    }
}
