
public class Main {
	public static void main(String[] args) {
		FullName name1 = new FullNameAdapter1(new User("이", "우용"));
		// 객체가 두개가 생성이 됨
		FullName name2 = new FullNameAdapter2("이", "우용");
		System.out.println(name1.getFullName());
		System.out.println(name2.getFullName());
	}
}
