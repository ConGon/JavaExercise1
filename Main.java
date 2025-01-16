public class Main {
    public static void main(String[] args) {
    System.out.println("Hello, World!");

    Car koenigsegg = new Car("Koenigsegg", "E009", 350, 1000000);

    System.out.println("Model Name: " + koenigsegg.getString("modelName"));

    koenigsegg.setInt("maxSpeed", 250);

    System.out.println("Max Speed: " + koenigsegg.getInt("maxSpeed"));


    
    }
}