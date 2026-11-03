public class Movie extends MediaItem {

    private String director;
    private double duration;
    private String ratingCode;


    public Movie(String title, String genre, int year, String director, double duration, String ratingCode) {

        super(title, genre, year);

        this.director = director;
        this.duration = duration;
        this.ratingCode = ratingCode;
    } // end constructor

    public boolean isLongMovie(){
        return duration > 2.5;
    }// end isLongMovie

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration);
        System.out.println("Rating Code: " + ratingCode);
        System.out.println("---------------------");
    }// ends displayDetails
}