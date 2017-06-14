
public class FullNameAdapter1 implements FullName {
	// 1. has-a ���踦 �̿��ϱ�(Object Adapter)
	private User user;
	public FullNameAdapter1(User user) {
		this.user = user;
	}
	@Override
	public String getFullName() {
		return user.getFirstName() + " " + user.getLastName() ;
		// return null;
	}

}
