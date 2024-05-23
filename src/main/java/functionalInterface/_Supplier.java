package functionalInterface;

import java.util.List;
import java.util.function.Supplier;


// Supplier returns a result set taking a argument
public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDbConnectionUrlsSupplier.get());
    }

    static Supplier<List<String>> getDbConnectionUrlsSupplier = () ->
         List.of(
                "jdbc://LocalHost:5432/users/",
                "jdbc://LocalHost:5432/consumers/"
        );

}
