package lab02;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewsPublisher newsServer = new SportsNewsPublisher();
		NewsClient client1 = new NewsClient("Lee");
		NewsClient client2 = new NewsClient("wooyong");
		newsServer.addObserver(o, client1);
		newsServer.addObserver(o, client2);
		newsServer.setNewFeed("리버풀 1: 맨유 0");
		newsServer.deleteObserver(o, client2);
		newsServer.setNewFeed("리버풀 2: 맨유 0"); 

	}

}
