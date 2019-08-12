package rentalstore;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void should_return_rentalReciept_when_call_statement() {
        Customer customer = new Customer("Felicity");
        assertEquals("Rental Record for Felicity\nAmount owed is 0.0\nYou earned 0 frequent renter points", customer.statement());
    }

    @Test
    public void should_return_rentalReciept_when_call_statement_given_Movie_regular(){
        Customer customer = new Customer("Jerry");
        Rental threeDayRental = new Rental(new RegularMovie("FJerry"), 3);
        customer.addRental(threeDayRental);

        assertEquals("Rental Record for Jerry\n\tFJerry\t3.5\nAmount owed is 3.5\nYou earned 1 frequent renter points", customer.statement());
    }

    @Test
    public void should_return_rentalReciept_when_call_statement_given_Movie_new_release(){
        Customer customer = new Customer("Felicity");
        Rental twoDayRental = new Rental(new NewReleaseMovie("JFelicity"), 2);
        customer.addRental(twoDayRental);

        assertEquals("Rental Record for Felicity\n\tJFelicity\t6.0\nAmount owed is 6.0\nYou earned 2 frequent renter points", customer.statement());
    }

    @Test
    public void should_return_rentalReciept_when_call_statement_given_Movie_childrens(){
        Customer customer = new Customer("Felicity");
        Rental fourDayRental = new Rental(new ChildrensMovie("JFelicity"), 4);
        customer.addRental(fourDayRental);

        assertEquals("Rental Record for Felicity\n\tJFelicity\t3.0\nAmount owed is 3.0\nYou earned 1 frequent renter points", customer.statement());
    }

    @Test
    public void should_return_rentalReciept_when_call_statement_given_Movie_childrens_getDayRented_2(){
        Customer customer = new Customer("Felicity");
        Rental fourDayRental = new Rental(new ChildrensMovie("JFelicity"), 2);
        customer.addRental(fourDayRental);

        assertEquals("Rental Record for Felicity\n\tJFelicity\t1.5\nAmount owed is 1.5\nYou earned 1 frequent renter points", customer.statement());
    }

    @Test
    public void should_return_rentalReciept_result_when_call_statement_given_Movie_regular_getDayRented_1() {
        Customer customer = new Customer("Jerry");
        Rental threeDayRental = new Rental(new RegularMovie("FJerry"), 1);
        customer.addRental(threeDayRental);

        assertEquals("Rental Record for Jerry\n\tFJerry\t2.0\nAmount owed is 2.0\nYou earned 1 frequent renter points", customer.statement());

    }

    @Test
    public void should_return_rentalReciept_when_call_htmlStatement() {
        Customer customer = new Customer("Felicity");
        assertEquals("<H1>Rentals for <EM>Felicity</EM></H1><P>\n" +
                "<P>You owe<EM>0.0</EM><P>\n" +
                "On this rental you earned <EM>0</EM> frequent renter points<P>", customer.htmlStatement());
    }

}