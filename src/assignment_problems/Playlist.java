package assignment_problems;

public class Playlist {
    private String[] songs;
    private int count;

    public Playlist(int maxSongs) {
        this.songs = new String[maxSongs];
        this.count = 0;
    }

    public void addSong(String title) {
        if (this.count < this.songs.length) {
            this.songs[this.count] = title;
            this.count = this.count + 1;
        }
    }

    public String[] getSongs() {
        String[] copy = new String[this.count];
        for (int i = 0; i < this.count; i++) {
            copy[i] = this.songs[i];
        }
        return copy;
    }

    public int getSongCount() {
        return this.count;
    }

    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();
        copy[0] = "Hacked";

        System.out.println(p.getSongs()[0]);
    }
}
