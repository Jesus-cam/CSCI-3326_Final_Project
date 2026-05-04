package warehouse;

public class Engine extends Carparts {
    public Engine(String name, double price, int year, String model) {
        super(name, price, year, model);
    }

    @Override
    public double updated_price() {
        int current_year = 2026;
        int yearsPassed = current_year - year;
        
        for(int index = 0; index <= yearsPassed; index++) {
            price = price * .90;
        }

        if(year >= 1970) {
            for(int index = 0; index <= yearsPassed; index++) {
                price = price + (price * 0.10);
            }
        }
        return price;
    }

    public void partInfor() {
        System.out.println("Name: " + name);
        System.out.printf("Price: %.2f\n", updated_price());
        System.out.println("year: " + year);
        System.out.println("Model: " + model);
    }
}