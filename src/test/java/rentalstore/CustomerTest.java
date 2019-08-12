package rentalstore;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void should_return_result_when_call_statement() {
        Customer customer = new Customer("Felicity");
        assertEquals("Rental Record for Felicity\nAmount owed is 0.0\nYou earned 0 frequent renter points", customer.statement());
    }

    @Test
    public void should_return_footer_when_call_footer_str(){
        Customer customer = new Customer("Felicity");
        assertEquals("Amount owed is 0.0\nYou earned 0 frequent renter points",customer.footerStr(0.0,0));
    }
}