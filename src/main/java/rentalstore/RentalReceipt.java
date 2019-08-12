package rentalstore;

import java.util.List;

public abstract class RentalReceipt {
    String statement(List<Rental> rentals, String name) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = getHeader(name);
        for (Rental each : rentals) {
            double thisAmount = each.calculateAmountByMovieType();

            frequentRenterPoints += increaseFrequentRenterPointsEveryMovie(isNewReleaseOverOneDay(each));

            result += getEachMovieInfo(each, thisAmount);
            totalAmount += thisAmount;
        }
        result += footerStr(totalAmount, frequentRenterPoints);
        return result;
    }

    protected abstract String footerStr(double totalAmount, int frequentRenterPoints);

    protected abstract String getEachMovieInfo(Rental each, double thisAmount);

    protected abstract String getHeader(String name);

    private boolean isNewReleaseOverOneDay(Rental each) {
        return (each.getMovie() instanceof NewReleaseMovie) && each.getDayRented() > 1;
    }

    private int increaseFrequentRenterPointsEveryMovie(boolean isNewReleaseOverOneDay) {
        return isNewReleaseOverOneDay ? 2 : 1;
    }
}
