// MediaItem.java
// ------------------------------------------------------------
// ROLE: Base class / parent class / superclass.
// This class stores information that all media should have.
// ------------------------------------------------------------

public class MediaItem {

    // --------------------------------------------------------
    // Instance variables
    // These are private to protect the data.
    // Child classes should use getters and setters.
    // --------------------------------------------------------
    private String title;
    private String genre;
    private int year;
    private double rating;
    private boolean favorite;

    // --------------------------------------------------------
    // Full constructor
    // This constructor receives all four pieces of information.
    // --------------------------------------------------------
    public MediaItem(String title, String genre, int year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.rating = 0.0;
        this.favorite = false;
    } // end constructor Student(name, major, email, phone)

    // ---------------------------
    // Getters
    // ---------------------------
    public String getTitle() {
        return title;
    } // end getTitle

    public String getGenre() {
        return genre;
    } // end getGenre

    public int getYear() {
        return year;
    } // end getYear

    public double getRating() {
        return rating;
    } // end getRating

    public boolean isFavorite() {
        return favorite;
    } // end isFavorite

    // ---------------------------
    // Setters
    // ---------------------------
    public void setTitle(String title) {
        this.title = title;
    } // end setTitle

    public void setGenre(String genre) {
        this.genre = genre;
    } // end setGenre

    public void setYear(int year) {
        this.year = year;
    } // end setYear

    public void setRating(double rating) {
        this.rating = rating;
    } // end setRating

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    } // end setFavorite

    // --------------------------------------------------------
    // Display method
    // A child class can override this method.
    // --------------------------------------------------------
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Year: " + year);
        System.out.println("Rating: " + rating);
        System.out.println("Favorite: " + favorite);
        System.out.println("----------------------");
    } // end displayDetails

    public void toggleFavorite(){
        favorite = !favorite;
    }// end toggleFavorite

    public void rateItem(double r) {
        if (r >= 0 && r <= 5) {
            rating = r;
        } else {
            System.out.println("Rating has to be between 0 and 5");
        }
    }// end rateItem

    public int yearsOld(){
        return 2026 - year;
    }// end yearsOld
} // end MediaItem class