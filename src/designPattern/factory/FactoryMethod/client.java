package designPattern.factory.FactoryMethod;

public class client {
    public static void main(String[] args) {
        VehicleFactory factory = new CarFactory();
        Vehicle car = factory.createVehicle();

    }
}
