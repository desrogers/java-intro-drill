import java.util.ArrayList;

public class Playlist {
    public String name;
    public ArrayList<Song> playlist;

    public Playlist(String name) {
      this.name = name;
      this.playlist = new ArrayList<>();
    }

    public boolean isEmpty() {
        return playlist.isEmpty();
    }

    public void addSong(Song song) {
        playlist.add(song);
    }

    public String[] songNames() {
        if (this.isEmpty()) {
            return new String[0];
        }

        String[] songArray = new String[this.playlist.size()];
        for (int i = 0; i < songArray.length; i += 1) {
            songArray[i] = this.playlist.get(i).title;
        }

        return songArray;
    }

    public int totalDuration() {
        int total = 0;
        for (Song song : this.playlist) {
            total += song.durationInSeconds;
        }
        return total;
    }

    public void swap(Song sOne, Song sTwo) {
        int sOneIdx = this.playlist.indexOf(sOne);
        int sTwoIdx = this.playlist.indexOf(sTwo);

        this.playlist.set(sOneIdx, sTwo);
        this.playlist.set(sTwoIdx, sOne);
    }
}
