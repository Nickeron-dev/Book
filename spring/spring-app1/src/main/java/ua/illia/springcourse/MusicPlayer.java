package ua.illia.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	private Music music;
	
	@Autowired
	public MusicPlayer(ClassicalMusic music) {
		this.music = music;
	}
	
	public MusicPlayer() {}
	
	public void setMusic(Music music) {
		this.music = music;
	}
	
	public void playMusic() {
		System.out.println("Playing: " + music.getSong());
	}
}
