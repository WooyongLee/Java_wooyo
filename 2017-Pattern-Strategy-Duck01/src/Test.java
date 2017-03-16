import java.util.ArrayList;

public class Test {
	public static void flySimulation(Duck d){
		d.display();
		d.fly();
	}
	public static void quackSimulation(Duck d){
		d.display();
		d.quack();
	}
	public static void main(String[] args) {
		ArrayList<Duck> ducks = new ArrayList<>();
		ducks.add(new MallardDuck());
		ducks.add(new MallardDuck());
		ducks.add(new RubberDuck());
		for(Duck d: ducks){
			quackSimulation(d);
			flySimulation(d);
		}
	}

}
