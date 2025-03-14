public class App {
    public static void main(String[] args) throws Exception {
        Print HarryPotter = new Print("R.L Stines","HarryPotter");
        Digital DailyNews = new Digital("David A", "Why are eggs so expensive");
        HarryPotter.Publish();
        DailyNews.Post("NBC");
    }
}
