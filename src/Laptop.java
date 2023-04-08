public abstract class Laptop implements Printable {
    private String brand = String.valueOf(this.getClass().getName());
    private String model;

    public Laptop(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
