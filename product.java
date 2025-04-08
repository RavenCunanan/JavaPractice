// The Product class has been created for you! 💖

class Product {
    String name;
    double price;

    // Add a constructor here 💖
    Product(String name, double price){
        this.name = name;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
    
        // Test your code here! 💖
        Product fit1 = new Product("T-Shirt", 44.99);
        Product fit2 = new Product("Jeans", 69.99); 

        System.out.println(fit1.name + " " + fit1.price); // Output: T-Shirt 44.99
    }
}
