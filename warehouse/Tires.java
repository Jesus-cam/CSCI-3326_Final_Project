package warehouse;

public class Tires extends Carparts{

    public Tires(String name, double price, int year, String model) {
        super(name,price,year,model);
    }

    public void partInfor() {
        System.out.println("Name: " + name);
        System.out.println("Price: "+ price);
        System.out.println("year: " + year);
        System.out.println("Model: " + model);
    }

}