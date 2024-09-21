package BookPackage;

public class Book {
    private String author;
    private String title;

    public static String of(String author, String title) {
        String bookData = author + ", " + title;
        System.out.println(bookData);
        return bookData;
    }
}