package MementoPattern;

import java.util.ArrayList;

public class MusicPlayer {
    ArrayList<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public ArrayList<Song> getSongs() {
        return (ArrayList<Song>) songs.clone();
    }

    public PlayListMemento save() {
        return new PlayListMemento(getSongs());
    }

    public void revert(PlayListMemento playListMemento) {
        songs = playListMemento.getSongs();
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "songs=" + songs +
                '}';
    }

    static class PlayListMemento {
        ArrayList<Song> songs;

        public PlayListMemento(ArrayList<Song> songs) {
            this.songs = songs;
        }

        private ArrayList<Song> getSongs() {
            return songs;
        }
    }
}
