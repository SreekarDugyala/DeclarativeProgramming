package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _BiFunction
{
    public static void main(String[] args) {
        //Imperative programming
        int result = MultiplyNumber(3,6);
        System.out.println(result);

        //Declarative programming
        int result2 = MultiplyTwoNumbers.apply(2,4);
        System.out.println(result2);

        int result3 = MultiplyTwoNumbers.andThen(Add100).apply(3,7);
        System.out.println(result3);

    }

    static int MultiplyNumber(int a, int b) {
        return a*b;
    }

    static BiFunction<Integer, Integer, Integer> MultiplyTwoNumbers =
            (num1, num2) -> num1*num2;

    static Function<Integer, Integer> Add100 =
            (num1) -> num1+100;

}
