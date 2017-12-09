
public class Tea extends CaffeinBeverage{
	@Override
	public void prepareRecipe() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}
	public void steepTeaBag() {
		System.out.println("Steep Teabag");
	}
	public void addLemon() {
		System.out.println("Add lemon");
	}
}
