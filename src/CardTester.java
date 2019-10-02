
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *
     * @param args is not used.
     */
    public static void main(String[] args) {
        /**** CARD 1 ****/
        System.out.println("\n CARD 1 TESTS");
        Card x = new Card("king", "clubs", 13);
        System.out.println("My card is raked: " + x.rank());
        System.out.println("My card has the suit: " + x.suit());
        System.out.println("My card has the value: " + x.pointValue());
        System.out.println(x); // test the toString method
        
        /**** CARD 2 ****/
        System.out.println("\n CARD 2 TESTS");
        Card y = new Card("king", "clubs", 13);
        System.out.println("My card is raked: " + y.rank());
        System.out.println("My card has the suit: " + y.suit());
        System.out.println("My card has the value: " + y.pointValue());
        System.out.println(y); // test the toString method
        System.out.println("This should be true: " + x.matches(y));
        
        /**** CARD 3 ****/
        System.out.println("\n CARD 3 TESTS");
        Card z = new Card("zorgon", "purple", 800);
        System.out.println("My card is raked: " + z.rank());
        System.out.println("My card has the suit: " + z.suit());
        System.out.println("My card has the value: " + z.pointValue());
        System.out.println(z); // test the toString method
        System.out.println("This should be true: " + x.matches(z));
        
    }
}
