import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("����1" , 100));
		customers.add(new Customer("����32" , 150));
		customers.add(new Customer("���󤩤�" , 600));
		customers.add(new Customer("�����" , 7900));
		
		// SimpleReportGenerator generator = new SimpleReportGenerator();
		ComplexReportGenerator generator2 = new ComplexReportGenerator();
		
		// System.out.println(generator.generate(customers));
		System.out.println(generator2.generate(customers));
	}
}
