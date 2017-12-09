
public abstract class CaffeinBeverage {
	// �ڵ� �ߺ��� ���̰��� CaffeinBeverage�� prepareRecipe�� �־����
	// �ڽ�Ŭ���������� �Ʒ� abstract �޼ҵ�鸸 ������ �Ҽ��ְԲ�
	public final void prepareRecipe() {
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