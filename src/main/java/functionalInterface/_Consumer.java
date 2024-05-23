package functionalInterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer sreekar = new Customer("Sreekar","99999");
        greetCustomerConsumer.accept(sreekar);
    }

    static Consumer<Customer> greetCustomerConsumer =
            (customer) -> System.out.println("Customer name is "
                    + customer.customerName+" and phone number is "
                    + customer.customerPhoneNumber);


    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber){
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
