package rentalstore;

public class ChildrensMovie extends Movie{

    public ChildrensMovie(String title) {
        super(title);
    }

    public double calculateAmount(int dayRented) {
        double thisAmount = 1.5;
        if (dayRented > 3) {
            thisAmount += (dayRented - 3) * 1.5;
        }
        return thisAmount;
    }
}
