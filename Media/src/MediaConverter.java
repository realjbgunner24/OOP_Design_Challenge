public class MediaConverter {

    public static Digital convertPrintToDigital(Print print, double fileSize) {
        return new Digital(print.getTitle(), print.getAuthor(), fileSize);
    }
    
}
