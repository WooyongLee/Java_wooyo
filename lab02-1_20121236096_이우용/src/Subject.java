import java.util.Observer;

public interface Subject {
	void addObserver(Observer o);
	void deleteObserver(Observer o);
	void notifyObservers();
	void notifyObservers(Object data);
}
