package warehouse;

public class Tires extends Carparts{


    // for the name of the tire we are going to use
    // mudtire, snowtire, normal tire and sports tire
    public Tires(String name, double price, int year, String model) {
        super(name,price,year,model);
    }


    // it will print out the information
    public void partInfor() {
        System.out.println("Type: Tire");
        System.out.println("Name: " + name);
        System.out.printf("Price: %.2f\n", updated_price());
        System.out.println("year: " + year);
        System.out.println("Model: " + model);
        
        if (getBuyer() != null) {
            System.out.println("Buyer: " + getBuyer().getName());
        } 
        else {
            System.out.println("Buyer: No buyer assigned");
        }
    }

}