package lab02;

import java.util.Observable;
import java.util.Observer;

public interface Subject {
	 public void addObserver(Observer o);
	 public void deleteObserver(Observer o);
	 public void notifyObservers( );// pushpull�� �� �׳� this������ �Ǵ°Ŵϱ�
	 public void notifyObservers(Object data);
}
