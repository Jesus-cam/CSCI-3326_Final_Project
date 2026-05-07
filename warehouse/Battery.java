package warehouse;

public class Battery extends Carparts{
    //Constructor
    public Battery(String name, double price, int year, String model) {
        //calls super class (parent) 
        super(name, price, year, model);
    }


    @Override
    public double updated_price() {
        int current_year = 2026;
        int yearsPassed = current_year - year;
        
        for(int index = 0; index <= yearsPassed; index++) {
            price = price * .85;
        }

        return price;
    }



    public void partInfor() {
        System.out.println("Type: Battery");
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