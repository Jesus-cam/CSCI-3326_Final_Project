import warehouse.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello worlds");

        System.out.println("Does this work?");

        Tires tire1 = new Tires("mudtire", 40.3, 2020, "ford");

        BuyersInfo b = new BuyersInfo();
        b.setName("jesus");
        b.setNumber(123453);

        tire1.setBuyer(b);
        tire1.getBuyer();

        System.out.println(tire1.name);
        tire1.partInfor();
        System.out.println();

        Battery bat1 = new Battery("small", 107, 2017, "ford");
        bat1.partInfor();
        System.out.println();

        System.out.println();
        Engine eng1 = new Engine("V8", 2000, 2017, "ford");
        eng1.partInfor();
        System.out.println();

        


    }
}