package rentalstore;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void should_return_result_when_call_statement() {
        Customer customer = new Customer("Felicity");
        assertEquals("Rental Record for Felicity\nAmount owed is 0.0\nYou earned 0 frequent renter points", customer.statement());
    }
}