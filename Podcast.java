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
    } // end totalContentMinutes

    public void promote(){
        System.out.println("Check out " + host + "'s latest episode of " + "'" + getTitle() + "'!");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Host: " + host);
        System.out.println("Episodes: " + episodes);
        System.out.println("Avg Length (min): " + avgLength);
        System.out.println("Total Content (min): " + totalContentMinutes());
        System.out.println("---------------------");
    }// ends displayDetails

    // Getters
    public String getHost() {
        return host;
    } // end getHost

    public int getEpisodes() {
        return episodes;
    } // end getEpisodes

    public double getAvgLength() {
        return avgLength;
    } // end getAvgLength


    // Setters
    // ---------------------------
    public void setHost(String host) {
        this.host = host;
    } // end setHost

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    } // end setEpisodes

    public void setAvgLength(double avgLength) {
        this.avgLength = avgLength;
    } // end setAvgLength
}