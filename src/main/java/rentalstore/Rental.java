package rentalstore;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    Movie getMovie() {
        return movie;
    }

    int getDayRented() {
        return dayRented;
    }

    double calculateAmountByMovieType() {
        return movie.calculateAmount(dayRented);
    }
}
