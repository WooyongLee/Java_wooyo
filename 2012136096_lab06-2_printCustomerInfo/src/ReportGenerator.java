import java.util.List;

public abstract class ReportGenerator {
	protected List<Customer> selected = null;
	// ������ �߻�Ŭ����
	public abstract String generate(List<Customer> customers);
	
	// header, main, footer�� ������ �����ϱ�
	public String generate2(List<Customer> customers) {
		selected = select(customers);
		return generateHeader(selected) + 
				generateMain(selected) +
				generateFooter(selected);
	}
	protected List<Customer> select(List<Customer> customers) {
		return customers;
	}
	
	// header, main, footer
	protected String generateHeader(List<Customer> customers) {
		return null;
	}
	protected String generateMain(List<Customer> customers) {
		return String.format("�� �� : %d��\n", customers.size());
	}
	protected String generateFooter(List<Customer> customers) {
		return null;
	}
}
