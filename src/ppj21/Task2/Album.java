package ppj21.Task2;

public class Album {
    private String title;
    private Song[] songs;

    Album(String title, Song[] songs) {
        this.title = title;
        this.songs = songs;
    }

    public String getTitle() {
        return title;
    }

    public Song[] getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return title;
    }
}
