public class MacBook extends Laptop{
    private String processor;
    private int ppi;

    public MacBook(String model, String processor, int ppi) {
        super(model);
        this.processor = processor;
        this.ppi = ppi;
    }

    @Override
    public void printInfo() {
        System.out.println("Бренд: " + getBrand() + " Модель: " + getModel() + " Процссор: " + processor + " Частота экрана: " + ppi + "ppi");
    }
}
