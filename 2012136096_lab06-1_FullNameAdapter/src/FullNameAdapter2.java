
public class FullNameAdapter2 extends User implements FullName{
	// 2. ��Ӱ��踦 �̿��ϱ� (Class Adapter)
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
