import java.util.List;
import java.util.stream.Collectors;

public class ComplexReportGenerator extends ReportGenerator {
	@Override
	public String generate(List<Customer> customers){
		List<Customer> selected = customers.stream()
				.filter(c->c.getPoint() >= 200)
				.collect(Collectors.toList());
		// filter를 합니다. 포인트가 200보다 큰걸루
		// 200보다 큰 애들을 목록에 별도로 뽑아냄
		// 필터링한 리스트를 selected 리스트에 집어넣음
 		
		String report = String.format("고객 수 : %d명\n", selected.size());
		
		report = selected.stream()
				.map(c->String.format("%s : %d%n", c.getName(), c.getPoint()))
				.reduce(report,String::concat);
		// selected된 리스트에 내용들을 출력합니다.
		
		report += String.format("합계 : %d", selected.stream()
				.map(c->c.getPoint())
				.reduce(0,Integer::sum));
		// selected된 리스트의 합계를 구합니다.
		// 여기서 stream API의 리덕션 연산을 사용합니다.
		
		return report;
	
	}
}