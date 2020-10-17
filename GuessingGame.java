/**
 * A game that creates an engine Guesser for finding out numbers using terminal
 * 
 * @author Marten Hernebring, Nahid Vafaie
 * @version 1.4
 * @since 1.1
 *        
 */
public class GuessingGame {
    /**Main method that creates a new Guesser instance with values between 0 and 10 and start the game in terminal
     * @param args Not used in this simple version. Maybe for future release
     */
    public static void main(String[] args) {
        Guesser guesser = new Guesser(0, 10); //0-10 for easy verification
        //System.out.println(guesser); for checking the constructor
        guesser.start(); //starts the engine questioning
    }
}
