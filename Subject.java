package lab02;

import java.util.Observable;
import java.util.Observer;

public interface Subject {
	 public void addObserver(Observer o);
	 public void deleteObserver(Observer o);
	 public void notifyObservers( );// pushpull할 떄 그냥 this보내면 되는거니까
	 public void notifyObservers(Object data);
}
