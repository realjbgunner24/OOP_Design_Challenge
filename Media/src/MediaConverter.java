import java.time.LocalDate;

public class MediaConverter {
    /**
     * Converts a Print object to a Digital object.
     * Demonstrates **stamp coupling** by passing a structured Print object.
     */
    public static Digital convertPrintToDigital(Print print, double fileSize, String platform, LocalDate postDate) {
        return new Digital(print.getTitle(), print.getAuthor(), fileSize, platform, postDate);
    }

}
