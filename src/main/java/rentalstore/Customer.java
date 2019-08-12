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

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = getHeader();
        for (Rental each : this.rentals) {
            double thisAmount = 0;

            thisAmount = calculateAmountByMovieType(each, thisAmount);

            frequentRenterPoints += increaseFrequentRenterPointsEveryMovie(isNewReleaseOverOneDay(each));

            result += getEachMovieInfo(each, thisAmount);
            totalAmount += thisAmount;
        }
        result += footerStr(totalAmount, frequentRenterPoints);
        return result;
    }

    private double calculateAmountByMovieType(Rental each, double thisAmount) {
        switch (each.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (each.getDayRented() > 2) {
                    thisAmount += (each.getDayRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                thisAmount += each.getDayRented() * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (each.getDayRented() > 3) {
                    thisAmount += (each.getDayRented() - 3) * 1.5;
                }
                break;
        }
        return thisAmount;
    }

    private boolean isNewReleaseOverOneDay(Rental each) {
        return (each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1;
    }

    private int increaseFrequentRenterPointsEveryMovie(boolean isNewReleaseOverOneDay) {
        return isNewReleaseOverOneDay ? 2 : 1;
    }

    private String getEachMovieInfo(Rental each, double thisAmount) {
        return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
    }

    private String getHeader() {
        return "Rental Record for " + getName() + "\n";
    }

    protected String footerStr(double totalAmount, int frequentRenterPoints) {
        String footer = "Amount owed is " + String.valueOf(totalAmount) + "\n";
        footer += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return footer;
    }


    public String htmlStatement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
        for (Rental each : this.rentals) {
            double thisAmount = 0;

            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDayRented() > 2) {
                        thisAmount += (each.getDayRented() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDayRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDayRented() > 3) {
                        thisAmount += (each.getDayRented() - 3) * 1.5;
                    }
                    break;
            }

            //add frequent renter points
            frequentRenterPoints++;
            //add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1) {
                frequentRenterPoints++;
            }

            //show figures for this rental
            result += each.getMovie().getTitle() + ": " + String.valueOf(thisAmount) + "<BR>\n";
            totalAmount += thisAmount;
        }

        result += htmlFooterStr(totalAmount, frequentRenterPoints);
        return result;
    }

    private String htmlFooterStr(double totalAmount, int frequentRenterPoints) {
        return "<P>You owe<EM>" + totalAmount + "</EM><P>\n" +
                "On this rental you earned <EM>" + frequentRenterPoints + "</EM> frequent renter points<P>";
    }
}
