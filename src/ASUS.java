public class ASUS extends Laptop{
    private int  diagonal;
    private String backlightColor;

    public ASUS(String model, int diagonal, String backlightColor) {
        super(model);
        this.diagonal = diagonal;
        this.backlightColor = backlightColor;
    }

    @Override
    public void printInfo() {
        System.out.println("Бренд: " + getBrand() + " Модель: " + getModel() + " Диогонал: " + diagonal + " Цвет подсветки: " + backlightColor);
    }
}
