package rentalstore;

public class NewReleaseMovie extends Movie{

    public NewReleaseMovie(String title) {
        super(title);
    }

    public double calculateAmount(int dayRented) {
        return dayRented * 3;
    }
}
