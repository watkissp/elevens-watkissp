
import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards. It provides several
 * operations including initialize, shuffle, deal, and check if empty.
 */
public class Deck {

    /**
     * cards contains all the cards in the deck.
     */
    private List<Card> cards;

    /**
     * size is the number of not-yet-dealt cards. Cards are dealt from the top
     * (highest index) down. The next card to be dealt is at size - 1.
     */
    private int size;

    /**
     * Creates a new <code>Deck</code> instance.<BR>
     * It pairs each element of ranks with each element of suits, and produces
     * one of the corresponding card.
     *
     * @param ranks is an array containing all of the card ranks.
     * @param suits is an array containing all of the card suits.
     * @param values is an array containing all of the card point values.
     */
    public Deck(String[] ranks, String[] suits, int[] values) {
        // instantiate our cards instance variable
        cards = new ArrayList<Card>();
        // loop through the ranks
        for (int j = 0; j < ranks.length; j++) {
            // loop through the suits
            for (String suitString : suits) {
                // add each card to the ArrayList
                cards.add(new Card(ranks[j], suitString, values[j]));
            }
        }
        
        // initialize the size variable
        this.size = cards.size();
        shuffle();
        
        
    } // close constructor
        /**
         * Determines if this deck is empty (no undealt cards).
         *
         * @return true if this deck is empty, false otherwise.
         */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Accesses the number of undealt cards in this deck.
     *
     * @return the number of undealt cards in this deck.
     */
    public int size() {
        return size;
    }

    /**
     * Randomly permute the given collection of cards and reset the size to
     * represent the entire deck.
     */
    public void shuffle() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
        
        // Same as shuffler selection shuffle but for ArrayList
        
        for(int k = cards.size() - 1; k > 0; k--){
            int pos = (int)(Math.random() * (k+1));
            //copy from pos to temp
            Card temp = cards.get(k);
            //copy from k to pos
            cards.set(k, cards.get(pos));
            //copy from temp to k
            cards.set(pos, temp);
        }
    }

    /**
     * Deals a card from this deck.
     *
     * @return the card just dealt, or null if all the cards have been
     * previously dealt.
     */
    public Card deal() {
        // IS EMPTY if so return null
        if(size == 0) return null;
        
        //if it's not empty...
        size--;
        Card c = cards.get(size);
        return c;
    }

    /**
     * Generates and returns a string representation of this deck.
     *
     * @return a string representation of this deck.
     */
    @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
} // closes class
