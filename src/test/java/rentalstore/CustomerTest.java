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
    public void should_result_when_call_statement_given_Movie_regular(){
        Customer customer = new Customer("Jerry");
        Movie regularMovie = new Movie("FJerry", 0);
        Rental threeDayRental = new Rental(regularMovie, 3);
        customer.addRental(threeDayRental);

        assertEquals("Rental Record for Jerry\n\tFJerry\t3.5\nAmount owed is 3.5\nYou earned 1 frequent renter points", customer.statement());
    }

    @Test
    public void should_result_when_call_statement_given_Movie_new_release(){
        Customer customer = new Customer("Felicity");
        Movie newReleaseMovie = new Movie("JFelicity", 1);
        Rental twoDayRental = new Rental(newReleaseMovie, 2);
        customer.addRental(twoDayRental);

        assertEquals("Rental Record for Felicity\n\tJFelicity\t6.0\nAmount owed is 6.0\nYou earned 2 frequent renter points", customer.statement());
    }

    @Test
    public void should_return_footer_when_call_footer_str(){
        Customer customer = new Customer("Felicity");
        assertEquals("Amount owed is 0.0\nYou earned 0 frequent renter points",customer.footerStr(0.0,0));
    }

}