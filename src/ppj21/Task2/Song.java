package ppj21.Task2;

public class Song {
    private String title;
    private String singer;

    Song(String title, String singer) {
        this.title = title;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }

    @Override
    public String toString() {
        return "title -> " + title + ", singer -> " + singer;
    }
}
