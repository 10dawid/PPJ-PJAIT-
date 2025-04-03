package ppj22.bonus.Task4;

public class Album {
    private String title;
    private Song[] songs;

    public Album(String title, Song[] songs){
        this.title = title;
        this.songs = songs;
    }

    public Song[] getSongs() {
        return songs;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        String songsString = "";
        songsString += "Title: " + title + "\n";
        for (Song song : songs) {
            songsString += song + "\n";
        }
        return songsString;
    }
}
