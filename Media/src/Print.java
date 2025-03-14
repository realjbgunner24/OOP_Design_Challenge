import java.time.LocalDate; // import the LocalDate class

public class Print extends Media{
private LocalDate publishDate;

public Print(String author, String title) {
    super(author, title);
    //TODO Auto-generated constructor stub
}

public void Publish(){
publishDate = LocalDate.now();
System.out.println(this.title+" was published on "+this.publishDate+" by "+this.author);
}

public LocalDate getPublishDate(){
return this.publishDate;
}

}
