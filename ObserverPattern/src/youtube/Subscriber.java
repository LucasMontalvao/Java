package youtube;

public class Subscriber implements ISubscriber {
	private String notification;
	private String name;
	
	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void newVideoAdded(String channelName, Videos video) {
		this.notification = "Hey "+ this.name + " a new video " + video.getTitle() + " from channel " + channelName + " has been added! Go check it out!";
		System.out.println(notification);
	}
	
}
