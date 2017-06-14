import java.util.List;

public class SimpleReportGenerator extends ReportGenerator{
	@Override
	public String generate(List<Customer> customers){
		String report = String.format("°í°´ ¼ö : %d¸í\n", customers.size());
		report = customers.stream()
				.map(c->String.format("%s : %d%n", c.getName(), c.getPoint()))
				.reduce(report,String::concat);
		
		return report;
	}
	
}