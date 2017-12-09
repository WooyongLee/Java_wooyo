import java.util.Scanner;

public class CoffeeWithHook extends CaffeinBeverage {
	// Hook 메소드를 추가하여 재정의하고 싶은거 함
	@Override
	protected void brew() {
		System.out.println("Brew coffee grinds");
	}
	@Override
	protected boolean customerWantsCondiments() {
		Scanner in = new Scanner(System.in);
		System.out.print("Do you want to add Milk and Sugar?? (y/n)");
		String answer = in.nextLine().toLowerCase();
		in.close();
		return answer.equals("y");
	}
	@Override
	protected void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Add sugar and milk");
	}

}
