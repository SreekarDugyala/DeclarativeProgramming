package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _BiConsumer {
    public static void main(String[] args) {
        Customer sreekar = new Customer("Sreekar","9999999999");
        getCustomerConsumer.accept(sreekar,false);

    }

    static BiConsumer<Customer, Boolean> getCustomerConsumer =
            (customer, showPhoneNumber) ->
                    System.out.println("Customer name is "
                    + customer.customerName+" and phone number is "
                    +(showPhoneNumber?customer.customerNumber:"**********"));

    static class Customer{
        private final String customerName;
        private final String customerNumber;

        Customer(String customerName, String customerNumber){
            this.customerName = customerName;
            this.customerNumber = customerNumber;
        }

    }
}
