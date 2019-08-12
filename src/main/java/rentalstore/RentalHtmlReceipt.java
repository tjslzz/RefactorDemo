package rentalstore;

public class RentalHtmlReceipt extends RentalReceipt{
    @Override
    protected String footerStr(double totalAmount, int frequentRenterPoints) {
        return "<P>You owe<EM>" + totalAmount + "</EM><P>\n" +
                "On this rental you earned <EM>" + frequentRenterPoints + "</EM> frequent renter points<P>";
    }

    @Override
    protected String getEachMovieInfo(Rental each, double thisAmount) {
        return each.getMovie().getTitle() + ": " + String.valueOf(thisAmount) + "<BR>\n";
    }

    @Override
    protected String getHeader(String name) {
        return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
    }
}
