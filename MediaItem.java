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

    // --------------------------------------------------------
    // Overloaded constructor
    // No phone number is provided, so we use a default value.
    // --------------------------------------------------------
    public Student(String name, String major, String email) {
        this(name, major, email, "N/A");
    } // end constructor Student(name, major, email)

    // --------------------------------------------------------
    // Overloaded constructor
    // Only name and major are provided.
    // --------------------------------------------------------
    public Student(String name, String major) {
        this(name, major, "unknown@email.com", "N/A");
    } // end constructor Student(name, major)

    // --------------------------------------------------------
    // Overloaded constructor
    // No values are provided.
    // --------------------------------------------------------
    public Student() {
        this("Unknown", "Undeclared", "none@email.com", "N/A");
    } // end constructor Student()

    // ---------------------------
    // Getters
    // ---------------------------
    public String getName() {
        return name;
    } // end getName

    public String getMajor() {
        return major;
    } // end getMajor

    public String getEmail() {
        return email;
    } // end getEmail

    public String getPhone() {
        return phone;
    } // end getPhone

    // ---------------------------
    // Setters
    // ---------------------------
    public void setName(String name) {
        this.name = name;
    } // end setName

    public void setMajor(String major) {
        this.major = major;
    } // end setMajor

    public void setEmail(String email) {
        this.email = email;
    } // end setEmail

    public void setPhone(String phone) {
        this.phone = phone;
    } // end setPhone

    // --------------------------------------------------------
    // Display method
    // A child class can override this method.
    // --------------------------------------------------------
    public void displayStudent() {
        System.out.println("Type: Student");
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("----------------------");
    } // end displayStudent

} // end class Student