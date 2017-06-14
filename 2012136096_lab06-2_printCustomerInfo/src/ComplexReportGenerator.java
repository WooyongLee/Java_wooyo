import java.util.List;
import java.util.stream.Collectors;

public class ComplexReportGenerator extends ReportGenerator {
	@Override
	public String generate(List<Customer> customers){
		List<Customer> selected = customers.stream()
				.filter(c->c.getPoint() >= 200)
				.collect(Collectors.toList());
		// filter�� �մϴ�. ����Ʈ�� 200���� ū�ɷ�
		// 200���� ū �ֵ��� ��Ͽ� ������ �̾Ƴ�
		// ���͸��� ����Ʈ�� selected ����Ʈ�� �������
 		
		String report = String.format("�� �� : %d��\n", selected.size());
		
		report = selected.stream()
				.map(c->String.format("%s : %d%n", c.getName(), c.getPoint()))
				.reduce(report,String::concat);
		// selected�� ����Ʈ�� ������� ����մϴ�.
		
		report += String.format("�հ� : %d", selected.stream()
				.map(c->c.getPoint())
				.reduce(0,Integer::sum));
		// selected�� ����Ʈ�� �հ踦 ���մϴ�.
		// ���⼭ stream API�� ������ ������ ����մϴ�.
		
		return report;
	
	}
}