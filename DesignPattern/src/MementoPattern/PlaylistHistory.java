package MementoPattern;

import java.util.Stack;

public class PlaylistHistory {
    Stack<MusicPlayer.PlayListMemento> history = new Stack<>();

    public void save(MusicPlayer musicPlayer) {
        history.push(musicPlayer.save());
    }

    public void revert(MusicPlayer musicPlayer) {
        if(!history.isEmpty()) {
            musicPlayer.revert(history.pop());
        } else {
            System.out.println("Cannot Undo");
        }
    }
}
