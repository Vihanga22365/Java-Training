package MementoPattern;

public class Application {
    public static void main(String[] args) {

        PlaylistHistory playlistHistory = new PlaylistHistory();
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.addSong(new Song("Classical Song"));
        musicPlayer.addSong(new Song("Hip-Hop Song"));
        playlistHistory.save(musicPlayer);
        System.out.println(musicPlayer);

        musicPlayer.addSong(new Song("Pop Song"));
        playlistHistory.revert(musicPlayer);
        System.out.println(musicPlayer);

        musicPlayer.addSong(new Song("Electronic Dance Music Song"));
        playlistHistory.save(musicPlayer);
        System.out.println(musicPlayer);

        musicPlayer.addSong(new Song("Country Song"));
        musicPlayer.addSong(new Song("Gospel Song"));
        musicPlayer.addSong(new Song("Folk Song"));
        playlistHistory.save(musicPlayer);
        System.out.println(musicPlayer);

        playlistHistory.revert(musicPlayer);
        System.out.println(musicPlayer);

        playlistHistory.revert(musicPlayer);
        System.out.println(musicPlayer);

        playlistHistory.revert(musicPlayer);
        System.out.println(musicPlayer);

        playlistHistory.revert(musicPlayer);
        System.out.println(musicPlayer);


    }
}
