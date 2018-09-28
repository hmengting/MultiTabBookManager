package bookmanager.groupone.test2;

import java.util.ArrayList;

public class SimpleBookManager {

    private ArrayList<Book> bookList = new ArrayList<Book>();

    public SimpleBookManager() {
        bookList.add(new Book("Art history", "Matt J", "Course 1","001", 100));
        bookList.add(new Book("Music history","Jenny K", "Course 2", "002", 200));
        bookList.add(new Book("Library history", "Peter P","Course 3","003",300));
        bookList.add(new Book("Furniture history", "Olivia R", "Course 4","004",400));
        bookList.add(new Book("Computer history","Adam T","Course 5","005",501));
    }

    public int count(){
        return bookList.size();

    }

    public Book getBook(int index){
        return bookList.get(index);

    }

    public Book createBook(String title, String author, String course, String isbn, int price ){
        Book book = new Book(title, author, course, isbn, price);
        bookList.add(book);
        return book;


    }


    public ArrayList<Book> getAllBooks(){
        return  bookList;

    }
    public void removeBook(Book book){
        int bookPos = bookList.indexOf(book);
        bookList.remove(bookPos);

    }
    public void moveBook (int from, int to){
        Book temp = bookList.get(from);
        bookList.remove(from);
        bookList.add(to, temp);
    }

    public int getMinPrice(){
        int N = bookList.size();

        if (N==0){
            throw new Error("No book in the list");
        }
        else{
            int minPrice = bookList.get(0).getPrice();
            while(N>1){
                int currentPrice = bookList.get(N-1).getPrice();
                if (minPrice > currentPrice){
                    minPrice = currentPrice;
                }
                N--;
            }
            return minPrice;
        }

    }
    public int getMaxPrice(){
        int N = bookList.size();

        if (N==0){
            throw new Error("No book in the list");
        }
        else{
            int maxPrice = bookList.get(0).getPrice();
            while(N>1){
                int currentPrice = bookList.get(N-1).getPrice();
                if (maxPrice < currentPrice){
                    maxPrice = currentPrice;
                }
                N--;
            }
            return maxPrice;
        }

    }

    public float getMeanPrice(){
        float meanPrice = (float) getTotalCost()/count();
        return meanPrice;
    }

    public int getTotalCost(){
        int totalCost = 0;
        for (int i=0; i<bookList.size(); i++){
            totalCost = totalCost + bookList.get(i).getPrice();
        }
        return totalCost;
    }

    public void saveChanges(){

    }
}
