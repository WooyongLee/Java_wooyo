public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITNewsPublisher server = new ITNewsPublisher();
		NewsClient client1 = new NewsClient("Lee");
		NewsClient client2 = new NewsClient("WooYONG");
		server.addObserver(client1);
		server.addObserver(client2);
		server.setNewFeed("KOR 1: BRA 0");
		server.setNewFeed("KOR 2: BRA 0");
		server.deleteObserver(client2);
		server.setNewFeed("KOR 2: BRA 1");

	}

}