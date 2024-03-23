package org.example.references;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        StringInterface stringInterface1 = String::toUpperCase;
        StringInterface stringInterface2 = String::toLowerCase;
        StringInterface stringInterface3 = String::trim;
        IntegerInterface integerInterface1 = Integer::highestOneBit;
        IntegerInterface integerInterface2 = Integer::bitCount;
        IntegerInterface integerInterface3 = Integer::reverse;

        System.out.println(stringInterface1.stringFunction("zamienia małe litery na duże"));
        System.out.println(stringInterface2.stringFunction("A TERAZ ZAMIENIA DUŻE NA MAŁE"));
        System.out.println(stringInterface3.stringFunction("   usuwa spacje z przodu i z tyłu   "));
        System.out.println(integerInterface1.intFunction(123)); //pokazuje bit o nawyższej wartości
        System.out.println(integerInterface2.intFunction(3)); //pokazuje z ilu bitów składa się dana liczba
        System.out.println(integerInterface3.intFunction(1)); //zamienia bity na przeciwne
    }

    interface StringInterface {String stringFunction(String text);}
    interface IntegerInterface {Integer intFunction(int number);}



    static class Person{
        String name;

        public Person(String name) {
            this.name = name;
        }
    }

//    interface SomeInterface{
//        void someFunction();
//    }

}
