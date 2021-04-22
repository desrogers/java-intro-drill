import java.util.ArrayList;

public class Playlist {
    public String name;
    public ArrayList<Song> playlist;

    public Playlist(String name) {
      this.name = name;
      this.playlist = new ArrayList<Song>();
    }

    public boolean isEmpty() {
        return playlist.isEmpty();
    }

    public void addSong(Song song) {
        playlist.add(song);
    };

    public String[] songNames() {
        if (this.isEmpty()) {
            return new String[0];
        }

        String[] songArray = new String[2];
        songArray[0] = this.playlist.get(0).title;
        songArray[1] = this.playlist.get(1).title;
        return songArray;
    }

    public int totalDuration() {
        int total = 0;
        for (int i = 0; i < this.playlist.size(); i += 1) {
            total += this.playlist.get(i).durationInSeconds;
        }
        return total;
    }
}
