package org.example.references;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ForEach {

    static List<StringObject> stringObjects = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new StringObject();
        }

//        for (StringObject stringObject : stringObjects) {
//            System.out.println(stringObject);
//        }

        stringObjects.forEach(StringObject::replaceHouseToBunny);
        stringObjects.forEach(System.out::println);
    }

    static class StringObject{
        String text;

        public StringObject() {
            text = generateRandomSentence();
            stringObjects.add(this);
        }

        static String generateRandomSentence(){
            return getPronoun() + " " + getNoun() + " is " + getQuantifier() + " " + getAdj();
        }

        void replaceHouseToBunny(){
            text = text.replaceAll("house", "bunny");
        }

        static RandomPronouns getPronoun(){
            int random = ThreadLocalRandom.current().nextInt(0, RandomPronouns.values().length);
            return RandomPronouns.values()[random];
        }

        static RandomNouns getNoun(){
            int random = ThreadLocalRandom.current().nextInt(0, RandomNouns.values().length);
            return RandomNouns.values()[random];
        }

        static RandomQuantifiers getQuantifier(){
            int random = ThreadLocalRandom.current().nextInt(0, RandomQuantifiers.values().length);
            return RandomQuantifiers.values()[random];
        }

        static RandomAdjectives getAdj(){
            int random = ThreadLocalRandom.current().nextInt(0, RandomAdjectives.values().length);
            return RandomAdjectives.values()[random];
        }

        @Override
        public String toString() {
            return text;
        }
    }

    enum RandomPronouns {My, Your, His, Her, Our, Their}
    enum RandomNouns {house, car, child, job, hobby, music, computer, nature}
    enum RandomQuantifiers {a_little, very, quite, a_bit, not_at_all}
    enum RandomAdjectives {beautiful, ugly, smart, stupid, nice, awful, awesome, gross}
}
