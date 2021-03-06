import java.util.Scanner;

/**
 * An engine that ask the player which number he is thinking about
 * 
 * @author Marten Hernebring, Nahid Vafaie
 * @version 1.4
 * @since 1.0
 *
 */
public class Guesser {
    /** Lowest integer instance variable */
    private int low;
    /** Highest integer instance variable */
    private int high;

    /*
     * Task 1. Write code here for a constructor which takes two int arguments and
     * saves them in the instance variables low and high.
     *
     * If you don't remember the syntax for how to write constructors, revisit the
     * chapter "Classes" and review the section about constructors.
     *
     */

    // Write the constructor below this line.
    /**
     * A constructor that needs two int values
     * 
     * @param low  Lowest possible integer from main
     * @param high Highest possible integer from main
     */
    public Guesser(int low, int high) {
        this.low = low;
        this.high = high;
    }

    /**
     * Simple toString which returns the instance variables low and high
     * 
     * @return String Class-name + low (Lowest possible integer from main) + high
     *         (high Highest possible integer from main)
     */
    @Override
    public String toString() {
        return "Guesser\tlow:" + low + "\thigh: " + high;
    }

    /*
     * Task 2. Complete the start() method, so that in the method body, you call
     * first the rules() method, next the doGuesses() method.
     */
    /**
     * A simple start method that will start the game and call the two methods
     * rules() and doGuesses()
     */
    public void start() {
        // call the rules method here
        rules();
        // call the doGuesses() method here
        doGuesses();
    }

    /**
     * A simple method for outprinting the rules to the terminal about lowest and
     * highest numbers and correct inputs
     */
    private void rules() {
        System.out.println("Think of a number between " + low + " and " + high);
        System.out.println("I'm going to ask a few questions in order " + "to guess the number.");
        System.out.println("Please answer T for true, and F for false.\n");
    }

    /*
     * * Task 3. Complete the code for the getReply() method. In the current version
     * below, it returns null each call, which is not what this method is supposed
     * to do.
     * 
     * Instead, change the method so that it reads a reply from the player, and if
     * it is "T" or "F", we have a valid reply. Return the String that you read from
     * the player.
     */

    /**Using standard scanner until answer method is called */
    final static Scanner SCAN = new Scanner(System.in);

    /**Ask the user to reply to the question with only T or F acceptable (spaces are OK!)
     * @return String with "T" or "F"
     */
    private String getReply() {
        // Write code here which reads a String from the console.
        String reply = SCAN.nextLine().trim();
        // As long as it is not a valid reply (one of "T" and "F")
        // write an error message, and read a new reply.
        while (!reply.equals("T") & !reply.equals("F")) {
            System.out.println("please answer T or F");
            reply = SCAN.nextLine().trim();
        }
        // When you have gotten a valid reply, return it.
        return reply;
    }

    //The computer will guess the number in the middle every time until right answer is found internal method
    private void doGuesses() {
        int i = 0; // number of guesses
        int middle = 0;
        while (low < high) {
            // Set next guess to the middle between
            // current low and current high
            middle = low + (high - low) / 2;
            System.out.println("Is the number less than or equal to " + middle + "?");
            String reply = getReply();
            if ("T".equals(reply)) {
                // The number is less than or equal to middle
                // so we move down high to middle
                high = middle;
            } else {
                // The number is greater than middle,
                // so we move up low to middle +1
                low = middle + 1;
            }
            i++; // One more guess!
        }
        // When low has met high, we don't enter the loop
        // and we have found the number
        answer(low, i);
    }

    //Internal method used when the number was found and the game ends
    private void answer(int guess, int numberOfGuesses) {
        SCAN.close(); //Scanner is not needed any more
        System.out.println("You were thinking about " + guess + " (took me " + numberOfGuesses + " guesses)");
    }

}
