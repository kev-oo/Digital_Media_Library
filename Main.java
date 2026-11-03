//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie m = new Movie("Inception", "Sci-Fi", 2010, "Christopher Nolan", 2.8, "PG-13");
        m.rateItem(4.8);
        m.toggleFavorite();

        Song s = new Song("Imagine", "Pop", 1971, "John Lennon", 3.1, "Imagine");
        s.rateItem(4.6);

        Podcast p = new Podcast("Tech Talk", "Technology", 2024, "Sarah Nguyen", 42, 38.5);
        p.rateItem(4.2);

        System.out.println("=== Digital Media Library ===");
        m.displayDetails();
        s.displayDetails();
        p.displayDetails();

        System.out.println("Is long movie? " + m.isLongMovie());
        s.playSample();
        System.out.println("From album 'Imagine'? " + s.isFromAlbum("Imagine"));
        p.promote();
        System.out.println("Total podcast minutes: " + p.totalContentMinutes());
        System.out.println("Movie age (years): " + m.yearsOld());
    }
}