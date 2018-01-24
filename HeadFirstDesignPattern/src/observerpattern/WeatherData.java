package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	
	public List<Observer> observers;
	public float temperature;
	public float humidity;
	public float pressure;
	
	public WeatherData() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer o: observers) {
			o.update(temperature, humidity, pressure);
		}
	}

}