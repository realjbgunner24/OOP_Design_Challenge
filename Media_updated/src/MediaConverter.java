public class MediaConverter {
    /**
     * Converts a Print object to a Digital object.
     * Demonstrates **stamp coupling** by passing a structured Print object.
     */
    public static Digital convertPrintToDigital(Print print, double fileSize) {
        return new Digital(print.getTitle(), print.getAuthor(), fileSize);
    }

}
