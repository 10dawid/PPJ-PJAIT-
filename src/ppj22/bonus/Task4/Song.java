package ppj22.bonus.Task4;

public class Song {
    private String title;
    private String singer;

    public Song(String title, String singer){
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
        return title + " - " + singer;
    }
}
