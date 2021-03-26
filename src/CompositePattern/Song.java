package CompositePattern;

public class Song implements IComponent{
	private String name;
	private String artist;
	private float playbackSpeed;
	
	public Song(String name, String artist) {
		this.name = name;
		this.artist = artist;
		playbackSpeed = 1.0f;
	}
	
	@Override
	public void play() {
		System.out.println(getName() + " by " + getArtist() + 
				" playing at " + getPlaybackSpeed() + " speed.\n");
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	public String getArtist() {
		return artist;
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		this.playbackSpeed = speed;
		
	}
	
	public float getPlaybackSpeed() {
		return playbackSpeed;
	}

}
