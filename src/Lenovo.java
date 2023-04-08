public class Lenovo extends Laptop{
    private String color;
    private int numberOfUSB_Ports;

    public Lenovo(String model, String color, int numberOfUSB_Ports) {
        super(model);
        this.color = color;
        this.numberOfUSB_Ports = numberOfUSB_Ports;
    }

    @Override
    public void printInfo() {System.out.println("Бренд: " + getBrand() + " Модель: " + getModel() + " Цвет ноубука: " + color + " Количество USB-портов: " + numberOfUSB_Ports);
    }
}
