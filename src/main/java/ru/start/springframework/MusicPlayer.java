package ru.start.springframework;

public class MusicPlayer {
    private Music music;
    // inversion of control
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
