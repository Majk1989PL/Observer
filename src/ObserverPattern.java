public class ObserverPattern {

    public static void main(String[] args) {

        WeatherStationImpl ws = new WeatherStationImpl(22);

        TemperatureReader reader1 = new TemperatureReader(1);
        ws.addRecipient(reader1);
        ws.setTemperature(27);

        TemperatureReader reader2 = new TemperatureReader(2);
        ws.addRecipient(reader2);
        ws.setTemperature(29);
    }
}
