import java.util.List;

public abstract class ReportGenerator {
	protected List<Customer> selected = null;
	// 기존의 추상클래스
	public abstract String generate(List<Customer> customers);
	
	// header, main, footer로 나누어 생각하기
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
		return String.format("고객 수 : %d명\n", customers.size());
	}
	protected String generateFooter(List<Customer> customers) {
		return null;
	}
}
