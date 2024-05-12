package designPattern.factory.practicalfactory;

public class client {
    public static void main(String[] args) {

        Vehicle v  = VehicleFactory.createVehicle("Car");
    }
}
