public class GasolineCar extends AFuelCar
{
    private String fuelType;
    private int registrationFee;

    public GasolineCar(String registrationNumber, String brand, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, brand, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType()
    {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee()
    {
        if (kmPrLitre>20 && kmPrLitre<50)
        {
            registrationFee = 330;
        } else if (kmPrLitre<20 && kmPrLitre>15) {
            registrationFee = 1050;
        } else if (kmPrLitre<15 && kmPrLitre>10) {
            registrationFee = 2340;
        } else if (kmPrLitre<10 && kmPrLitre>5) {
            registrationFee = 5500;
        } else if (kmPrLitre<5) {
            registrationFee = 10470;
        }
        return registrationFee;
    }
}
