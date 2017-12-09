
public class Coffee extends CaffeinBeverage{
	@Override
	public void prepareRecipe() {
		boilWater();
		brewCoffeGrinds();
		pourInCup();
		addSugarAndMilk();
	}
	public void brewCoffeGrinds() {
		System.out.println("Brew coffee grinds");
	}
	public void addSugarAndMilk() {
		System.out.println("Add sugar and milk");
	}
}
