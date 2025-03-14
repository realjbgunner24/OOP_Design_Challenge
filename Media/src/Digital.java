import java.time.LocalDate; 
public class Digital extends Media implements Downloadable {
    private double fileSize; // Size of the digital media file in MB
    protected String platform;
    protected LocalDate postDate;

    public Digital(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    /**
     * Implementation of the download method from the Downloadable interface.
     * This shows interface implementation.
     */
    @Override
    public void download() {
        System.out.println("Downloading " + getTitle() + " (" + fileSize + "MB)...");
    }

    public void post(String platform) {
        this.postDate = LocalDate.now();
        this.platform = platform;
        System.out.println(getTitle() + " was posted on " + this.platform + " by " + getAuthor() + " on " + this.postDate);
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }
}
