// Create a new class named Order here! 💖
class Order{
    String orderName;
    String drinkName;
    double price;
    boolean isHot;
    char size;
    Boolean toGo;

    Order(String orderName, String drinkName,double price, boolean isHot, char size, Boolean toGo){
        this.orderName = orderName;
        this.drinkName = drinkName;
        this.price = price;
        this.isHot = isHot;
        this.size = size;
        this.toGo = toGo;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a new Order object here! 💖
        Order myOrder = new Order("Raven", "Matcha", 5.99, true, 'L', true);

        // Add print statements here! 💖
        System.out.println("Order for " + myOrder.orderName + ": " + myOrder.drinkName + " size: " + myOrder.size + " iced?: " + myOrder.isHot +" $" + myOrder.price + " togo?: " + myOrder.toGo);       
    }
}
