import java.util.ArrayList;
import java.util.Iterator;

public class WeatherStationImpl implements WeatherStation {

    ArrayList<TemperatureReader> recipients;
    int temperature;

    public WeatherStationImpl(int temperature) {
        recipients = new ArrayList<>();
        this.temperature = temperature;
    }

    @Override
    public void addRecipient(TemperatureReader temperatureReader) {
        recipients.add(temperatureReader);
    }

    @Override
    public void removeRecipient(TemperatureReader temperatureReader) {
        recipients.remove(temperatureReader);
    }

    @Override
    public void tell() {
        Iterator<TemperatureReader> it = recipients.iterator();
        while ((it.hasNext())) {
            TemperatureReader temperatureReader = it.next();
            temperatureReader.update(temperature);
        }
    }

    public void setTemperature(int newTemperature){
        System.out.println("Nowa wartość: " + newTemperature);
        temperature = newTemperature;
        tell();
    }
}
