import java.util.ArrayList;

public class Library {

    private ArrayList<Book> libraryBooks = new ArrayList<Book>();

    public Library() {

    }

    public void addBook(Book newBook) {
        libraryBooks.add(newBook);
    }

    public void printBooks() {
        for(Book index: libraryBooks) {
            System.out.println(index);
        }
    }

    public ArrayList<Book> searchByTitle(String title){

//        if(StringUtils.included(book.title(), searchedTitle)) {
//            // Book found!
//        }

        ArrayList<Book> found = new ArrayList<Book>();
        for(Book index: libraryBooks){
            if(StringUtils.included(index.title(), title)){
                found.add(index);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book index: libraryBooks){
            if(StringUtils.included(index.publisher(), publisher)){
                found.add(index);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book index: libraryBooks){
            if(index.year() == year) {
                found.add(index);
            }
        }
        return found;
    }
}
