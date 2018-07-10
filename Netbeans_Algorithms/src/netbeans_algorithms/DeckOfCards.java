package netbeans_algorithms;

/*
Chapter 7 | Object-Oriented Design

7.1 | Deck of Cards

Design the Data Structures for a generic deck of cards. Explain how you would subclass the data structures to implement blackjack.
*/

public enum Suit {
    Club (0), Diamond (1), Heart (2), Spade (3);
    private int value;
    private Suit(int v) { value = v; }
    public int getValue() { return value; }
    public static Suit getSuitFromValue(int value) { ... }
}

public class Deck <T extends Card> {
    private ArrayList<T> cards;
    private int dealtIndex = 0; // this is confusing
    
    public void setDeckOfCards(ArrayList<T> deckOfCards) { ... }
    
    public void shuffle() { ... }
    public int remainingCards() {
        return cards.size() - dealtIndex; // this is confusing
    }
    public T[] dealHand(int number) { ... } // T[] stands for Card Array
    public T dealCard() { ... }
}

public abstract class Card {
    private boolean available = true;
    
    protected int faceValue;
    protected Suit suit;
    
    public Card(int c, Suit s) {
        faceValue = c;
        suit = s;
    }
    
    public abstract int value();
    public Suit suit { return suit; }
    
    public boolean isAvailable() { return available; }
    public void markUnavailable() { available = false; }
    public void markAvailable() { available = true; }
}

public class Hand <T extends Card> {
    protected ArrayList<T> cards = new ArrayList<T>();
    
    public int score() {
        int score = 0;
        for (T card: cards) {
            score += card.value();
        }
        return score;
    }
    
    public void addCard(T card) {
        cards.add(card);
    }
}