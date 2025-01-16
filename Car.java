public class Car {
    private String modelName = "Koenigsegg";
    private String modelNumber = "E06";
    private int maxSpeed;
    private int price;

    public Car(String modelName, String modelNumber, int maxSpeed, int price) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public void setString(String target, String data) {
        if (target.equals("modelName")) {
            modelName = data;

        } else if (target.equals("modelNumber")) {
            modelNumber = data;

        } else {
            System.out.println("INVALID PROPERTY INPUTTED");
        }    
    }

    public void setInt(String target, int data) {
        if (target.equals("maxSpeed")) {
            maxSpeed = data;

        } else if (target.equals("price")) {
            price = data;

        } else {
            System.out.println("INVALID PROPERTY INPUTTED");
        }    
    }


    public String getString(String data) {
        if (data.equals("modelName")) {
            return modelName;

        } else if (data.equals("modelNumber")) {
            return modelNumber;

        } else {
            System.out.println("INVALID PROPERTY INPUTTED");
        }

        // Have to return empty string
        return "";
    }

    public int getInt(String data) {
        if (data.equals("maxSpeed")) {
            return maxSpeed;

        } else if (data.equals("price")) {
            return price;

        } else {
            System.out.println("INVALID PROPERTY INPUTTED");
        }

        // Have to return int
        return 0;
    }
}
