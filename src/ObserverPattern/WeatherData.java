package ObserverPattern;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {

        int i =observers.indexOf(observer);
        if(i>=0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {

        for(Observer observer: observers){
            observer.update(temperature,humidity,pressure);
        }

    }

    public void measurementChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementChanged();
    }
}
