package ppj22.bonus.Task4;

public class Main {
    public static void main (String[] args) {
        Album alb1 = new Album("Loving You",
                new Song[]{
                        new Song("Elvis","Party"),
                        new Song("Elvis","Hot Dog")
                });
        Album alb2 = new Album("Ella & Louis",
                new Song[]{
                        new Song("Armstrong","A Foggy Day"),
                        new Song("Cheek to Cheek", "Fitzgerald")
                });
        Shelf shelf = new Shelf(
                new Album[]{alb1,alb2});
        System.out.println("Song from album: " +
                shelf.findAlbumBySong("Cheek to Cheek"));
    }
}
