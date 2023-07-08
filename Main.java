package doSelect;

class Customer {
    int id;
    String name;
    double walletBalance;
    String address;

    public Customer(int id, String name, double walletBalance, String address) {
        this.id = id;
        this.name = name;
        this.walletBalance = walletBalance;
        this.address = address;
    }
}

class Item {
    int id;
}

public class Main {
    public static void main(String[] args) {
        // Create a customer object
        Customer customer = new Customer(1, "John Doe", 100.0, "123 Main St");
        
        // Create an item object
        Item item = new Item();
        item.id = 1;
        
        // Print customer and item details
        System.out.println("Customer ID: " + customer.id);
        System.out.println("Customer Name: " + customer.name);
        System.out.println("Customer Wallet Balance: " + customer.walletBalance);
        System.out.println("Customer Address: " + customer.address);
        
        System.out.println("Item ID: " + item.id);
    }
}
