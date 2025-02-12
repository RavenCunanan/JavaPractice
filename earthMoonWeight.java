public class HelloWorld {
    
    // Create method here 💖
    public static void earthMoonWeight(String name, int weight, String unit){
    double moonWeight=weight*(1.62/9.81);
    System.out.println("Hi "+ name + "! Your weight on Earth is "+ weight + unit + " and your weight on the moon would be about " + moonWeight + unit +".");
    }
    public static void main(String[] args) {

        // Call the method here 💖
        earthMoonWeight("Raven",160,"lbs");

    }
    
}
