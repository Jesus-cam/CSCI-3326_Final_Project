import warehouse.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // BuyersInfo b = new BuyersInfo();
        // b.setName("jesus");
        // b.setNumber(123453);

        //store items into inventory 
        ArrayList<Carparts> inventory = new ArrayList<Carparts>();
        Tires tire1 = new Tires("mudtire", 40.3, 2020, "ford");
        Battery bat1 = new Battery("small", 107, 2017, "ford");
        Engine eng1 = new Engine("V8", 2000, 2017, "ford");
        inventory.add(tire1);
        inventory.add(bat1);
        inventory.add(eng1);
        //create menu object
        WarehouseMenu menu = new WarehouseMenu(inventory);
        menu.start();//call menu start method

    }
}