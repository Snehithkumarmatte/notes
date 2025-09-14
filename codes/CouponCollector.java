import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CouponCollector {

    // Enum for Suit of Cards
    enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    // Method to pick a random card suit
    public static Suit pickCard() {
        Random random = new Random();
        int suit = random.nextInt(4);  // Random number between 0 and 3 (four suits)
        return Suit.values()[suit]; 
    }

    public static void main(String[] args) {
        Set<Suit> collectedSuits = new HashSet<>();  // To store the suits we've collected
        int numberOfPicks = 0;  // Counter to track the number of picks

        // Continue picking cards until we have all four suits
        while (collectedSuits.size() < 4) {
            Suit pickedSuit = pickCard();  // Pick a random card
            numberOfPicks++;  // Increment the number of picks
            collectedSuits.add(pickedSuit);  // Add the picked suit to the set (duplicates are ignored)

            // Display the suit of the card that was picked
            System.out.println("Picked: " + pickedSuit);
        }

        // Display the results
        System.out.println("It took " + numberOfPicks + " picks to collect all four suits.");
    }
}
