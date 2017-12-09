
public abstract class CaffeinBeverage {
	public abstract void prepareRecipe();
	// coffee와 tea 클래스에 중복되어 있는 메소드들
	protected final void boilWater() {
		// 재정의 불가하도록 만듦
		System.out.println("Boil water");
	}
	protected final void pourInCup() {
		System.out.println("Pour in cup");
	}
}