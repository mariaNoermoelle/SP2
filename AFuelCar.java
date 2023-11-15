public abstract class AFuelCar extends ACar
{
    protected String fuelType;
    protected int kmPrLitre;

    public AFuelCar(String registrationNumber, String brand, String model, int numberOfDoors, int kmPrLitre)
    {
        super(registrationNumber, brand, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public int getKmPrLitre()  //how many kilometres på litre of fuel
    {
        return kmPrLitre;
    }

    public abstract String getFuelType(); //returns Gasoline or Diesel

    @Override
    public String toString()
    {
        return super.toString() + "KmPrLitre: " + kmPrLitre;
    }
}
