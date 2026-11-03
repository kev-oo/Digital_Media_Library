public class Song extends MediaItem {

    private String artist;
    private double length;
    private String album;


    public Song(String title, String genre, int year, String artist, double length, String album) {

        super(title, genre, year);

        this.artist = artist;
        this.length = length;
        this.album = album;
    } // end constructor

    public void playSample() {
        System.out.println("Now playing a sample of " + getTitle() + " by " + artist + "...");
    }// end playSample

    public boolean isFromAlbum(String albumName){
        return album.equalsIgnoreCase(albumName);
    }// end isFromAlbum

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Artist: " + artist);
        System.out.println("Length: " + length + " minutes");
        System.out.println("Album: " + album);
        System.out.println("---------------------");
    }// ends displayDetails

    // Getters
    public String getArtist() {
        return artist;
    } // end getDirector

    public double getLength() {
        return length;
    } // end getDuration

    public String getAlbum() {
        return album;
    } // end getRatingCode


    // Setters
    // ---------------------------
    public void setArtist(String artist) {
        this.artist = artist;
    } // end setDirector

    public void setLength(double length) {
        this.length = length;
    } // end setDuration

    public void setAlbum(String album) {
        this.album = album;
    } // end setRatingCode
}// end song class