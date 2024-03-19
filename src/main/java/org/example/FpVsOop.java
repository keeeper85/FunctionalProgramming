package org.example;

public class FpVsOop
{
    public static void main( String[] args )
    {
        int firstNumber = 3;
        int secondNumber = 5;

        ObjectProgramming objectProgramming = new ObjectProgramming(firstNumber);
        objectProgramming.increment(secondNumber);
        System.out.println("OOP: " + objectProgramming.value);

        System.out.println("FP: " + FunctionalProgramming.sum(firstNumber, secondNumber));
    }

    static class ObjectProgramming {
        int value;

        public ObjectProgramming(int value) {
            this.value = value;
        }

        public void increment(int anyNumber){
            value += anyNumber;
        }
    }

    static class FunctionalProgramming {
        static int sum(int number1, int number2){
            return number1 + number2;
        }
    }
}
