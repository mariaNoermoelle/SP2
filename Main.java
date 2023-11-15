public class Main
{
    public static void main(String[] args) {

    FleetOfCars fleetOfCars = new FleetOfCars();

    GasolineCar obel = new GasolineCar("2", "obel", "zafira", 5, 20);
    DieselCar suzuki = new DieselCar("3", "suzuki", "vitara", 5, 24, true);
    ElectricCar tesla = new ElectricCar("4", "Tesla", "x", 5, 200, 300, 70);

    fleetOfCars.addCar(obel);
    fleetOfCars.addCar(suzuki);
    fleetOfCars.addCar(tesla);

    System.out.println(fleetOfCars.toString());
    System.out.println(fleetOfCars.getTotalRegistrationFee());

    }
}
