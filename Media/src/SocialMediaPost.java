import java.time.LocalDate;

public class SocialMediaPost extends Digital{
    private int viewCount;
    private boolean isPosted;

    public SocialMediaPost(String author, String title, double fileSize, String platform, LocalDate postDate) {
        super(author, title, fileSize, platform, postDate);
        isPosted = false;
        viewCount = 0;
    }

    @Override
    public void post(String platform){
        if(!isPosted) {
            isPosted = true;
            super.post(platform);
        } else {
            System.out.println("This has already been posted");
        }
    }

    public void view(int views){
        if(isPosted){
            this.viewCount += views;
            System.out.println(getTitle() + " now has " + this.viewCount + " views");
        } else {
            System.out.println("This video must be posted before it can be viewed");
        }
    }

    public void delete(){
        if(isPosted){
            isPosted = false;
            this.viewCount = 0;
            System.out.println(getTitle() + " has been deleted.");
        } else {
            System.out.println("This video must be posted before it can be deleted");
        }
    }

}
