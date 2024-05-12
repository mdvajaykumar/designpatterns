public class Main {
    public static void main(String[] args) {
     SingletonClass  check = SingletonClass.getInstance();
    Car car = new Car.CarBuilder()
            .setMake("Toyoto")
            .setModel("carmy")
            .setYear(1998)
            .setColor("blue")
            .build();

    System.out.println(car);

    }
}