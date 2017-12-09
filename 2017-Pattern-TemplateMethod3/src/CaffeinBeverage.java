
public abstract class CaffeinBeverage {
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments())
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
	// ��޼ҵ带 ���� ÷�������� �߰��Ǿ�� ��� �޼ҵ���� abstract�� �����ϰ�
	// ÷���� �ʿ���°� �߰����ص� �Ǵ½�����
	protected boolean customerWantsCondiments() {
		return true;
	}
	//�� �޼ҵ�� ���� ���� ��¼����¼��
	//
}