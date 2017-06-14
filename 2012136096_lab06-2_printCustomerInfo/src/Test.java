import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("路塭1" , 100));
		customers.add(new Customer("路塭32" , 150));
		customers.add(new Customer("路塭予仄" , 600));
		customers.add(new Customer("路塭蹂" , 7900));
		
		// SimpleReportGenerator generator = new SimpleReportGenerator();
		ComplexReportGenerator generator2 = new ComplexReportGenerator();
		
		// System.out.println(generator.generate(customers));
		System.out.println(generator2.generate(customers));
	}
}
