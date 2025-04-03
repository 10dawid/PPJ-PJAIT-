package ppj21.Task2;

public class Shelf {
    private Album[] albums;

    Shelf(Album[] albums) {
        this.albums = albums;
    }

    public Album[] getAlbums() {
        return albums;
    }

    public String findAlbumBySong(String title){
        for (int i = 0; i < albums.length; i++){
            Song[] songs = albums[i].getSongs();
            for (int j = 0; j < songs.length; j++){
                if (songs[j].getTitle().equals(title)){
                    return albums[i].getTitle();
                }
            }
        }
        return null;
    }
}
