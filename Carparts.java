package Warehouse;

public abstract class Carparts {
    private String name;
    // when we input the name in the class
    // it would like mudtires, small battery or, truck engine, sport car engine, etc.

    private double price;
    public String model;
    public int year;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Price of the part
    // I want to make a class specifically for the price of the part
    // I want to make it so the older the year of the part, the cheaper it is
    // but for the engine, if it passes certain years, it becomes more expensive
    // because it allready stoped being manufactured and it is more rare.


    // when we are going to input the original price
    // which is going to decrease over time.
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract void partInfor();
}