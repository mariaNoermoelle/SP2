public class DieselCar extends AFuelCar
{
    private boolean particleFilter;
    private int registrationFee = 0;

    public DieselCar(String registrationNumber, String brand, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter)
    {
        super(registrationNumber, brand, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    @Override
    public String getFuelType()
    {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee()
    {
        if(!particleFilter)
        {
            registrationFee += 1000;
        }
        if(kmPrLitre<50 && kmPrLitre>20)
        {
            registrationFee = 130;
        } else if (kmPrLitre>15 && kmPrLitre<20) {
            registrationFee = 1390;
        } else if (kmPrLitre>10 && kmPrLitre<15) {
            registrationFee = 1850;
        } else if(kmPrLitre>5 && kmPrLitre<10) {
            registrationFee = 2770;
        } else if (kmPrLitre<5); {
            registrationFee = 15260;
        }
        return registrationFee;
    }
}
