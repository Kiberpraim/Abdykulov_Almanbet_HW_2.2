public class Main {
    public static void main(String[] args) {
        Printable laptop,laptop1,laptop2;
        laptop = createObject("ASUS");
        laptop1 = createObject("MacBook");
        laptop2 = createObject("Lenovo");
        laptop.printInfo();
        laptop1.printInfo();
        laptop2.printInfo();
    }
    public static Printable createObject(String className){
        Laptop laptop = null;
        switch (className){
            case "ASUS": ASUS asus = new ASUS("M413DA",15,"Белый");
            laptop = asus; break;
            case "MacBook": MacBook macBook = new MacBook("MGN63xx/A","Intel Core i5-3317U",224);
            laptop = macBook ; break;
            case "Lenovo": Lenovo lenovo = new Lenovo("Y-530","Чёрный",3);
            laptop = lenovo; break;
        }
        return laptop;
    }
}