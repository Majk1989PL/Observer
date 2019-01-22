public interface WeatherStation {

    void addRecipient(TemperatureReader temperatureReader);
    void removeRecipient(TemperatureReader temperatureReader);
    void tell();
}
