package lab02;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewsPublisher newsServer = new SportsNewsPublisher();
		NewsClient client1 = new NewsClient("Lee");
		NewsClient client2 = new NewsClient("wooyong");
		newsServer.addObserver(o, client1);
		newsServer.addObserver(o, client2);
		newsServer.setNewFeed("����Ǯ 1: ���� 0");
		newsServer.deleteObserver(o, client2);
		newsServer.setNewFeed("����Ǯ 2: ���� 0"); 

	}

}
