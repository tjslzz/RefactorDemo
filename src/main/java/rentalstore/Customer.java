package rentalstore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String htmlStatement() {
        return new RentalHtmlReceipt().statement(rentals, name);
    }

    public String statement() {
        return new RentalTextReceipt().statement(rentals, name);
    }
}
