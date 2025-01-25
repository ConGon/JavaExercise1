public class Main {
    public static void main(String[] args) {
    Car hondaCivic = new Car("Honda Civic", "0013FKSH&", 120, 25000);
    Car defaultCar = new Car();

    System.out.println("Default car model name: " + defaultCar.getModelName());
    System.out.println("Default car model number: " + defaultCar.getModelNumber());
    System.out.println("Default car max speed: " + defaultCar.getMaxSpeed());
    System.out.println("Default car price: " + defaultCar.getPrice());

    System.out.println("\nHonda Civic model name: " + hondaCivic.getModelName());
    System.out.println("Honda Civic model number: " + hondaCivic.getModelNumber());
    System.out.println("Honda Civic max speed: " + hondaCivic.getMaxSpeed());
    System.out.println("Honda Civic price: " + hondaCivic.getPrice());

    }
}