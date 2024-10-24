public class LiteraryGenre {
    public enum GenreType {
        FICTION, NON_FICTION, MYSTERY, FANTASY, SCIENCE_FICTION
    }

    static String organization;
    static int popularBooksCount;
    static String typicalAudience;

    String title;
    String author;
    int publicationYear;
    GenreType genre;
    boolean isBestSeller;

    static {
        organization = "Literary Association";
        popularBooksCount = 10; 
        typicalAudience = "General Audience"; 
    }

    public LiteraryGenre(String title, String author, int publicationYear, GenreType genre, boolean isBestSeller) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.isBestSeller = isBestSeller;
    }

    public void printDetails() {
        System.out.println("Organization: " + organization);
        System.out.println("Popular Books Count: " + popularBooksCount);
        System.out.println("Typical Audience: " + typicalAudience);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Genre: " + genre);
        System.out.println("Is Best Seller: " + isBestSeller);
        System.out.println(); 
    }
}


