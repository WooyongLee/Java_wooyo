
public abstract class CaffeinBeverage {
	// 코드 중복을 줄이고자 CaffeinBeverage에 prepareRecipe를 넣어놓음
	// 자식클래스에서는 아래 abstract 메소드들만 재정의 할수있게끔
	public final void prepareRecipe() {
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