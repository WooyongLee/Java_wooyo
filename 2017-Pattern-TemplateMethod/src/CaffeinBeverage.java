
public abstract class CaffeinBeverage {
	public abstract void prepareRecipe();
	// coffee�� tea Ŭ������ �ߺ��Ǿ� �ִ� �޼ҵ��
	protected final void boilWater() {
		// ������ �Ұ��ϵ��� ����
		System.out.println("Boil water");
	}
	protected final void pourInCup() {
		System.out.println("Pour in cup");
	}
}