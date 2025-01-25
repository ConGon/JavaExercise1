public class Car {
    private String modelName;
    private String modelNumber;
    private int maxSpeed;
    private int price;

    public Car() {
        this.modelName = "Default Car";
        this.modelNumber = "Default Model";
        this.maxSpeed = 0;
        this.price = 0;
    }

    public Car(String modelName, String modelNumber, int maxSpeed, int price) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
