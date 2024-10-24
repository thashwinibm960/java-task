public class LiteraryGenreRunner {
    public static void main(String[] args) {
        LiteraryGenre book1 = new LiteraryGenre("The Great Gatsby", "F. Scott Fitzgerald", 1925, LiteraryGenre.GenreType.FICTION, true);
        LiteraryGenre book2 = new LiteraryGenre("Sapiens", "Yuval Noah Harari", 2011, LiteraryGenre.GenreType.NON_FICTION, true);
        LiteraryGenre book3 = new LiteraryGenre("Gone Girl", "Gillian Flynn", 2012, LiteraryGenre.GenreType.MYSTERY, true);
        LiteraryGenre book4 = new LiteraryGenre("Harry Potter", "J.K. Rowling", 1997, LiteraryGenre.GenreType.FANTASY, true);
        LiteraryGenre book5 = new LiteraryGenre("Dune", "Frank Herbert", 1965, LiteraryGenre.GenreType.SCIENCE_FICTION, true);

        book1.printDetails();
        book2.printDetails();
        book3.printDetails();
        book4.printDetails();
        book5.printDetails();
    }
}