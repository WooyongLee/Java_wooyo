package lab01;

public class Test {
	public static void main(String[] args) {
		Player player1 = new Player(new RandomStrategy());
		Player player2 = new Player(new LastResultBasedStrategy());
		for(int i=0; i<100; i++){
			HandType h1 = player1.nextHand();
			HandType h2 = player2.nextHand();
			System.out.printf("�����1: %s VS �����2: %s", h1, h2);
			if(h1==h2){
					System.out.println(" > ���: ���º�");
						player1.setResult(ResultType.DRAWN);
						player2.setResult(ResultType.DRAWN);
			}
			else if(h1.winValueOf()==h2){
				System.out.println(" > ���: �����2 ��");
				player1.setResult(ResultType.LOST);
				player2.setResult(ResultType.WON);
			}
			else{
				System.out.println(" > ���: �����1 ��");
				player1.setResult(ResultType.WON);
				player2.setResult(ResultType.LOST);
			}
		}
		System.out.println(player1);
		System.out.println(player2);
	}
}