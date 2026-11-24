class Book{
    int bookId;
    String title;
    String author;
    Book(int bookId, String title){
        this(bookId, title, "Amar");
        this.bookId = bookId;
        this.title = title;
    }
    Book(int bookId, String title, String author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
    void displayBook(){
        System.out.println("Book Id = "+bookId);
        System.out.println("Book Title = "+title);
        System.out.println("Book Author = "+author);
    }
}

public class Task32 {
    public static void main(String[] args) {
        Book book1 = new Book(61, "Men in Love");
        Book book2 = new Book(12, "Men After Marriage", "Hari");

        book1.displayBook();
        book2.displayBook();
    }
}
