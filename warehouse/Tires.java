package warehouse;

public class Tires extends Carparts{


    // for the name of the tire we are going to use
    // mudtire, snowtire, normal tire and sports tire
    public Tires(String name, double price, int year, String model) {
        super(name,price,year,model);
    }

    public void updated_price(price);

    // it will print out the information
    public void partInfor() {
        System.out.println("Name: " + name);
        System.out.println("Price: "+ price);
        System.out.println("year: " + year);
        System.out.println("Model: " + model);
    }

}