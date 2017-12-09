
public abstract class CaffeinBeverage {
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments())
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
	// 빈메소드를 만들어서 첨가물들이 추가되어아 햐는 메소드들을 abstract로 정의하고
	// 첨가물 필요없는건 추가안해도 되는식으로
	protected boolean customerWantsCondiments() {
		return true;
	}
	//빈 메소드로 훅을 만들어서 어쩌구저쩌구
	//
}