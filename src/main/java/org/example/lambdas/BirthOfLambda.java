package org.example.lambdas;

public class BirthOfLambda {

    public static void main(String[] args) {

        DoubleParametrizedFunctionReturningString makingLambdaStep_0 = new DoubleParametrizedFunctionReturningString() {
            @Override
            public String mergeStrings(String first, String second) {
                return first + " " + second;
            }
        };

        DoubleParametrizedFunctionReturningString makingLambdaStep_1 = (String first, String second) -> "";

        DoubleParametrizedFunctionReturningString makingLambdaStep_2 = (String first, String second) -> first + " " + second;

        DoubleParametrizedFunctionReturningString makingLambdaStep_3 = (first, second) -> first + " " + second;



        /*SomeFunction voidFunction = () -> System.out.println("1. Metoda bez parametrów, nic nie zwraca.");
        voidFunction.someMethod();

        StringReturningFunction stringFunction = () -> "2. Metoda bez parametrów, zwraca Stringa.";
        System.out.println(stringFunction.stringProduction());

        ParametrizedFunction parametrizedFunction = someText -> System.out.println(someText);
        parametrizedFunction.printText("3. Metoda z 1 paramatrem, nic nie zwraca.");

        DoubleParametrizedFunction doubleFunction = (t1, t2) -> System.out.println(t1 + " " + t2);
        doubleFunction.linkStrings("4. Metoda z 2 parametrami,", "nic nie zwraca.");

        DoubleParametrizedFunctionReturningString doubleFunctionReturning = (bla1, bla2) -> bla1 + " " + bla2;
        System.out.println(doubleFunctionReturning.mergeStrings("5. Metoda z 2 parametrami,", "zwraca Stringa."));*/
    }

    interface DoubleParametrizedFunctionReturningString{
        String mergeStrings(String first, String second);
    }

    interface DoubleParametrizedFunction{
        void linkStrings(String first, String second);
    }

    interface ParametrizedFunction{
        void printText(String text);
    }

    interface StringReturningFunction{
        String stringProduction();
    }

    interface SomeFunction{
        void someMethod();
    }

}
