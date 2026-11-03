public class Podcast extends MediaItem {

    private String host;
    private int episodes;
    private double avgLength;


    public Podcast(String title, String genre, int year, String host, int episodes, double avgLength) {

        super(title, genre, year);
        this.host = host;
        this.episodes = episodes;
        this.avgLength = avgLength;
    } // end constructor

    public double totalContentMinutes() {
        return episodes * avgLength;
    } // end getRating

    public void promote(){
        System.out.println("Don't miss " + getTitle() + "hosted by " + host + "!");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Host: " + host);
        System.out.println("Episodes: " + episodes);
        System.out.println("Avg Length: " + avgLength + " minutes");
        System.out.println("Total Content: " + totalContentMinutes() + " minutes");
        System.out.println("---------------------");
    }// ends displayDetails

    // Getters
    public String getHost() {
        return host;
    } // end getDirector

    public int getEpisodes() {
        return episodes;
    } // end getDuration

    public double getAvgLength() {
        return avgLength;
    } // end getRatingCode


    // Setters
    // ---------------------------
    public void setHost(String host) {
        this.host = host;
    } // end setDirector

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    } // end setDuration

    public void setAvgLength(double avgLength) {
        this.avgLength = avgLength;
    } // end setRatingCode
}