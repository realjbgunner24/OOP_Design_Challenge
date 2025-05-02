import java.time.LocalDate;

public class Book extends Print {
    private String genre;
    
    public Book(String author, String title, String genre) {
        super(author, title);
        this.genre = genre;
    }

    @Override
    public void publish(){
        setPublishDate(LocalDate.now());
        System.out.println("The book "+ getTitle() + " was published by " + getAuthor() + " on " + getPublishDate());
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
