package functionalInterface;

import java.util.function.Predicate;


// Predicate returns a boolean value taking in a argument

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValidPredicate.test("0389898989"));
    }

    static Predicate<String> isPhoneNumberValidPredicate =
            (number) ->
                    number.startsWith("03")
                            && number.length()==10;
}
