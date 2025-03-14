import java.time.LocalDate;

public class Book extends Print {

    protected String genre;
    

    public Book(String author, String title, String genre) {
        super(author, title);
        this.genre = genre;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void publish(){
        this.publishDate = LocalDate.now();
        System.out.println("The book "+getTitle() + " was published by " + this.author + " on " + this.publishDate);
    }


    

}
