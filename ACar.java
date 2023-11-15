public abstract class ACar implements Car {

    private final String registrationNumber;
    private final String brand;
    private final String model;
    protected final int numberOfDoors;

    public ACar(String registrationNumber, String brand, String model, int numberOfDoors)
    {
        this.registrationNumber=registrationNumber;
        this.brand = brand;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public String getRegistrationNumber()
    {
        return registrationNumber;
    }

    public String getMake()
    {
        return brand;
    }

    public String getModel()
    {
        return model;
    }

    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    @Override
    public String toString()
    {
        return registrationNumber + ", " + brand + ", " + model + ", " + numberOfDoors;
    }
}
