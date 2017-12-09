
public abstract class CaffeineBeverage {
	private CaffeinBeverageStrategy strategy;
	public CaffeineBeverage(CaffeinBeverageStrategy strategy) {
		this.strategy = strategy;
	}
	public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	// coffee와 tea 클래스에 중복되어 있는 메소드들
	protected final void boilWater() {
		// 재정의 불가하도록 만듦
		System.out.println("Boil water");
	}
	protected abstract void brew();	
	protected final void pourInCup() {
		System.out.println("Pour in cup");
	}
	protected abstract void addCondiments();
}