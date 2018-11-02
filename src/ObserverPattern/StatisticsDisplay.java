package ObserverPattern;

public class StatisticsDisplay implements Observer,DisplayElement {


    private float totalTemp=0;
    private float totalHumid=0;
    private  float totalPressure=0;

    private int counter=0;
    private float maxTemp;
    private float maxPressure;
    private float maxHumidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("\nStatistical Display : avgTemp = "+totalTemp/counter+", avgPressure = "
                +totalPressure/counter+", avgHumidity = "+totalHumid/counter+"\n" +
                "MaxTemp = "+maxTemp+", MaxPressure = "+maxPressure+", MaxHumidity = "+maxHumidity+"\n");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

        counter++;

        totalHumid=totalHumid+humidity;
        totalPressure=totalPressure+pressure;
        totalTemp=totalTemp+temp;

        if(temp>maxTemp){
            maxTemp=temp;
        }
        if(humidity>maxHumidity){
            maxHumidity=humidity;
        }

        if(pressure>maxPressure){
            maxPressure=pressure;
        }

        display();

    }
}
