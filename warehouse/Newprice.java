package warehouse;

public class Newprice extends Carparts {


    public void updated_price (double np) {
        for(int index = year; index <= 2026; index++) {
            super.price = super.price * 0.80;
        }
    }

    public void partInfor() {
        System.out.println("Updated price: " + price);
    }
}