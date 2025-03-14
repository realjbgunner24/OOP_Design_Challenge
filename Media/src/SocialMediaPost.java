import java.time.LocalDate;

public class SocialMediaPost extends Digital{

    protected int viewCount;
    protected boolean isPosted;
    public SocialMediaPost(String author, String title, double fileSize) {
        super(author, title, fileSize);
        isPosted = false;
        viewCount = 0;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void post(String platform){
        if(!isPosted){
        isPosted = true;
        this.postDate = LocalDate.now();
        this.platform = platform;
        System.out.println(getTitle() + " was posted on " + this.platform + " by " + getAuthor() + " on " + this.postDate);
        }else{
            System.out.println("This has already been posted");
        }
    }

    public void view(int views){
        if(isPosted){
        this.viewCount += views;
        System.out.println(this.getTitle()+" now has "+this.viewCount+" views");
        }else{
            System.out.println("This video must be posted before it can be viewed");
        }
    }

    public void delete(){
        if(isPosted){
            isPosted = false;
            this.viewCount = 0;
        }else{
            System.out.println("This video must be posted before it can be deleted");
        }
    }

 



}
