package youtube;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Channel aVeryFuckingNiceChannel = new Channel("Cool as fuck boyyyy");
		Subscriber me = new Subscriber("me");
		Subscriber someone = new Subscriber("someone");
		Subscriber anotherRamdonGuy = new Subscriber("anotherRamdonGuy");
		aVeryFuckingNiceChannel.subscribeToChannel(me);
		aVeryFuckingNiceChannel.subscribeToChannel(someone);
		aVeryFuckingNiceChannel.subscribeToChannel(anotherRamdonGuy);
		
		aVeryFuckingNiceChannel.addVideo("How to get a 10 in POO!");
		
		
		
	}

}
