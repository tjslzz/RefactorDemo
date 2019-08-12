package rentalstore;

public class RentalTextReceipt extends RentalReceipt{
    @Override
    protected String footerStr(double totalAmount, int frequentRenterPoints) {
        String footer = "Amount owed is " + totalAmount + "\n";
        footer += "You earned " + frequentRenterPoints + " frequent renter points";
        return footer;
    }

    @Override
    protected String getEachMovieInfo(Rental each, double thisAmount) {
        return "\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n";
    }

    @Override
    protected String getHeader(String name) {
        return "Rental Record for " + name + "\n";
    }

}
