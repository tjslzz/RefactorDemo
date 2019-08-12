package rentalstore;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addRental(Rental arg) {
        rentals.add(arg);
    }

    String htmlStatement() {
        return new RentalHtmlReceipt().statement(rentals, name);
    }

    String statement() {
        return new RentalTextReceipt().statement(rentals, name);
    }
}
