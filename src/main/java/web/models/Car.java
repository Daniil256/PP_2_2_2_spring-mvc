package web.models;

public class Car {
    private final String brand;
    private final String model;
    private final int release;

    public Car(String brand, String model, int release) {
        this.brand = brand;
        this.model = model;
        this.release = release;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRelease() {
        return release;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", release=" + release +
                '}';
    }
}
