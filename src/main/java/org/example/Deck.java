package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        // Gå igenom varje färg...
        for (Card.Suit suit : Card.Suit.values()) {
            // ...och varje valör för att skapa ett kort
            for (Card.Rank rank : Card.Rank.values()) {
                this.cards.add(new Card(suit, rank));
            }
        }
    }

    // Metod för att blanda kortleken
    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    // Metod för att dra ett kort
    public Card dealCard() {
        if (cards.isEmpty()) {
                System.out.println("Kortleken är tom, kan inte dela ut fler kort.");
                return null;
        }
        return cards.remove(0);
    }
}
