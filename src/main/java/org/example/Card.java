package org.example;

public class Card {

    // Enums för att representera kortets färg och valör
    public enum Suit {
        HEARTS("\u2665"), DIAMONDS("\u2666"), CLUBS("\u2663"), SPADES("\u2660");

        public final String symbol;

        Suit(String symbol) {
            this.symbol = symbol;
        }
    }

    public enum Rank {
        TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
        JACK(10), QUEEN(10), KING(10), ACE(11);

        public final int value;

        Rank(int value) {
            this.value = value;
        }
    }

    // Variabler för kortet
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Metoder för att hämta kortets information
    public int getValue() {
        return rank.value;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    // Den visuella representationen av kortet
    // I din Card.java-fil
    @Override
    public String toString() {
        return "[" + rank.name() + " " + suit.symbol + "]";
    }
}
