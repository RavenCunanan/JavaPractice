class Neopet{
    String name;
    String species;
    String color;
    char gender;
    boolean hasScarf;
}


public class Main {
    public static void main(String[] args) {
        Neopet gravatia = new Neopet();
        gravatia.name = "Gravatia";
        gravatia.species ="Eyrie";
        gravatia.color = "Blue";
        gravatia.gender = 'F';
        gravatia.hasScarf = false;

        // Print the attributes of the Neopet 💖
        System.out.println("Name: " + gravatia.name);
        System.out.println("Species: " + gravatia.species);
        System.out.println("Color: " + gravatia.color);
        System.out.println("Gender: " + gravatia.gender);
        System.out.println("Does " + gravatia.name + " have a scarf? " + gravatia.hasScarf); 
    }
}
