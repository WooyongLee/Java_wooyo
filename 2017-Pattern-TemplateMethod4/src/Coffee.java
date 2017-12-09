
public class Coffee extends CaffeineBeverage{
	public Coffee(CaffeinBeverageStrategy strategy) {
		super(strategy);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("Brew coffee grinds");
	}
	@Override
	public void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Add sugar and milk");
	}
}
