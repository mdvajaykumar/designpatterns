package designPattern.factory.FactoryMethod;

public class BikeFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
