public class Book {

    private String title;
    private String publisher;
    private int year;

    public Book(String bookTitle, String bookPublisher, int printYear) {
        this.title = bookTitle;
        this.publisher = bookPublisher;
        this.year = printYear;
    }

    public String title() {
        return this.title;
    }

    public String publisher() {
        return this.publisher;
    }

    public int year() {
        return this.year;
    }

    public String toString() {
        return this.title + ", " + this.publisher + ", " + this.year;
    }
}
