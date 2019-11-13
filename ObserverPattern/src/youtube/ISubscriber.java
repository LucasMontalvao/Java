package youtube;

public interface ISubscriber {
	void newVideoAdded(String channelName, Videos video);
}
