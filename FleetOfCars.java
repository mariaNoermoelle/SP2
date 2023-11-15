import java.util.ArrayList;

public class FleetOfCars
{
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car)
    {
        cars.add(car);
    }

    //Fik hjælp af Michella til denne del:
    @Override
    public String toString()
    {
        String name = "";
        for(Car car : cars)
        {
            name = (car.getMake());
        }
        return name;
    }

    public int getTotalRegistrationFee()
    {
        int sum = 0;
        for(Car car : cars)
        {
            sum += car.getRegistrationFee();
        }
        return sum;
    }
}
