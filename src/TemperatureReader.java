public class TemperatureReader {

    private int nextNumber;

    public TemperatureReader(int nextNumber) {
        this.nextNumber = nextNumber;
    }

    public void update(int temperature){
        System.out.println("Czytnik nr " + nextNumber + " odczytał nową temperaturę: " + temperature);
    }
}
