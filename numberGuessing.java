import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 10: ");
        int number = scanner.nextInt();
        while (number <1 || number >10){
            System.out.println("The number enter is invalid please enter a number between 1 and 10:");
            number = scanner.nextInt();
        }
        int guess = rand.nextInt(10)+1;
        System.out.println("💻 The computer guesses: "+ guess);
        if (number == guess){
            System.out.println("The computer guessed correctly!");
        }
        else{
            System.out.println("❌ The computer guessed wrong!");
        }
    }
}
