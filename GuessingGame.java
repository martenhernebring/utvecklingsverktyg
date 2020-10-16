/**
 * A game that creates an engine Guesser for finding out numbers using terminal
 * 
 * @author Marten Hernebring, Nahid Vafaie
 * @version 1.0
 * @since 1.0
 *        <p>
 *        Steg 1- Continuation - Created main method of GuessingGame.java with
 *        an instance of Guesser with arg 0 and 1000. This will create a Guesser
 *        object that can guess the number you are thinking about between 0 and
 *        1000. Guesser is not complete yet but a toString-method was creted so
 *        that GuessingGame.java could verify the constructor. Both
 *        GuessingGame.java and Guesser.java compiles successfully. Added
 *        GuessingGame.java to Github with message “adding main class, added
 *        toString-method in constructor”.
 * 
 *        </p>
 */
public class GuessingGame {
    /**Main method that creates a new Guesser instance with values between 0 and 1000 and prints it out in terminal
     * @param args Not used in this simple version. Maybe for future release
     */
    public static void main(String[] args) {
        Guesser guesser = new Guesser(0, 1000);
        System.out.println(guesser);
    }
}
