import java.time.LocalDate;

public class SocialMediaPost extends Digital{
    private int viewCount;

    public SocialMediaPost(String author, String title, double fileSize, String platform, LocalDate postDate) {
        super(author, title, fileSize, platform, postDate);
        viewCount = 0;
    }

    @Override
    public void post(String platform){
        if(getPostDate() == null){     // #2 change
            super.post(platform);
        } else {
            System.out.println("This has already been posted");
        }
    }

    public void addViews(int views){   // #1 change
        if(getPostDate() != null){        // #2 change
            this.viewCount += views;
            System.out.println(getTitle() + " now has " + this.viewCount + " views");
        } else {
            System.out.println("This video must be posted before it can be viewed");
        }
    }

    public void deletePost(){    // #1 change
        if(getPostDate() != null){    // #2 change
            this.viewCount = 0;
            System.out.println(getTitle() + " has been deleted.");
        } else {
            System.out.println("This video must be posted before it can be deleted");
        }
    }

    public int getViewCount(){ // #3 change
        return viewCount;
    }
}
