package ppj22.bonus.Task4;

import java.util.Arrays;

public class Shelf {
    private Album[] albums;

    public Shelf(Album[] albums) {
        this.albums = albums;
    }

    public Album[] getAlbums() {
        return albums;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "albums=" + Arrays.toString(albums) +
                '}';
    }

    public String findAlbumBySong(String title){
        for(Album album : albums){
            for(Song song : album.getSongs()){
                if (song.getTitle().equals(title)) return album.getTitle();
            }
        }
        return "Album Not Found";
    }
}
