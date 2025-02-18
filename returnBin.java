public class HelloWorld {

    // Create returnBin() method here 💖
    public static void returnBin(String[] items){
        System.out.println("Items to Return \n—--------------");
        for(int i=0;i<items.length;i++){
            System.out.println((i+1)+"." + items[i]);
        }


    }


    public static void main(String[] args) {
        returnBin(new String[]{"Apple Watch", "Size 9 Shoes", "Wallet", "Suitcase", "Laptop"});
    }
}
