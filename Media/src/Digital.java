import java.time.LocalDate; // import the LocalDate class
public class Digital extends Media{

private String platform;
private LocalDate postDate;

public Digital(String author, String title) {
        super(author, title);
        //TODO Auto-generated constructor stub
    }

public void Post(String platform){
this.postDate = LocalDate.now();
this.platform = platform;
System.out.println(this.title+" was posted on "+this.platform+" by "+this.author+" on "+this.postDate);
}





}
