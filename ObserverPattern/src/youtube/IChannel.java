package youtube;

public interface IChannel {
	void subscribeToChannel(Subscriber sub);
	void unfollowChannel(Subscriber sub);
	void notifySubscriber(Videos video);
}
