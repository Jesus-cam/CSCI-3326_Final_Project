package warehouse;

import java.util.ArrayList;
import java.util.Scanner;

public class WarehouseMenu {

    
    private Scanner input;
    //array list that stores all car parts in inventory
    private ArrayList<Carparts> inventory;
    //set to private to prevent other classes from directly modifying it


    // Constructor for warehouse menu
    public WarehouseMenu(ArrayList<Carparts> inventory) {
        //creates scanner object for keyboard input
        this.input = new Scanner(System.in);
        //to use the same inventory list and not have different ones
        this.inventory = inventory;
    }
    //Method to display menu options
    public void start(){
        int choice = 0;
        //continue to loop until condition is met
        do{
            //Display Menu
            System.out.println("===== WAREHOUSE MENU =====");
            System.out.println("1. Add Tire");
            System.out.println("2. Add Battery");
            System.out.println("3. Add Engine");
            System.out.println("4. Display Inventory");
            System.out.println("5. Add Buyer Information (Verify Inventory for item #)");
            System.out.println("6. Exit");
            System.out.print("Enter choice (1-6): ");
            //Get user to choose menu option
            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                //create a variable for 'Tires' data type that holds a tire object
                Tires tire = addTire(); //calls addTire method
                //add to 'inventory' array list the tire object
                inventory.add(tire);
            //Same principle is applied to the rest V
            }
            else if (choice == 2) {
                Battery battery = addBattery();
                inventory.add(battery);
            }
            else if (choice == 3) {
                Engine engine = addEngine();
                inventory.add(engine);
            }
            else if (choice == 4) {
                displayInventory(); //call method to display inventory
            }
            else if (choice == 5) {
                addBuyerInfo();
            }
            else if (choice == 6) {
                System.out.println("Exiting..");
            }
            else {
                System.out.println("Invalid choice, try again!");
            }
        } while (choice != 6); //exit if 6 is pressed
    }
    //method for creating and returnign a tire object
    public Tires addTire(){
        System.out.print("Enter tire name: ");
        String name = input.nextLine();
        System.out.print("Enter price: ");
        double price = input.nextDouble();
        System.out.print("Enter year: ");
        int year = input.nextInt();
        input.nextLine(); //clear buffer
        System.out.print("Enter model: ");
        String model = input.nextLine();
        //create tire object using constructor
        Tires tire = new Tires(name, price, year, model);
        return tire;
    }
    //method for creating and returning a battery object
    public Battery addBattery() {
        System.out.print("Enter battery name: ");
        String name = input.nextLine();
        System.out.print("Enter price: ");
        double price = input.nextDouble();
        System.out.print("Enter year: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.print("Enter model: ");
        String model = input.nextLine();
        //create battery object using constructor
        Battery battery = new Battery(name, price, year, model);
        return battery;
    }
    //method for creating and returning an engine object
    public Engine addEngine() {
        System.out.print("Enter engine name: ");
        String name = input.nextLine();
        System.out.print("Enter price: ");
        double price = input.nextDouble();
        System.out.print("Enter year: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.print("Enter model: ");
        String model = input.nextLine();
        //create engine object
        Engine engine = new Engine(name, price, year, model);
        return engine;
    }
    //method for assigning buyer info to an inventory item 
    private void addBuyerInfo() {
        System.out.println("Enter an item # to assign a buyer:");
        int itemNum = input.nextInt(); //read item number
        input.nextLine(); //clear buffer
        //Get part according to item #
        Carparts part = inventory.get(itemNum - 1);
        //create new buyer object
        BuyersInfo buyer = new BuyersInfo();
        System.out.print("Enter buyer name: ");
        String buyerName = input.nextLine();
        buyer.setName(buyerName);
        
        System.out.print("Enter card number: ");
        int cardNumber = input.nextInt();
        buyer.setNumber(cardNumber);

        // Assign buyer to the part
        part.setBuyer(buyer);
        System.out.println("Buyer assigned to item # " +itemNum);
    }
    
    //method that displays all inventory items
    public void displayInventory(){
        System.out.println("****** INVENTORY LIST ******");
        //loop thorugh every item in the inventory 
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println("---Item number: " + (i + 1) + "---");

            //Get item at postion i
            Carparts part = inventory.get(i);
            //call method to display info 
            part.partInfor();

            
        }
    }
}
