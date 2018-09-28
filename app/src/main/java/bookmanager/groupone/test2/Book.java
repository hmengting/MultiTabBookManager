package bookmanager.groupone.test2;

public class Book {
    private String author;
    private String title;
    private int price;
    private String isbn;
    private String course;

    public Book(String title, String author, String course, String isbn, int price) {
        this.title = title;
        this.author = author;
        this.course = course;
        this.isbn = isbn;
        this.price = price;


    }

    public Book(){

    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }




}
