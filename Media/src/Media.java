public abstract class Media {
    protected String author;
    protected String title;

    public Media(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }
}
