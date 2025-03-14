import java.time.LocalDate; 

public class Print extends Media {
    private LocalDate publishDate;

    public Print(String author, String title) {
        super(author, title);
    }

    public void publish() {
        this.publishDate = LocalDate.now();
        System.out.println(getTitle() + " was published on " + this.publishDate + " by " + getAuthor());
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public LocalDate getPublishDate() {
        return this.publishDate;
    }

}
