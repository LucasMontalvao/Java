package youtube;

import java.util.ArrayList;
import java.util.List;

public class Channel implements IChannel {
	private List<Subscriber> subscribers;
	private List<Videos> videos;
	private String name;
	
	public Channel(String name) {
		this.name = name;
		subscribers = new ArrayList();
		videos = new ArrayList();
	}
	
	public void addVideo(String videoName) {
		Videos video = new Videos(videoName);
		videos.add(video);
		notifySubscriber(video);
	}
	
	@Override
	public void subscribeToChannel(Subscriber sub) {
		subscribers.add(sub);
	}

	@Override
	public void unfollowChannel(Subscriber sub) {
		subscribers.remove(sub);
	}

	@Override
	public void notifySubscriber(Videos video) {
		for(Subscriber subs: subscribers ) {
			subs.newVideoAdded(this.name, video);
		}
		
	}
}
