
public class Tea extends CaffeineBeverage{
	public Tea(CaffeinBeverageStrategy strategy) {
		super(strategy);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("Steep Teabag");
	}
	@Override
	public void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Add lemon");
	}
}
