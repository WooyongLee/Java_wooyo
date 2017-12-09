
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
	// coffee�� tea Ŭ������ �ߺ��Ǿ� �ִ� �޼ҵ��
	protected final void boilWater() {
		// ������ �Ұ��ϵ��� ����
		System.out.println("Boil water");
	}
	protected abstract void brew();	
	protected final void pourInCup() {
		System.out.println("Pour in cup");
	}
	protected abstract void addCondiments();
}