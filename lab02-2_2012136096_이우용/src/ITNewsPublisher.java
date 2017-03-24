import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class ITNewsPublisher implements NewsPublisher {
	ImprovedObservable observers = new ImprovedObservable();
	private ArrayList<Observer> obs; 
	private String latestFeed;
	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.addObserver(o);
	}

	@Override
	public void deleteObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.deleteObserver(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for ( Observer o : obs)
			o.update(observers, latestFeed);
	}

	@Override
	public void notifyObservers(Object data) {
		// TODO Auto-generated method stub
		observers.notifyObservers(data);
	}

	@Override
	public void setNewFeed(String newFeed) {
		// TODO Auto-generated method stub
		this.latestFeed = newFeed;
		notifyObservers();
		// observers.notifyObservers(this);

	}
	
	public String getFeed() {
		return latestFeed;
	}
}
