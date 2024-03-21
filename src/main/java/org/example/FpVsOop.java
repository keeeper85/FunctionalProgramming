package org.example;

public class FpVsOop
{
    static int counterOOP = 0;
    static int counterFP = 0;

    public static void main( String[] args )
    {
        ObjectProgramming objectProgramming = new ObjectProgramming(0);

        for (int k = 0; k < 5; k++) {
            Thread[] threads = new Thread[5];
            for (int i = 0; i < threads.length; i++) {
                threads[i] = new Thread(() -> {
                    for (int j = 0; j < 1000; j++) {
                        objectProgramming.increment(j);
                        counterFP = FunctionalProgramming.sum(0, j);
                    }
                });
                threads[i].start();
            }

            for (Thread thread : threads) {
                try { thread.join(); }
                catch (InterruptedException e) {} }

            counterOOP = objectProgramming.value;
            System.out.println("OOP: " + counterOOP);
            System.out.println("FP: " + counterFP);
            System.out.println("---------------------");
            objectProgramming.value = 0;
        }
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
