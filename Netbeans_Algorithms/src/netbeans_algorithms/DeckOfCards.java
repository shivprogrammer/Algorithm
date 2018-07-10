package netbeans_algorithms;

/*
Chapter 7 | Object-Oriented Design

7.1 | Deck of Cards

Design the Data Structures for a generic deck of cards. Explain how you would subclass the data structures to implement blackjack.
*/

public class DeckOfCards {
    public Deck {
        // new Deck = Card[][];
        // There should be some sort of hash table ensure that a card of a particular suit and value is not repeated
        // Max card count 52
    }
}

//////// DIFFERENT CARD CLASS ////////

public class Card {
    public Card(CardSuit suit, CardValue value) {
        // if card is in Deck, you need to do a count++ to the over all number of Cards within the Deck
    }
    
    public enum CardSuit {
        Clubs, //
        Spades,
        Hearts,
        Diamonds
    }
    
    public enum CardValue {
        Two,
        Three,
        Four,
        Five,
        Six,
        Seven,
        Eight,
        Nine,
        Ten,
        Jack,
        Queen,
        King,
        Ace
    }
    
    public static class isRed(Suit suit) {
        // if 
    }
}

///// BLACKJACK GAME BELOW /////