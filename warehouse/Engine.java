package warehouse;

public class Engine extends Carparts {
    public Engine(String name, double price, int year, String model) {
        super(name, price, year, model);
    }

    public void partInfor() {
        System.out.println("Name: " + name);
        System.out.println("Price: "+ price);
        System.out.println("year: " + year);
        System.out.println("Model: " + model);
    }
}