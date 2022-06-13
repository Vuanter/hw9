public class Book {

    private final String bookName;

    Author author;
    private int publishedYear;

    public Book(String bookName, Author author, int publishedYear) {

        this.bookName = bookName;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getBookName() {
        return this.bookName;
    }
     Author getAuthor() {
        return this.author;
    }
    public int getPublishedYear() {
        return this.publishedYear;
    }
    public void setPublishedYear(int newPublishedYear) {
        this.publishedYear = newPublishedYear;
    }


}
