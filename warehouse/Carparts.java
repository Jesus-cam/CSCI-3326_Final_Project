package warehouse;

public abstract class Carparts {
    public String name;
    // when we input the name in the class
    // it would like mudtires, small battery or, truck engine, sport car engine, etc.

    public double price;
    public String model;
    public int year;

    public Carparts(String name, double price,  int year, String model) {
        this.name = name;
        this.price = price;
        this.year = year;
        this.model = model;
    }

    public double updated_price() {
        int current_year = 2026;
        int yearsPassed = current_year - year;
        for(int index = 0; index <= yearsPassed; index++) {
            price = price * .90;
        }
        return price;
    }

    // Price of the part
    // I want to make a class specifically for the price of the part
    // I want to make it so the older the year of the part, the cheaper it is
    // but for the engine, if it passes certain years, it becomes more expensive
    // because it allready stoped being manufactured and it is more rare.


    // when we are going to input the original price
    // which is going to decrease over time.

    // ok so instead of a class i decided to put it in here
    // as a function
    // I overrided it in class engine so it also increase the price over time


    public abstract void partInfor();

    
}