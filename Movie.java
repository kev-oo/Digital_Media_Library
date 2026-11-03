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
        System.out.println("Duration (hrs): " + duration);
        System.out.println("Rating Code: " + ratingCode);
        System.out.println("---------------------");
    }// ends displayDetails

    // Getters
    public String getDirector() {
        return director;
    } // end getDirector

    public double getDuration() {
        return duration;
    } // end getDuration

    public String getRatingCode() {
        return ratingCode;
    } // end getRatingCode


    // Setters
    // ---------------------------
    public void setDirector(String director) {
        this.director = director;
    } // end setDirector

    public void setDuration(Double duration) {
        this.duration = duration;
    } // end setDuration

    public void setRatingCode(String ratingCode) {
        this.ratingCode = ratingCode;
    } // end setRatingCode
}