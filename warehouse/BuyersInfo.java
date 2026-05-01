package warehouse;


// I made this class encapsuted
// so no can access the buyers information

public class BuyersInfo{
    private String name;
    private int cardNumber;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int CardNumber) {
        this.cardNumber = CardNumber;
    }

    public int getNumber() {
        return cardNumber;
    }


}