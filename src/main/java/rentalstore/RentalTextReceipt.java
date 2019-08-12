package rentalstore;

public class RentalTextReceipt extends RentalReceipt{
    @Override
    protected String footerStr(double totalAmount, int frequentRenterPoints) {
        String footer = "Amount owed is " + String.valueOf(totalAmount) + "\n";
        footer += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return footer;
    }

    @Override
    protected String getEachMovieInfo(Rental each, double thisAmount) {
        return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
    }

    @Override
    protected String getHeader(String name) {
        return "Rental Record for " + name + "\n";
    }

}