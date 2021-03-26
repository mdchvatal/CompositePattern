package CompositePattern;

import java.util.ArrayList;

public class Playlist implements IComponent{
	private String title;
	private float playbackSpeed;
	private ArrayList<IComponent> playlist;
	
	public Playlist(String title) {
		this.title = title;
		this.playbackSpeed = 1.0f;
		this.playlist = new ArrayList<IComponent>();
	}
	
	@Override
	public void play() {
		playlist.forEach(x -> x.play());
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		this.playbackSpeed = speed;
	}
	
	public float getPlaybackSpeed() {
		return playbackSpeed;
	}

	@Override
	public String getName() {
		return title;
	}
	
	public void add(IComponent component) {
		playlist.add(component);
	}
	
	

}
