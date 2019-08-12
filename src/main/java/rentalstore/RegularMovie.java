package rentalstore;

public class RegularMovie extends Movie{

    public RegularMovie(String title) {
        super(title);
    }

    public double calculateAmount(int dayRented) {
        double thisAmount = 2.0;
        if (dayRented > 2) {
            thisAmount += (dayRented - 2) * 1.5;
        }
        return thisAmount;
    }
}
