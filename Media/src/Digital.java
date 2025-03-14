public class Digital extends Media implements Downloadable {
    private double fileSize; // Size of the digital media file in MB

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

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }
}
