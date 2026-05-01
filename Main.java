import warehouse.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello worlds");

        System.out.println("Does this work?");

        Tires tire1 = new Tires("mudtire", 40.3, 2020, "ford");

        System.out.println(tire1.name);
        tire1.partInfor();

    }
}