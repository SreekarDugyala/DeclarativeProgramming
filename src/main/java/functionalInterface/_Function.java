package functionalInterface;

import java.util.Scanner;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Imperative Approach
        int incrementedNumber = increment(Integer.parseInt(sc.next()));
        System.out.println("number to be incrementByOne: "+incrementedNumber);

        //Declarative Approach
        int incrementedNumber2 = incrementByOneFunction.apply(Integer.parseInt(sc.next()));
        System.out.println("number to be incrementByOne: "+incrementedNumber2);

//        int resultNumber = Add1andMultiply10Function.apply(Integer.parseInt(sc.next()));
        int resultNumber = incrementByOneFunction.andThen(multiplyByTenFunction).apply(Integer.parseInt(sc.next()));
        System.out.println("number to be Add1andMultiply10 is: "+resultNumber);
    }

    //imperative Approach
    static int increment(int num) {
        return num+1;
    }

    //Declarative Approach
    static Function<Integer, Integer> incrementByOneFunction =
            number -> ++number;

    static Function<Integer, Integer> multiplyByTenFunction =
            number -> number * 10;

    static Function<Integer, Integer> Add1andMultiply10Function =
            incrementByOneFunction.andThen(multiplyByTenFunction);

}
