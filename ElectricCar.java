public class ElectricCar extends ACar
{
    private int whPrKm;
    private int maxRangeKm;
    private int batteryCapacity;
    public ElectricCar(String registrationNumber, String brand, String model, int numberOfDoors, int whPrKm, int maxRangeKm, int batteryCapacity)
    {
        super(registrationNumber, brand, model, numberOfDoors);
        this.whPrKm=whPrKm;
        this.maxRangeKm=maxRangeKm;
        this.batteryCapacity=batteryCapacity;
    }

    public int getBatteryCapacityKWh()
    {
       return batteryCapacity;
    }

    public int MaxRangeKm()
    {
        return maxRangeKm;
    }

    public int getWhPrkm()
    {
        return whPrKm;
    }

    @Override
    public int getRegistrationFee()
    {
        int sum = (int)(getWhPrkm()/91.25*1000);
        return sum;
    }

}
