import java.util.*;
import java.util.Random;

class Game {

    private int random;
    private int user;

    public void rand(int range) {
        Random r = new Random();
        random = r.nextInt(range); // Store the random number in the class field
    }

    public void takeUserinput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user input: ");
        user = sc.nextInt();
    }

    public boolean CheckFor() {
        if (user == random) {
            System.out.println("Congrats!");
            return true;
        } else if (user < random) {
            System.out.println("The random number is greater than your guess.");
        } else {
            System.out.println("Your guess is greater than the random number.");
        }
        return false;
    }

}

public class random {
    public static void main(Stringggg[] args) {
        Game g = new Game();
        g.rand(100); // Generate a random number between 0 and 99
        boolean flag = false;
        while (!flag) {
            g.takeUserinput(); // Take user input
            flag = g.CheckFor(); // Check if the guess is correct
        }
    }
}
