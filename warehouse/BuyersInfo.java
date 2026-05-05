package warehouse;


// I made this class encapsuted
// so no one can access the buyers information

public class BuyersInfo{
    private String Bname;
    private int cardNumber;

    public void setName(String Bname) {
        this.Bname = Bname;
    }

    public String getName() {
        return Bname;
    }

    public void setNumber(int CardNumber) {
        this.cardNumber = CardNumber;
    }

    public int getNumber() {
        return cardNumber;
    }

}