package mta.edu.vn.java8.lambda;


public class LambdaExpressionExample01 {
    public static void main(String[] args) {
        LambdaExpressionExample01 lde = new LambdaExpressionExample01();

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };

        //without return statement add without curly braces
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + lde.operate(10, 5, addition));
        System.out.println("10 - 5 = " + lde.operate(10, 5, subtraction));
        System.out.println("10 * 5 = " + lde.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + lde.operate(10, 5, division));

        //without parenthesis
        GreetingService greetingService = message -> {
            System.out.println("Hello " + message);
        };

        //with parenthesis
        GreetingService greetingService1 = (message) -> {
            System.out.println("Hell " + message);
        };

        greetingService.sayMessage("Phan");
        greetingService1.sayMessage("Van");

    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

}
