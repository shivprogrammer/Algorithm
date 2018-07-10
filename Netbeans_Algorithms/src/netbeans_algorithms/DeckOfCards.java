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
}

//public class DeckOfCards {
//    public Deck {
//        // new Deck = Card[][];
//        // Max card count 52
//         this.CardCount = 0;
//    }
//    
//    public boolean isThereCardDuplicate(Deck deck, Card newCard) {
//        // There should be some sort of hash table ensure that a card of a particular suit and value is not repeated
//    }
//    
//    public boolean isDeckFull(Deck deck) {
////        if(Deck.CardCount > 52)
////            return false;
////        else
////            return true;
//       
//    }
//}
//
////////// DIFFERENT CARD CLASS ////////
//
//public class Card {
//    public Card(CardSuit suit, CardValue value) {
//        // if card is in Deck, you need to do a count++ to the over all number of Cards within the Deck
//    }
//    
//    public enum CardSuit {
//        Clubs, //
//        Spades,
//        Hearts,
//        Diamonds
//    }
//    
//    public enum CardValue {
//        Two,
//        Three,
//        Four,
//        Five,
//        Six,
//        Seven,
//        Eight,
//        Nine,
//        Ten,
//        Jack,
//        Queen,
//        King,
//        Ace
//    }
//    
//    public static class isRed(Suit suit) {
        // if (Card.CardSuit == Hearts || Card.CardSuit == Diamonds) {
//        return true;
//        else 
//        return false;
//    }
}

///// BLACKJACK GAME BELOW /////