
public class FullNameAdapter2 extends User implements FullName{
	// 2. 상속관계를 이용하기 (Class Adapter)
	public FullNameAdapter2(String firstName, String lastName) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getFullName() {
		// TODO Auto-generated method stub
		return getFirstName() + " " + getLastName();
	}
	

}
