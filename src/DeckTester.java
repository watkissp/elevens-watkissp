
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *
     * @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        
        // REUSABLE ASSETS
        String[] suits = {"clubs", "hearts", "diamonds", "spades"};
        String[] ranks = {"ace", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "jack", "queen", "king"};
        int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        
        // NEW ASSETS
        String[] type = {"penny", "nickel", "quarter", "dime"};
        String[] army = {"hi", "be", "to", "no", "yes", "hello",
            "hey", "beat", "tree", "apex", "blue", "green", "red"};
        int[] points = {12, 23, 34, 45, 56, 67, 78, 89, 910, 1011, 1112, 1213, 1314};
        
        /**** EXAMPLE DECK 1 ****/
        System.out.println("----Testing Deck 1----");
        // create a deck
        Deck dMoney = new Deck(ranks, suits, pointValues);
        // test its size
        System.out.println("Deck Size: " + dMoney.size());
        // deal one card
        Card x = dMoney.deal();
        System.out.println("Dealt card: " + x);
        System.out.println("Now my deck size is: " + dMoney.size());
        // test two string
        System.out.println(dMoney);
        
        
        /**** EXAMPLE DECK 2 ****/
        System.out.println("----Testing Deck 2----");
        // create a deck
        Deck dEasy = new Deck(type, army, points);
        // test its size
        System.out.println("Deck Size: " + dEasy.size());
        // deal until empty
        while(!dEasy.isEmpty()){
            dEasy.deal();
        }
        
        System.out.println(dEasy);
    }
}
